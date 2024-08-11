import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n=sc.nextInt();
        System.out.println("Enter marks of "+n+" subjects");
        sc.close();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int marks=sc.nextInt();
            sum+=marks;
        }
        float avg=(float)sum/n;
        String grade="";
        if(avg>=90 && avg<=100){grade="A";}
        if(avg>=80 && avg<90){grade="B";}
        if(avg>=70 && avg<80){grade="C";}
        if(avg>=60 && avg<70){grade="D";}
        if(avg<60){grade="F";}
        System.out.println("Total Marks = "+sum+"\nAverage Percentage = "+avg+"%"+"\nGrade = "+ grade);
    }
}
