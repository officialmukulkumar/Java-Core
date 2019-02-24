class Demo {
    public static void main (String ... s){
		p1.A a1 = new p1.A();
		a1.m1();
		System.out.println(a1.x);
		
	    p2.A a2 = new p2.A();
		a2.m3();
		System.out.println(a2.h);
		
		p1.B b = new p1.B();
		b.m2();
		System.out.println(b.y);
	
	    p2.D d = new p2.D();
		d.m4();
		System.out.println(d.z);
	
	
	}


}