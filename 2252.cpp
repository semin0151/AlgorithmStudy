#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int N, M;

void BFS();

vector<int> G[32001];
int degree[32001];
queue<int> answer;
queue<int> Q;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> M;

    for(int i = 0; i < M; i++){
        int a, b;
        cin >> a >> b;
        degree[b]++;
        G[a].push_back(b);
    }    

    for(int i = 1; i <= N; i++){
        if(degree[i]==0) {
            Q.push(i);
            degree[i]--;
            BFS();
            break;
        }
    }

    while(!answer.empty()){
        cout << answer.front() << " ";
        answer.pop();
    }
    return 0;
}

void BFS(){

    while(!Q.empty()){
        int pos = Q.front();
        
        for(int i = 0; i < G[pos].size(); i++){
            degree[G[pos][i]]--;
        }

        for(int i = 1; i <= N; i++){
            if(degree[i] == 0){
                Q.push(i);
                degree[i]--;
            }
        }

        answer.push(Q.front());
        Q.pop();
    }

}
