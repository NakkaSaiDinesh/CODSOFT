import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        int a,b,c,d;
        char grade;
        System.out.println("Enter subject marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Sub1: ");
        a=sc.nextInt();
        System.out.println("Sub2: ");
        b=sc.nextInt();
        System.out.println("Sub3: ");
        c=sc.nextInt();
        System.out.println("Sub4: ");
        d=sc.nextInt();
        int TotalMarks = a+b+c+d;
        int AvgPersent = TotalMarks/4;
        if(AvgPersent>=90){
            grade ='A';
        }else if(AvgPersent>=80){
            grade='B';
        }else if(AvgPersent>=70){
            grade='C';
        }else if(AvgPersent>=60){
            grade='D';
        }else if(AvgPersent>=50){
            grade='E';
        }else{
            grade='F';
        }

        System.out.println("Total mark of the student is: "+TotalMarks);
        System.out.println("Average persentage of student is: "+AvgPersent);
        System.out.println("Grade of the Student is: "+grade);
        //System.out.println(a+b+c+d);
    }
}