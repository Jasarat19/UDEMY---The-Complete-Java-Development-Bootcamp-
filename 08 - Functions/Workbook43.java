public class Workbook43 {
    public static void main(String[] args) {
        double noon = 77.0;
        double evening = 61.0;
        double midnight = 55.0;
            
        double measure1 = fahrenheitToCelsius(noon);
        double measure2 = fahrenheitToCelsius(evening);
        double measure3 = fahrenheitToCelsius(midnight);
        printTemperatures(noon,measure1);
        printTemperatures(evening,measure2);
        printTemperatures(midnight, measure3);


   }
 

    public static double fahrenheitToCelsius(double fahrenheit) { /* void will be replaced by double */
        double celsius =  (fahrenheit - 32) * 5/9;
        return celsius; 

    }

    public static void printTemperatures(double fahrenheit, double celsiun) {
        System.out.println("F :" + fahrenheit );
        System.out.println("C :" + celsiun + "\n");

    }
}