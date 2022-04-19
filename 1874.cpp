#include <iostream>
#include <queue>
#include <stack>
#include <vector>

using namespace std;

void solution(queue<int> Q);
int main(){
    int n;
    cin >> n;
    queue<int> Q;
    for(int i = 0; i < n; i++){
        int num;
        cin >> num;
        Q.push(num);
    }
    solution(Q);

    return 0;
}

void solution(queue<int> Q){
    int pos = 1;
    stack<int> S;
    vector<char> V;
    S.push(0);
    while(!Q.empty()){
        if(S.top() < Q.front()){
            if(pos > Q.front()){
                cout << "NO\n";
                return;
            }
            V.push_back('+');
            S.push(pos);
            pos++;
        }else if(S.top() == Q.front()){
            V.push_back('-');
            S.pop();
            Q.pop();
        }else{
            V.push_back('-');
            S.pop();
        }
        if(S.empty()){
            cout << "NO\n";
            return;
        }
    }
    for(int i = 0; i < V.size(); i++) cout << V[i] << "\n";
}