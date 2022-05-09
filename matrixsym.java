import java.util.Scanner;

class matrix
{
	public static void main(String args[])
	{
		int m,n,i,j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows in matrix:");
		m = in.nextInt();

		System.out.println("Enter the number of columns in matrix:");
		n = in.nextInt();

		int mat1[][] = new int[m][n];
		int trans[][] = new int[m][n];
		
		System.out.println("Enter the  matrix elements:");
		for (i=0 ; i<m ; i++)
			for (j=0; j<n; j++)
				mat1[i][j] =trans[j][i]= in.nextInt();
		
int count=0;
		for (i=0 ; i<m ; i++)
		{	for (j=0; j<n; j++)
				{
				if (trans[i][j] != mat1[i][j])
				count=1;
				break;
				}
		}	
		if(count==0){
			System.out.print("Symmetric");	
			}
		else
			System.out.print("Not-Symmetric");
			System.out.println();
	}
}

