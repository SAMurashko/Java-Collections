package com.Stanislav.Flowers.utility;

import com.sun.istack.internal.logging.Logger;

public final class IdGenerator {

    private static Logger LOG = Logger.getLogger(IdGenerator.class);

    private static int idFlower = 0;
    private static int idAccessory = 0;

    public static int generateIdFlower() {
        idFlower++;
        return idFlower;
    }

    public static int generateIdAccessory(){
        idAccessory++;
        return idAccessory;
    }
}
