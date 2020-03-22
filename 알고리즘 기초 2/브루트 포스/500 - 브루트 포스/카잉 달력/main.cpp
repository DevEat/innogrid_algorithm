//
// Created by asia_ on 2020-03-17.
//

#include <iostream>

using namespace std;

int lcd(int x, int y);
int gcd(int x, int y);

int lcd(int x, int y) {
    return x * y / gcd(x, y);
}

int gcd(int x, int y) {
    if (x < y) {
        swap(x, y);
    }

    int result = 0;
    while (y != 0) {
        result = x % y;
        x = y;
        y = result;
    }

    return x;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    int M, N, x, y;

    cin >> T;
    while (T--) {
        cin >> M >> N >> x >> y;

        int year = -1;
        int range = lcd(M, N);
        while (1) {
            if (x < y)
                x += M;
            else if (y < x)
                y += N;

            if(range < x || range < y) {
                break;
            }

            if (x == y) {
                year = x;
                break;
            }
        }

        cout << year << "\n";
    }

    return 0;
}