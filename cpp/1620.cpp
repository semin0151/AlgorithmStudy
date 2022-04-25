#include <iostream>
#include <vector>
#include <string>
#include <map>

using namespace std;

void solution(vector<string> pocketmon, vector<string> question);
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n, m;
    cin >> n >> m;
    vector<string> pocketmon;
    for(int i = 0; i < n; i++){
        string str;
        cin >> str;
        pocketmon.push_back(str);
    }
    vector<string> question;
    for(int i = 0; i < m; i++){
        string str;
        cin >> str;
        question.push_back(str);
    }
    solution(pocketmon, question);
    return 0;
}

void solution(vector<string> pocketmon, vector<string> question){
    map<string, int> p2n;
    map<int, string> n2p;
    
    for(int i = 0; i < pocketmon.size(); i++){
        p2n.insert(make_pair(pocketmon[i], i+1));
        n2p.insert(make_pair(i+1, pocketmon[i]));
    }

    for(int i = 0; i < question.size(); i++){
        if(question[i][0] -'0' >= 0 && question[i][0] - '0' <= 9){
            int num = stoi(question[i]);
            cout << n2p[num] << "\n";
        }else{
            cout << p2n[question[i]] << "\n";
        }
    }

}