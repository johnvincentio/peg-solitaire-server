package io.johnvincent.server.solitaire;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utils {

	public static Solution JSONtoObject(String json) {
		System.out.println("Json "+json);
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			Solution solution = mapper.readValue(json, Solution.class);
			System.out.println("solution is: "+solution);
			return solution;
		} 
		catch (JsonGenerationException e) 
		{
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Solution> JSONArraytoListObject(String json) {
//		System.out.println("Json "+json);
		ObjectMapper mapper = new ObjectMapper();
		try {
			List<Solution> list = Arrays.asList(mapper.readValue(json, Solution[].class));
//			System.out.println("list is: "+list);
			return list;
		} 
		catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
