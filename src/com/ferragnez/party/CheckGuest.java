package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] guestArray = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        boolean isGuestFound = false;

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("CONTROLLORE: Nome sulla lista?");
        System.out.println("");
        System.out.println("TU:");
        String currentGuest = input.nextLine();
        System.out.println("");

        for (int i = 0; i < guestArray.length; i++) {
            if (guestArray[i].toLowerCase().equals(currentGuest.toLowerCase())) {
                isGuestFound = true;
                break;
            }
        }

        // int index = 0;
        // while (!(isGuestFound)) {
        // if (guestArray[index].toLowerCase().equals(currentGuest.toLowerCase())) {
        // isGuestFound = true;
        // break;
        // } else {
        // index += 1;
        // }
        // }

        if (isGuestFound) {
            System.out.println("CONTROLLORE: Il nome è nella lista, ti do il benvenuto.");
        } else {
            System.out.println("CONTROLLORE: Il nome non è nella lista, non puoi entrare!");
        }
    }
}
