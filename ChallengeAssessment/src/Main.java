import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) 
	{
		List<Student> studentList;
			Student s1 = new Student(10011, "Rudresh", 85, 77, 82);
			Student s2 = new Student(10012, "Manoj", 57, 35, 63);
			Student s3 = new Student(10013, "Prajwal", 32, 71, 61);
			Student s4 = new Student(10014, "Rachu", 55, 52, 61);
			Student s5 = new Student(10015, "Rohan", 95, 92, 97);

			studentList = new ArrayList<>();
			studentList.add(s1);
			studentList.add(s2);
			studentList.add(s3);
			studentList.add(s4);
			studentList.add(s5);
			ReportGeneration r=new ReportGeneration();
			System.out.println("-------------CLASS TOPPER------------");
			System.out.println("CLASS TOPPER IS "+r.getTopScorer(studentList));
			System.out.println();
			r.getPassedOutStudents(studentList);
			System.out.println();
			r.getStudentsForRetest(studentList);
			System.out.println();
			r.getStudentGrades(studentList);
			System.out.println();
			r.getStudentRollNumber(studentList);
	}

} 

