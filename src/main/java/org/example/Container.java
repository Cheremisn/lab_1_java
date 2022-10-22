package org.example;

public class Container {
    int length = 0;
    Box startBox;
    public void add(int value){
        if(length==0) startBox=new Box(value);
        else {
            startBox.get(length-1).nextBox = new Box(value);
        }
        length++;
    }

    public Box get(int a) {
        return startBox.get(a);
    }

    public void remove(int i){
       Box box;
       if(length==1) startBox=null;
        if(i==0) startBox=startBox.nextBox;
        else {
            box = startBox.get(i - 1);
            if (box.nextBox != null && box.nextBox.nextBox != null)
                box.nextBox = box.nextBox.nextBox;
        }
        length--;
    }


}
