using System;

class Program
{
  static void Main()
  {
    int number1, number2;
    string[] inputs = Console.ReadLine().Split(' ');
    if (inputs == null) return;

    number1 = Convert.ToInt32(inputs[0]);
    number2 = Convert.ToInt32(inputs[1]);
    Console.WriteLine(GCD(number1, number2));
    Console.WriteLine(LCM(number1, number2));
  }

  static int GCD(int number1, int number2)
  {
    if (number2 == 0) return number1;
    else return GCD(number2, number1 % number2);
  }

  static int LCM(int number1, int number2) 
  {
    return (number1 * number2) / GCD(number1, number2);
  }
}