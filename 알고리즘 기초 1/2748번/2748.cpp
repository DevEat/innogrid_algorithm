#include <iostream>

using namespace std;

unsigned long long fibo(int n)
{
	unsigned long long arr[2] = {0, 1};
	unsigned long long res = 0;

	if(0 == n)
		return arr[0];
	else if(1 == n)
		return arr[1];
	else
	{
		for(int i=2; i<=n; i++)
		{
			res = arr[0] + arr[1];
			arr[0] = arr[1];
			arr[1] = res;
		}

		return res;
	}
}

int main()
{
	int n;

	cin >> n;
	cout << fibo(n) << endl;

	return 0;
}
