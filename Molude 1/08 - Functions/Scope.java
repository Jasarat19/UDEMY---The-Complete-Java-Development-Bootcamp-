public class Scope{ 
    static int apple = 5;
    
    
    public static void main(String[] args){
     SomeFunction();
     System.out.println(apple);
    }

    // the variable can only exit inside the function scope. when you make variable inside scope,, we also cannot access hte variable from another func.
    public static void SomeFunction(){
       // int apple = 5;
        System.out.println(apple);

    
    //when u make variable from level you can access from anywhere
    
}
}