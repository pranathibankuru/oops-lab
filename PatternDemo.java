abstract class PatternPrinter {
    abstract void printPattern(int n);
    
    void displayTitle(String title) {
        System.out.println(title);
    }
}

class StarPattern extends PatternPrinter {
    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  
            }
            System.out.println();
        }
    }
}

class NumberPattern extends PatternPrinter {
    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class PatternDemo{  
    public static void main(String[] args) {
        int rows = 5;
        
        PatternPrinter star = new StarPattern();
        star.displayTitle("Star Pattern");  
        star.printPattern(rows);
        
        PatternPrinter number = new NumberPattern();
        number.displayTitle("Number Pattern");
        number.printPattern(rows);
    }
}