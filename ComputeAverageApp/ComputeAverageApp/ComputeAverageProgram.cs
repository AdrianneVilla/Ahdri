using System.Collections;

namespace ComputeAverageApp
{
    internal class ComputeAverageProgram
    {
        static int grades, newGrade;
        
        static void Main(string[] args)
        {
            
            Console.WriteLine("Enter 5 grades seperated by new line: ");

            for(int i = 0; i < 5; i++) {
                grades = Convert.ToInt32(Console.ReadLine());
                newGrade += grades;
            }
            double average =(double) newGrade/5;
            Console.WriteLine($"The average is {average} and round off to {Math.Round(average)} ");
           
            
             
        }
    }
}