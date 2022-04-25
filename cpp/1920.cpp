#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> A;

bool checkNum(int num, int begin, int end);
int main(){
    
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    
    int a, b;
    cin >> a;
    for(int i = 0; i < a; i++){
        int num;
        cin >> num;
        A.push_back(num);
    }
    sort(A.begin(), A.end());
    
    cin >> b; 
    for(int i = 0; i < b; i++){
        int num;
        cin >> num;
        if(checkNum(num, 0, a-1)) cout << "1\n";
        else cout << "0\n";
    }
    
    return 0;
}

bool checkNum(int num, int begin, int end){
    if(begin>end) return false;

    int mid = (begin + end) / 2;
    //cout << begin << " " << end << " " << mid << endl;
    
    if(A[mid] == num) return true;
    else{
        if(A[mid]>num) return checkNum(num,begin,mid-1);
        else return checkNum(num, mid+1, end);
    }
}