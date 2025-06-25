package com.kata.kataexpensereportback.domain;

public enum Category {
    TRANSPORTATION("Transport"),
    MEAL("Meal"),
    FURNITURE("Furniture"),
    OTHER("Other");

    private final String name;

    Category(String name) {
        this.name = name;
    }
}