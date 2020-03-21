//
// Created by asia_ on 2020-03-19.
//
#include <iostream>
#include <algorithm>

using namespace std;

int sequence[10] = {1};

void go(int index, int n, int m) {

    if (m < index) {
        for (int i = 1; i <= m; i++) {
            cout << sequence[i] << " ";
        }
        cout << "\n";

        return;
    }

    for (int i = sequence[index-1]; i <= n; i++) {
        sequence[index] = i;
        go(index + 1, n, m);
    }
}

int main() {
    int n, m;

    cin >> n >> m;
    go(1, n, m);

    return 0;
}