#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n, c;
vector<int> arr;

int binarySearch();
bool check(int d);
int main(){

    cin >> n >> c;

    for(int i = 0; i < n; i++){
        int tmp;
        cin >> tmp; 
        arr.push_back(tmp);
    }   
    sort(arr.begin(), arr.end());

    cout << binarySearch();
    return 0;
}

int binarySearch(){
    int start = 1;
    int end = arr[arr.size()-1] - arr[0];
    int mid;
    
    while(start <= end){
        mid = (start + end)/2;
        if(check(mid)) start = mid +1;
        else end = mid -1;  
    }
    return end;
}

bool check(int d){
    int pos;
    int cnt = 0;
    for(int i = 0; i < arr.size(); i++){
        if(i == 0 || arr[i] - arr[pos] >= d){
            pos = i;
            cnt++;
        }
        if(cnt == c) return true;
    }
    return false;
}