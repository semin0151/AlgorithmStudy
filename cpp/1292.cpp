#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    string str, answer = "";
    cin >> str;
    reverse(str.begin(), str.end());
    if(str.size()%3!=0){
        while(str.size()%3!=0) str += '0';
    }
    for(int i = 0; i < str.size(); i+=3){
        string tmp = str.substr(i, 3);
        
        if(tmp == "000") answer += "0";
        else if(tmp == "100") answer += "1";
        else if(tmp == "010") answer += "2";
        else if(tmp == "110") answer += "3";
        else if(tmp == "001") answer += "4";
        else if(tmp == "101") answer += "5";
        else if(tmp == "011") answer += "6";
        else answer += "7";
    }
    /*
    for(int i = answer.size() - 1; i > 0; i--){
        if(answer[i] == '0') answer = answer.substr(0, answer.size()-1);
    }
    */
    reverse(answer.begin(), answer.end());
    cout << answer;
    return 0;
}