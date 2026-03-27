class Student{
    String Name="Abhay";
    String Lname="Hatzade";

}

class info{
    String A="Khushal";
    String B="Kunda";
    String C="Amol";
}

class Address{
    String city="Arjuni/Mor";
    String Dis="Gondia";
    String state="MH";
}

public class class_obj{
    public static void main(String[] args){
        Student obj1=new Student();
        Address obj2 = new Address();
        info obj3 = new info();

        System.out.println(obj1.Name);
        System.out.println(obj1.Lname);

        System.out.println("Family Information : " );
        System.out.println(obj3.A);
        System.out.println(obj3.B);
        System.out.println(obj3.C);

        System.out.println(obj2.city);   
        System.out.println(obj2.Dis);
        System.out.println(obj2.state);


    }
}