
public class matrix {

	public static void main (String[] args)
	{

		
		double[][] pintable=(generateIdentityMatrix(1,7));
		printMatrix(pintable);
System.out.println("");
		
		double[][] pintable2=(generateIdentityMatrix(5,5));
		printMatrix(pintable2);
	}
	
	
	public static double[][] generateIdentityMatrix(int size1, int size2)
	{
		double [][] matrix = new double [size1][size2];
	 /*Wenn Quadratisch:
	  * for(int i=0;z<size1;z++)
	  * matrix[i][i] = 1;
	  */
		for (int i=0; i<size1;i++)
		{
			for (int n=0;n<size2;n++)
			{
				if (i ==n)
				{
					matrix[i][n]=1;
				}
			}
		}
		return matrix;
	}

	public static void printMatrix(double[][] matrix)
	{
	
		for (int i=0; i<matrix.length;i++)
		{
			for (int n=0;n<matrix[i].length;n++)
			{
				System.out.print(matrix[i][n]+"\t");
			}
			System.out.println("");
		}
	}

}
