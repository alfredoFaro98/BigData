package app;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.chainsaw.Main;

import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import task1.Employee;


public class App {
	public static void main(String[] args) {
		Employee employee = new Employee().insert();
		System.out.println(employee);
		System.out.println("here");
		insert(employee);
	}
	
	public static void insert(Employee e)
	{
	    Path path=new Path("m");
		FileSystem fs = null;
		
		
		try {
			fs = FileSystem.get(new Configuration());
			FSDataOutputStream outputStream = null;
			if(fs.exists(path))
			{
				outputStream = fs.append(path);
			}
			else {
				outputStream = fs.create(path);
			}
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream)); // ho bisogno di un buffered writer
			JsonObject jsonObject = new JsonObject();
			jsonObject.addProperty("name", e.getName());
			jsonObject.addProperty("surname", e.getSurname());
			jsonObject.addProperty("age", e.getAge());
			jsonObject.addProperty("city", e.getCity());
			jsonObject.addProperty("province", e.getProvince());
			jsonObject.addProperty("number", e.getNumberOfLanguage());
			jsonObject.addProperty("pls", e.getSkills().toString());
			writer.append(jsonObject.toString()+"\n");
			writer.flush();
			writer.close(); 
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
