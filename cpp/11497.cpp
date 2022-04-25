#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>

using namespace std;

void solution(int n, vector<int> V);

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int tt;
    cin >> tt;
    for(int t = 0; t < tt; t++){
        int n;
        cin >> n;
        vector<int> V;
        for(int i = 0; i < n; i++){
            int num;
            cin >> num;
            V.push_back(num);
        }
        solution(n, V);
    }

    return 0;
}

int getAbs(int num);

void solution(int n, vector<int> V){
    sort(V.rbegin(), V.rend());
    deque<int> answer;
    answer.push_back(V[0]);

    for(int i = 1; i < V.size(); i++){
        if(i%2==0) answer.push_front(V[i]);
        else answer.push_back(V[i]);
    }
    int gap = 0;
    for(int i = 0; i < answer.size()-1; i++){
        gap = max(gap, getAbs(answer[i] - answer[i+1]));
    }
    cout << gap <<'\n';

}

int getAbs(int num){
    if(num < 0 ) return num*(-1);
    else return num;
}
