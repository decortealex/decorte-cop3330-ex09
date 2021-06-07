/*
 * UCF COP3330 Summer 2021 Assignment 9 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class solution09 {
    public static void main(String[] args) {
        final int areaPerGallon = 350;
        double len, width, area, gallons;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room? ");
        len = Integer.parseInt(in.nextLine());
        System.out.print("What is the width of the room? ");
        width = Integer.parseInt(in.nextLine());

        area = len * width;
        gallons = Math.ceil(area / areaPerGallon);


        System.out.printf("You will need to purchase %.1f gallons of paint to cover %.3f square feet.",
                gallons, area);
    }
}
