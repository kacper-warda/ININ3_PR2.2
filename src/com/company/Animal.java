package com.company;

public class Animal {
    //konfiguracja
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.3;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;

    //pola / przechowywanie danych
     String species;
    String name;
    private Double weight;
    Integer age;
    Boolean alive;

    //konstruktory
//    Animal(String species) {
//        this.species = species; // wartość z parametru
//        this.alive = true; //wartość domyślna
//
//        if (this.species.equals("canis")) {
//            this.weight = DEFAULT_DOG_WEIGHT;
//        } else if (this.species.equals("felis")) {
//            this.weight = DEFAULT_CAT_WEIGHT;
//        } else {
//            this.weight = DEFAULT_ANIMAL_WEIGHT;
//        }
//    }

    //metody
    void feed() {
        this.weight++;
        System.out.println("moja waga to: " + this.weight);
    }

    void feed(Double foodWeight) {
        this.weight += foodWeight;
        System.out.println("moja waga to: " + this.weight);
    }

    Double getWeight() {
        return this.weight;
    }

    void resetWeightToDefault(){
        this.weight = DEFAULT_ANIMAL_WEIGHT;
    }
}
