
package problem_2;


public class Student {
   String name;
   int number_of_quizzes;
   double totalQuizScore, average ;
   public Student(String name,int number_of_quizzes){
   this.name=name;
   this.number_of_quizzes=number_of_quizzes;
   
   }
   public double calculate(double [] arr){
   for(int i=0;i<arr.length;i++){
   totalQuizScore =totalQuizScore+arr[i];
   average=totalQuizScore/number_of_quizzes;
   }
   return average;
   }
}
