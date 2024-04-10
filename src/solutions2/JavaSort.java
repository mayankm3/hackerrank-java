package solutions2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class JavaSort{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
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
		
		//My solution
		Checker2 check2 = new Checker2();
		Collections.sort(studentList, check2);
		
		//HackerRank solution from discussions
//		Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().thenComparing(Student :: getFname).thenComparing(Student :: getId));
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
      	
//      or
//      studentList.stream().forEach(st->System.out.println(st.getFname()));
	}
}

class Checker2 implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getCgpa()==s2.getCgpa()) {
			if(s1.getFname().equals(s2.getFname()))
				return s1.getId()-s2.getId();
			return s1.getFname().compareTo(s2.getFname());
		}					
		return s1.getCgpa()>s2.getCgpa()?-1:1;
	}
	
}

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