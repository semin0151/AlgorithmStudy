#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N, M;
vector<int> arr;

int lowerBound(int num);
int upperBound(int num);

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N;
    for(int i = 0; i < N; i++){
        int tmp;
        cin >> tmp;
        arr.push_back(tmp);
   }
   sort(arr.begin(), arr.end());

    cin >> M;
    for(int i = 0; i < M; i++){
        int tmp;
        cin >> tmp;

        cout << upper_bound(arr.begin(), arr.end(), tmp) - arr.begin() << ' ' << lower_bound(arr.begin(), arr.end(), tmp) - arr.begin() << endl;
        cout << upper_bound(arr.begin(), arr.end(), tmp) - lower_bound(arr.begin(), arr.end(), tmp) << ' ' << endl;
    }

    return 0;
}