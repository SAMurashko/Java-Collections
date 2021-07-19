package com.Stanislav.Flowers.entity;

import com.Stanislav.Flowers.exception.FlowerException;
import com.Stanislav.Flowers.utility.IdGenerator;
import com.sun.istack.internal.logging.Logger;

public class Accessory {

    private static Logger LOG = Logger.getLogger(Accessory.class);

    private int id;
    private String name;
    private int price;

    public Accessory(String name, int price) throws FlowerException {
        super();
        this.id = IdGenerator.generateIdAccessory();
        if (name.isEmpty()){
            throw new FlowerException("Name can not be null.");
        }
        this.name = name;
        if (price < 0) {
            throw new FlowerException("Price can not be less then 0.");
        }
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Accessory: " + this.getName() +
                ". Price: " + this.getPrice();
    }

}
