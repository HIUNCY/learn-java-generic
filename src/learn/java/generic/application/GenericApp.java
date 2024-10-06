package learn.java.generic.application;

import learn.java.generic.MyData;
import learn.java.generic.Pair;

public class GenericApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Ajay");
        MyData<Integer> integerMyData = new MyData<Integer>(100);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());

        Pair<String, Integer> pair = new Pair<String, Integer>("Ajay", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
