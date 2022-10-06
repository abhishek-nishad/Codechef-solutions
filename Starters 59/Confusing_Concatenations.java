

            // ******************* TLE *******************

import java.util.*;
class Confusing_Concatenations
{
	static Scanner ob = new Scanner(System.in);
	private int findMaxIndex(int arr[], int n)
	{
		int maxVal = arr[0];
		int index = 0;

		for(int i=0; i<n; i++)
		{
			if(arr[i] > maxVal)
			{
				maxVal = arr[i]; 
				index = i;
			}
		}
		return index; 
	}
	public void solve()
	{
		int n = ob.nextInt(); 
		int arr[] = new int[n]; 

		for(int i=0; i<n; i++)
		{
			arr[i] = ob.nextInt();
		}

		int a = findMaxIndex(arr, n);
		
		if(a == 0)
			System.out.println(-1); 

		else
		{
			System.out.println(a);
			for(int i=0; i<a; i++)
				System.out.print(arr[i] + " ");

			System.out.println(); 

			System.out.println(n-a);
			for(int i=a; i<n; i++)
				System.out.print(arr[i] + " ");

			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		// ----------template--------------

		// if (System.getProperty("ONLINE_JUDGE") == null) {
			
		// 	try 
		// 	{
		// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		// 		ob = new Scanner(new File("input.txt"));
		// 	}
		// 	catch (Exception e){}
		// }

		// ----------------------------------

		int t = ob.nextInt();
		while(t-- > 0)
		{
			new Confusing_Concatenations().solve();
			// System.out.println(new Solution().solve());
		}

		// System.out.println(inp + " World!");
	}
}