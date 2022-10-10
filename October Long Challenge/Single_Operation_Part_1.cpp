// -----headers-----

#include<bits/stdc++.h>
#include<iostream>
// #include<vector>
// #include<math.h>

// -----templates-----

#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define ll long long
#define ld long double
#define MAX INT_MAX
#define MIN INT_MIN

#define LMIN 10e18
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

void solve()
{
	ll n;
	cin >> n; 

	string s; 
	cin >> s; 

	ll count = 0; 

	for(ll i=0; i<n; i++)
	{
		if(s[i] == '0')
			break; 
		else
			count ++;
	}
	cout << count << endl; 
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
