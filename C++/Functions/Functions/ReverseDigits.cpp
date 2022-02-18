#include <iostream>
#include <iomanip>
using namespace std;

int reverseDigits( int ); // function prototype

int main()
{
   int number; // input number

   cout << "Enter a number between 1 and 9999: ";
   cin >> number;

   cout << "The number with its digits reversed is: ";

   // find number with digits reversed
   cout << reverseDigits( number ) << endl;
} // end main

// reverseDigits returns number obtained by reversing digits of n
int reverseDigits( int n )
{
   int reverse = 0; // reversed number

   // loop until zero
   while ( n > 0 )
   {
      reverse *= 10; // shift digits in reverse left
      reverse += n % 10; // add least-significant digit of n to reverse
      n /= 10; // remove least-significant digit from n
   } // end while

   return reverse; // return reversed number
} // end function reverseDigits

