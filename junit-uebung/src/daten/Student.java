package daten;

import java.util.Comparator;
import java.util.Date;

//Zusammenarbeit mit Nico
public class Student extends Person implements Comparable<Student>{

	public Student(String firstName, String lastName) {
		this(firstName, lastName, false);
	}

	public Student(String firstName, String lastName, boolean selfEntitled) {
		super(firstName, lastName);
		setSelfEntitled(selfEntitled);
	}

	public Student(String firstName, String lastName, boolean selfEntitled,
			Date birthDate) {
		super(firstName, lastName);
		setSelfEntitled(selfEntitled);
		setBirthDate(birthDate);
	}

	private boolean selfEntitled;
	private Date birthDate; // TODO add getter,setter,Constructors

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setSelfEntitled(boolean selfEntitled) {
		this.selfEntitled = selfEntitled;
	}
	
	
	public int compareTo(Date o){
		int result = 0;
		if (birthDate.getYear() < o.getYear())
			result = -1;
		else if (birthDate.getYear() > o.getYear())
			result = 1;
		else if (birthDate.getMonth() < o.getMonth())
			result = -1;
		else if (birthDate.getMonth() > o.getMonth())
			result = 1;
		else if (birthDate.getDay() < o.getDay())
			result = -1;
		else if (birthDate.getDay() > o.getDay())
			result = 1;

		return result;
	}

	@Override
	public int compareTo(Student o) {
		int result = 0;

		// TODO implement meaningful unit tests
		if ((result = getLastName().compareTo(o.getLastName())) == 0) {
			if ((result = getFirstName().compareTo(o.getFirstName())) == 0) {
				result = compareTo(o.birthDate);
				

				/*if (birthDate.getYear() < o.birthDate.getYear())
					result = -1;
				else if (birthDate.getYear() > o.birthDate.getYear())
					result = 1;
				else if (birthDate.getMonth() < o.birthDate.getMonth())
					result = -1;
				else if (birthDate.getMonth() > o.birthDate.getMonth())
					result = 1;
				else if (birthDate.getDay() < o.birthDate.getDay())
					result = -1;
				else if (birthDate.getDay() > o.birthDate.getDay())
					result = 1;*/
			}
		}
		return result;
	}

	@Override
	public String toString() {
		// TODO missing implementation
		return "Student {firstName= " + super.getFirstName() + ", lastName= "
				+ super.getLastName() + ", selfEntitled= " + selfEntitled
				+ ", Birthdate= " + getBirthDate() + "}";
	}

	

}

class compareDate implements Comparator<Date> {

	@Override
	public int compare(Date o1, Date o2) {
		int result = 0;
		if (o1.getYear() < o2.getYear())
			result = -1;
		else if (o1.getYear() > o2.getYear())
			result = 1;
		else if (o1.getMonth() < o2.getMonth())
			result = -1;
		else if (o1.getMonth() > o2.getMonth())
			result = 1;
		else if (o1.getDay() < o2.getDay())
			result = -1;
		else if (o1.getDay() > o2.getDay())
			result = 1;

		return result;
	}
}
