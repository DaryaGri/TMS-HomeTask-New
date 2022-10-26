package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        String text = "She sells sea shells at the sea shore, the shells she sells are the sea-shore shells, I’m sure.";
        String[] arrayText = text.split("\\s|,|\\.");
        ArrayList <String> arrayListText = new ArrayList<>();
        for (String word : arrayText){
            arrayListText.add(word);
        }
        Set <String> uniqueWords = new HashSet<>();
        for (String world : arrayListText){
            uniqueWords.add(world.toLowerCase());
            if(world.equals("")){
                uniqueWords.remove(world);
            }
        }
        System.out.println(uniqueWords);

    }
}
