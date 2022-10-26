package ro.uvt.p3.io;

import ro.uvt.p3.Apple;
import ro.uvt.p3.Banana;
import ro.uvt.p3.Fruit;



public class InputDevice {

    public String nextLine(){
        return "The quick brown fox jumps over the lazy dog.";
    }
    public Fruit[] readFruit()
    {
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Apple(100, 20,70, Fruit.Color.red);
        fruits[1] = new Banana(100, 20,70);
        fruits[2] = new Banana(800, 15,80);
        fruits[3] = new Apple(120, 20,60, Fruit.Color.yellow);
        fruits[4] = new Apple(110, 15,65, Fruit.Color.green);
        return fruits;
    }
}
