
public class matrix {

	public static void main (String[] args)
	{
		int x = 7;
		
		generateIdentityMatrix(x);
	}
	
	public static double[][] generateIdentityMatrix(int size)
	{
		double [][] a = new double [size][size];
	
		for (int i=0; i<size;i++)
		{
			for (int n=0;n<size;n++)
			{
				if (i ==n)
				{
					a[i][n]=1;
					System.out.print(a[i][n]+" ");
				}
				else
				{
					a[i][n]=0;
					System.out.print(a[i][n]+" ");
				}
			}
			System.out.println("");
		}
		return a;
	}
	}

