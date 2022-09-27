#include <iostream>

using namespace std;

class teacher
{
protected:
    string name, subject;
    static string school;
    int id;

public:
    static int count;

    teacher()
    {
        count++;
        id = count;
    };

    void get();
    void display();
};

class classTeacher : public teacher
{
    int cls;
    char section;

public:
    void get();
    void display();
};

int main()
{
    teacher t1, t2;
    classTeacher t3;
    cout << "Enter details of teachers: " << endl;
    t1.get();
    t2.get();
    t3.get();
    cout << "\nDetails of teachers: " << endl;
    t1.display();
    t2.display();
    t3.display();
}

string teacher::school = "Primary School";
int teacher::count = 0;

void teacher::get()
{
    cout << "\nTeacher " << id << ": " << endl;
    cout << "Enter teacher's name: ";
    cin >> name;
    cout << "Enter teachers's subject: ";
    cin >> subject;
}

void teacher::display()
{
    cout << "\nTeacher " << id << ": " << endl;
    cout << "Name: " << name << endl;
    cout << "Subject: " << subject << endl;
    cout << "School: " << school << endl;
}

void classTeacher::get()
{
    cout << "\nTeacher " << id << ": " << endl;
    cout << "Enter teacher's name: ";
    cin >> name;
    cout << "Enter teachers's subject: ";
    cin >> subject;
    cout << "Enter the class which the teacher is teacher of: ";
    cin >> cls;
    cout << "Enter the section: ";
    cin >> section;
}

void classTeacher::display()
{
    cout << "\nTeacher " << id << ": " << endl;
    cout << "Name: " << name << endl;
    cout << "Subject: " << subject << endl;
    cout << "School: " << school << endl;
    cout << "Class: " << cls << endl;
    cout << "Section: " << section << endl;
}
