#include <iostream>

using namespace std;

int main(){
    int num, cnt = 0, div = 64;
    cin >> num;
    for(int i = 64; i > 0; i/=2){
        if(i>num) continue;
        else{
            while(true){
                if(num >= i){
                    num -= i;
                    cnt++;
                }
                else break;
            }
        }
    }
    cout << cnt;
    return 0;
}
