package ro.uvt.p3;

public abstract class Fruit {
    float weight;
    int sugarContent;
    int waterContent;
    Color color;

    public Fruit(float weight, int sugarContent, int waterContent, Color color) {
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.waterContent = waterContent;
        this.color = color;
    }

    public enum Color{
        red, blue, yellow, purple
    }
}


