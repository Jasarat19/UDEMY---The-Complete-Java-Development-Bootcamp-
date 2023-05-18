import java.util.Arrays;

public class Workbook11 {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        
        double[] fahrenheit = celciusToFahrenheit(celsius);
        System.out.println(Arrays.toString(fahrenheit));


    

    }


    public static double[] celciusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double [7];
        for(int i = 0; i<7; i++){
            fahrenheit[i] = (celsius[i]/5 * 9) + 32;

        }
        
        return fahrenheit ;

        
    }

}
    

