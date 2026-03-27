import java.util.Scanner;

public class Conditional{
    public static void main(String[] args){

      Scanner sc=new Scanner(System.in);

  
      System.out.println("Enter n");
      int n=sc.nextInt();
      
      //IF-Statement
      if(n%2==0){
        System.out.println("The given number is even : " + n);
      }else{
        System.out.println("The given number is odd");
      }



      //AgeGroup
      System.out.println("Enter Age");
      int age=sc.nextInt();
      if(age<=12){
        System.out.println("Child");
      }else if(age>=12 && age<=18){
        System.out.println("teenage");
      }else{
        System.out.println("Adult");
      }

      // Ternary Operator
      System.out.println("Enter num");
      int num=sc.nextInt();
      String result=(num%2==0) ? "Even" : "Odd";
      System.out.println(result);

      //Even And Divisible by 3
      System.out.println("Enter Value");
      int val=sc.nextInt();
      if((val%2==0) && (val%3==0)){
        System.out.println("Value found : " + val);
      }

      //Divisible 3 OR 5
      System.out.println("Enter Value");
      int value=sc.nextInt();
      if((value%3==0) || (value%5==0)){
        System.out.println("Value found : " + value);
      }

      //Switch Statement
      System.out.println("Enter Day Number");
      int day=sc.nextInt();
      switch(day){
        case 1:
            System.out.println("Monaday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;

        default: 
            System.out.println("Inavalid Day");
      }
    
      
    }
}