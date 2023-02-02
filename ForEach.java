package LinkedList;

//import java.util.ArrayList;
//import java.util.LinkedList;

public class ForEach {
    
    public static void main(String[] args){
        /*
        String[] array = {"Hello", "Nick", "Kariotis"};
        forArray(array);
        System.out.println();

        ArrayList<String> l = new ArrayList<>();
        LinkedList<String> l2 = new LinkedList<>();

        l.add("First");
        l.add("Second");
        l.add("Third");

        for(String el : l){
            System.out.println(el);
        }
        System.out.println();

        l2.addAll(l);
        for(String el : l2){
            System.out.println(el);
        }
        */

        ArrayList<String> l = new ArrayList<>();
        l.append("Hello");
        l.append("Nick");
        l.append("Kariotis");
        for(String el : l){
            System.out.println(el);
        }

        System.out.println();

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.append(2);
        l2.append(4);
        l2.append(6);
        for(int el: l2){
            System.out.println(el);
        }




    }

    public static void forArray(String[] array){

        for( String el : array){
            System.out.println(el);
        }
    }
}
