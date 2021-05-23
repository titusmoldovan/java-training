package com.company;
/*
* Author: Lutencu Octaviam
* Task: Two Fighters
* */
import com.company.fighters.GermanyFighter;
import com.company.fighters.HungarianFighter;
import com.company.fighters.ItalianFigher;
import com.company.fighters.RomanianFighter;
import com.company.match.BoxingMatch;

public class Main {

    public static void main(String[] args) {

        RomanianFighter romanianFighter = new RomanianFighter("Ion");
        ItalianFigher italianFigher = new ItalianFigher("Alberto");
        GermanyFighter germanyFighter = new GermanyFighter("Otto");
        HungarianFighter hungarianFighter = new HungarianFighter("Janush");

        BoxingMatch boxingMatch1 = new BoxingMatch(romanianFighter, germanyFighter);
        System.out.println("Fitght between " + romanianFighter.getName() + " and " + germanyFighter.getName());
        System.out.println("The winner is: " + boxingMatch1.fight());

        BoxingMatch boxingMatch2 = new BoxingMatch(italianFigher, hungarianFighter);
        System.out.println("Fitght between " + italianFigher.getName() + " and " + hungarianFighter.getName());
        System.out.println("The winner is: " + boxingMatch2.fight());

    }
}
