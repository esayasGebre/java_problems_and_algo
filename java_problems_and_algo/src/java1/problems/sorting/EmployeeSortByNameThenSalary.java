package java1.problems.sorting;

import java.util.Comparator;

public class EmployeeSortByNameThenSalary implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Employee emp1 = (Employee) obj1;
		Employee emp2 = (Employee) obj2;
		if(emp1.getFirstName().compareTo(emp2.getFirstName()) != 0)
			return emp1.getFirstName().compareTo(emp2.getFirstName());
		else 
		{
			double salary1 = emp1.getSalary();
			double salary2 = emp2.getSalary();
			if(salary1 < salary2)
				return -1;
			else 
				return 1;
		}
			
	}

}
