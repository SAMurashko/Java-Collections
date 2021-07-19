package com.Stanislav.CatalogList;

import java.io.File;

public class CatalogList {
    public static void main(String[] args) {
        String s = null;
        File dir = new File("C:\\Users\\DELL\\Course\\Java-Collections\\Optional Tasks\\Catalog List\\Изображения");
        readFiles(dir);
    }

    public static void readFiles(File dir) {
        File[] files = dir.listFiles();
        for (File item : files) {
            if (item.isFile()) {
                System.out.println(item.getName() + " файл");
            } else {
                readFiles(item);
            }
        }
    }
}
