package io.johnvincent.server.work;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.johnvincent.server.solitaire.Solution;

public class FromJSONToPOJO {

	public static void test1() {
		String json = "{\"id\":1,\"name\":\"Lokesh Gupta\",\"age\":34,\"location\":\"India\"}";

		ObjectMapper mapper = new ObjectMapper();
		try
		{
			Employee emp = mapper.readValue(json, Employee.class);

			System.out.println(emp);
		} 
		catch (JsonGenerationException e) 
		{
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void test2() {
		String json = "{\"status\":\"OK\",\"from\":{\"row\":1,\"column\":3},\"via\":{\"row\":2,\"column\":3},\"to\":{\"row\":3,\"column\":3},\"type\":3}";

		ObjectMapper mapper = new ObjectMapper();
		try
		{
			Solution solution = mapper.readValue(json, Solution.class);

			System.out.println(solution);
		} 
		catch (JsonGenerationException e) 
		{
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
