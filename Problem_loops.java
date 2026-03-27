import java.util.Scanner;

public class Problem_loops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");

        int n=sc.nextInt();
        


        // [1]. use while loop count number
        int count=0;
        while(n!=0){
            n/=10;           
            count++;
        }
        System.out.println(count);


        // [1.2]. use for loop count number
        int count=0;
        for(; n>0; n/=10){
            count++;
        }
        System.out.println(count);

        //[2]. use while loop sum number
        int sum=0;

        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);

        //[2.1]. use for loop sum number
        int sum=0;
        for(; n>0; n/=10){
           sum+=n%10;           
        }
        System.out.println(sum);

        //[3]. use while loop reverse number
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.println(rev);

        //[3.1]. use for loop reverse number
        int rev=0;
        for(; n>0; n/=10){
          int digit=n%10;
          rev=rev*10+digit;
        }
        System.out.println(rev);

        // sum
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum-=i;
            }else{
                sum+=i;
            }
        }
        System.out.println(sum);

        // Factorial
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);



       // find a raise to b

        System.out.println("Enter a");

        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();

        int pow=1;
        for(int i=1; i<=b; i++){
            pow*=a;
        }
        System.out.println("the number of " + a + " raise to " + b + " is : " + pow);
    }
}