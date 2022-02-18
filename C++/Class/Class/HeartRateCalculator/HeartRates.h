#include <string>
using namespace std;
class HeartRates
{
public:
   HeartRates( string first, string last, int m, int d, int y )
   {
      setFirstName( first ); 
      setLastName( last ); 
      setBirthMonth( m );
      setBirthDay( d );
      setBirthYear( y );
   }

   void setFirstName( string first )
   {
      firstName = first;
   } 

   string getFirstName()
   {
      return firstName;
   } 


   void setLastName( string last )
   {
      lastName = last;
   }

   string getLastName()
   {
      return lastName;
   } 

   void setBirthMonth( int m )
   {
      birthMonth = m;
   }

   int getBirthMonth()
   {
      return birthMonth;
   } 

   void setBirthDay( int d )
   {
      birthDay = d;
   } 

   int getBirthDay()
   {
      return birthDay;
   } 

   void setBirthYear( int y )
   {
      birthYear = y;
   } 

   int getBirthYear()
   {
      return birthYear;
   }

   int getAge()
   {
      if ( currentYear == 0 )
      {
         cout << "Please enter today's month, day, and year:" << endl;
         cin >> currentMonth >> currentDay >> currentYear;
      }

      if ( currentMonth >= birthMonth )
         if ( currentDay >= birthDay )
            return currentYear - birthYear;

      return currentYear - birthYear - 1;
   }

   int getMaximumHeartRate()
   {
      return 220 - getAge();
   } 

   int getMinimumTargetHeartRate()
   {
      return 50 * getMaximumHeartRate() / 100;
   } 

   int getMaximumTargetHeartRate()
   {
      return 85 * getMaximumHeartRate() / 100;
   }
private:
   string firstName;
   string lastName; 
   int birthMonth; 
   int birthDay;
   int birthYear; 
   int currentMonth; 
   int currentDay; 
   int currentYear; 
}; 

