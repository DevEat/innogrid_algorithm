#include <iostream>
#include <algorithm>

using namespace std;

bool broken[10];

int possible(int c) {

    if(c == 0) {
        return broken[0] ? 0 : 1;
    }

    int len = 0;
    while(c > 0) {
        if(broken[c % 10])
            return 0;

        len++;
        c /= 10;
    }

    return len;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int N, M;

    cin >> N >> M;
    for(int i=0; i<M; i++) {
        int x;
        cin >> x;
        broken[x] = true;
    }

    int ans = abs(N - 100);

    for(int i=0; i<=1000000; i++) {
        int c = i;
        int len = possible(c);

        if(0 < len) {
            int press = abs(c - N);

            if(len + press < ans) {
                ans = len+press;
            }
        }
    }

    cout << ans;

    return 0;
}
