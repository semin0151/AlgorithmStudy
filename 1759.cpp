#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n, m;
int M, J;
vector<char> V;
char arr[16];
void getRecursion(int level);
int main(){
    cin >> n >> m;
    for(int i = 0; i < m; i++) {
        char ch;
        cin >> ch;
        V.push_back(ch);
    }
    sort(V.begin(), V.end());
    getRecursion(0);    
    return 0;
}

void getRecursion(int level){
    if(level==n){
        if(M>=1 && J >=2){
            for(int i = 0; i < n; i++) cout << arr[i];
            cout << "\n";
        }
    }
    else{
        for(int i = 0; i < m; i++){
            if(level == 0 || V[i] > arr[level-1]){
                if(V[i] == 'a' || V[i] == 'e' || V[i] == 'i' || V[i] == 'o' || V[i] =='u') M++;
                else J++;
                arr[level] = V[i];
                getRecursion(level+1);
                if(V[i] == 'a' || V[i] == 'e' || V[i] == 'i' || V[i] == 'o' || V[i] =='u') M--;
                else J--;
            }
        }
    }
}