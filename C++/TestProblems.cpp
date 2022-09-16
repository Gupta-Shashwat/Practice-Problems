#include <iostream>

using namespace std;

class Student {
    char name[20];
    int rollNo;
    static const char sec = 'b';

    public:
        void get() {
            cout << "Enter your name: ";
            cin >> name;
            cout << "Enter your roll number: ";
            cin >> rollNo;
        }
        void print() {
            cout << "Name: " << name << endl << "Roll No.: " << rollNo << endl << "Section: " << sec << endl;
        }
};

// char Student::sec = 'b';

int main() {
    Student s1, s2;
    s1.get();
    s2.get();
    s1.print();
    s2.print();
    return 0;
}