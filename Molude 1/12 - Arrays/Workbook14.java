public class Workbook14  {
    public static void main(String[] args) {
            // The instructions for this workbook are on Learn the Part (workbook 6.13)
            int[][] array = new int[100][10];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = randomNumber();
                }
            }
            print2DArray(array);
            

        }


        
        public static int randomNumber() {
            double randomNumber = Math.random()*100;
            return (int)randomNumber;
        }

        public static void print2DArray(int[][] array) {
            for(int i=0; i<array.length; i++){
                
                for(int j=0; j<array[i].length; j++){
                    int numbers = randomNumber();
                    System.out.print(numbers + " ");
                }
                System.out.print("\n");
    
            }
        }
    }
    
    