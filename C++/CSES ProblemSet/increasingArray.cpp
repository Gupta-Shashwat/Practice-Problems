#include <iostream>
using namespace std;

int main()
{
    int n, i;
    long long int count = 0;
    cin >> n;
    int arr[n];
    for (i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    i = 1;
    while (i < n)
    {
        if (arr[i] < arr[i - 1])
        {
            count += arr[i - 1] - arr[i];
            arr[i] = arr[i - 1];
        }
        i++;
    }
    cout << count;
}