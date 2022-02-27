package com.company.data;

public class Flat {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int area; //Значение поля должно быть больше 0
    private Long numberOfRooms; //Поле может быть null, Значение поля должно быть больше 0
    private Boolean furniture; //Поле не может быть null
    private Long timeToMetroOnFoot; //Значение поля должно быть больше 0
    private View view; //Поле не может быть null
    private House house; //Поле может быть null

    public Flat(Integer id, String name, Coordinates coordinates, java.time.ZonedDateTime creationDate, int area,
                Long numberOfRooms, Boolean furniture, Long timeToMetroOnFoot, View view, House house) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.furniture = furniture;
        this.timeToMetroOnFoot = timeToMetroOnFoot;
        this.view = view;
        this.house = house;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public java.time.ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public int getArea() {
        return area;
    }

    public Long getNumberOfRooms() {
        return numberOfRooms;
    }

    public Boolean getFurniture() {
        return furniture;
    }

    public Long getTimeToMetroOnFoot() {
        return timeToMetroOnFoot;
    }

    public View getView() {
        return view;
    }

    public House getHouse() {
        return house;
    }


}

