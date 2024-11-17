

public class ProblemsOn2dMatrices{


 public static void printAllElements(int [][] arr){

        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[0].length; col++){

               System.out.print(arr[row][col] + " ");

            }

            System.out.println();
        }

    }


    public static void printAllElementsExceptMiddle(int [][] arr){

        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[0].length; col++){
               if(row == 0 || row == arr.length -1 || col == 0 || col == arr[0].length - 1)
                   System.out.print(arr[row][col] + " ");
               else 
                   System.out.print("  ");

            }

            System.out.println();
        }

    }


    public static void printAllDiagonalElements(int [][] arr){

        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[0].length; col++){
               if(row + col == arr.length - 1 || row == col)
                   System.out.print(arr[row][col] + " ");
               else 
                   System.out.print("  ");

            }

            System.out.println();
        }

    }

    public static void printAllUpperDiagonalElements(int [][] arr){

        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[0].length; col++){
               if(row <= col)
                   System.out.print(arr[row][col] + " ");
               else 
                   System.out.print("  ");

            }

            System.out.println();
        }

    }


    public static void main(String [] args){

      int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

      ProblemsOn2dMatrices.printAllElements(arr);
       System.out.println();
      ProblemsOn2dMatrices.printAllElementsExceptMiddle(arr);
       System.out.println();
      ProblemsOn2dMatrices.printAllDiagonalElements(arr); 
       System.out.println();
      ProblemsOn2dMatrices.printAllUpperDiagonalElements(arr); 
       System.out.println();
      

    }
  


}