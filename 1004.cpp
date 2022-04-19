#include <iostream>
#include <vector>

using namespace std;

struct P{
    int cx, cy, cr;
};

P makeP(int cx, int cy, int cr);
void solution(int x1, int y1, int x2, int y2, int n, vector<P> planet);
bool isIn(int x, int y, P p);

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    for(int tt= 0; tt < t; tt++){
        int x1, y1, x2, y2;
        cin >> x1 >> y1 >> x2 >> y2;
        int n;
        cin >> n;
        vector<P> planet;
        for(int i = 0; i < n; i++){
            int x, y, r;
            cin >> x >> y >> r;
            planet.push_back(makeP(x,y,r));
        }

        solution(x1, y1, x2, y2, n, planet);
    }

    return 0;
}

P makeP(int cx, int cy, int cr){
    P p;
    p.cx = cx;
    p.cy = cy;
    p.cr = cr;
    return p;
}

void solution(int x1, int y1, int x2, int y2, int n, vector<P> planet){
    int cnt = 0;
    for(int i = 0; i < n; i++){
        if(isIn(x1, y1,planet[i]) && !isIn(x2, y2, planet[i])) cnt++;
        else if(!isIn(x1, y1,planet[i]) && isIn(x2, y2, planet[i])) cnt++;
    }
    cout << cnt << "\n";
}

bool isIn(int x, int y, P p){
    int distance = (( x - p.cx )*( x - p.cx )) + (( y - p.cy )*( y - p.cy ));
    int radius = p.cr*p.cr;
    if(distance > radius) return false;
    else return true;
}