package dev.jmv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListOf1000 {
    static final int maxBatchSize = 1000;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        var accounts = new ArrayList<Integer>();
        for (int i = 0; i <= 45232; i++) {
            accounts.add(i);
        }
        var strTime = new Date().getTime();
//        run1(accounts);
//        run2(accounts, 0, maxBatchSize);

        encryptMe(accounts, Math.min(accounts.size(), maxBatchSize));
        System.out.printf("Time lapsed: %d ms", new Date().getTime() - strTime);
    }

    static void encryptMe(List<Integer> accounts, int end) throws InterruptedException, ExecutionException {
        ExecutorService ioBound = Executors.newCachedThreadPool();
        List<CompletableFuture<String>> list = accounts.subList(0, end).stream()
                .map(a -> CompletableFuture.supplyAsync(() -> encrypt(a), ioBound))
                .toList();

        List<String> joined = list.stream().map(CompletableFuture::join).toList();
        saveMe(joined);

        accounts.subList(0, end).clear();

        if (!accounts.isEmpty())
            encryptMe(accounts, Math.min(accounts.size(), maxBatchSize));
    }

    static void saveMe(List<String> list) {
        for (String x : list) {
            System.out.println(x);
        }
    }

    static void run1(List<Integer> accounts) throws InterruptedException {
        for (Integer account : accounts)
            System.out.println(encrypt(account));
    }

    static void run2(List<Integer> accounts, int start, int end) throws InterruptedException, ExecutionException {
        var list = accounts.subList(start, end).stream()
                .map(a -> CompletableFuture.supplyAsync(() -> encrypt(a)))
                .toList();

        list
                .forEach(x -> {
                    try {
                        System.out.println(x.get());
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    static String encrypt(int i) {
        return "encrypt-" + i;
    }
}
