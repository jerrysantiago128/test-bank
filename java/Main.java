//
//
// Main.java
// by Jerry Santiago
//
//
public class Main extends BankUser{
	
	public static void main(String[] args) {
		
		String fname = args[0];
		String lname = args[1];
		String a = args[2];
		String permission = args[3];
		
		int age = Integer.parseInt(a);
		
		BankUser user = new BankUser();
		
		user.createUser(fname, lname, age, permission); // set this to system arguments 
			//specify that permissions needs to be 1,2, or 3;
		user.updateUser(fname,lname,age, permission);
		
		System.out.println(user.getPermissions());
		

		
	}
}

 


// need to set permissions in another class?
// start on user account next or list of users
