#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct P{
    int age;
    string name;
    int pos;
};

vector<P> arr;

P getP(int age, string name, int pos);
bool compare( const P& p1, const P& p2);


int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    int num;

    cin >> num;

    for(int i = 0; i < num; i++){
        int age; 
        string name;
        cin >> age >> name;
        arr.push_back(getP(age, name, i));
    }
    
    sort(arr.begin(), arr.end(), compare);
    
    for(int i = 0; i < num; i++){
        cout << arr[i].age << " " << arr[i].name << "\n";
    }
}

P getP(int age, string name, int pos){
    P p;
    p.age = age;
    p.name = name;
    p.pos = pos;
    return p;
}

bool compare( const P& p1, const P& p2){
    if(p1.age == p2.age){
        return p1.pos < p2.pos;
    }
    else return p1.age < p2.age;
}