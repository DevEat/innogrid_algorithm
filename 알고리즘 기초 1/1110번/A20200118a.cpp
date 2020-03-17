#include <iostream>

int main()
{
	int fix = 0;
	int before = -1;
	int after = -1;
	int digit = 0;
	int decimal = 0;
	int cycle = 0;

	std::cin >> fix;
	before = fix;
	do{
        	cycle++;
		digit = before / 10;
		decimal = before % 10;

		after = (decimal * 10) + ((digit + decimal) % 10);
		before = after;
	}while(fix != after)

	std::cout << cycle;

	return 0;
}
