#include <bits/stdc++.h>
#define int long long
using namespace std;

int32_t main()
{
    int t, x, y;
    int ans;
    cin >> t;
    while (t--)
    {
        cin >> x >> y;
        if (x >= y)
        {
            ans = (x % 2 == 0) ? (x * x - y + 1) : ((x - 1) * (x - 1) + y);
        }
        else
        {
            ans = (y % 2 == 0) ? ((y - 1) * (y - 1) + x) : (y * y - x + 1);
        }
        cout << ans << endl;
    }
}