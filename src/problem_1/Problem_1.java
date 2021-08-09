package problem_1;
import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("please enter new password:");
        String password=in.nextLine(); 
        System.out.println("Please re-enter the password to confirm : ");
        String confirm = in.nextLine();
        boolean n=isValid(password,confirm);
           while(password.equals(confirm)){
                if(n==false){
                    System.out.println("Please enter the password again : ");
             String Password = in.nextLine();
            System.out.println("Please re-enter the password to confirm : ");
            String Confirm = in.nextLine();
               n= isValid(Password,Confirm);}
                if(n==true){
                       break;}}
        while (!password.equals(confirm)) {
            System.out.println("Please enter the password again : ");
             String Password = in.nextLine();
            System.out.println("Please re-enter the password to confirm : ");
            String Confirm = in.nextLine();
             boolean r=isValid(Password,Confirm);
            if(Password.equals(Confirm)){
                if(r==false){}
                if(r==true){
                    break;}
            }}}
public static boolean isValid(String password,String confirm){
    int count=0,counte=0, counter=0,con=0;
   if(!password.equals(confirm))
        System.out.println("no equal ");
       if(password.length()>=8)
        con++;
        else
            System.out.println(" The password must be at least 8 characters long");
for(int i=0;i<password.length();i++){
    if(Character.isUpperCase(password.charAt(i)))
    count++;
if(Character.isLowerCase(password.charAt(i)))
    counte++;
if(Character.isDigit(password.charAt(i)))
    counter++;
}
if(count==0)
   System.out.println(" The password must have at least one uppercase letter");
if(counte==0)
   System.out.println(" The password must have at least one lowercase letter");
if(counter==0)
  System.out.println("The password must have at least one digit");
if(count>=1 && counte>=1 &&counter>=1 && con>=1 && password.equals(confirm)){
      System.out.println("The password is valid");
return true;}
else{
    System.out.println("The password is invalid");
return false;}
}
}
        