#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct P {
	int y;
	int x;
};

vector<P> arr;

P getP(int x, int y);

bool cmp(P p1,P p2);
int n;

int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int x, y;
		cin >> x >> y;
		arr.push_back(getP(x, y));
	}
	sort(arr.begin(), arr.end(), cmp);

	for (int i = 0; i < n; i++) cout << arr[i].x << " " << arr[i].y << "\n";
	
	return 0;
}

bool cmp(P p1, P p2) {
	if (p1.x == p2.x)return p1.y < p2.y;
	return p1.x < p2.x;
}

P getP(int x, int y) {
	P p;
	p.y = y;
	p.x = x;
	return p;
}