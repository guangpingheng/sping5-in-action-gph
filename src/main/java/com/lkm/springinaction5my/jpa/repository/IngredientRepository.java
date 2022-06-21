package com.lkm.springinaction5my.jpa.repository;

import com.lkm.springinaction5my.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/31 16:18
 **/
// 此处不需要@Repository注解
public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}
