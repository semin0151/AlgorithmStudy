#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n, m;
vector<int> arr;

int binarySearch(int num);

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin >> n;
    for(int i = 0; i < n; i++){
        int tmp;
        cin >> tmp;
        arr.push_back(tmp);
    }
    sort(arr.begin(), arr.end());
    cin >> m;
    for(int i = 0; i < m; i++){
        int tmp;
        cin >> tmp;
        cout << binarySearch(tmp) << ' ';
    }

    return 0;
}

int binarySearch(int num){
    int start = 0;
    int end = arr.size()-1;
    int mid;
    while(start <= end){
        mid = ( start + end )/2;
        if( arr[mid] == num ) return 1;

        if( arr[mid] > num ) end = mid -1;
        if( arr[mid] < num ) start = mid + 1;
    }
    return 0;
}