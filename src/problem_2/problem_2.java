
package problem_2;


import java.util.Scanner;

public class problem_2 {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Project o=new Project("somia",5,"java",3);
        for(int i=0;i<o.arr.length;i++){
        o.arr[i]=in.nextDouble();}
        o.print();}}
