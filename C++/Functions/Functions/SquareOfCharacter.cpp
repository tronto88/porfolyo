#include <iostream>
using namespace std;

void square( int, char ); // function prototype

int main()
{
   int side; // input side length
   char character; // fill character

   cout << "Enter a character and the side length: ";
   cin >> character >> side;
   cout << '\n';

   square( side, character ); // display solid square of input character
   cout << endl;
} // end main

// square displays solid square of fillCharacter with specified side
void square( int side, char fillCharacter )
{
   // loop side times for number of rows
   for ( int row = 1; row <= side; row++ ) 
   {
      // loop side times for number of columns
      for ( int col = 1; col <= side; col++ )
         cout << fillCharacter;

      cout << '\n';
   } // end for
} // end function square


