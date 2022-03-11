#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> stones_copy;
vector<int> V;
vector<int> check;
int k_copy;
bool ok = false;

string solution(vector<int> stones, int k);

void getRecursion(int sum, int pos);

int main(){
    
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    vector<int> VV;
    int kk;
    
    for(int i = 0; i < 5; i++){
        int tmp;
        cin >> tmp;
        VV.push_back(tmp);
    }
    cin >> kk;
    
    cout << solution(VV, kk);
}

string solution(vector<int> stones, int k) {
    

    string answer = "";

    stones_copy = stones;
    k_copy = k;
    
    getRecursion(0,0);

    if(check.empty() && !ok) return "-1";
    for(int i = 0; i < check.size(); i++) answer += check[i] + '0';
    
    return answer;
}

void getRecursion(int sum, int pos){
    for(int i = 0; i < stones_copy.size(); i++) cout << stones_copy[i] << " ";
    cout << endl;
    cout << "sum : " << sum << " pos : " << pos << endl;
    if(sum == k_copy && stones_copy[pos] == k_copy){
        check = V;
        ok = true;
        return;
    } 

    for(int i = 0; i < stones_copy.size(); i++){
        
        bool flag = true;

        for(int j = 0; j < stones_copy.size(); j++){
            if(j!=i && stones_copy[j]==0){
                flag = false;
                break;
            }
        }
        if(flag){
        V.push_back(i);
        int checksum = 0;
        for(int j = 0; j < stones_copy.size(); j++){
            if(j==i) stones_copy[j]++;
            else stones_copy[j]--;
            checksum += stones_copy[j];
        }
        
        getRecursion(checksum,i);
        
        V.pop_back();
        for(int j = 0; j < stones_copy.size(); j++){
            stones_copy[j]++;
        }
        stones_copy[i] -= 2;
        }
    }
}