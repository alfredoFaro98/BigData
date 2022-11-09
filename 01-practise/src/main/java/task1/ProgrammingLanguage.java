package task1;

import java.util.Scanner;

public class ProgrammingLanguage {
	
	private String name;
	private String description;
	
	public ProgrammingLanguage(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public ProgrammingLanguage()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return name + ", " + description;
	}

	public ProgrammingLanguage insert()
	{
		System.out.println("insert name of pl");
		String nameString = new Scanner(System.in).nextLine();
		System.out.println("insert description");
		String description = new Scanner(System.in).nextLine();
		return new ProgrammingLanguage(nameString,description);
	}
	
	
	
}
