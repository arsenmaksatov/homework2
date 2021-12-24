package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(number( 78,12));
        System.out.println(number( 23,50));
        System.out.println(number( 45,11));
        System.out.println(number( 87,41));
    }

    public static String number (int agePerson,int temperature){

     if (agePerson > 20 && agePerson < 45 && temperature >=20 && temperature <=30) {
         return "можно идти гулять";
     }else if (agePerson <= 20&& temperature>=0&& temperature<=28){
         return "можно идти гулять";
     }else if (agePerson>= 45 && temperature >= -10 && temperature <= 25){
         return "можно идти гулять";
     } else {
         return "остовайтесь дома";
     }
    }



}
