class calculator_6 {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main_6{
    public static void main(String[] args) {
        calculator_6 calculator = new calculator_6();
        System.out.println("Addition of two integers: " + calculator.add(5, 10));
        System.out.println("Addition of two doubles: " + calculator.add(5.5, 2.2));
        System.out.println("Addition of three integers: " + calculator.add(1, 2, 3));
    }
}