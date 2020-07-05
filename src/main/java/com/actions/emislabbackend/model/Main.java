package com.actions.emislabbackend.model;

public class Main {
    public static void main(String[] args) {
        OperationTeeth operationTeeth = new OperationTeeth(1, "Popescu", "Ion", WorkType.METALO_CERAMICA, 3);
        System.out.println(operationTeeth);
    }
}
