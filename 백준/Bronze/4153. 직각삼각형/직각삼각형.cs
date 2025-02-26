using System;

class Program
{
  static void Main()
  {
    int A, B, C;

    while (true)
    {
      bool Checker = false;
      string[] inputs = Console.ReadLine().Split(' '); if (inputs == null) return;
      A = Convert.ToInt32(inputs[0]);
      B = Convert.ToInt32(inputs[1]);
      C = Convert.ToInt32(inputs[2]);
      if (A == 0 && B == 0 && C == 0) break;
      if ((A*A)+(B*B) == (C*C)) Checker = true;
      if ((A*A)+(C*C) == (B*B)) Checker = true;
      if ((C*C)+(B*B) == (A*A)) Checker = true;
      if (Checker) Console.WriteLine("right");
      else Console.WriteLine("wrong");

    }
  }
}