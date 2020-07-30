package com.learning.chapter08.article49;

import com.learning.chapter06.article39.Test;

import java.util.Objects;

public class TestNull {

    private Integer x;
    public TestNull(Integer x){
        this.x = Objects.requireNonNull(x);
    }

    public int getX(){
        return x;
    }

    public void addPostive(int y){
        assert y > 0;
        this.x += y;
    }

}
