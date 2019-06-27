#include<stdio.h>
#include<iostream>
using namespace std;

int Re(int n);
int main()
{
	int n;
	cin >> n;
	int a[500][500];
	for (int i = 0; i <= n; i++) {
		for (int j = 0, j1 = 1; j <=j1 && j1 <= n; j++) {
			cin >> a[i][j];
		}
	}
	cout << "a";
	return 0;
}
