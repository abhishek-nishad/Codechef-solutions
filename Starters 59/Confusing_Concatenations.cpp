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
#define LMIN -10e18
#define LMAX 10e18

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
	ll arr[n]; 

	ll maxVal = MIN; 
	ll index = -1; 

	for(ll i=0; i<n; ++i)
	{
		cin >> arr[i]; 

		if(arr[i] > maxVal)
		{
			maxVal = arr[i]; 
			index = i;
		}
	}

	if(index == 0)
		cout << -1 << endl; 

	else
	{
		cout << index << endl;
		for(ll i=0; i<index; ++i)
		{
			cout << arr[i] << " ";
		}

		cout << endl; 

		cout << (n-index) << endl;

		for(ll i=index; i<n; ++i)
			cout << arr[i] << " ";

		cout << endl; 
	}
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
