package com.lkm.springinaction5my.tacos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/14 18:17
 **/
@Data
//@RequiredArgsConstructor
@Entity
public class Taco {
    @Id
    // 查之
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String id;
    @NotNull
    @Size(min=5,message = "name must be at least 5")
    private  String name;
    private Date createdAt;
    // 查
    @ManyToMany(targetEntity = Ingredient.class)
    @Size(min=1,message = "you must choose at least 1")
    private List<String> ingredients;
    @PrePersist
    void creatAt(){
        this.createdAt = new Date();
    }
}
