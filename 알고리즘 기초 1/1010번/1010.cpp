#include <iostream>

using namespace std;

unsigned long long factorial(int  n);

int main()
{
    int T = 0;
    int N = 0, M = 0;
    unsigned long long bridge = 0;

    unsigned long long a, b, c;

    cin >> T;
    for(int i=0; i<T; i++)
    {
        cin >> N >> M;
        bridge = factorial(M) / factorial(N) / factorial(M-N);
        cout << bridge << "\n";
    }

    return 0;
}

unsigned long long  factorial(int n)
{
  unsigned long long value = 1;
  for(unsigned long long i=1; i<=n; i++)
  {
    value = value * i;
    cout << value << "\n";
  }

  return value;
}
