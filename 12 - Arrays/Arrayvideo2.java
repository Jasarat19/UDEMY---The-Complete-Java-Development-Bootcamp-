
import java.util.Arrays;
public class Arrayvideo2 {
    
    public static void main(String[] args) {
        String [] menu = {"Gala", "Granny Smith", "Macintosh"};
        menu [2] = "Latte";
       
        System.out.println(Arrays.toString(menu));

       // rule to write array

       String[] newMenu = new String[5];
       for(int i =0; i<menu.length; i++){
        newMenu[i]= menu[i];
        
       }
       newMenu [3] = "House Blend";
       newMenu [4] = "Mocha";
       System.out.println(Arrays.toString(newMenu));
       



 
       
    }

    
        
       
    }


