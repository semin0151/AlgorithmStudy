#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int N, K, cnt = 1;
queue<int> Q;
vector<int> V;
int main(){
    cin >> N >> K;
    for(int i = 1; i <= N; i++) Q.push(i);

    while(!Q.empty()){
        
        if(cnt != K){
            Q.push(Q.front());
            Q.pop();
        }
        else{
            V.push_back(Q.front());
            Q.pop();
        }
        cnt++;
        if(cnt > K) cnt -= K;
    }
    cout << "<";
    for(int i = 0; i < V.size() - 1; i++) cout << V[i] << ", ";
    cout << V[V.size()-1] << ">";


    return 0;
}