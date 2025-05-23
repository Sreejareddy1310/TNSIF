// Java program demonstrating Encapsulation
class Programmer {
    
    private String name;

    // Getter and Setter for name
    
    // Getter method used to get the data
    public String getName() { return name; }
    
    // Setter method is used to set or modify the data
    public void setName(String name) { this.name = name; }
}

public class Encapsulation {
    
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Sreeja"); 
        System.out.println("Name=> " + p.getName());
    }
}
	
