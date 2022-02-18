#include <iostream>
#include <string>
#include "HeartRates.h"
using namespace std;

int main()
{
   string first, last; 
   int month, day, year; 

   cout << "Please enter first and last name:" << endl;
   cin >> first >> last;
   cout << "Please enter month, day, and year of birth:" << endl;
   cin >> month >> day >> year;

   HeartRates heartRates( first, last, month, day, year );

   cout << "First Name: " << heartRates.getFirstName() << "\n";
   cout << "Last Name: " << heartRates.getLastName() << "\n";
   cout << "Date of Birth: " << heartRates.getBirthMonth() << "/"
      << heartRates.getBirthDay() << "/"
      << heartRates.getBirthYear() << "\n";
   cout << "Age: " << heartRates.getAge() << "\n";
   cout << "Maximum Heart Rate: "
      << heartRates.getMaximumHeartRate() << "\n";
   cout << "Target Heart Rate: "
      << heartRates.getMinimumTargetHeartRate() << "-"
      << heartRates.getMaximumTargetHeartRate() << "\n";
} 

