#include <iostream>
#include "Invoice.h"
using namespace std;

Invoice::Invoice( string number, string description, int count, 
   int price )
{
   setPartNumber( number ); 
   setPartDescription( description ); 
   setQuantity( count ); 
   setPricePerItem( price ); 
} 

void Invoice::setPartNumber( string number )
{
   partNumber = number;
}

string Invoice::getPartNumber()
{
   return partNumber;
} 

void Invoice::setPartDescription( string description )
{
   partDescription = description; 
} 

string Invoice::getPartDescription()
{
   return partDescription;
} 

void Invoice::setQuantity( int count )
{
   if ( count > 0 )
      quantity = count; 

   if ( count <= 0 ) 
   {
      quantity = 0; 
      cout << "\nquantity cannot be negative. quantity set to 0.\n";
   } 
} 
   
int Invoice::getQuantity()
{
   return quantity;
} 
   
void Invoice::setPricePerItem( int price )
{
   if ( price > 0 ) 
      pricePerItem = price; 

   if ( price <= 0 ) 
   {
      pricePerItem = 0; 
      cout << "\npricePerItem cannot be negative. "
         << "pricePerItem set to 0.\n";
   } 
} 

int Invoice::getPricePerItem()
{
   return pricePerItem;
} 

int Invoice::getInvoiceAmount()
{
   return getQuantity() * getPricePerItem();
}

