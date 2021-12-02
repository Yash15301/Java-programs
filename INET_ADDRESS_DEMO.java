import java.net.*;

class InetAddressDemo
{
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress add = InetAddress.getLocalHost();
		System.out.println(add);
		InetAddress add1;
		add1 = InetAddress.getByName("www.google.com");
		System.out.println(add1);
	}
}