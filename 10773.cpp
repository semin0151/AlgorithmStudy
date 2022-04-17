#include <iostream>
#include <stack>

using namespace std;

int main(){
    int n;
    stack<int> S;
    long long answer = 0;
    cin >> n;
    for(int i = 0; i < n; i++){
        int num;
        cin >> num;
        if(num > 0){
            S.push(num);
        }
        else{
            S.pop();
        }
    }

    while(!S.empty()){
        answer += S.top();
        S.pop();
    }

    cout << answer;

    return 0;
}