class A{

int x;
A(){
x =2;
System.out.println("Hello Object");
}
void display(){
System.out.println("Value of x = "+ x);

}

}

class DefaultConstructor{
public static void main (String ... s)
{
A a1 = new A();
A a2 = new A();

a1.display();
a2.display();


}


}