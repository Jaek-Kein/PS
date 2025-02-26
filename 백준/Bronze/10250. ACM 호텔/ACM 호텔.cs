using System;

class Program
{
  static void Main()
  {
    int testCase, height, width, guestNumber, roomNumber, floor;

    testCase = Convert.ToInt32(Console.ReadLine());

    for (int i = 0; i < testCase; i++)
    {

      string[] inputs = Console.ReadLine().Split(' ');
      height = Convert.ToInt32(inputs[0]);
      width = Convert.ToInt32(inputs[1]);
      guestNumber = Convert.ToInt32(inputs[2]);

      floor = (guestNumber % height == 0) ? height : guestNumber % height;

      roomNumber = (floor * 100) + ((guestNumber - 1) / height + 1);
      Console.WriteLine(roomNumber);
    }
  }
}