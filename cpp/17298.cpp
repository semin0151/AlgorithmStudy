#include <iostream>
#include <vector>

using namespace std;
void solution(int n, vector<int> arr);
int getRecursion(int num, int pos);
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;
    vector<int> arr;
    for(int i = 0; i < n; i++){
        int num;
        cin >> num;
        arr.push_back(num);
    }
    solution(n, arr);
    return 0;
}

vector<int> copy_answer;
void solution(int n, vector<int> arr){
    vector<int> answer(n);
    copy_answer = answer;
    copy_answer[n-1] = -1;

    for(int i = n-2; i >= 0; i--){
        if(arr[i+1] > arr[i]) copy_answer[i] = arr[i+1];
        else copy_answer[i] = getRecursion(arr[i], i);
    }
    for(int i = 0; i < n; i++){
        cout << copy_answer[i] << " ";
    }
}

int getRecursion(int num, int pos){
    if(copy_answer[pos+1] == -1) return -1;
    if(num < copy_answer[pos+1]) return copy_answer[pos+1];
    else return getRecursion(num, pos+1);
}