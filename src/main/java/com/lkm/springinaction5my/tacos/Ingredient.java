package com.lkm.springinaction5my.tacos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/14 17:52
 **/
// 查lombok
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC,force = true)

@Entity
public class Ingredient {
    // 查为啥设置为final
    @Id
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
