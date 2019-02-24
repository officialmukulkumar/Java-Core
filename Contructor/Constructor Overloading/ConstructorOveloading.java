class A{

int a,b;

A(int x){

System.out.println("Constructor with one arguement");
a = x;
System.out.println("Value of  a = "+ a  + "and b = "+b );

}

A(int x,int y){

System.out.println("Constructor with two arguement");
a = x;
b = y ;
System.out.println("Value of  a = "+ a  + "and b = "+b );

}

A(){
System.out.println("Constructor with no arguement");
System.out.println("Value of  a = "+ a  + "and b = "+b );
}

}


class ConstructorOveloading{
public static void main (String ... s)
{
A a1 = new A(11);
A a2 = new A(21,51);
A a3 = new A();

}

}