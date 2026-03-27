import java.util.Scanner;
public class Loops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n");
        
        

        //sum of nth no. using while loop
        int sum=0;
        int num=1;
        while(num<n){
            sum+=num;
         num++;
         System.out.println(sum);
        }
        

        //sum of nth no. using for loop
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
            
        }
        System.out.println(sum);

        // 10 to n number

        
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }

        int sum = 0;
         int num = sc.nextInt(); 

          while(num != -1){
          sum += num;
          num = sc.nextInt();  
         }

          System.out.println(sum);

          sc.close();
    }
}