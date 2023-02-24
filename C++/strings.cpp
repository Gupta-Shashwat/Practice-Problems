#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    string s, s1, s2, s3;
    cin >> s1 >> s2 >> s3;
    s = s1 + " " + s2 + " " + s3;
    cout << s << endl;
    s = "";
    s.append(s1);
    s.append(" ");
    s.append(s2);
    s.append(" ");
    s.append(s3);
    cout << s << endl;
}