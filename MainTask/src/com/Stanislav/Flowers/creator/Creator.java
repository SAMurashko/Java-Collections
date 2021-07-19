package com.Stanislav.Flowers.creator;

import com.Stanislav.Flowers.entity.*;
import com.Stanislav.Flowers.exception.FlowerException;
import com.sun.istack.internal.logging.Logger;

public class Creator {

    private static Logger LOG = Logger.getLogger(Creator.class);

    public static CutFlower rose1;
    public static CutFlower rose2;
    public static CutFlower rose3;
    public static CutFlower rose4;
    public static CutFlower tulip1;
    public static CutFlower tulip2;
    public static CutFlower lilium1;
    public static CutFlower lilium2;
    public static CutFlower lilium3;

    public static GardenFlower thoren;
    public static GardenFlower kermek;
    public static GardenFlower kereopsis;

    public static MeadowFlower aconite;
    public static MeadowFlower cornflower;
    public static MeadowFlower lupine;


    public static Accessory ribbon;
    public static Accessory ribbon2;
    public static Accessory cover;

    public static Bouquet bouquet = new Bouquet();

    public void createObjects(){
        //CutFlowers
        try {
            rose1 = new CutFlower("rose1", "red", 54, 70, 20);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            rose2 = new CutFlower("rose2", "yellow", 45, 50, 60);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            rose3 = new CutFlower("rose3", "blue", 40, 40, 70);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            rose4 = new CutFlower("rose4", "red", 31, 30, 30);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            tulip1 = new CutFlower("tulip1", "blue", 31, 30, 74);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            tulip2 = new CutFlower("tulip2", "yellow", 19, 24, 91);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            lilium1 = new CutFlower("lilium1", "white", 90, 45, 41);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            lilium2 = new CutFlower("lilium2", "white", 93, 48, 49);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            lilium3 = new CutFlower("lilium3", "pink", 78, 40, 35);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        //GardenFlowers
        try {
            thoren = new GardenFlower("thoren", "violet", 112, 61, 42);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            kermek = new GardenFlower("kermek", "blue", 81, 43, 64);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            kereopsis = new GardenFlower("kereopsis", "yellow", 54, 71, 21);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        //MeadowFlowers
        try {
            aconite = new MeadowFlower("aconite", "blue", 34, 74, 84);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            cornflower = new MeadowFlower("cornflower", "light-blue", 23, 24, 78);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            lupine = new MeadowFlower("lupine", "blue", 21, 23, 91);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        //Accessories
        try {
            ribbon = new Accessory("ribbon", 4);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            ribbon2 = new Accessory("ribbon2", 3);
        } catch (FlowerException e){
            e.printStackTrace();
        }
        try {
            cover = new Accessory("cover", 7);
        } catch (FlowerException e){
            e.printStackTrace();
        }
    }

    public void createBouquet1(){
        try {
            bouquet.addToBouquet(rose1);
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        try {
            bouquet.addToBouquet(tulip2);
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        try {
            bouquet.addToBouquet(lilium3);
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        try {
            bouquet.addToBouquet(rose2);
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        try {
            bouquet.addToBouquet(rose3);
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        try {
            bouquet.addToBouquet(ribbon);
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        try {
            bouquet.addToBouquet(ribbon2);
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        try {
            bouquet.addToBouquet(cover);
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        LOG.config("Using method createBouquet1");
    }

}
