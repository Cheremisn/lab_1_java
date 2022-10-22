import org.example.MyArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.jupiter.api.Test
    void test1(){
        MyArray cont= new MyArray();
        cont.add(21);
        cont.add(322);
        cont.add(4342);
        assertEquals(cont.get(0).value,21);

    }
    @org.junit.jupiter.api.Test
    void test2(){
        MyArray cont= new MyArray();
        cont.add(1);
        cont.add(1322);
        cont.add(4342);
        cont.remove(1);
        assertEquals(cont.get(0).value,1);
        assertEquals(cont.get(1).value,4342);
    }
    @org.junit.jupiter.api.Test
    void test3(){
        MyArray cont= new MyArray();
        cont.add(-13);
        cont.add(-233);
        cont.add(33);
        cont.add(4233);
        cont.add(411);
        assertEquals(cont.get(0).value,-13);
        assertEquals(cont.get(1).value,-233);
        assertEquals(cont.get(4).value,411);

    }
}
