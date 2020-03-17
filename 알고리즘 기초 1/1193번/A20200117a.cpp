#include <iostream>

int main()
{
    int x =0;
    int y =0;
    int number = 0;

    std::cin >> number;

    for(int i=1; ;i++)
    {
        if (number-i <= 0)
        {
            if (0 == i%2)
            {
                x = 1 + (number-1);
                y = i - (number-1);
                break;
            }
            else
            {
                x = i - (number-1);
                y = 1 + (number-1);
                break;
            }
        }

        number -= i;
    }

    std::cout << x << "/" << y << std::endl;
    
    return 0;
}