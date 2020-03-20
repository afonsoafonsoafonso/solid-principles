public class Ellipse implements AreaShape {
    int x_radius;
    int y_radius;

    public Ellipse(int x_radius, int y_radius) {
        this.x_radius = x_radius;
        this.y_radius = y_radius;
    }

    public int getX_radius() {
        return x_radius;
    }

    public int getY_radius() {
        return y_radius;
    }

    @Override
    public double getArea() {
        return (double) (Math.PI * this.x_radius * this.y_radius);
    }

    @Override
    public void draw() {
        System.out.println("ellipse");
    }
}
