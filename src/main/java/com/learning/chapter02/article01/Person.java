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

class teacher {
    private int age;
    private String sex;

    public teacher(int age,String sex){
        this.age = age;
        this.sex = sex;
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
    方法有名称
    */
    public static teacher createTeather(int age,String sex){
        return new teacher(age,sex);
    }


    /*
    不必在每次调用它们的时候都创建一个新对象
     */
    private static Person getPerson(){
        return person;
    }

    /*
       返回原返回类型的任何子类型
     */
    public static Person CreateStudent(int age, String sex, int score){
        return new Student(age,sex,score);
    }


}
