package com.actions.emislabbackend.model;

public enum WorkType {

    METALO_CERAMICA(195),
    METALO_CERAMICA_ONE(165),
    MCP_FIZIONOMIC(165),
    CERAMICA_ZIRKONIU(500),
    EMAX(500),
    CERAMICA_SINTER(230),
    DCR(50),
    REPARATIE_PROTEZA(70),
    PROTEZA_TOTALA(350),
    REBAZARE(100),
    MODEL_STUDIU(50),
    PROTEZA_SCHELETATA(1300),
    PROVIZORII(50),
    FREZ_BONT_IMPLANT(50),
    ALLON_46(300),
    DCR_EMAX(250),
    GUTIERE(100);


    private final int price;

    public int getPrice() {
        return price;
    }

    WorkType(int price) {
        this.price = price;
    }

    public String getName(WorkType workType){
        return workType.name();
    }
}
