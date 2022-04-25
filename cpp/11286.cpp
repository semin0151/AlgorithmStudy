#include <iostream>
#include <vector>
#include <queue>

using namespace std;

void solution(vector<int> V);
int getAbs(int num);
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;
    vector<int> V;
    for(int i = 0; i < n; i++){
        int num;
        cin >> num;
        V.push_back(num);
    }
    solution(V);
    return 0;
}

void solution(vector<int> V){
    priority_queue<int, vector<int>, greater<int>> plusQ;
    priority_queue<int, vector<int>, less<int>> minusQ;

    for(int i = 0; i < V.size(); i++){
        if(V[i] == 0){
            if(plusQ.empty() || minusQ.empty()){
                if(!plusQ.empty()){
                    cout << plusQ.top() << "\n";
                    plusQ.pop();
                }else if(!minusQ.empty()){
                    cout << minusQ.top() << "\n";
                    minusQ.pop();
                }else{
                    cout << "0\n";
                }
            }else{
                if(getAbs(plusQ.top()) < getAbs(minusQ.top())){
                    cout << plusQ.top() << "\n";
                    plusQ.pop();
                }else{
                    cout << minusQ.top() << "\n";
                    minusQ.pop();
                }
            }

        }
        else{
            if(V[i] > 0) plusQ.push(V[i]);
            else minusQ.push(V[i]);
        }
    }
}

int getAbs(int num){
    if(num < 0) return num*(-1);
    return num;
}
