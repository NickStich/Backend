package com.actions.emislabbackend.model.employees;

import com.actions.emislabbackend.model.Percent;
import com.actions.emislabbackend.model.WorkType;

import java.util.*;

public class EmployeeAmountDistribution {

    public static Map<String, List<Percent>> getEmployeeAmountDistribution() {

        Map<String, List<Percent>> employeeMapPercent = new HashMap<>();
        List<Percent> timeeaList = new ArrayList<>();
        timeeaList.add(new Percent(WorkType.METALO_CERAMICA,WorkType.METALO_CERAMICA.getPrice()*0.41));
        timeeaList.add(new Percent(WorkType.METALO_CERAMICA_ONE,WorkType.METALO_CERAMICA_ONE.getPrice()*0.335));
        timeeaList.add(new Percent(WorkType.MCP_FIZIONOMIC,WorkType.MCP_FIZIONOMIC.getPrice()*0.335));
        timeeaList.add(new Percent(WorkType.CERAMICA_ZIRKONIU,WorkType.CERAMICA_ZIRKONIU.getPrice()*0.2));
        timeeaList.add(new Percent(WorkType.EMAX,WorkType.EMAX.getPrice()*0.2));
        timeeaList.add(new Percent(WorkType.CERAMICA_SINTER,WorkType.CERAMICA_SINTER.getPrice()*0.35));

        List<Percent> paulaList = new ArrayList<>();
        paulaList.add(new Percent(WorkType.METALO_CERAMICA,WorkType.METALO_CERAMICA.getPrice()*0.105));
        paulaList.add(new Percent(WorkType.METALO_CERAMICA_ONE,WorkType.METALO_CERAMICA_ONE.getPrice()*0.105));
        paulaList.add(new Percent(WorkType.MCP_FIZIONOMIC,WorkType.MCP_FIZIONOMIC.getPrice()*0.105));
        paulaList.add(new Percent(WorkType.DCR,WorkType.DCR.getPrice()*0.3));
        paulaList.add(new Percent(WorkType.REPARATIE_PROTEZA,WorkType.REPARATIE_PROTEZA.getPrice()*0.7));
        paulaList.add(new Percent(WorkType.PROTEZA_TOTALA,WorkType.PROTEZA_TOTALA.getPrice()*0.285));
        paulaList.add(new Percent(WorkType.MODEL_STUDIU,WorkType.MODEL_STUDIU.getPrice()*0.2));
        paulaList.add(new Percent(WorkType.REBAZARE,WorkType.REBAZARE.getPrice()*0.5));

        List<Percent> emiList = new ArrayList<>();
        emiList.add(new Percent(WorkType.METALO_CERAMICA,WorkType.METALO_CERAMICA.getPrice()*0.485));
        emiList.add(new Percent(WorkType.METALO_CERAMICA_ONE,WorkType.METALO_CERAMICA_ONE.getPrice()*0.56));
        emiList.add(new Percent(WorkType.MCP_FIZIONOMIC,WorkType.MCP_FIZIONOMIC.getPrice()*0.56));
        emiList.add(new Percent(WorkType.CERAMICA_ZIRKONIU,WorkType.CERAMICA_ZIRKONIU.getPrice()*0.8));
        emiList.add(new Percent(WorkType.EMAX,WorkType.EMAX.getPrice()*0.8));
        emiList.add(new Percent(WorkType.CERAMICA_SINTER,WorkType.CERAMICA_SINTER.getPrice()*0.65));
        emiList.add(new Percent(WorkType.DCR,WorkType.DCR.getPrice()*0.7));
        emiList.add(new Percent(WorkType.REPARATIE_PROTEZA,WorkType.REPARATIE_PROTEZA.getPrice()*0.3));
        emiList.add(new Percent(WorkType.PROTEZA_TOTALA,WorkType.PROTEZA_TOTALA.getPrice()*0.715));
        emiList.add(new Percent(WorkType.MODEL_STUDIU,WorkType.MODEL_STUDIU.getPrice()*0.8));
        emiList.add(new Percent(WorkType.REBAZARE,WorkType.REBAZARE.getPrice()*0.5));
        emiList.add(new Percent(WorkType.PROTEZA_SCHELETATA,WorkType.PROTEZA_SCHELETATA.getPrice()));
        emiList.add(new Percent(WorkType.PROVIZORII,WorkType.PROVIZORII.getPrice()));
        emiList.add(new Percent(WorkType.FREZ_BONT_IMPLANT,WorkType.FREZ_BONT_IMPLANT.getPrice()));
        emiList.add(new Percent(WorkType.ALLON_46,WorkType.ALLON_46.getPrice()));
        emiList.add(new Percent(WorkType.DCR_EMAX,WorkType.DCR_EMAX.getPrice()));
        emiList.add(new Percent(WorkType.GUTIERE,WorkType.GUTIERE.getPrice()));

        employeeMapPercent.put("Timeea", timeeaList);
        employeeMapPercent.put("Paula", paulaList);
        employeeMapPercent.put("Emi", emiList);

        return employeeMapPercent;
    }

}
