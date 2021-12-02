import java.io.*;
class abc 
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("D:\\file1");
		File f2=new File("D:\\file2");
		
		f.createNewFile();
		
		System.out.println(f.getName());
		System.out.println(f.isHidden());
		System.out.println(f.getPath());
	}
}