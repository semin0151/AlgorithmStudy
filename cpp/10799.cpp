#include <iostream>
#include <queue>
#include <stack>
#include <vector>
#include <algorithm>

using namespace std;

struct P{
    int pos;
    char ch;
};

struct Stick{
    int start;
    int end;
};

void solution(string str);
Stick getStick(int start, int end);
P getP(int pos, char ch);

int main(){
    string str;
    cin >> str;

    solution(str);

    return 0;
}

void solution(string str){
    stack<P> S;
    vector<float> lazer;
    queue<Stick> stick;
    for(int i = 0; i < str.size(); i++){
        if(str[i] == '(')S.push(getP(i, str[i]));
        else{
            if(S.top().pos == i-1){
                lazer.push_back(i-0.5);
                S.pop();
            }
            else{
                stick.push(getStick(S.top().pos, i));
                S.pop();
            }
        }
    }
    
    int answer = 0;
    while(!stick.empty()){
        int cnt = 1;
        cnt += lower_bound(lazer.begin(), lazer.end(), stick.front().end) - upper_bound(lazer.begin(), lazer.end(), stick.front().start);

        answer += cnt;
        stick.pop();
    }
    cout << answer;
}

Stick getStick(int start, int end){
    Stick stick;
    stick.start = start;
    stick.end = end;
    return stick;
}

P getP(int pos, char ch){
    P p;
    p.pos = pos;
    p.ch = ch;
    return p;
}