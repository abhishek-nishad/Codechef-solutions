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
#define MAX ll_MAX
#define MIN ll_MIN
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

ll binPower(ll a, ll b)
{
	ll result = 1;
	while(b > 0)
	{
		if((b & 1) == 1)
			result = (result * a) % MOD; 

		a = (a * a) % MOD; 
		b >>= 1; 
	}
	return result % MOD; 
}

ll countSetBits(ll i, ll j)
{
	ll t1 = ((i / (1 << (j+1))) << j);
	ll t2 = (max(0ll, i % (1 << (j+1)) - (1 << j) + 1));

	return  t1 + t2; 
}
void solve()
{
	ll n, m; 
	cin >> n >> m; 
	ll result = 0; 

	for(ll i=0; i<31; ++i)
	{
		ll count = countSetBits(m, i);
		ll temp = (binPower(count, n) << i) % MOD;
		result = (result + temp) % MOD;
	}	
	cout << result << endl; 
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
