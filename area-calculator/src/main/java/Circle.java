public class Circle implements AreaShape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return (double) (2 * Math.PI * this.radius);
    }

    @Override
    public void draw() {
        System.out.println("circle");
    }
}
