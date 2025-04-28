package com.basics.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef_ConstructorRef {

    public static void main(String[] args) {

        //METHOD REFERENCE
        List<String> friends = Arrays.asList("Jack", "Sam", "Howard");
        friends.forEach(x -> System.out.println(x));    //normal lambda exp
        friends.forEach(System.out::println);                 //method reference
        System.out.println(friends.stream().toList());

        //CONSTRUCTOR REFERENCE
        List<String> names = Arrays.asList("Jack", "Sam", "Howard");
        List<MobilePhone> mobilePhonesList = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> constructorReference = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        constructorReference.forEach(System.out::println);
    }

}

class MobilePhone{
    private String name;

    MobilePhone(String name){
        this.name=name;
    }
}
