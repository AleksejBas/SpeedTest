
using System;
// using System.Diagnostics;
// using System.Threading;
    public class Example
    {
        public static void Main()
        {
                // Stopwatch stopwatch = new Stopwatch();
                Console.WriteLine("Speed test ran C#!");
                double a = 3.1415926;
                double b = 2.718;
                // stopwatch.Start();
                DateTime start = DateTime.Now;
                    for(int i = 0; i < 100000000; i++)
                        a+=b;
                // stopwatch.Stop();
                DateTime end = DateTime.Now;
                // TimeSpan ts = stopwatch.Elapsed;
                TimeSpan ts = (end - start);

                Console.WriteLine("C#: {0:0.###}ms",  ts.TotalMilliseconds);
                Console.WriteLine((int)a);
        }
    }
