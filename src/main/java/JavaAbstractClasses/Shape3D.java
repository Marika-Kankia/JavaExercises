package JavaAbstractClasses;

abstract class Shape3D {
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
    protected double radius;
    protected double sideLength;
    public Shape3D(double radius) {
        this.radius = radius;
    }

}
class Sphere extends Shape3D{
    public Sphere(double radius){
        super(radius);
    }


    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D{
    public Cube(double sideLength) {
        super(sideLength);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

 class Main5 {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(7.0);
        Shape3D cube = new Cube(6.0);

        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
    }
}

