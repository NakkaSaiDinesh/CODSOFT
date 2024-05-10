import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        char GradeOfStudent;
        System.out.println("Enter subject marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Sub1: ");
        int x=sc.nextInt();
        System.out.println("Sub2: ");
        int y=sc.nextInt();
        System.out.println("Sub3: ");
        int z=sc.nextInt();
        System.out.println("Sub4: ");
        int q=sc.nextInt();
        int TotalMarks = x+y+z+q;
        int AvgPersent = TotalMarks/4;
        if(AvgPersent>=90){
            GradeOfStudent ='A';
        }else if(AvgPersent>=80){
            GradeOfStudent='B';
        }else if(AvgPersent>=70){
            GradeOfStudent='C';
        }else if(AvgPersent>=60){
            GradeOfStudent='D';
        }else if(AvgPersent>=50){
            GradeOfStudent='E';
        }else{
            GradeOfStudent='F';
        }

        System.out.println("Total mark of the student is: "+TotalMarks);
        System.out.println("Average persentage of student is: "+AvgPersent);
        System.out.println("Grade of the Student is: "+GradeOfStudent);
        //System.out.println(a+b+c+d);
    }
}
