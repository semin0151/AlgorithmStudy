#include <iostream>
#include <vector>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n, m;
    int apos, bpos = 0;
   
    vector<int> A;
    vector<int> B;
    vector<int> answer; 
    
    cin >> n >> m;

    for(int i = 0; i < n; i++){
        int num;
        cin >> num;
        A.push_back(num);
    }
    for(int i = 0; i < m; i++){
        int num;
        cin >> num;
        B.push_back(num);
    }

    while(true){
        int num;
        if(apos >= n || bpos >= m) break;
        if(A[apos] < B[bpos]){
            num = A[apos];
            apos++;
        }
        else{
            num = B[bpos];
            bpos++;
        }
        answer.push_back(num);
    }

    if(apos < n){
        for(int i = apos; i < n; i++) answer.push_back(A[i]);
    }
    if(bpos < m){
        for(int i = bpos; i < m; i++) answer.push_back(B[i]);
    }
    for(int i = 0; i < answer.size(); i++) cout << answer[i] << " ";

    return 0;
}
