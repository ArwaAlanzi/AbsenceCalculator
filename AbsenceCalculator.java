import java.util.Scanner;

public class AbsenceCalculator {
public static double result;

public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
System.out.println("<< Welcome to The Absence Calculator >>");
System.out.println("Enter the name of the subject: ");
String subjectName = input.next();
System.out.println("Enter the hours of " +subjectName+ " in week: ");
int subjectHours = input.nextInt();
System.out.println("Enter the number of weeks in this semester: ");
int studyWeeks = input.nextInt(); 
couter(subjectHours , studyWeeks);
System.out.println("The hours of absence thet you can have before reaching the deprivation are: ");
System.out.println(couter(subjectHours , studyWeeks));
}

public static double couter (int hours ,int weeks )
{
result = (hours * weeks) * 0.25 ;
return result;
}}