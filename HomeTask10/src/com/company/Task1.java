package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        String[] name = {"Tom", "Alice", "Bob", "Tom", "Tom", "Alice", "Sam"};
        ArrayList <String> people = new ArrayList<>();

        for( int i=0; i< name.length; i++){
            people.add(name[i]);
        }

        Map <String, Integer> countPeople = new HashMap<>();
        for(int i=0; i<people.size(); i++){
            int count = 1;
            if(!countPeople.containsKey(people.get(i))){
                for(int j=i+1; j<people.size(); j++){
                    if(people.get(i).equals(people.get(j))){
                        count++;
                    }
                }
                if (count>1){
                    countPeople.put(people.get(i), count);
                }
            }
        }
        System.out.println(countPeople);
        // Или второе решение ( с лямбдой):
        /*for(String item : people){
            if (countPeople.containsKey(item)){
                countPeople.put(item, countPeople.get(item) + 1);

            }else {
                countPeople.put(item, 1);
            }
        }
        countPeople.values().removeIf(value -> value.equals(1));

        System.out.println(countPeople);*/

    }
}
