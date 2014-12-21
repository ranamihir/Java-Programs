public class jaggedArrays{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter the value of m: ");
		int m = sc.nextInt();
		
		int[][] a = new int[m][];
		
		System.out.println("Enter the number of columns of these " + m + " rows: ");
		for(int i = 0; i < m; i++)
			a[i] = new int [sc.nextInt()];
		
		for(int i = 0; i < m; i++)
			for(int j = 0; j < a[i].length; j++)
				a[i][j] = i+j;
				
		System.out.println("The matrix is: ");
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + "  ");		
			}
			
			System.out.print("\n");
		}
	}
}