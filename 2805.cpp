#include <iostream>
#include <vector>

using namespace std;

vector<long long> tree;

long long n, m;
long long answer;
void check(long long begin, long long end);

int main(){
    cin >> n >> m;

    long long treeMax = 0;

    for(int i = 0; i < n; i++){
        long long tmp;
        cin >> tmp;
        tree.push_back(tmp);
        treeMax = max(treeMax, tmp);
    }
    check(0, treeMax);
    cout << answer;


    return 0;
}

void check(long long begin, long long end){
    if( begin > end ) return;
    long long mid = (begin + end)/ 2;

    long long result = 0;
    for(int i = 0; i < n; i++){
        if(tree[i] - mid <= 0) continue;
        result += tree[i] - mid;
    }
    if(result >= m) {
        answer = max(mid, answer);
        check(mid+1, end);
    }
    else{
        check(begin, mid-1);
    }
}