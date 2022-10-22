package org.example;

public class Box {
   public int value;
    Box nextBox;
    public Box(int value) {
        this.value = value;
    }

   public Box get(int a){
        if(a==0) return this;
        return nextBox.get(a-1);
   }

}
