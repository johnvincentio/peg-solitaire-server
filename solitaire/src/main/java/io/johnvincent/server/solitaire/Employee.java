package io.johnvincent.server.solitaire;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String location;
  
    public Employee() {}
    
//    public Employee(Integer id, String name, Integer age, String location) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.location = location;
//    }
 
    //Setters and Getters will be added here
    
	public Integer getId() {return id;}
	public String getName() {return name;}
	public Integer getAge() {return age;}
	public String getLocation() {return location;}

	public void setId (Integer id) {this.id = id;}
	public void setName (String name) {this.name = name;}
	public void setAge (Integer age) {this.age = age;}
	public void setLocation (String location) {this.location = location;}
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age
                + ", location=" + location + "]";
    }
}
