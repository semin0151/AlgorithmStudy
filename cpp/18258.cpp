#include <iostream>
#include <queue>

using namespace std;

int main(){
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    queue<int> Q;
    cin >> n;
    for(int tt = 0; tt < n; tt++){
        string str;
        cin >> str;
        if(str == "push"){
            int num;
            cin >> num;
            Q.push(num);
        }
        else if(str == "pop"){
            if(!Q.empty()){
                cout << Q.front() << "\n";
                Q.pop();
            }
            else{
                cout << "-1\n";
            }
        }
        else if(str == "size"){
            cout << Q.size() << "\n";
        }
        else if(str =="empty"){
            cout << Q.empty() << "\n";
        }
        else if(str == "front"){
            if(!Q.empty()){
                cout << Q.front() << "\n";
            }
            else cout << "-1\n";
        }
        else{
            if(!Q.empty()){
                cout << Q.back() << "\n";
            }
            else cout << "-1\n";
        }

    }


    return 0;
}