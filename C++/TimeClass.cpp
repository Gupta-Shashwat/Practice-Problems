#include <iostream>
#include <conio.h>

using namespace std;

class Time
{
    int hrs, mins;

public:
    Time()
    {
        hrs = 0;
        mins = 0;
    }
    Time(int x, int y)
    {
        hrs = x;
        mins = y;
    }
    Time(Time &t)
    {
        this->hrs = t.hrs;
        this->mins = t.mins;
    }
    void sum(Time obj1, Time obj2)
    {
        hrs = obj1.hrs + obj2.hrs;
        mins = obj1.mins + obj2.mins;
        if (mins > 60)
        {
            hrs += (mins / 60);
            mins = mins % 60;
        }
    }
    void display()
    {
        cout << "Hours: " << hrs << "\n";
        cout << "Minutes: " << mins << "\n";
    }
};

int main()
{
    Time time1(1, 40), time2(1, 50), time3;
    time3.sum(time1, time2);
    cout << "Time 1: \n";
    time1.display();
    cout << "Time 2: \n";
    time2.display();
    cout << "Time 3: \n";
    time3.display();
    return 0;
}