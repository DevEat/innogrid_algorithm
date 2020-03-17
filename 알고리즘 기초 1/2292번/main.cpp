#include <iostream>

int main()
{
    int room = 0;
    int step = 0;

    std::cin >> step;
    if (0 == step)
    {
        room = 0;
    }  else {
        
        step -= 1;
        room = 1;
        while(0 < step)
        {
            step -= 6 * room;
            room += 1;
        }

    }

    std::cout << room;

    return 0;
}
