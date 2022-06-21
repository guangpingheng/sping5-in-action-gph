package com.lkm.springinaction5my.controller;

import com.lkm.springinaction5my.tacos.Ingredient;
import com.lkm.springinaction5my.tacos.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static com.lkm.springinaction5my.tacos.Ingredient.Type;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/14 17:58
 **/
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController222 {

    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredientList = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                new Ingredient("CHED", "Cheddar", Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredient("SLSA", "Salsa", Type.SAUCE),
                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        );
        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),ingredientList.stream().filter(x->x.getType().equals(type)).collect(Collectors.toList()));
        }
        model.addAttribute("design",new Taco());
        // 查改变log配置
        log.info("model attribute is = ",String.join(",",model.asMap().keySet()));
        return "design";
    }

    @PostMapping
    public String processDesign(Taco design){
        log.info("design =" + design);

        return "redirect:/orders/current";

    }

}
