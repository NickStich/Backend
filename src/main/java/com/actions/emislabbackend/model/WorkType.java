package com.actions.emislabbackend.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum WorkType {

    METALO_CERAMICA("METALO_CERAMICA", 195),
    METALO_CERAMICA_ONE("METALO_CERAMICA_ONE", 165),
    MCP_FIZIONOMIC("MCP_FIZIONOMIC", 165),
    CERAMICA_ZIRKONIU("CERAMICA_ZIRKONIU", 500),
    EMAX("EMAX", 500),
    CERAMICA_SINTER("CERAMICA_SINTER", 230),
    DCR("DCR", 50),
    REPARATIE_PROTEZA("REPARATIE_PROTEZA", 70),
    PROTEZA_TOTALA("PROTEZA_TOTALA", 350),
    REBAZARE("REBAZARE", 100),
    MODEL_STUDIU("MODEL_STUDIU", 50),
    PROTEZA_SCHELETATA("PROTEZA_SCHELETATA", 1300),
    PROVIZORII("PROVIZORII", 50),
    FREZ_BONT_IMPLANT("FREZ_BONT_IMPLANT", 50),
    ALLON_46("ALLON_46", 300),
    DCR_EMAX("DCR_EMAX", 250),
    GUTIERE("GUTIERE", 100);

    private final String name;
    private final int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    WorkType(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public static List<WorkType> getWorkTypeList() {
        WorkType[] enumConstants = WorkType.class.getEnumConstants();
        return new ArrayList<>(Arrays.asList(enumConstants));
    }
}
