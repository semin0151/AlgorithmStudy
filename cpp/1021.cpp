#include <iostream> 
#include <queue>

using namespace std;

void solution(int n, queue<int> Q);
int findPosition(deque<int> DQ, int num);
int main(){
    int n, m;
    cin >> n >> m;
    queue<int> Q;
    for(int i = 0 ; i < m; i++){
        int num;
        cin >> num;
        Q.push(num);
    }

    solution(n, Q);
    return 0;
}

void solution(int n, queue<int> Q){
    deque<int> DQ;
    for(int i = 1; i <= n; i++) DQ.push_back(i);
    int cnt = 0;
    while(!Q.empty()){
        if(Q.front() == DQ.front()){
            Q.pop();
            DQ.pop_front();
            continue;
        }
        
        int pos = findPosition(DQ, Q.front());
        int leftD = pos;
        int rightD = DQ.size() - pos;

        if(leftD <= rightD){
            for(int i = 0; i < leftD; i++){
                DQ.push_back(DQ.front());
                DQ.pop_front();
            }
            cnt += leftD;
        }
        else{
            for(int i = 0; i < rightD; i++){
                DQ.push_front(DQ.back());
                DQ.pop_back();
            }
            cnt += rightD;
        }
    }
    cout << cnt;
}

int findPosition(deque<int> DQ, int num){
    for(int i = 0; i < DQ.size(); i++){
        if(DQ[i] == num) return i;
    }
    return -1;
}