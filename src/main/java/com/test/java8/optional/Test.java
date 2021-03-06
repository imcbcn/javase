package com.test.java8.optional;

import com.test.java8.Person;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author 陈彬
 * Date 2018/3/7
 * Time 16:03
 */
public class Test {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("abc");
        optional.ifPresent(System.out::print);
        optional.orElse("123");
            chainCall();

    }


    /**
     * Optional  链式调用
     */
    public static void chainCall() {
        List<Person> list = Arrays.asList(new Person("kevin", 20, null));
//        list = null;
        int hashCode =    Optional.ofNullable(list).map(l -> l.get(0)).map(person -> person.getHeight()).map(BigDecimal::hashCode).orElseThrow(RuntimeException::new);
        System.out.println(hashCode);


    }
}
