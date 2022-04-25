#include <iostream>
#include <queue>

using namespace std;

int main(){
    int n;
    cin >> n;

    if(n == 1){
        cout << 1;
    }else{
        queue<int> Q;
        for(int i = 1; i <= n; i++)Q.push(i);

        while(!Q.empty()){
            Q.pop();
            Q.push(Q.front());
            Q.pop();

            if(Q.size() == 1) break;
        }
        cout << Q.front();
    }

    return 0;
}