#include <string> 
using namespace std;

class Invoice
{
public:
   Invoice( string, string, int, int );

   void setPartNumber( string ); 
   string getPartNumber(); 
   void setPartDescription( string ); 
   string getPartDescription();
   void setQuantity( int ); 
   int getQuantity();
   void setPricePerItem( int ); 
   int getPricePerItem();

   int getInvoiceAmount(); 
private:
   string partNumber; 
   string partDescription;
   int quantity;
   int pricePerItem;
}; 

