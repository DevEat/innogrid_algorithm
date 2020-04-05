//
// Created by asia_ on 2020-03-29.
//
#include <iostream>
#include <algorithm>
#include <queue>

using namespace std;

int mat[1001][1001];
int visit[1001];

void dfs(int n, int v) {
    cout << v << ' ';
    visit[v] = 1;
    for(int i=1; i<=n; i++) {
        if(visit[i] == 1 || mat[v][i] == 0)
            continue;
        dfs(n, i);
    }
}

void bfs(int n, int v) {
    queue<int> q;
    q.push(v);
    visit[v] = 0;
    while(!q.empty()) {
        v = q.front();
        cout << q.front() << ' ';
        q.pop();
        for (int i = 1; i <= n; i++) {
            if (visit[i] == 0 || mat[v][i] == 0)
                continue;
            q.push(i);
            visit[i] = 0;
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  cout.tie(NULL);

    int n, m, v;
    int x, y;

    cin >> n >> m >> v;
    while(m--) {
        cin >> x >> y;
        mat[x][y] = mat[y][x] = 1;
    }

    dfs(n, v);
    cout << "\n";
    bfs(n, v);

    return 0;
}