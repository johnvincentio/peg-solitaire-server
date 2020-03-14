package io.johnvincent.server.solitaire;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;

@RestController
public class SolitaireController {

	private static final int TOTAL_SOLUTIONS = 6518;

	private static final String template = "solutions/%d.txt";

	@GetMapping("/greeting")
	public Solutions greeting(@RequestParam(value = "id", defaultValue = "0") int id) {
		Solutions result = getSolution(id);
//		System.out.println("result "+result.toString());
		return result;
	}
	
	private static String getFilename(int id) {
		if (id < 1 || id > TOTAL_SOLUTIONS) {
			return String.format(template, getRandom(1, TOTAL_SOLUTIONS));
		}
		return String.format(template, id);
	}

	private static int getRandom(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}

	private static Solutions getSolution(int id) {
		System.out.println("id "+id);
		String filename = getFilename(id);
		System.out.println("filename "+filename);
		Resource resource = new ClassPathResource(filename);
		Solutions codeList = new Solutions();
		BufferedReader buf = null;
		String line;
		try {
			File file = resource.getFile();
			buf = new BufferedReader(new FileReader(file));
			while ((line = buf.readLine()) != null) {codeList.add(new Solution(line));}
			buf.close();
			buf = null;
		}
		catch (IOException exception) {
			System.out.println("Exception "+exception.getMessage());
			System.out.println("Trouble reading file "+filename);
//			exception.printStackTrace();
		}
		finally {
			try {
				if (buf != null) buf.close();
			}
			catch (IOException exception2) {
				System.out.println("Exception "+exception2.getMessage());
				System.out.println("Trouble closing file "+filename);
				exception2.printStackTrace();
			}
		}
		buf = null;
		return codeList;
	}
}

/*
	private static void test() {
		Resource resource = new ClassPathResource(getFilename());
		InputStream input = null;
		File file = null;
		try {
			input = resource.getInputStream();
			file = resource.getFile();
			System.out.println("File "+file);
		}
		catch (IOException exception) {
			System.out.println("Exception "+exception.getMessage());
			System.out.println("Trouble reading file "+file.getPath());
//			exception.printStackTrace();
		}
		finally {
			try {
				if (input != null) input.close();
			}
			catch (IOException exception2) {
				System.out.println("Exception "+exception2.getMessage());
				System.out.println("Trouble closing file "+file.getPath());
				exception2.printStackTrace();
			}
		}
	}
*/


//@GetMapping("/greeting")
//public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//	int jv = getRandom(1, TOTAL_SOLUTIONS);
//	System.out.println("getFilename() "+getFilename());
//	Solutions result = getSolution();
//	System.out.println("result "+result.toString());
////	return new Greeting(counter.incrementAndGet(), String.format(template, name));
//	return new Greeting(counter.incrementAndGet(), getFilename());
//}
