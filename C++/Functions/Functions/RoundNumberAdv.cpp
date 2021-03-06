
#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

double roundToInteger( double ); // function prototype
double roundToTenths( double ); // function prototype
double roundToHundredths( double ); // function prototype
double roundToThousandths( double ); // function prototype

int main()
{   
   int count; // number of values to process
   double number; // current input

   cout << "How many numbers do you want to process? " << fixed;
   cin >> count;

   // loop for inputs
   for ( int i = 0; i < count; i++ ) 
   {
      cout << "\nEnter number: ";
      cin >> number;

      // display number rounded to nearest integer
      cout << setprecision( 6 ) << number 
         << " rounded to the nearest integer is:    "
         << setprecision( 0 ) << roundToInteger( number ) << '\n';

      // display number rounded to nearest tenth
      cout << setprecision( 6 ) << number 
         << " rounded to the nearest tenth is:      "
         << setprecision( 1 ) << roundToTenths( number ) << '\n';

      // display number rounded to nearest hundredth
      cout << setprecision( 6 ) << number 
         << " rounded to the nearest hundredth is:  "
         << setprecision( 2 ) << roundToHundredths( number ) << '\n';

      // display number rounded to nearest thousandth
      cout << setprecision( 6 ) << number 
         << " rounded to the nearest thousandth is: "
         << setprecision( 3 ) << roundToThousandths( number ) << '\n';
   } // end for
} // end main

// roundToInteger rounds n to nearest integer
double roundToInteger( double n )
{
   return floor( n + .5 );
} // end function roundToInteger

// roundToTenths rounds n to nearest tenth
double roundToTenths( double n )
{
   return floor( n * 10 + .5 ) / 10;
} // end function roundToTenths

// roundToHundredths rounds n to nearest hundredth
double roundToHundredths( double n )
{
   return floor( n * 100 + .5 ) / 100;
} // end function roundToHundredths

// roundToThousandths rounds n to nearest thousandth
double roundToThousandths( double n )
{
   return floor( n * 1000 + .5 ) / 1000;
} // end function roundToThousandths


