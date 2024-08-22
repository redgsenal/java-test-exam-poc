package com.exam.test1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SomeThing thinghere = new SomeThing("hello1", "test2", 1, List.of("1", "a", "b", "c"));
        System.out.println(thinghere.getProperty1());
        System.out.println(thinghere.getProperty4());
    }

}
