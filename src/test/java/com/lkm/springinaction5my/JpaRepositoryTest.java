package com.lkm.springinaction5my;

import com.lkm.springinaction5my.jpa.repository.IngredientRepository;
import com.lkm.springinaction5my.tacos.Ingredient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/31 16:34
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaRepositoryTest {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Test
    public void testIngredientRepository(){
        Ingredient in11 = new Ingredient("2000","test11", Ingredient.Type.CHEESE);
        Ingredient in12 = new Ingredient("2001","test12", Ingredient.Type.CHEESE);
        Ingredient in13 = new Ingredient("2002","test13", Ingredient.Type.CHEESE);
        Ingredient in14 = new Ingredient("2003","test14", Ingredient.Type.CHEESE);

        System.out.println("before save count=" + ingredientRepository.count());
        if (ingredientRepository.save(in11) != null) {
            System.out.println("set in11 sucess");
        }
        if (ingredientRepository.save(in12) != null) {
            System.out.println("set in12 sucess");
        }
        if (ingredientRepository.save(in13) != null) {
            System.out.println("set in13 sucess");
        }
        if (ingredientRepository.save(in14) != null) {
            System.out.println("set in14 sucess");
        }
        System.out.println("after save count=" + ingredientRepository.count());
        System.out.println("2000="+ingredientRepository.findById("2000"));
        System.out.println("2004 is exists = "+ingredientRepository.existsById("2004"));
        System.out.println("###########find all ############");
        for (Ingredient ingredient : ingredientRepository.findAll()) {
            System.out.println(ingredient);
        }
        System.out.println("##############fiand all end##############");
        System.out.println("before delete 2003 exist=" + ingredientRepository.existsById("2003"));
        ingredientRepository.deleteById("2003");
        System.out.println("after delete 2003 exist=" + ingredientRepository.existsById("2003"));

    }

}
