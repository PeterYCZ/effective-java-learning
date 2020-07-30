package com.learning.chapter08.article50;

import java.time.LocalDateTime;
import java.util.Date;

public final class Period2 {
    private final LocalDateTime start;
    private final LocalDateTime end;

    public Period2(LocalDateTime start, LocalDateTime end){
        if(start.compareTo(end) > 0){
            throw new IllegalArgumentException(start + " after " + end);
        }
        this.start =start;
        this.end = end;
    }

    public LocalDateTime start() {
        return start;
    }

    public LocalDateTime end() {
        return end;
    }
}
