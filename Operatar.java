public class Operatar{
    public static void main(String[]args){
        int a=5 , b=6;

        //Arithmatic Operator
        System.out.println("Arithmatic Operator");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Relational Operator
        System.out.println("Relational Operator");
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        
        //Logical Operator
        System.out.println("Logical Operator");
        int p=10, q=20, r=25;
        System.out.println((p==q) && (q<=r));
        System.out.println((p==q) || (q<=r));
        System.out.println(!(p==q));
        
        //Assignment Operator
        System.out.println("Assignment Operator");
         a+=b;
        System.out.println(a);
         a-=b;
        System.out.println(a);
         a*=b;
        System.out.println(a);
         a/=b;
        System.out.println(a);
         a%=b;
        System.out.println(a);

        //Unary Operator
        System.out.println("Unary Operator");
        
        //Post-Increment
        System.out.println(a++); //5
        System.out.println(a);   //6

        //Pre-Increment
        System.out.println(++b); //7
        System.out.println(b);   //7


        int x=a++;
        int y=++b; 
        
        System.out.println(x); //6
        System.out.println(a); //7

        System.out.println(y); //8
        System.out.println(b); //8


    }
}