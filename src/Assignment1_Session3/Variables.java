package Assignment1_Session3; // Package containing class and Methods to differentiate Class and INstance Variables


public class Variables {  // class declaration

	public static void main(String[] args) { // Main method containing Objects for both type of variables.
		
	VarClass vc = new VarClass();  // Object created for VarClass Class and assigned value 11111
	vc.setVar1(11111);             // Memory will be allocated for this object during compile time.
	
	VarClass vc1 = new VarClass();  // Another Object created for VarClass Class and assigned value 10101
	vc1.setVar1(10101); 
	
	VarInstance vi = new VarInstance();  // Object created for VarInstance Class and assigned value 99999
	vi.setVar2(99999);                  
	
	VarInstance vi1 = new VarInstance();  //Another Object created for VarInstance Class and assigned value 99999
	vi1.setVar2(22222);
	
	System.out.println("Value Class variable : "+vc.getVar1());  // Printing Value for Object  from VarClass Class
	System.out.println("Value Instance Variable : "+vi.getVar2()); // Printing Value for Object 1 from VarClass Class
	System.out.println("Value Instance Variable : "+vi1.getVar2());  // Printing Value for Object 2  from VarInstance Class
	                                          /* For Static variable the value that is finally passed to the
	                                           * variable will be stored in the memory location allocated to the 
	                                           * static variable
	                                           * For Instance variable memory will be allocated at compilation time.
	                                           * So value will be assigned to the object created.
		*/
	}

}

