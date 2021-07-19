package com.Stanislav.Flowers.entity;

import com.Stanislav.Flowers.exception.FlowerException;
import com.sun.istack.internal.logging.Logger;

import java.util.ArrayList;
import java.util.Iterator;

public class Bouquet {

    private static Logger LOG = Logger.getLogger(Bouquet.class);

    private ArrayList<CutFlower> bouquetFlowers = new ArrayList<CutFlower>();
    private ArrayList<Accessory> bouquetAccessories = new ArrayList<Accessory>();

    public Bouquet() {
    }

    public ArrayList<CutFlower> getBouquetFlowers() {
        ArrayList<CutFlower> clonBouquetFlowers = new ArrayList<CutFlower>();
        clonBouquetFlowers.addAll(bouquetFlowers);
        return clonBouquetFlowers;
    }

    public ArrayList<Accessory> getBouquetAccessories() {
        ArrayList<Accessory> clonBouquetAccessories = new ArrayList<Accessory>();
        clonBouquetAccessories.addAll(bouquetAccessories);
        return clonBouquetAccessories;
    }

    public void addToBouquet(CutFlower cutFlower) throws FlowerException {
        if (cutFlower == null){
            throw new FlowerException("CutFlower for bouquet can not be null.");
        }
        this.bouquetFlowers.add(cutFlower);
    }

    public void addToBouquet(Accessory accessory) throws FlowerException {
        if (accessory == null){
            throw new FlowerException("Accessory for bouquet can not be null.");
        }
        this.bouquetAccessories.add(accessory);
    }


    public void removeFlowerFromBouquet(int id) {
        for (int i = 0; i < bouquetFlowers.size(); i++) {
            if (bouquetFlowers.get(i).getId() == id) {
                bouquetFlowers.remove(i);
            }
        }
    }

    public void removeAccessoryFromBouqet(int id){
        for (int i = 0; i < bouquetAccessories.size(); i++) {
            if (bouquetAccessories.get(i).getId() == id) {
                bouquetAccessories.remove(i);
            }
        }
    }

    public int calculateTotalPrice(){
        int totalPrice = 0;
        for (CutFlower cutFlower : this.bouquetFlowers){
            totalPrice = totalPrice + cutFlower.getPrice();
        }
        for (Accessory accessory : this.bouquetAccessories){
            totalPrice = totalPrice + accessory.getPrice();
        }

        return totalPrice;
    }

    @Override
    public String toString(){
        Iterator iteratorFlower = bouquetFlowers.iterator();
        Iterator iteratorAccessory = bouquetAccessories.iterator();
        String toReturn = "Bouquet:\n";
        while(iteratorFlower.hasNext()){
            toReturn = toReturn + iteratorFlower.next() + "\n";
        }
        while(iteratorAccessory.hasNext()){
            toReturn = toReturn + iteratorAccessory.next() + "\n";
        }

        return toReturn;
    }

}
