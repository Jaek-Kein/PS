using System;

class Program
{
  static void Main()
  {
    char[] Alphabet = new char[26]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    string? Input = Console.ReadLine();

    if (Input == null)
    {
      return;
    }

    Input = Input.ToLower();

    for (int i = 0; i < 26 ; i++)
    {
      for (int k = 0; k < Input.Length; k++)
      {
        if (char.Equals(Input[k], Alphabet[i]))
        {
          Console.WriteLine(k);
          break;
        }
        if (k == Input.Length - 1)
        {
          Console.WriteLine(-1);
          break;
        }
      }
    }
  }
}