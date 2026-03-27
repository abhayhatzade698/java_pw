import java.util.Scanner;

public class NoSystem10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        //Binary to Decimal
        int binary=sc.nextInt();
        int ans=0;
        int pow=1;

        while(binary>0){
            int digit=binary%10;
            ans+=digit*pow;
            binary/=10;
            pow*=2;
        }
        
        System.out.println(ans);

       // Decimal to Binary

       int decimal=sc.nextInt();
       int ans=0;
       int pow=1;

       while(decimal>0){
        int parity=decimal%2;
        ans+=parity*pow;
        pow*=10;
        decimal/=2;
       }
       System.out.println(ans);
    }
}