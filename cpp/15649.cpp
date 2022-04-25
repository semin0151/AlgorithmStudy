#include <iostream>

using namespace std;

void getRecursion(int idx);

int n, m;
int arr[9];
bool check[9];
int main(){
    cin >> n >> m;

    getRecursion(0);

    return 0;
}

void getRecursion(int idx){
    if(idx == m){
        for(int i = 0; i < m; i++){
            cout << arr[i] << " ";
        }
        cout << '\n';
    }
    else{
        for(int i = 1; i <= n; i++){
            if(!check[i]){
                check[i] = true;
                arr[idx] = i;
                getRecursion(idx+1);
                check[i] = false;
            }
        }
    }
}