#include <iostream>
using namespace std;

int32_t main()
{
    long long n, x = 1;
    cin >> n;
    n %= 29;
    for (long long i = 0; i < n; i++)
    {
        x *= 2;
    }
    cout << x;
}