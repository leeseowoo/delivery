package com.seowoo.delivery.catalog.food.domain;

import java.util.List;

public class Food {

    private long id;

    private String name;

    private int price;

    private String description;

    private boolean soldOut;

    private List<FoodOption> foodOptionList;
}
