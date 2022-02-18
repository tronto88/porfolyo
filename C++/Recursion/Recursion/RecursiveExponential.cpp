//(Recursive Exponentiation) Write a recursive function power( base, exponent ) that, when
//invoked, returns base exponent //For example, power( 3, 4 ) = 3 * 3 * 3 * 3. Assume that 
//exponent is an integer greater than or equal to 1. 
//Hint: The recursion step would use the relationship base exponent = base · base exponent - 1
//and the terminating condition occurs when exponent is equal to 1, because
//base1 = base


#include <iostream>
using namespace std;

long power( long, long ); // function prototype

int main()
{
   long b; // base 
   long e; // exponent

   cout << "Enter a base and an exponent: ";
   cin >> b >> e;

   // calculate and display b^e
   cout << b << " raised to the " << e << " is " << power( b, e ) << endl;
} // end main

// power recursively calculates base^exponent, assume exponent >= 1
long power( long base, long exponent )
{
   if ( exponent == 1 ) // base case: exponent equals 1, return base
      return base;
   else // recursion step
      return base * power( base, exponent - 1 );
} // end function power

