import java.util.*;

public class Workbook44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String shape = sc.nextLine(); // sc.nextLine();

    double length = 0.0;
    double width = 0.0;
    double radius = 0.0;
    double height = 0.0;
    double base = 0.0;
    

    if (shape.equals("square")) {
      length = sc.nextDouble();
    } else if (shape.equals("rectangle")) {
      length = sc.nextDouble();
      width = sc.nextDouble();
    }

    else if (shape.equals("triangle")) {
      height = sc.nextDouble();
      base = sc.nextDouble();
    } else if (shape.equals("circle")) {
      radius = sc.nextDouble();

    } else {
      System.out.println("invalid shape taken");
      System.exit(0);
    }

    double area = measure(shape, length, width, radius, height, base);

    stringPrinter(length, height, base, radius, width, area, shape);

  }

  public static double measure(String shape, double length, double width, double radius, double height, double base) {

    double area = 0.0;
    if (shape.equals("square")) {
      area = measureSquare(length);
    } else if (shape.equals("rectangle")) {
      area = measureRectangle(length, width);
    } else if (shape.equals("triangle")) {
      area = measureTriangle(height, base);
    } else if (shape.equals("circle")) {
      area = measureCircle(radius);
    }
    return area;
  }

  public static double measureRectangle(double length, double width) {
    if (length < 0 || width < 0) {
      System.out.println("the  length   and width cannot be neg");
      System.exit(0); // bujhinai

    }
    double area = length * width;
    return area; // return is the last that runs in a func(break)

  }

  public static double measureSquare(double length) {
    if (length < 0) {
      System.out.println("the  length   and width cannot be neg");
      System.exit(0); // bujhinai

    }
    double area = length * length;
    return area; // return is the last that runs in a func(break)

  }

  public static double measureTriangle(double height, double base) {
    if (height < 0 || base < 0) {
      System.out.println("the  length   and width cannot be neg");
      System.exit(0); // bujhinai

    }
    double area = (base * height) / 2;
    return area; // return is the last that runs in a func(break)

  }

  public static double measureCircle(double radius) {
    if (radius < 0) {
      System.out.println("the  radius cannot be neg");
      System.exit(0); // bujhinai

    }
    double area = Math.PI * Math.pow(radius, 2);
    return area; // return is the last that runs in a func(break)

  }

  public static void stringPrinter(double length, double height, double base, double radius, double width, double area,
      String shape) {// option bujhini, meassure konta nibe
    System.out.println("the area of the " + shape + " with l " + length + "  and w " + width + " is " + area);
  }
  
}
