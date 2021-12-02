import java.util.*;
class abc
{
	public static void main(String args[])
	{
		int a[][] = new int [6][6];
		int i,j;
		System.out.println("the matrix is:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=(int)(Math.random()*2);
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		checkrow(a);
		System.out.println("-----------------------------");
		checkcolumn(a);
		System.out.println("-----------------------------");
	}
	
	public static void checkrow(int [][] matrix)
	{
		int count;
		for(int i=0;i<matrix.length;i++)
		{
			count=0;
			for(int j=0;j<matrix.length;j++)
			{
				if(matrix[i][j]==1)
				{
					count++;
				}
			}	
			if(count%2!=0)
			{
				System.out.println("Row "+ i + "has odd numbers of 1's" );
			}
		}
	}
	
	public static void checkcolumn(int [][] matrix)
	{
		int count;
		for(int i=0;i<matrix.length;i++)
		{
			count=0;
			for(int j=0;j<matrix.length;j++)
			{
				if(matrix[i][j]==1)
				{
					count++;
				}					
			}
		
			if(count%2!=0)
			{
				System.out.println("column "+ i +"has odd number of 1's");
			}
		}
	}
	
}