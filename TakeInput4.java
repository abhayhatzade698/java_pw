import java.util.Scanner;

public class TakeInput4{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        //Enter name
        System.out.println("Enter name");
        String Name=sc.nextLine();
        System.out.println("The First name is : " + Name);
 
       // some Calculation 
       System.out.println("Enter num1");
       int num1=sc.nextInt();
       System.out.println("Enter num2");
       int num2=sc.nextInt();

       int sum=num1+num2;
       int sub=num1-num2;
       int mul=num1*num2;
       
       System.out.println("The Sum of 2 number :" + sum);
       System.out.println("The sub of 2 number :" + sub);
       System.out.println("The mul of 2 number :" + mul);

        
        // Simple Interest
       
       System.out.println("Enter Principle");
       float p=sc.nextFloat();

       System.out.println("Enter Rate");
       float r=sc.nextFloat();

       System.out.println("Enter Time");
       float t=sc.nextFloat();

      System.out.println(p);
      System.out.println(r);
      System.out.println(t);

      float SI=(p * r * t) /100;
      System.out.println("The Simple Interest of PRT: " + SI);

      sc.close();
    }
}

