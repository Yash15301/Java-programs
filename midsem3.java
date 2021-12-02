public class abc
{
	public static void main(String args[])
	{
		B b=new C();
		A a=new b();
		if(a instanceof A)System.out.println("R");
		if(a instanceof B)System.out.println("S");
		if(a instanceof C)System.out.println("H");
		if(a instanceof D)System.out.println("G");
	}
}
class A{}
class B extends A{}
class C extends B{}
class D extends c{}