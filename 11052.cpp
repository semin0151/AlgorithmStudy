#include <iostream>
#include <vector>

using namespace std;

void solution(int n, vector<int> V);

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;
    cin >> n;
    vector<int> V;
    V.push_back(0);
    for(int i = 1; i <= n; i++){
        int num;
        cin >> num;
        V.push_back(num);
    }
    solution(n, V);

    return 0;
}

void solution(int n, vector<int> V){
    vector<int> answer(n+1);

    for(int i = 1; i <= n; i++){

        for(int j = 0; j + i <= n; j++){
            answer[j+i] = max(answer[j+i], answer[j] + V[i]);
        }
        /*
        for(int j = 1; j <= n; j++){
            cout << answer[j] << " ";
        }*/
        //cout << endl;
    }
    cout << answer[n];
}