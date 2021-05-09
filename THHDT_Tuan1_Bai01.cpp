#include <iostream>
using namespace std;
int main()
{
	int a, b, c, min;
	cout << "nhap a: ";
	cin >> a;
	cout << "nhap b: ";
	cin >>  b ;
	cout << "nhap c: ";
	cin >>  c;
	min = a;
	if (min > b)
		min = b;
	if (min > c)
		min = c;
	cout << "so nhat trong 3 so la: " << min<<endl;
	system("pause");
	return 0;
}