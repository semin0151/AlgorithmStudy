#include <iostream>
#include <vector>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, m, sum = 0;

    cin >> n >> m;

    vector<int> V(n+1);
    vector<int> S(n+1);
    
    for(int i = 1; i <= n; i++){
        cin >> V[i];
        sum += V[i];
        S[i] = sum;
    }

    for(int tt = 0; tt < m; tt++){
        int a, b;
        cin >> a >> b;
        cout << S[b] - S[a-1] << "\n";
    }

    return 0;
}