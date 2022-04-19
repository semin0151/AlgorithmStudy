#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

void solution(int n);
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;
    cin >> n;
    solution(n);
    return 0;
}

void solution(int n){
    vector<int> V(n+1, 100000);
    V[0] = 0;
    for(int i = 1; i <= sqrt(n); i++){
        int pos = i*i;
        for(int j = 0; j + pos <= n; j++){
            V[j + pos] = min(V[j]+1, V[j+pos]);
        }
    }
    //for(int i = 1; i <= n; i++) cout << V[i] << " ";
    cout << V[n];
}