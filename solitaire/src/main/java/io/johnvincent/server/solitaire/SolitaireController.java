package io.johnvincent.server.solitaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolitaireController {

	private static final int TOTAL_SOLUTIONS = 6518;

	private static final String template = "solutions/%d.txt";

//	@CrossOrigin(origins = "http://localhost:9501")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/solution")
	public List<Solution> findSolution(@RequestParam(value = "id", defaultValue = "0") int id) {
		StringBuffer sb = getFileContents(id);
		List<Solution> list = Utils.JSONArraytoListObject(sb.toString());
//		System.out.println("result "+list.toString());
		return list;
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

	private static StringBuffer getFileContents(int id) {
		StringBuffer result = new StringBuffer();
		String filename = getFilename(id);
		System.out.println("id "+id+" filename "+filename);

		InputStream input = SolitaireController.class.getResourceAsStream(filename);
        if (input == null) {
            // this is how we load file within editor (eg eclipse)
            input = SolitaireController.class.getClassLoader().getResourceAsStream(filename);
        }

//		Resource resource = new ClassPathResource(filename);
		BufferedReader buf = null;
		String line;
		try {
//			File file = resource.getFile();
			buf = new BufferedReader(new InputStreamReader(input));
			while ((line = buf.readLine()) != null) {
//				System.out.println("line : "+line);
				result.append(line);
			}
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
		return result;
	}
}

/*
private static StringBuffer getFileContents(int id) {
StringBuffer result = new StringBuffer();
String filename = getFilename(id);
System.out.println("id "+id+" filename "+filename);

Resource resource = new ClassPathResource(filename);
BufferedReader buf = null;
String line;
try {
	File file = resource.getFile();
	buf = new BufferedReader(new FileReader(file));
	while ((line = buf.readLine()) != null) {
//		System.out.println("line : "+line);
		result.append(line);
	}
	buf.close();
	buf = null;
}
catch (IOException exception) {
	System.out.println("Exception "+exception.getMessage());
	System.out.println("Trouble reading file "+filename);
//	exception.printStackTrace();
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
return result;
}
*/