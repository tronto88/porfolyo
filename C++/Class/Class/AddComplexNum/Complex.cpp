#include <iostream> 
#include "Complex.h"
using namespace std;

Complex::Complex( double real, double imaginary )
{ 
   setComplexNumber( real, imaginary ); 
}

Complex Complex::add( const Complex &right )
{
   return Complex( 
      realPart + right.realPart, imaginaryPart + right.imaginaryPart );
}

Complex Complex::subtract( const Complex &right )
{
   return Complex( 
      realPart - right.realPart, imaginaryPart - right.imaginaryPart );
}

void Complex::printComplex()
{
   cout << '(' << realPart << ", " << imaginaryPart << ')';
}

void Complex::setComplexNumber( double rp, double ip ) 
{
   realPart = rp;
   imaginaryPart = ip;
}
