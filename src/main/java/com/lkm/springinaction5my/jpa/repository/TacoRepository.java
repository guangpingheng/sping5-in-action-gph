package com.lkm.springinaction5my.jpa.repository;

import com.lkm.springinaction5my.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/31 16:19
 **/
public interface TacoRepository extends CrudRepository<Taco,String> {
}
