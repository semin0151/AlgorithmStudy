#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
vector<int> arr;

long long answer, n, m;
void findLine(long long left, long long right);
int main() {
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		int tmp;
		cin >> tmp;
		arr.push_back(tmp);
	}
	sort(arr.begin(), arr.end());
	findLine(1, arr[arr.size()-1]);
	cout << answer;

	return 0;
}

void findLine(long long	left, long long right) {
	int cnt = 0;
	long long mid = (left + right) / 2;
	if (left > right) {
		answer = min(left, right);
	}
	else {
		for (int i = 0; i < arr.size(); i++) {
			cnt += arr[i] / mid;
		}
		if (cnt < m)findLine(left, mid - 1);
		else findLine(mid + 1, right);
	}
}