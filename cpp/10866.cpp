#include <iostream>
#include <deque>

using namespace std;

deque<int> DQ;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;
    cin >> n;

    for(int i = 0; i < n; i++){
        string str;
        cin >> str;
        if(str == "push_back"){
            int num;
            cin >> num;
            DQ.push_back(num);
        }
        if(str == "push_front"){
            int num;
            cin >> num;
            DQ.push_front(num);
        }
        if(str == "pop_front"){
            if(DQ.empty()){
                cout << "-1\n";
            }
            else{
                cout << DQ.front() << "\n";
                DQ.pop_front();
            }
        }
        if(str == "pop_back"){
            if(DQ.empty()){
                cout << "-1\n";
            }
            else{
                cout << DQ.back() << "\n";
                DQ.pop_back();
            }
        }
        if(str == "size"){
            cout << DQ.size() << "\n";
        }
        if(str == "empty"){
            if(DQ.empty()) cout << "1\n";
            else cout << "0\n";
        }
        if(str == "front"){
            if(DQ.empty()){
                cout << "-1\n";
            }
            else{
                cout << DQ.front() << "\n";
            }
        }
        if(str == "back"){
            if(DQ.empty()){
                cout << "-1\n";
            }
            else{
                cout << DQ.back() << "\n";
            }
        }
    }

    return 0;
}