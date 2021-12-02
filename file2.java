import java.io.*;
class abc
{
	public static void main (String args[]) throws IOException
	{
		File f1=new File("hello.txt");
		
		f1.createNewFile();
		
		FileWriter f=new FileWriter("hello.txt");
		
		BufferedWriter b=new BufferedWriter(f);
		
		b.write("hello");
		b.newLine();
		b.write("hello1");
		b.newLine();
		b.append("hello2");
		
		b.close();
		
	}
}