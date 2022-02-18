#include "Rectangle.h"

Rectangle::Rectangle( double w, double l )
{
   setWidth(w);
   setLength(l); 
} 

void Rectangle::setWidth( double w ) 
{ 
   width = w > 0 && w < 20.0 ? w : 1.0;
} 

void Rectangle::setLength( double l ) 
{ 
   length = l > 0 && l < 20.0 ? l : 1.0;
}

double Rectangle::getWidth() 
{ 
   return width; 
} 

double Rectangle::getLength() 
{
   return length; 
} 
double Rectangle::perimeter() 
{ 
   return 2 * ( width + length ); 
} 

double Rectangle::area() 
{ 
   return width * length; 
} 
