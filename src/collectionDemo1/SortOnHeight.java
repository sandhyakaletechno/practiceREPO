package collectionDemo1;

import java.util.Comparator;

public class SortOnHeight implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.height>o2.height)
			return 1;
			else if (o1.height<o2.height)
				return -1;
			else
				return 0;
		
	}

}
