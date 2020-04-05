//
// Created by asia_ on 2020-04-05.
//
#include <iostream>
#include <cstring>

#define MAX 50
using namespace std;

int N, M;
char map[MAX][MAX];
bool visit[MAX][MAX];
bool flag = false;

int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

void Input() {
    cin >> N >> M;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            cin >> map[i][j];
        }
    }
}

void DFS(int x, int y, int dir, int line_cnt, int sx, int sy) {
    if (flag) return;

    for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
            if (!visit[nx][ny]) {
                if (map[nx][ny] == map[x][y]) {
                    visit[nx][ny] = true;
                    if (i == dir) DFS(nx, ny, dir, line_cnt, sx, sy);
                    else DFS(nx, ny, i, line_cnt + 1, sx, sy);
                }
            } else {
                if (nx == sx && ny == sy && line_cnt >= 4) {
                    flag = true;
                    return;
                }
            }
        }
    }
}

void Solution() {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            memset(visit, false, sizeof(visit));
            int start_X = i;
            int start_Y = j;

            for (int k = 0; k < 4; k++) {
                memset(visit, false, sizeof(visit));
                visit[i][j] = true;
                DFS(i, j, k, 1, start_X, start_Y);
                if (flag) {
                    cout << "Yes\n";
                    return;
                }
            }
        }
    }
    cout << "No\n";
}

void Solve() {
    Input();
    Solution();
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    Solve();
}