package NestedLoop;

public class Hello3
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>i;k--)
			{
				for(int j=1;j<i;j++)
				{
					for(int l=1;l<=i;l++)
					{
						System.out.print("*");
					}
				}   System.out.println();
			}
		}
		// TODO Auto-generated method stub

	}

}
