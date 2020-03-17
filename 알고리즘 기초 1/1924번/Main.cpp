#include <iostream>

int main()
{
    char days[7][4] = {
        "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"
    };
    
    int month = 1;
    int day = 1;

    std::cin >> month >> day;
    for(int i=1; i<month; i++)
    {
        if(2 == i)
        {
            day += 28;
        }
        else if(4 == i || 6 == i || 9 == i || 11==i)
        {
            day += 30;
        }
        else
        {
            day += 31;
        }
    }

    day = day%7;
    std::cout << days[day] << std::endl;

    return 0;
}