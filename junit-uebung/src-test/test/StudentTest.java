package test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import daten.Student;

public class StudentTest {
	
	public Student s1;
	public Student s2;
	public Student s3;
	
	public StudentTest(){
		
		try {
			s1 = new Student("Vorname1", "Nachname1", true, DateFormat.getDateInstance().parse("22.2.1590"));
			s2 = new Student("Vorname1", "Nachname1", true, DateFormat.getDateInstance().parse("22.2.1590"));
			s3 = new Student("Vorname3", "Nachname3", false, DateFormat.getDateInstance().parse("22.2.1591"));
		} catch (ParseException e) {
			assert (false);
		}	
	}
	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void compareStudents1() {
		//Gleicher Name, Gleiches gebdat
			int x = s1.compareTo(s2);
			assertTrue(x == 0);

		
	}
	
	@Test
	public void compareStudents2() {
		//unGleicher Name
		s2.setFirstName("Vorname2");
		s2.setLastName("Nachname2");
		
		int x = s1.compareTo(s2);
		assertTrue(x != 0);

		
	}

	@Test
	public void compareStudentsDate() {
		// mit Datum, (Aufgabe 2, compareTo(Date))
		int x= s1.compareTo(s3.getBirthDate());
			
			
		assertTrue(x!= 0 );

	}
}
