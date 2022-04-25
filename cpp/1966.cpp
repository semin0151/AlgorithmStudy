#include <iostream>
#include <queue>
using namespace std;

struct P{
    int value, idx;
};

P getP(int value, int idx);
int main(){
    int n;
    cin >> n;

    for(int tt = 0; tt < n; tt++){
        int m, idx;
        deque<P> Q, answer;
        cin >> m >> idx;

        for(int i = 0; i < m; i++){
            int num;
            cin >> num;
            Q.push_back(getP(num, i));
        }

        if(Q.size()>1){
            while(!Q.empty()){
                answer.push_back(Q.front());
                Q.pop_front();

                if(answer.back().value < Q.front().value){
                    deque<P> tmp;
                    while(!Q.empty() && !answer.empty() && answer.back().value < Q.front().value){
                        tmp.push_back(answer.back());
                        answer.pop_back();
                    }
                    while(!tmp.empty()){
                        Q.push_back(tmp.back());
                        tmp.pop_back();
                    }
                }
            }

            int cnt = 0;
            while(!answer.empty()){
                cnt++;
                if(answer.front().idx == idx){
                    cout << cnt << "\n";
                    break;
                }
                answer.pop_front();
            }
        }
        else cout << "1\n";

    }


    return 0;
}

P getP(int value, int idx){
    P p;
    p.value = value;
    p.idx = idx;
    return p;
}