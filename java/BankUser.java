//
//
//
//  BankUser.java
//  by: Jerry Santiago
//
//


public class BankUser{
	private User user;
	
	public String getName() {
		return "fname "  + "lname";
	}
	
	public void createUser(String fname, String lname, int age, String permission) {
		user = new User(fname, lname, age, permission);  //may see issues with user creation for permissions
		user.permission = user.updatePermissions(permission);
		//System.out.println(permission);
		permission = getPermissions();
		//System.out.println(permission);	
		user.toString(fname, lname, age, permission);
		System.out.println("User created: " + user.s);
	}
	
	public void updateUser(String newFName, String newLName, int newAge, String permission) {
        if (user != null) { // Check if the user has been created
            user.setName(newFName, newLName);
            user.setAge(newAge);
            
            System.out.println("User updated: " + user.toString());
        } else {
            System.out.println("No user found. Please create a user first.");
        }
    }
	
	public String getPermissions() {
		return user.permission;
	}
	
}


	// user has a name, age, and permission
	class User{
		
		//vars
		String fname;
		String lname;
		int age;
		String permission;
		String s;
		
		
		//constructor(s)
		public User() {
			
		}
		//constructor
		public User(String fname,String lname, int age, String permission) {
			this.fname = fname;
			this.lname = lname;
			this.age = age;
			this.permission = permission;
		}
		
		//enum to assign permissions
		enum Roles {
			CUSTOMER,
			EMPLOYEE,
			ADMINISTRATOR
		}
		
		
		
		public void setName(String fname, String lname) {
			this.fname = fname;
			this.lname = lname;
		}
		
		
		
		public void setAge(int age) {
			this.age = age;
		}
		
		
		//using this may complicate calling user permissions later
		public String updatePermissions(String permission) {
			
			switch(permission) {
			case "1": 
				permission = Roles.values()[0].name();
				break;
			case "2": 
				permission = Roles.values()[1].name();
				break;
			case "3": 
				permission = Roles.values()[2].name();
				break;
			default:
				System.out.println("Invalid permissions value");
				break;
			}
			//System.out.println("Permissions updated to: "+ permission);
			return permission;
			
		}
		
		public void setPermissions(String permission) {
			this.permission = permission;
		}
		

		public String toString(String fname,String lname, int age, String permission) {
			return "User Info{" + 
					"Name:" + fname + " " + lname + "\n" +
					"Age: " + age + "\n " + 
					"Permission: " + permission + "\n" + 
					"}";
		}
	}





	

//TreeMap<String, User> user_map;
