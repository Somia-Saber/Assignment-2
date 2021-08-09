
package problem_2;

public class Project extends Student {
   String projectName;
   int projectScore;
   double[] arr;
   public Project(String name,int number_of_quizzes,String projectName,int projectScore){
   super(name,number_of_quizzes);
   this.projectScore=projectScore;
   this.projectName=projectName;
   this.arr=new double[number_of_quizzes];
   }
   public void print(){
   calculate(arr);
   System.out.println("name:"+name+"\n totalQuizScore:"+totalQuizScore+"\n average:"+average+"\n projectName:"
           +projectName+"\n projectScore:"+projectScore);
   
   }
}
