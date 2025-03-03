import java.util.Scanner;
class AreaofRectangle {
   public static void main(String args[]){
      int length, breadth, area;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the length of the rectangle ::");
      length = sc.nextInt();
      System.out.print("Enter the breadth of the rectangle ::");
      breadth = sc.nextInt();
      area = length* breadth;
      System.out.println("Area of the rectangle is ::"+area);
   }
}