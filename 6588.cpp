#include <iostream>
#include <cmath>
using namespace std;

bool check[1000001] = { false };
bool isPrime(int num);

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	check[1] = false;
	check[2] = true;
	for (int i = 3; i <= 1000000; i++) {
		    if (isPrime(i))check[i] = true;
	    }
	while (true) {
		int num;
		cin >> num;
        
        if(num==0) break;
		for (int i = 3; i <= num/2; i++) {
			if (check[i] && check[num - i]) {
				cout << num << " = " << i << " + " << num-i << "\n";
				break;
			}
		}
	}
	return 0;
}

bool isPrime(int num) {
	for (int i = 2; i <= sqrt(num); i++) {
		if (num % i == 0) return false;
	}
	return true;
}