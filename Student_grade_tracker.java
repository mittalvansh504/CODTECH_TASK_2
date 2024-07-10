import java.util.*;
public class Student_grade_tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the markes of first subject:- ");
        int m1 = sc.nextInt();

        System.out.print("Enter the markes of second subject:- ");
        int m2 = sc.nextInt();

        System.out.print("Enter the markes of third subject:- ");
        int m3 = sc.nextInt();

        System.out.print("Enter the markes of fourth subject:- ");
        int m4 = sc.nextInt();

        System.out.print("Enter the markes of fifth subject:- ");
        int m5 = sc.nextInt();

        if(m1>100 || m2>100 || m3>100 || m4>100 || m5>100){
            System.out.println("You enter invalid marks");
        }
        else if(m1<33 || m2<33 || m3<33 || m4<33 || m5<33){
            System.out.println("You are fail");
        }
        else {
            int sum = m1+m2+m3+m4+m5;
            float avg = sum/5;
            float per = (sum*100)/500;
            System.out.println("Sum of marks:- " + sum);
            System.out.println("Average of marks:- " + avg);
            System.out.println("Percentage of marks:- " + per);

            if(per>90.0 && per<=100.0){
                System.out.println("Your grade is A");
            }

            else if(per>80.0 && per<=90.0){
                System.out.println("Your grade is B");
            }

            else if(per>70.0 && per<=80.0){
                System.out.println("Your grade is C");
            }

            else if(per>60.0 && per<=70.0){
                System.out.println("Your grade is D");
            }

            else if(per>=40.0 && per<=60.0){
                System.out.println("Your grade is E");
            }
            
            else{
                System.out.println("You are fail");
            }
        }
    }
}