package dev.jmv;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.jmv.model.Emp;
import lombok.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class ToStr {
    public static void main(String[] args) throws JsonProcessingException {
        var e1 = Emp.builder().id(11L).name("Ram").build();
        var e2 = Emp.builder().id(22L).name("Sita").build();

        var mapper = new ObjectMapper();
        var e = mapper.writeValueAsString(List.of(e1, e2));
        System.out.println(e);

        var eList = mapper.readValue(e, Emp[].class);
        Arrays.stream(eList).forEach(System.out::println);
    }
}

