#include <iostream>
#include <set>

using namespace std;
set<string> s, answer;
int main(){
    int n, m;
    
    cin >> n >> m;
    for(int i = 0 ; i < n; i++){
        string name;
        cin >> name;
        s.insert(name);
    }

    for(int i = 0; i < m; i++){
        string name;
        cin >> name;
        if(s.find(name) == s.end()) continue;
        answer.insert(name);
    }
    cout << answer.size() << "\n";

    for(string name: answer){
        cout << name << "\n";
    }

    return 0;
}