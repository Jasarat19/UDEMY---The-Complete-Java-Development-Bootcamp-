public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(4.2, 2.3);
        double measure2 = measureRectangle(1.2, 1.3);
        stringPrinter(4.2, 2.3, measure1); // EIKHANE 4.2 R 2.2 KNO LIKHE DILAM INSTEAD OF LENGTH AND WIDTH
        stringPrinter(1.2, 1.3, measure2); 

    }

    public static double measureRectangle(double length, double width) { /* void will be replaced by double */
        double area = length * width;
        return area; // return is the last that runs in a func(break)

    }

    public static void stringPrinter(double length, double width, double area) {
        System.out.println("the area of the rectangle with l " + length + "  and w " + width + " is " + area);
    }
    // parameters are value func expects to receve
    // arguments are .. that we are passing

}
