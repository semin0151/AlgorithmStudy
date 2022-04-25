#include <iostream>
#include <queue>

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
    priority_queue<int, vector<int>, less<int>> PQ;
    for(int i = 0; i < n; i++){
        int num;
        cin >> num;

        if(num == 0){
            if(PQ.empty()) cout << "0\n";
            else{
                cout << PQ.top() << "\n";
                PQ.pop();
            }
        }
        else{
            PQ.push(num);
        }
    }

}