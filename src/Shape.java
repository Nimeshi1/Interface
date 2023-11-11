public interface Shape {
    abstract void getArea();
    default void getSides() {
        System.out.println("Sides of this Shape,");
    }
}
class Rectangle implements Shape {
    public void getArea() {
        int length = 10;
        int width = 15;
        int area = length*width;
        System.out.println("Area of Rectangle: -"+ area);
    }

    @Override
    public void getSides() {
        System.out.println("I have 2 sides");
    }
}
class Square implements Shape {
    @Override
    public void getArea() {
        int length = 20;
        int area = length*length;
        System.out.println("Area of Squre: -"+ area);
    }

    @Override
    public void getSides() {
        System.out.println("tyyyyy");
    }
}
class Test1 {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        r.getArea();
        r.getSides();
        Shape s = new Square();
        s.getArea();
        s.getSides();
    }
}
