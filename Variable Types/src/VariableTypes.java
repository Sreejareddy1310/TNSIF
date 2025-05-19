

class local {
    public static void main(String[] args)
    {
        // Declared a Local Variable
        int var = 10;

        // This variable is local to this main method only
        System.out.println("Local Variable: " + var);
    }
}


class Static {

    // Declared Instance Variable
    public String Static;
    public int i;
    public Integer I;
    public Static()
    {
        // Default Constructor
        // initializing Instance Variable
        this.Static= "Sweta Dash";
    }

    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
        Static name = new Static();

        // Displaying O/P
        System.out.println("Static name is: " + name.Static);
        System.out.println("Default value for int is "+ name.i);
      
        // toString() called internally
        System.out.println("Default value for Integer is: "+ name.I);
    }
  }
       