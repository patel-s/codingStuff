import java.util.Scanner;
public class TwoD_Array 
{
	public static void main (String[] args)
	{
		Scanner sp = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Enter the number of columns of matrix1 "); // for matrix 1
		int column = sp.nextInt();
		System.out.println("Enter the number of rows of matrix1 ");
		int rows = sp.nextInt();
		
		int[][] userinput = new int[rows][column];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < column; j++)
			{
				System.out.println("Enter a number for matrix1 [" + i + "]" + "[" + j + "]"  );
				userinput [i][j] = sp.nextInt();
			}
		}
		
		System.out.println("\nEnter the number of columns of matrix2 "); // for matrix2
		int columns1 = sp.nextInt();
		System.out.println("Enter the number of rows of matrix2 ");
		int rows1 = sp.nextInt();
		int[][] userinput1 = new int[rows1][columns1];
		
		for (int i = 0; i < rows1; i++)
		{
			for (int j = 0; j < columns1; j++)
			{
				System.out.println("Enter a number for second matrix [" + i + "]" + "[" + j + "]");
				userinput1 [i][j] = sp.nextInt();
			}
		}
		
		System.out.println(); // for the first matrix
		System.out.println("Your first matrix will look like ");
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < column; j++)
			{
				System.out.print(userinput[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println(); // for the second matrix
		System.out.println("Your second matrix will look like ");
		for (int i = 0; i < rows1; i++)
		{
			for (int j = 0; j < columns1; j++)
			{
				System.out.print(userinput1[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[][] result = new int [rows][columns1];
				if (column != rows1)
					System.out.println("This matrix cannot be multiplied.");
				else if (column == rows1)
				{
					for (int i = 0; i < rows; i++)
					{
						for (int j = 0; j < columns1; j++)
						{
							for (int k = 0; k < rows1; k++)
							{
								sum = sum + userinput[i][k] * userinput[k][j];
							}
							result [i][j] = sum;
							sum = 0;
						}
					}
				}
				
				else
					System.out.println("Error");
				
		System.out.println();
		System.out.println("The result of multiplication is ");
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns1; j++)
			{
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
					
		sp.close();
	}
}
