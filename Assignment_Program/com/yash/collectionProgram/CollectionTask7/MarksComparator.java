package com.yash.collectionProgram.CollectionTask7;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.totalmarks == o2.totalmarks)
			return 0;
		else if (o1.totalmarks > o2.totalmarks)
			return 1;
		else
			return -1;

	}

}
