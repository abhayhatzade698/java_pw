import java.util.Scanner;

class algebra{
    algebra(){
        System.out.println("This is the default constructor");
    }
    


    int a;
    int b;
    algebra (int x, int y){
        System.out.println("This is the parameterized constructor");
        a=x;
        b=y;
    }

    

    int add(){
        return a+b;
    }

    int sub(){
        return a-b;
    }

    int mul(){
        return a*b;
    }

}

 class rand_practice{
    public static void main(String[]args){
    //  Scanner sc=new Scanner(System.in);
    //  System.out.println("Enter random Number");

    //  int n=sc.nextInt();
     
    //  int count=0;
    //  while(n>0){
    //     n/=10;
    //     count++;
    //  }
    //  System.out.println("the number of counts : " + count);

    // int sum=0;
    // while(n>0){
        
    //     sum+=n%10;
    //     n/=10;
    // }
    // System.out.println("the sum of given number : " + sum);

    // int rev=0;
    // while(n>0){
    //     // int digit=n%10;
    //     rev=rev*10+n%10;
    //     n/=10;
    // }
    // System.out.println("the reverse of given number : " + rev);

    // int rev=0;
    // for(; n>0; n/=10){
    //     rev=rev*10+n%10;
    // }
    // System.out.println("the reverse of given number : " + rev);

    // int sum=0;
    // for(int i=1; i<=n; i++){
    //     if(i%2==0){
    //         sum-=i;
    //     }else{
    //         sum+=i;
    //     }

    // }
    // System.out.println("the sum of given number : " + sum);

    // int fact=1;
    // for(int i=1; i<=n; i++){
    //     fact*=i;
    // }
    // System.out.println("the sum of given number : " + fact);


    // System.out.println("Enter a");
    // int a=sc.nextInt();
    // System.out.println("Enter b");
    // int b=sc.nextInt();

    // int pow=1;
    // for(int i=1; i<=b; i++){
    //  pow*=a;
    // }
    // System.out.println("the sum of given number : " + pow);


    //  System.out.println("Enter r");
    //  int r=sc.nextInt();

    //  System.out.println("Enter c");
    //  int c=sc.nextInt();

    //  for(int i=1; i<=r; i++){
    //     for(int j=1; j<=c; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }


    //  for(int i=1; i<=r; i++){
    //     for(int j=1; j<=c; j++){
    //         if(i==1 || i==r || j==1 || j==c){
    //              System.out.print("*");
    //         }else{
    //              System.out.print(" ");
    //         }
    //     }
    //      System.out.println();
    //  }

    //  for(int i=1; i<=r; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }

    //  for(int i=1; i<=r; i++){
    //     for(int j=1; j<=r-i; j++){
    //       System.out.print("*");
    //     }
    //     System.out.println();
    //  }

    //  for(int i=1; i<=r; i++){
    //     for(int j=1; j<=r-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=2*i-1; k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }

    //  for(int i=r-1; i>=1; i--){
    //     for(int j=1; j<=r-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=2*i-1; k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }


    //  for(int i=1; i<=r; i++){
    //     for(int j=i; j<=r; j++){
    //         System.out.print(j);
    //     }
    //     for(int k=1; k<=i-1; k++){
    //         System.out.print(k);
    //     }
    //     System.out.println();
    //  }

    //  for(int i=1; i<=r; i++){
    //     for(int j=1; j<=c; j++){
    //         if((i+j)%2==0){
    //             System.out.print("1");
    //         }else{
    //             System.out.print("2");
    //         }
    //     }
    //     System.out.println();
    //  }

    //  for(int i=1; i<=r; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    //  }
  
    //    int r=sc.nextInt();
    //    int c=sc.nextInt();

    //    for(int i=1; i<=r; i++){
    //     for(int j=1; j<=c; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    }
    
    //    for(int i=1; i<=r; i++){
    //     for(int j=1; j<=c; j++){
    //         if(i==1 || i==r || j==1 || j==c){
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
           
    //     }
    //     System.out.println();
    //    }

    //    for(int i=1; i<=r; i++){
    //     for(int j=1; j<=5-i; j++){
    //          System.out.print("*");
    //     }
    //      System.out.println();
    //    }


    //    for(int i=1; i<=r; i++){
    //     for(int j=1; j<=r-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=2*i-1; k++){
    //         System.out.print("*");
    //     }
    //      System.out.println();
    //    }


    //    for(int i=1; i<=r; i++){
    //     for(int j=i; j<=r; j++){
    //       System.out.print(j);
    //     }
    //     for(int k=1; k<=i-1; k++){
    //       System.out.print(k);
    //     }
    //     System.out.println();
    //    }

    //    for(int i=1; i<=r; i++){
    //     for(int j=1; j<=c; j++){
    //         if((i+j)%2==0){
    //             System.out.print(1);
    //         }else{
    //             System.out.print(2);
    //         }
    //     }
    //     System.out.println();
    //    }

    //    for(int i=1; i<=r; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    //    }

    //    for(int i=1; i<=r; i++){
    //     for(int j=1; j<=r-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=i; k++){
    //         System.out.print(k);
    //     }
    //     for(int l=i-1; l>=1; l--){
    //         System.out.print(l);
    //     }
    //     System.out.println();
    //  }


//   dec > bin
    // Scanner sc=new Scanner(System.in);
    // int Decimal=sc.nextInt();

    // int ans=0;
    // int pow=1;

    // while(Decimal>0){
    //     int digit=Decimal%10;
    //     ans+=digit*pow;
    //     Decimal/=10;
    //     pow*=2;
    // }
    // System.out.println(ans);

    // int Binary=sc.nextInt();

    // int ans=0;
    // int pow=1;

    // while(Binary>0){
    //     int parity=Binary%2;
    //     ans+=parity*pow;
    //     pow*=10;
    //     Binary/=2;

    // }
    // System.out.println(ans);
    // }

   algebra obj=new algebra();

   algebra obj2=new algebra(5,5);
   System.out.println(obj2.add());
   System.out.println(obj2.sub());
   System.out.println(obj2.mul());
    }
}






