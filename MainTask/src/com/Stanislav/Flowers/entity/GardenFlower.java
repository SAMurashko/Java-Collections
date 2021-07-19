package com.Stanislav.Flowers.entity;

import com.Stanislav.Flowers.exception.FlowerException;
import com.sun.istack.internal.logging.Logger;

public class GardenFlower extends AbstractFlower {

    private static Logger LOG = Logger.getLogger(GardenFlower.class);

    private int growth;

    public GardenFlower(String name, String color, int price, int length, int growth) throws FlowerException {
        super(name,color,price,length);
        if (growth <= 0 || growth > 100){
            throw new FlowerException("Growth can not be less then 1% or more then 100%.");
        }
        this.growth = growth;
    }

    public int getGrowth() {
        return growth;
    }

    @Override
    public String toString(){
        return "Flower: " + this.getName() +
                ". Color: " + this.getColor() +
                ". Price: " + this.getPrice() +
                ". Length: " + this.getLength() +
                ". Growth: " + this.growth + "%.";
    }

}
