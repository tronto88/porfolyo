#include <iostream>
#include "Employee.h"
using namespace std;

Employee::Employee( string first, string last, int salary )
{ 
   setFirstName( first );
   setLastName( last );
   setMonthlySalary( salary );
}

void Employee::setFirstName( string name )
{
   firstName = name; 
} 

string Employee::getFirstName()
{
   return firstName;
} 

void Employee::setLastName( string name )
{
   lastName = name; 
} 

string Employee::getLastName()
{
   return lastName;
}

void Employee::setMonthlySalary( int salary )
{ 
   if ( salary > 0 ) 
      monthlySalary = salary; 

   if ( salary <= 0 ) 
      monthlySalary = 0; 
} 

int Employee::getMonthlySalary()
{
   return monthlySalary;
}
