//
// Created by asia_ on 2020-03-19.
//
#include <iostream>
using namespace std;

bool c[10];
int sequence[10] = {1};

void go(int index, int n, int m) {

    if(m < index) {
        for(int i=1; i<=m; i++) {
            cout << sequence[i] << " ";
        }
        cout << "\n";

        return;
    }

    for(int i=1; i<=n; i++) {
        if(c[i])
            continue;

        c[i] = true;
        sequence[index] = i;
        go(index+1, n, m);
        c[i] = false;
    }
}


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m;

    cin >> n >> m;
    go(1, n, m);

    return 0;
}