package io.github.guilhermemelo01.programming.roadmap.computer_science.data_structure.hashtable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
//        Map<String, Double> frutas = new HashMap<>();
        Hashtable<String, Double> frutas = new Hashtable<>();
        frutas.put("Banana", 1.0);
        frutas.put("Maça", 3.50);
        frutas.put("Morango", 8.0);

//        Double valorBanana = frutas.get("Banana");
//        System.out.println(valorBanana);
//
//        if(frutas.containsKey("Maça")){
//            Double valorMaca = frutas.get("Maça");
//            System.out.println(valorMaca);
//        }
//
//        Double valorDefault = frutas.getOrDefault("Banana", 5.0);
//        System.out.println(valorDefault);

        frutas.values().forEach(System.out::println);
    }
}
