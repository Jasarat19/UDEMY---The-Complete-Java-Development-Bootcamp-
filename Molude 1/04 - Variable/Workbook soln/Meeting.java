public class Meeting {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.4 to access the link).

        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 
        int w = (int)sales;
        int x = (int)profit;
        int y = (int)refunds;
        int z = (int)shipping;


        System.out.println("This month, we made $ " +w+" in sales");
        System.out.println("Factoring in costs, we made $ " +x +" in profit");
        System.out.println("The refunds are at a low $ " +y +". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $ " +z +" in shipping");


    }
}