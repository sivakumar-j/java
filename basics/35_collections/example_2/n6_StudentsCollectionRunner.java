package com.basics.packageone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class n6_StudentsCollectionRunner {
	public static void main(String[] args) {
		List<n6_Student> students = List.of(new n6_Student(1, "Ranga"), new n6_Student(100, "Adam"),
				new n6_Student(2, "Eve"));
		ArrayList<n6_Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);

		Comparator<n6_Student> v_com = new Comparator<n6_Student>() {

			@Override
			public int compare(n6_Student s1, n6_Student s2) {

				return (s1.getId()>s2.getId()?1:-1);

			}

		};

		Collections.sort(studentsAl, v_com);
		System.out.println(studentsAl);

	}

}
