public class IfCase {
   
        public static void main (String[] args) {
            double measure1 = measureRectangle(4.2, 2.3, "area");
            double measure2 = measureRectangle(1.2, 1.3,"perimeter");
            stringPrinter(4.2, 2.3, measure1, "area"); 
            stringPrinter(1.2, 1.3, measure2, "perimeter"); 
    
        }
    
        public static double measureRectangle(double length, double width, String option) { 
            if (length < 0 || width < 0){
                System.out.println("the  length   and width cannot be neg");
                System.exit(0); // bujhinai

            }
            switch(option){
            case "area" : return length * width; // break lagbe na retuen e break
            case "perimeter" : return 2 * (length + width);
            default : return 404;
            }
            
        }
    
        public static void stringPrinter(double length, double width, double measure, String option) {// option bujhini, meassure konta nibe
            System.out.println("the "+ option + " of the rectangle with l " + length + "  and w " + width + " is " + measure);
        }
      
    
    }
    
    

