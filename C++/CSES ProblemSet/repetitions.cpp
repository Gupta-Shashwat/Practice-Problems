#include <iostream>
using namespace std;

int main()
{
    string s;
    int currentStreak = 1, maxStreak = 1;
    cin >> s;
    for (int i = 1; i < s.length(); i++)
    {
        if (s[i] == s[i - 1])
        {
            currentStreak += 1;
        }
        else if (maxStreak < currentStreak)
        {
            maxStreak = currentStreak;
            currentStreak = 1;
        }
    }
    if (maxStreak < currentStreak)
    {
        maxStreak = currentStreak;
    }
    cout << maxStreak;
}