#include <iostream>
#include <algorithm>

int lcm(int l, int r);
int gcd(int l, int r);

int lcm(int l, int r)
{
    int temp = 0;
    int m = gcd(l, r);

    temp = l/m * r/m * m;

    return temp;
}

int gcd(int l, int r)
{
    int temp = 0;

    if(l < r)
    {
        std::swap(l, r);
    }

    while(r != 0)
    {
        temp = l%r;
        l = r;
        r = temp;
    }

    return l;
}

int main()
{
    int l, r;

    std::cin >> l >> r;
    std::cout << gcd(l, r) << std::endl << lcm(l, r) << std::endl;

    return 0;
}