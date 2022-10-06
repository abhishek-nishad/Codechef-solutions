

        // ************* TLE *************

        
import java.util.*;
class Confusing_Concatenations 
{
	static Scanner ob = new Scanner(System.in);
	public void solve()
	{
		int n = ob.nextInt(); 
		int arr[] = new int[n]; 

		int maxVal = Integer.MIN_VALUE;
		int index = -1;

		for(int i=0; i<n; ++i)
		{
			arr[i] = ob.nextInt();
			if(arr[i] > maxVal)
			{
				maxVal = arr[i]; 
				index = i;
			}
		}

		// int a = findMaxIndex(arr, n);
		
		if(index == 0)
			System.out.println(-1); 

		else
		{
			System.out.println(index);
			for(int i=0; i<index; ++i)
				System.out.print(arr[i] + " ");

			System.out.println(); 

			System.out.println(n-index);
			for(int i=index; i<n; ++i)
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