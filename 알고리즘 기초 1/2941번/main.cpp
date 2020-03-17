#include <iostream>
#include <cstring>

using namespace std;

int main()
{   
    char alphabet[100];
    int number = 0;

    cin >> alphabet;
    for(int i=0; i<strlen(alphabet); i++)
    {
        if(('-' == alphabet[i] || '=' == alphabet[i]))
        {
        }
        else if(('l' == alphabet[i] || 'n' == alphabet[i]) && 'j' == alphabet[i+1])
        {
        }
        else if('d' == alphabet[i] && 'z' == alphabet[i+1] && '=' == alphabet[i+2])
        {
        }
        else
        {
            number++;
        }
    }

    cout << number << endl;

    return 0;
}