import java.util.*;
class Suspense_String 
{
	static Scanner ob = new Scanner(System.in);
	public void solve()
	{
		int n = ob.nextInt();
		char s[] = ob.next().toCharArray(); 
		String result = ""; 
		boolean	flag = true; 

		int start = 0, end = s.length - 1; 

		while(start <= end)
		{
			if(flag)
			{
				if(s[start] == '0')
					result = "0" + result; 

				else
					result = result + "1";
				start ++;
			}
			else
			{
				if(s[end] == '1')
					result = "1" + result; 

				else
					result = result + "0";
				end --;
			}
			flag = !flag;
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
		// 	}
		// 	catch (Exception e){}
		// }

		// ----------------------------------

		int t = ob.nextInt();
		while(t-- > 0)
		{
			new Suspense_String().solve();
			// System.out.println(new Solution().solve());
		}

		// System.out.println(inp + " World!");
	}
}