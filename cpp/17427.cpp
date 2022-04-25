#include <iostream> 

using namespace std;

int main(){
    int n;

    cin >> n;

    long long answer = 0;

    for(int i = 1; i <=n; i++){
        answer += i * (n/i);
    }

    cout << answer;

    return 0;
}