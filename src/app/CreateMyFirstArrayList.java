package app;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateMyFirstArrayList {
    public static void main(String[] args) {
        ArrayList <String> animals = new ArrayList<>();
        
        //Add
        animals.add("Lion");
        System.out.println(animals);
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Cat");
        System.out.println(animals);

        animals.add(2, "Bird");
        System.out.println(animals);


        ArrayList<Integer> firstArrayWithNumbers = new ArrayList<>();
        firstArrayWithNumbers.add(1);
        firstArrayWithNumbers.add(3234);
        ArrayList<Integer> secondArrayWithNumbers = new ArrayList<>(firstArrayWithNumbers);
        System.out.println("firstArray = " + firstArrayWithNumbers);
        System.out.println("secondArray = " + secondArrayWithNumbers);

        
        secondArrayWithNumbers.add(3);
        System.out.println("firstArray = " + firstArrayWithNumbers);
        System.out.println("swcondArray = " + secondArrayWithNumbers);
        

        firstArrayWithNumbers.remove(0);
        System.out.println("After removing");
        System.out.println("firstArray = " + firstArrayWithNumbers);
        System.out.println("secondArray = " + secondArrayWithNumbers);


        //Iterating
        for(int i = 0; i< secondArrayWithNumbers.size();i++) {
            System.out.println(secondArrayWithNumbers.get(i)+ " ");

           
        }
        //Third ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Steve");
        names.add("Bill");


        //Finding the index of element
        System.out.println(names.indexOf("Finding index of John = "+ names.indexOf("John")));

        //Convert ArrayList to Array
        String[] namesArray = names.toArray(new String[names.size()]);
        System.out.println(Arrays.toString(namesArray));
    }
    }
