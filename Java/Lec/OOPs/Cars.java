public class Cars {
    int price;
    String color;
    int speed;

    public Cars() {
        

    }
    public Cars(int price, int speed, String color) {
        this.speed = speed;
        this.price = price;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Cars [price=" + price + ", color=" + color + ", speed=" + speed + "]";
    }
}