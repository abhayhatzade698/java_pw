import java.util.Scanner;

public class Problem_loops2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row");
        int r=sc.nextInt();
        System.out.println("Enter column");
        int c=sc.nextInt();
        // System.out.println("Enter column");
        // int c=sc.nextInt();

        // Rectangular Pattern

        // for(int i=1; i<=r; i++){
        //     for(int j=1; j<=c; j++){
        //      System.out.print("*");
        
        //     }
        //     System.out.println();
        // }

        
        
         // Hellow Rectangular Pattern

        // for(int i=1; i<=r; i++){
        //     for(int j=1; j<=c; j++){
        //         if(i==1 || i==r || j==1 || j==c){
        //          System.out.print("*");
        //         }else{
        //           System.out.print(" ");
        //         }
               
        //     }
        //     System.out.println();
        // }

 
       // Triangular pattern
    //    for(int i=1; i<=r; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    }

        // try Triangular pattern
        // for(int i=r; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //      System.out.print("*");
        
        //     }
        //     System.out.println();
        // }

        // second logic
        // for(int i=1; i<=r; i++){
        //     for(int j=1; j<=r+1-i; j++){
        //         System.out.print("*");
        //     }
        //    System.out.println();
        // }

        
        //Pyramid Pattern
        // for(int i=1; i<=r; i++){
        //     for(int j=1; j<=r-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=2*i-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    //     for(int i=r-1; i>=1; i--){
    //     for(int j=1; j<=r-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=2*i-1; k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }

        // Numerical Reectangular
        // for(int i=1; i<=r; i++){
        //     for(int j=i; j<=r; j++){
        //         System.out.print(j);
        //     }
        //     for(int k=1; k<=i-1; k++){
        //         System.out.print(k);
        //     }
        //     System.out.println();
        // }
        

        //Numerical Pattern

        for(int i=1; i<=r; i++){
        for(int j=1; j<=c; j++){
            if((i+j)%2==0){
                System.out.print(1);
            }else{
                System.out.print(2);
            }
            
        
        }
        System.out.println();
     }


     //Numerical Pyramid
     for(int i=1; i<=r; i++){
        for(int j=1; j<=r-i; j++){
            System.out.print(" ");
        }
        for(int k=1; k<=i; k++){
            System.out.print(k);
        }
        for(int l=i-1; l>=1; l--){
            System.out.print(l);
        }
        System.out.println();
     }
    }
}