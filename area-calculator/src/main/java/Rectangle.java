public class Rectangle implements AreaShape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
