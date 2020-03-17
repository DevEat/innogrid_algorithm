#include<iostream>
#include <cstring>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    int N;
    int value = 0;
    int six_count = 0;

    cin >> N;
    while(N != six_count)
    {
        value++;

        string temp = to_string(value);
        if(string::npos != temp.find("666"))
        {
            six_count++;
        }
    }

    cout << value;

    return 0;
}