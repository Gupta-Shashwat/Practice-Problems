#include<iostream>
using namespace std;

int search(int *arr,int e, int x)
{
    for (int i = 0; i < e; i++){ 
        if (arr[i] == x)
        {
            return i;
        }
    }
    return -1;
}

void func()
{
    int e;
    cout << "Enter the number of elements in the array: ";
    cin >> e;
    int arr[e], x;
    cout << "Enter the elements of the array: ";
    for (int j = 0; j < e; j++){ 
        cin >> arr[j];
    }
    cout << "Enter the value of the search number: ";
    cin >> x;
    cout << "The index at which " << x << " is found in the given array is ";
    cout << search(arr, e, x) << endl;
}

int main(){
    int t, e;
    cout << "Enter the number of test cases: ";
    cin >> t;
    while (t > 0){
        func();
        t--;
    }
    return 0;
}