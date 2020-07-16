package com.actions.emislabbackend.model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        blabla("EMAX");


    }
 public static void blabla(String workType) {
     WorkType wt = null;
     List<WorkType> workTypeList = WorkType.getWorkTypeList();
     for (WorkType type : workTypeList) {
         if (type.getName().equals(workType)) {
             wt = type;
         }
     }
     System.out.println(wt.getName()+ " "+wt.getPrice());

 }
}
