package com.learning.chapter08.article49;

public class Main49 {

    public static void main(String[] args){
        TestNull testNull = new TestNull(3);
        testNull.addPostive(2);
        System.out.println(testNull.getX());
        testNull.addPostive(-2);
        System.out.println(testNull.getX());
    }
}
