import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String shape = sc.nextLine();; // sc.nextLine();
    String option = sc.nextLine();; // sc.nextLine();
    double length = 0.0;
    double width = 0.0;

    if(shape.equals("square")){
      length = sc.nextDouble();
    }
    else if(shape.equals("rectangle")){
      length = sc.nextDouble();
      width = sc.nextDouble();
    }
    
    double measure = 0.0;

    if(shape.equals("square"))
    {
      measure = measureSquare(length, option);
    }
    else if(shape.equals("rectangle")) {
      measure = measureRectangle(length, width, option);
    }else {
      measure = 404;
    }

    stringPrinter(length, width, measure, option, shape);
    // stringPrinter(1.2, 1.3, measure2, "perimeter");

  }

  public static double measureRectangle(double length, double width, String option) {
    if (length < 0 || width < 0) {
      System.out.println("the  length   and width cannot be neg");
      System.exit(0); // bujhinai

    }
    double returnVal = 0.0;
    switch (option) {
      case "area":
      returnVal = length * width; // break lagbe na retuen e break
      return returnVal;
      case "perimeter":
        return 2 * (length + width);
      default:
        return 404;
    }

  }

  public static double measureSquare(double length, String option) {
    if (length < 0) {
      System.out.println("the  length   and width cannot be neg");
      System.exit(0); // bujhinai

    }
    switch (option) {
      case "area":
        return length * length; // break lagbe na retuen e break
      case "perimeter":
        return 2 * length;
      default:
        return 404;
    }

  }

public static void stringPrinter(double length, double width, double measure, String option, String shape) {// option bujhini, meassure konta nibe
    System.out.println("the "+ option + " of the " + shape + " with l " + length + "  and w " + width + " is " + measure);
}
}


// |0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|1| = 1
// |0|0|0|0|0|0|0|1| = 1
// |0|0|0|0|0|0|1|0| = 2
// |1|0|0|0|0|0|1|0| = -2
// .
// .
// .
// |1|1|1|1|1|1|1|1| = 255