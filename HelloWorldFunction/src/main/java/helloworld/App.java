package helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// This is for demo purposes. In real application keep only one Lambda function and private methods it uses in one class.
// Do not write more than one Lambda function in one class.
public class App {

	public String hello(String name) {
		return "Hello "  + name + " from Lamda!";
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
	
}
