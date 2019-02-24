class A{

A(int x){

System.out.println("Hello");

}

A(int x,int y){
this(6);
System.out.println("Hye");

}

A(){

System.out.println("Incapp");

}

}

class ConstructorChaining{
public static void main (String ... s)
{
A a1 = new A(11);
A a2 = new A(21,51);
A a3 = new A();

}
}