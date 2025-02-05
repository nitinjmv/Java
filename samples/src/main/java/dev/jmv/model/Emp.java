package dev.jmv.model;

import lombok.*;

import java.io.Serializable;

public @Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Emp implements Serializable {
    private Long id;
    private String name;

    public String toString(){
        return "Emp(id="+this.id+", name="+this.name+")";
    }
}