package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	
	private String name;
	private String surname;
	private String age;
	private String city;
	private String province;
	private int numberOfLanguage;
	private ArrayList<ProgrammingLanguage> skills;
	
	
	public Employee(String name, String surname, String age, String city, String province,
			ArrayList<ProgrammingLanguage> skills, int number) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.city = city;
		this.province = province;
		this.skills = skills;
		this.numberOfLanguage = number;
	}
	
	public Employee()
	{
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public ArrayList<ProgrammingLanguage> getSkills() {
		return skills;
	}


	public void setSkills(ArrayList<ProgrammingLanguage> skills) {
		this.skills = skills;
	}
	
	public int getNumberOfLanguage() {
		return numberOfLanguage;
	}

	public void setNumberOfLanguage(int numberOfLanguage) {
		this.numberOfLanguage = numberOfLanguage;
	}
	
	

	

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", age=" + age + ", city=" + city + ", province="
				+ province + ", numberOfLanguage=" + numberOfLanguage + ", skills=" + skills;
	}

	public Employee insert()
	{	
		System.out.println("Insert name");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Insert surname");
		String surname= new Scanner(System.in).nextLine();
		System.out.println("Insert age");
		String age= new Scanner(System.in).nextLine();
		System.out.println("Insert city");
		String city = new Scanner(System.in).nextLine();
		System.out.println("Insert province");
		String province = new Scanner(System.in).nextLine();
		System.out.println("Inserisci il numero di linguaggi di programmazione");
		Integer number = new Scanner(System.in).nextInt();
		ArrayList<ProgrammingLanguage>skills = new ArrayList<ProgrammingLanguage>();
		for(int i = 0; i < number; i++)
		{
			skills.add(new ProgrammingLanguage().insert());
		}
		return new Employee(name,surname,age,city,province,skills,number);
	}
	
}
