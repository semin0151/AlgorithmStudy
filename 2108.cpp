#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int check[8002] = { 0 };
vector<int> arr;

int main(){
    int num;
    cin >> num;

    double sum = 0;
    int count_max = 0;

    for(int i = 0; i < num; i++){
        int tmp;
        cin >> tmp;
        sum += tmp;
        check[tmp+4000]++;
        count_max = max(count_max, check[tmp+4000]);
        arr.push_back(tmp);
    }
    sort(arr.begin(), arr.end());

    cout << floor((sum / num) + 0.5) << endl;
    cout << arr[(num-1)/2] << endl;

    int cnt = 0;
    int tmp;

    for(int i = 0; i < 8002; i++){
        if(check[i] == count_max){
            tmp = i;
            cnt++;
        }
    }
    if(cnt == 1) cout << tmp - 4000 << endl;
    else{
        bool flag = false;
        for(int i = 0; i < 8002; i++){
            if(check[i] == count_max){
                if(!flag) flag = true;
                else {
                    cout << i-4000 << endl;
                    break;
                }
            }
        }
    }
    
    
    cout << arr[arr.size()-1] - arr[0] << endl;

    return 0;
}