#include <iostream> 
#include "Date.h"
using namespace std;

int main()
{
   const int MAXDAYS = 16;
   Date d( 12, 24, 2004 );


   for ( int loop = 1; loop <= MAXDAYS; ++loop ) 
   {
      d.print();
      d.nextDay(); 
   } 

   cout << endl;
} 