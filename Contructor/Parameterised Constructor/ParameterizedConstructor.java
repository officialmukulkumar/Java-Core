class A{

int x;
A(int a){
x =a;
System.out.println("Hello Object");
}
void display(){
System.out.println("Value of x = "+ x);

}

}

class ParameterizedConstructor{
public static void main (String ... s)
{
A a1 = new A(11);
A a2 = new A(21);

a1.display();
a2.display();


}


}