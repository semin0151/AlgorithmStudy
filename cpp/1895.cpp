#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int map[41][41], answer[39][39];
vector<int> V(9);
int n, m, T;
int checkmap(int y, int x);
int main(){
    cin >> n >> m;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= m; j++){
            cin >> map[i][j];
        }
    }
    cin >> T;

    int cnt = 0;
    for(int i = 1; i <= n-2; i++){
        for(int j = 1; j <= m-2; j++){
            answer[i][j] = checkmap(i,j);
            if(answer[i][j] >= T)cnt++;
        }
    }
    cout << cnt;

    return 0;
}

int checkmap(int y, int x){
    int pos = 0;
    for(int i = y; i <= y+2; i++){
        for(int j = x; j <= x+2; j++){
            V[pos] = map[i][j];
            pos++;
        }
    }
    sort(V.begin(), V.end());
    return V[4];
}