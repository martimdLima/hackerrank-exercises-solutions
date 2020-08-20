import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class Checker implements Comparator<Student>{

    @Override
    public int compare(Student a, Student b){
        
        int nameComp = a.getFname().compareTo(b.getFname());
        int cgpaComp = Double.compare(b.getCgpa(), a.getCgpa());
        int idComp = Integer.compare(a.getId(), b.getId());
        
        if(cgpaComp == 0) {

            if(nameComp == 0) {
                return idComp;
            } else {
                return nameComp;
            }

        } else {
            return cgpaComp;
        }
    }
}


public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        Checker checker = new Checker();
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList, checker);
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



