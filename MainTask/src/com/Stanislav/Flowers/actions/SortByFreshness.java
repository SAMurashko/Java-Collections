package com.Stanislav.Flowers.actions;

import com.Stanislav.Flowers.entity.CutFlower;
import com.Stanislav.Flowers.exception.FlowerException;
import com.sun.istack.internal.logging.Logger;

import java.util.ArrayList;
import java.util.Collections;

public final class SortByFreshness {

    private static Logger LOG = Logger.getLogger(SortByFreshness.class);

    private SortByFreshness() {
    }

    public static ArrayList<CutFlower> sortByFreshness(ArrayList<CutFlower> bouquetFlowers) throws FlowerException {
        if (bouquetFlowers.isEmpty()){
            throw new FlowerException("Bouquet of flowers can not be empty for sort.");
        }

        Collections.sort(bouquetFlowers, new FlowerFreshnessDescendingOrderComparator());

        return bouquetFlowers;
    }

}