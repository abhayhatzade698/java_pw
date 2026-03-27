class main{
    public void show(){
        System.out.println("No parameter + No return");

    }
}

class para{
    public void show1(String name){
        System.out.println("parameter + No return " + name);
    }
}

class ret{
    public int show2(int a){
       return a;
    }
}

class param{
    public int sum(int a, int b){
       return a+b;
    }
}

class algebra{
    algebra(){
        System.out.println("This is the algebra constructor");
    }
}

public class Methods{
    public static void main(String[] args){
        algebra ob=new algebra();
        main obj=new main();
        para obj1=new para();
        ret obj3=new ret();
        param obj4=new param();

        obj.show();
        obj1.show1("Abhay");

        int retu=obj3.show2(36);
        System.out.println(retu);
        
        int add= obj4.sum(50,50);
        System.out.println(add);
    }
}