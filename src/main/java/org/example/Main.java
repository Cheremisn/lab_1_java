package org.example;

public class Main {
    public static void main(String[] args) {
        MyArray cont= new MyArray();
        cont.add(21);
        cont.add(322);
        cont.add(4342);
        cont.get(1);
        cont.remove(2);
       for(int i=0;i< cont.length;i++) {
           System.out.println(cont.get(i).value);
       }


    }
}
