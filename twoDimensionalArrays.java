public class twoDimensionalArrays{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int n = sc.nextInt();
		
		int[][] a = new int[m][n];
		
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				a[i][j] = i+j;
				
		System.out.println("The matrix is: ");
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(a[i][j] + "  ");		
			}
			
			System.out.print("\n");
		}
	}
}