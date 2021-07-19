package com.Stanislav.Flowers.main;

import com.Stanislav.Flowers.creator.Creator;
import com.Stanislav.Flowers.report.Report;
import com.sun.istack.internal.logging.Logger;

import java.util.logging.LogManager;

public class Main {

    static {
        new DOMConfigurator().notifyAll("log4j.xml", LogManager.getLogManager());
    }

    public static Creator creator = new Creator();

    private static Logger LOG = Logger.getLogger(Main.class);


    public static void main(String[] args) {
        creator.createObjects();
        Report.reportCutFlowerList();
        Report.reportGardenFlowerList();
        Report.reportMeadowFlowerList();
        Report.reportAccessoryList();
        creator.createBouquet1();
        Report.reportUnsortBouquetList();
        Report.reportSortBouquetList();
        Report.reportSearchList();
        Report.reportTotalBouquetPrice();
        LOG.config("End of running.");
    }

}

