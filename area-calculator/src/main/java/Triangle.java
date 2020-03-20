public class Triangle implements AreaShape {
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ( this.base * this.height ) / 2;
    }

    @Override
    public void draw() {
        System.out.println("triangle");
    }
}
