#include <iostream>
#include <string>
#include <vector>
#include <queue>

using namespace std;
vector<int> makeVector(string str);
void solution(string str, vector<int> V);
int main(){
    int t;
    cin >> t;
    for(int tt= 0 ; tt < t; tt++){
        string str;
        int n;
        string tmp;
        cin >> str;
        cin >> n;
        cin >> tmp;
        solution(str, makeVector(tmp));
    }
}

void solution(string str, vector<int> V){
    queue<char> Q;
    deque<int> DQ;

    for(int i = 0; i < str.size(); i++) Q.push(str[i]);

    for(int i = 0; i < V.size(); i++) DQ.push_back(V[i]);

    bool dir = true;
    //cout << "size " <<  DQ.size() << endl;
    while(!Q.empty()){
        if(Q.front() == 'R'){
            if(dir) dir = false;
            else dir = true;
        }
        if(Q.front() == 'D'){
            if(DQ.empty()){
                cout << "error\n";
                return;
            }

            if(dir) DQ.pop_front();
            else DQ.pop_back();
        }

        Q.pop();
    }

    if(DQ.size() <= 1){
        cout << '[';
        if(DQ.size() == 1) cout << DQ.front();
        cout << "]\n";
    }
    else if(dir){
        cout << '[';
        while(DQ.size()> 1){
            cout << DQ.front() << ',';
            DQ.pop_front();
        }
        cout << DQ.front() << "]\n";
    }
    else{
        cout << '[';
        while(DQ.size()> 1){
            cout << DQ.back() << ',';
            DQ.pop_back();
        }
        cout << DQ.back() << "]\n";
    }
}

vector<int> makeVector(string str){
    vector<int> V;
    string tmp = "";
    for(int i = 0; i < str.size(); i++){
        if(str[i] - '0' >= 0 && str[i] - '0' <= 9) tmp += str[i];
        else if(str[i] == ',' || str[i] == ']'){
            if(tmp.length() != 0) V.push_back(stoi(tmp));
            tmp = "";
        }
    }
    return V;
}