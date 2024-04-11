
package com.company;

public class CWH_3_Resultant_DataType_Expression {
    public static void main(String[] args){

     System.out.println("Dear harry,\n\t your java course is nice.\nThanks");
     int num_1=2 , num_2=3 ;
     float Divide=num_2/ num_1;
     System.out.println("The Division is:"+Divide);
/*    WE WILL GET 3/2 = 1 AS OUTPUT INSTEAD OF 1.5 BECAUSE IN JAVA :

      Resulting data type after arithmetic operation is:

      Result = byte + short -> integer
      Result = short + integer -> integer
      Result = long + float -> float
      Result = integer + float -> float
      Result = character + integer -> integer
      Result = character + short -> integer
      Result = long + double -> double
      Result = float + double -> double

      Increment and Decrement operators
      a++, ++a (Increment Operators)
      a--, --a (Decrement Operators)
      These will operate on all data types except Booleans.

      Quick Quiz: Try increment and decrement operators on a Java variable

      a++ -> first use the value and then increment
      ++a -> first increment the value then use it

      Quick Quiz: What will be the value of the following expression(x).
      int y=7;
      int x = ++y*8;
      value of x?
      char a = ‘B’;
      a++; (a is not ‘C’)
 */
    }
}