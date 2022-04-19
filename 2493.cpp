#include <iostream>
#include <vector>

using namespace std;

void solution(int n, vector<int> V);

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;
    vector<int> V;
    for(int i = 0; i < n; i++) {
        int num;
        cin >> num;
        V.push_back(num);
    }
    solution(n, V);
    return 0;
}

vector<pair<int,int>> answer;
vector<int> copy_V;
pair<int, int> getRecursion(int num, int pos);
void solution(int n, vector<int> V){
    answer.resize(n);
    copy_V = V;

    answer[0].first = -1;
    answer[0].second = 0;

    for(int i = 1; i < n; i++){
        if(V[i-1] > V[i]){
            answer[i].first = V[i-1];
            answer[i].second = i;
        } 
        else answer[i] = getRecursion(V[i], i-1);
    }

    for(int i = 0; i < n; i++){
        cout << answer[i].second << " ";
    }
}

pair<int, int> getRecursion(int num, int pos){
    if(answer[pos].first == -1) return answer[pos];
    if(num < answer[pos].first) return answer[pos];
    else return getRecursion(num, pos-1);
}