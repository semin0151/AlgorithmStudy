#include <iostream>
#include <vector>
#include <queue>

using namespace std;

struct P{
    int y, x;
};

struct dir{
    int time;
    char D;
};

void solution(int n, vector<P> apple, queue<dir> snake);
P makeP(int y, int x);
dir makeDir(int time, char D);
bool move();

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n, m, s;
    vector<P> apple;
    queue<dir> snake;
    cin >> n;
    cin >> m;
    for(int i = 0; i < m; i++){
        int A, B;
        cin >> A >> B;
        apple.push_back(makeP(A,B));
    }
    cin >> s;
    for(int i = 0; i < s; i++){
        int A;
        char B;
        cin >> A >> B;
        snake.push(makeDir(A,B));
    }
    solution(n, apple, snake);

    return 0;
}

P makeP(int y, int x){
    P p;
    p.y = y;
    p.x = x;
    return p;
}

dir makeDir(int time, char D){
    dir d;
    d.time = time;
    d.D = D;
    return d;
}

int arr[105][105] = { { 0 } };
int dy[4] = { 0, 1, 0, -1};
int dx[4] = { 1, 0, -1, 0};
deque<P> sQ;
int sD;
int copy_nn;

void solution(int n, vector<P> apple, queue<dir> snake){
    sD = 0;
    sQ.push_back(makeP(1,1));
    arr[1][1] = 1;
    copy_nn = n;

    for(int i = 0; i < apple.size(); i++){
        arr[apple[i].y][apple[i].x] = 2;
    }

    int t = 0;
    
    while(true){
        
        if(snake.front().time == t){
            if(snake.front().D == 'L'){
                sD--;
                if(sD == -1) sD = 3;
            }
            if(snake.front().D == 'D'){
                sD++;
                if(sD == 4)sD = 0;
            }
            snake.pop();
        }

        bool isAvailable = move();
        /*
        cout << "======\n";
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                cout << arr[i][j] << " ";
            }
            cout << endl;
        }*/

        if(isAvailable){
            t++;
            continue;
        } 
        break;
    }
    t++;
    cout << t;
}

bool move(){
    int ny = sQ.front().y + dy[sD];
    int nx = sQ.front().x + dx[sD];

    if(ny == 0 || ny > copy_nn || nx == 0 || nx > copy_nn || arr[ny][nx] == 1) return false;
    sQ.push_front(makeP(ny, nx));
    
    if(arr[ny][nx] == 0){
        arr[sQ.back().y][sQ.back().x] = 0;
        sQ.pop_back();
    }
    arr[ny][nx] = 1;  

    return true;

}