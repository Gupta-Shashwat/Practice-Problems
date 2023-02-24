#include <iostream>
#define int long long
using namespace std;

void printSets(int x)
{
    int c1 = 0, c2 = 0, s1[x / 2], s2[x / 2], t1 = 0, t2 = 0;
    while (x)
    {
        if (t1 < t2)
        {
            s1[c1++] = x;
            t1 += x;
        }
        else
        {
            s2[c2++] = x;
            t2 += x;
        }
        x--;
    }
    cout << c2 << endl;
    for (int i = 0; i < c2; i++)
    {
        cout << s2[i] << " ";
    }
    cout << endl
         << c1 << endl;
    for (int i = 0; i < c1; i++)
    {
        cout << s1[i] << " ";
    }
}

int32_t main()
{
    int x;
    cin >> x;
    if (((x * (x + 1)) / 2) % 2 == 0)
    {
        cout << "YES" << endl;
        printSets(x);
    }
    else
    {
        cout << "NO";
    }
}