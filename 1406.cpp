#include <iostream>
#include <queue>

using namespace std;

void solution(string str, int n);
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string str;
    cin >> str;
    int n;
    cin >> n;
    solution(str, n);
    return 0;
}

void solution(string str, int n){
    deque<char> DQ1, DQ2;
    
    for(int i = 0; i < str.size(); i++){
        DQ1.push_back(str[i]);
    }
    
    for(int i = 0; i < n; i++){
        char ch;
        cin >> ch;
        
        if(ch == 'L'){
            if(!DQ1.empty()){
                DQ2.push_front(DQ1.back());
                DQ1.pop_back();
            } 
        }
        if(ch == 'D'){
            if(!DQ2.empty()){
                DQ1.push_back(DQ2.front());
                DQ2.pop_front();
            }
        }
        if(ch == 'B'){
            if(!DQ1.empty()) DQ1.pop_back();            
        }
        if(ch == 'P'){
            char tmp;
            cin >> tmp;
            DQ1.push_back(tmp);
        }
    }

    while(!DQ1.empty()){
        cout << DQ1.front();
        DQ1.pop_front();
    }
    
    while(!DQ2.empty()){
        cout << DQ2.front();
        DQ2.pop_front();
    }
}