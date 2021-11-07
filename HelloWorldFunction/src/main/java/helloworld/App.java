package helloworld;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import helloworld.dto.ClinicalData;
import helloworld.dto.Patient;

// This is for demo purposes. In real application keep only one Lambda function and private methods it uses in one class.
// Do not write more than one Lambda function in one class.
public class App {

	public String hello(String name) {
		return "Hello " + name + " from Lamda!";
	}

	public int getNumber(float num) {
		return (int) num;
	}

	public List<Integer> getScores(List<String> names) {
		Map<String, Integer> studentScores = new HashMap<>();
		studentScores.put("Luffy", 90);
		studentScores.put("Naruto", 89);
		studentScores.put("Jiraya", 95);

		List<Integer> results = new ArrayList<>();
		names.forEach(name -> {
			results.add(studentScores.get(name));
		});

		return results;
	}

	public void printMap(Map<String, Integer> map) {
		System.out.println(map);
	}

	public ClinicalData getClinicalData(Patient patient) {
		System.out.println(patient);
		return new ClinicalData("Normal", "Normal");
	}

	public void getOutput(InputStream in, OutputStream out) throws IOException {
		int data;
		while ((data = in.read()) != -1) {
			out.write(Character.toLowerCase(data));
		}
	}

}
