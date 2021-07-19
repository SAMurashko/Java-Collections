package com.Stanislav.Flowers.entity;

import com.Stanislav.Flowers.exception.FlowerException;
import com.Stanislav.Flowers.utility.IdGenerator;
import com.sun.istack.internal.logging.Logger;

public abstract class AbstractFlower {

    private static Logger LOG = Logger.getLogger(AbstractFlower.class);

    private int id;
    private String name;
    private String color;
    private int price;
    private int length;

    public AbstractFlower(String name, String color, int price, int length) throws FlowerException {
        super();
        this.id = IdGenerator.generateIdFlower();
        if (name.isEmpty()){
            throw new FlowerException("Name can not be null.");
        }
        this.name = name;
        if (color.isEmpty()){
            throw new FlowerException("Color can not be null.");
        }
        this.color = color;
        if (price < 0) {
            throw new FlowerException("Price can not be less then 0.");
        }
        this.price = price;
        if (length < 0) {
            throw new FlowerException("Length can not be less then 0.");
        }
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }
}
