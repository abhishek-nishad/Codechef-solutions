import java.util.*;
class Chef_and_Happy_String
{
	static Scanner ob = new Scanner(System.in);
	public void solve()
	{
		char s1[] = ob.next().toCharArray(); 
		int p1 = 0, p2 = 0, n = s1.length; 

		Set<Character> vowels = new HashSet<>();
		vowels.addAll(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u'}));

		int count = 0; 

		while(p1 < n && p2 < n)
		{
			if(vowels.contains(s1[p2]))
			{
				count ++; 
				p2++;
			}
			
			else
			{
				p2 ++;
				p1 = p2; 
				count = 0;
			}

			if(count > 2)
			{
				System.out.println("Happy");
				break;
			}
		}
		if(count < 3)
			System.out.println("Sad");
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
			new Chef_and_Happy_String().solve();
			// System.out.println(new Solution().solve());
		}

		// System.out.println(inp + " World!");
	}
}
