// Account.cpp
// Member-function definitions for class Account.
#include <iostream>
#include "Account.h" // include definition of class Account
using namespace std;

// Account constructor initializes data member balance
Account::Account( double initialBalance )
{

   if ( initialBalance >= 0.0 )
      balance = initialBalance;
   else // otherwise, output message and set balance to 0.0
   {
      cout << "Error: Initial balance cannot be negative." << endl;
      balance = 0.0;
   } 
} 

// credit (add) an amount to the account balance
void Account::credit( double amount )
{
   balance = balance + amount; // add amount to balance
} // end function credit

// debit (subtract) an amount from the account balance
// return bool indicating whether money was debited
bool Account::debit( double amount )
{
   if ( amount > balance ) // debit amount exceeds balance
   {
      cout << "Debit amount exceeded account balance." << endl;
      return false;
   } // end if
   else // debit amount does not exceed balance
   {
      balance = balance - amount;
      return true;
   } // end else
} // end function debit

// set the account balance
void Account::setBalance( double newBalance )
{
   balance = newBalance;
} // end function setBalance

// return the account balance
double Account::getBalance()
{
   return balance;
} // end function getBalance