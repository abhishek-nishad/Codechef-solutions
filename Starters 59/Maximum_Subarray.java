import java.util.*;
class Maximum_Subarray 
{
	static Scanner ob = new Scanner(System.in);
	public void solve()
	{
		int n = ob.nextInt();
		long a[] = new long[n]; 

	    for(int i = 0; i < n; ++i) 
	    	a[i] = ob.nextLong(); 

	    int m = ob.nextInt();
		long b[] = new long[m]; 
		
	    for(int i = 0; i < m; ++i) 
	    	b[i] = ob.nextLong();

	   	long frontSum = 0, rearSum = 0;
	    long result = 0, currSum = 0;

	    for(int i=0; i<n; i++) 
	    {
	        currSum += a[i];
	        frontSum = Math.max(frontSum, currSum);
	    }
	    
	    currSum = 0; 
	    for(int i = n-1; i >= 0; --i) 
	    {
	        currSum += a[i];
	        rearSum = Math.max(rearSum, currSum);
	    }
	    
	    result = Math.max(frontSum, rearSum);

	    for(int i=0; i<m; i++) 
	    {
	        if(b[i] > 0) 
	        	result += b[i];
	    }

	    System.out.println(result);
	}	
		
	public static void main(String[] args)
	{
		// ----------template--------------

		// if (System.getProperty("ONLINE_JUDGE") == null) {
			
		// 	try 
		// 	{
		// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		// 		ob = new Scanner(new File("input.txt"));
		// 		// br = new BufferedReader(new File("input.txt"));
		// 	}
		// 	catch (Exception e){}
		// }

		// ----------------------------------

		// int t = Integer.parseInt(br.readLine());
		int t = ob.nextInt();
		while(t-- > 0)
		{
			new Maximum_Subarray().solve();
			// System.out.println(new Solution().solve());
		}

		// System.out.println(inp + " World!");
	}
}
