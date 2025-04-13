class Shape {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Tools{
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5);

        System.out.println("Area of square: " + shape.calculateArea(4));
        System.out.println("Area of rectangle: " + shape.calculateArea(4, 6));
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}