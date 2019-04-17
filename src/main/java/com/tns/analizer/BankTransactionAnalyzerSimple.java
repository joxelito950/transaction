package com.tns.analizer;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class BankTransactionAnalyzerSimple {

    private static final String FILE = "src/test/resources/transactions.csv";

    public void execute() {
        try{
            System.out.println("Estamos listos para empezar!!");
        }catch (Exception e){
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }

    }

}




