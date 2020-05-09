package com.learning.chapter02.article01;

/*
    用静态工厂方法代替构造器
 */

class Student extends Person{
    private int age;
    private String sex;
    private int score;

    public Student(int age, String sex, int score){
        super(age,sex);
        this.score = score;
    }

}


public class Person {
    private int age;
    private String sex;

    private static Person person = new Person(1,"male");

    public Person(int age,String sex){
        this.age = age;
        this.sex = sex;
    }

    /*
    不必在每次调用它们的时候都创建一个新对象
     */
    private Person getPerson(){
        return this.person;
    }

    /*
       返回原返回类型的任何子类型
     */
    public static Person CreateStudent(int age, String sex, int score){
        return new Student(age,sex,score);
    }


}
