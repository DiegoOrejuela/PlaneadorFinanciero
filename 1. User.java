
public class User {

	private static int userId = 1;
	
	private int id ;
	
	private String userName;
	
	private String email;
	
	private String password;
	
	private Account account;
	
		public User (String userName, String email, String password) {
			
			id = userId;
			userId++;
			this.userName = userName;
			this.email = email;
			this.password = password;
			account = new Account ("");
		}
	
	public String getName () {
		return userName;
	}
	
	public String getEmail () {
		return email;
	}
	
	public String getPassword () { //De prueba
		return password;
	}
	
	public int id  () {
		return id;
	}
	
	public String getDescription () {
		return "Usuario: " + "\n" + id + ". Nombre: " + userName + ". Email: " + email + "."
				+ " Contraseña: " + password ;
	}
	
	public void setAccount (Account object) {
		account = object;
	}
}

