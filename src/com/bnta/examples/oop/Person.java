package com.bnta.examples.oop;

public class Person {
    private String name;
    private int age;
    private SkinColor skinColor;
    private String nationality;

    public Person() {
    }

    public Person(String name, int age, SkinColor skinColor, String nationality) {
        this.name = name;
        this.age = age;
        this.skinColor = skinColor;
        this.nationality = nationality;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SkinColor getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(SkinColor skinColor) {
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skinColor=" + skinColor +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
