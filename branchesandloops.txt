using System;
using System.Collections.Generic;
using System.Linq;

namespace myApp
{
    class Program
    {
        static void Main()
        {
            // Make decisions using the if statement

            int a = 5;
            int b = 6;
            if (a + b > 10)
                Console.WriteLine("The answer is greater than 10.");

            // Make if and else work together

            // int a = 5;
            // int b = 3;
            // if (a + b > 10)
            //     Console.WriteLine("The answer is greater than 10");
            // else
            //     Console.WriteLine("The answer is not greater than 10");


            // int a = 5;
            // int b = 3;
            // if (a + b > 10)
            // {
            //     Console.WriteLine("The answer is greater than 10");
            // }
            // else
            // {
            //     Console.WriteLine("The answer is not greater than 10");
            // }

            // int a = 5;
            // int b = 3;
            // int c = 4;
            // if ((a + b + c > 10) && (a == b))
            // {
            //     Console.WriteLine("The answer is greater than 10");
            //     Console.WriteLine("And the first number is equal to the second");
            // }
            // else
            // {
            //     Console.WriteLine("The answer is not greater than 10");
            //     Console.WriteLine("Or the first number is not equal to the second");
            // }


            // int a = 5;
            // int b = 3;
            // int c = 4;
            // if ((a + b + c > 10) || (a == b))
            // {
            //     Console.WriteLine("The answer is greater than 10");
            //     Console.WriteLine("Or the first number is equal to the second");
            // }
            // else
            // {
            //     Console.WriteLine("The answer is not greater than 10");
            //     Console.WriteLine("And the first number is not equal to the second");
            // }


            // // Use loops to repeat operations

            // int counter = 0;
            // while (counter < 10)
            // {
            //   Console.WriteLine($"Hello World! The counter is {counter}");
            //   counter++;
            // }

            // int counter = 0;
            // do
            // {
            //   Console.WriteLine($"Hello World! The counter is {counter}");
            //   counter++;
            // } while (counter < 10);


            // // Work with the for loop

            // for(int counter = 0; counter < 10; counter++)
            // {
            //   Console.WriteLine($"Hello World! The counter is {counter}");
            // }


            // // Created nested loops

            // for (int row = 1; row < 11; row++)
            // {
            //   Console.WriteLine($"The row is {row}");
            // }

            // for (char column = 'a'; column < 'k'; column++)
            // {
            //   Console.WriteLine($"The column is {column}");
            // }

            // for (int row = 1; row < 11; row++)
            // {
            //   for (char column = 'a'; column < 'k'; column++)
            //   {
            //     Console.WriteLine($"The cell is ({row}, {column})");
            //   }
            // }


            // // challenge

            // int sum = 0;
            // for (int number = 1; number < 21; number++)
            // {
            //   if (number % 3 == 0)
            //   {
            //     sum = sum + number;
            //   }
            // }
            // Console.WriteLine($"The sum is {sum}");




        }
    }
}