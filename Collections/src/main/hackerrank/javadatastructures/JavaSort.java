package main.hackerrank.javadatastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

	public void solution() {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		in.close();

		Collections.sort(studentList, new Comparator<Student>() {
			public int compare(Student a, Student b) {
				if (a.getCgpa() != b.getCgpa()) {
					if (a.getCgpa() < b.getCgpa()) {
						return 1;
					} else {
						return -1;
					}
				} else if (a.getFname().compareTo(b.getFname()) != 0) {
					return a.getFname().compareTo(b.getFname());
				} else {
					if (a.getId() < b.getId()) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		});

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}

class Student {
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