final class abc
 {
	 void s()
	 {
		 int a=10,b=10;
		 System.out.println(+(a+b));
	 }
 }
 
class xyz extends abc
{
}
 
 class a
 {
 public static void main(String args[])
 {
	 abc a1=new abc();
	 xyz x1=new xyz();
	 x1.s();
	 a1.s();
 }
 }	