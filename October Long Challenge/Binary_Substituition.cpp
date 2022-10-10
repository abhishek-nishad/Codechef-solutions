// -----headers-----

#include<bits/stdc++.h>
#include<iostream>
// #include<vector>
// #include<math.h>

// -----templates-----

#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define ll long long int
#define ld long double

// -----constants-----
#define MAX INT_MAX
#define MIN INT_MIN
#define LMIN -10e18
#define LMAX 10e18

#define MOD 998244353

#define pb(x) push_back(x)
#define eb(x) emplace_back(x)

using namespace std;

void init_code()
{
	fast_io;
	#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
	#endif
}

// ll memoize(string& s, unordered_map<string, string>& hmap, unordered_set<string>& visited, string curr, vector<ll>& dp, int i)
// {
// 	if(i < 0)
// 	{

// 		if(visited.find(curr) == visited.end())
// 		{
// 			visited.insert(curr); 
// 			return 1; 
// 		}
// 		return 0;
// 	}

// 	if(dp[i] != -1)
// 		return dp[i];

// 	// System.out.println(map.get(s.substring(i, i+1)));

// 	ll take1 = memoize(s, hmap, visited, hmap[s.substr(i, 1)]+curr, dp, i-1);  
// 	ll take2 = 0;

// 	if(i-1 >= 0 && hmap.find(s.substr(i-1, 2)) != hmap.end())
// 	{
// 		take2 = memoize(s, hmap, visited, curr + hmap[s.substr(i-1, 2)], dp, i-2);
// 	}
// 	return dp[i] = (take1 + take2) % MOD;

// }
void solve()
{
	ll n;
	// cin >> n; 

	string s; 
	cin >> s; 
	ll dp[100005][2];

	n = s.size();
	dp[0][0] = 1;

    for(int i=1; i<n; ++i) 
    {
        dp[i][0] = (dp[i-1][0] + dp[i-1][1]) % MOD;

        if(s[i] != s[i-1]) 
        	dp[i][1] = dp[i-1][0];

        else 
        	dp[i][1] = 0;
    }
    cout << (dp[n-1][0] + dp[n-1][1]) % MOD << endl;
}
int main()
{
	// init_code();
	ll t; 
	cin >> t;
	while(t--)
	{
		solve();
	}

	// for(ll i=1; i <= t; i++)
	// 	cout << solve(i) << endl;
	return 0;
}
