package com.company.data;

public class Coordinates {
    private Integer x; //Максимальное значение поля: 676, Поле не может быть null
    private Long y; //Поле не может быть null

    public Coordinates(Integer x, Long y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Long getY() {
        return y;
    }

}
