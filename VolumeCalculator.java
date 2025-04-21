abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurface();
}

class Sphere extends Shape3D {
    int radius;
    
    Sphere(int radius) {
        this.radius = radius;
    }
    
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    double calculateSurface() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D {
    int side;
    
    Cube(int side) {
        this.side = side;
    }
    
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    double calculateSurface() {
        return 6 * Math.pow(side, 2);
    }
}

public class VolumeCalculator{  
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(4);
        
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurface());
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurface());
    }
}