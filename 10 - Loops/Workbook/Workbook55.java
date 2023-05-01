import java.util.Scanner;
public class Workbook55 {
    public static void main(String[] args) {

      
        Scanner sc = new Scanner(System.in);
        System.out.print("Hi Bart. I can write lines for you.What do you want me to write? : " );
        int num1 = sc.nextInt();
        System.out.print("Hi Bart. I can write lines for What do you want me to write? : " );
        int num2 = sc.nextInt();
        System.out.print("Hi Bart. I can write linesat do you want me to write? : " );
        int num3 = sc.nextInt();
  

        
        for(int i = num2; i<=num3; i++){
            if (i%num1==0){
            System.out.print(i+  " ");
            }
        } 


        
        
    }
}