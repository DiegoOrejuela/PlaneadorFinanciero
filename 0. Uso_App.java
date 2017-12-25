
public class Uso_App {

	
	public static void main(String[] args) {
			
			
			
	//User | Create	
	User Diana = new User ("Diana Pito", "diapito@gmail.com", "pito"); 
			
	//Account | Create			
	Account cuenta1 = new Account ("Gastos mensuales");
	
		//User - Account | Assign
		Diana.setAccount(cuenta1);
		
	// Incomes | Create
		Incomes [] Incomes1 = new Incomes [2];
		Incomes1 [0] = new Incomes ("Trabajo", 500000);
		Incomes1 [1 ]= new Incomes ("Renta", 250000);
		
		//Account - Incomes | Assign
		cuenta1.setIncomesObjects(Incomes1);
	
	// Outcomes | Create
		Outcomes [] Outcomes1 = new Outcomes [2];
		Outcomes1 [0] = new Outcomes ("Arriendo", 250000);
		Outcomes1 [1] = new Outcomes ("Pensión", 250000);
		
		// Account - Outcomes | Assign
		cuenta1.setOutcomesObjects(Outcomes1);
		
	// Operations
		cuenta1.setIncomesBalance(Incomes1);
		cuenta1.setOutcomesBalance(Outcomes1);
		cuenta1.setBalance();
	
	//Print
		System.out.println("Planeador financiero: génesis");
		
		System.out.println(Diana.getDescription());
		
		System.out.println(cuenta1.getDescription());
		
		System.out.println("Transacciones" + "\n" + "   Ingresos: " + "\n" + 
				Incomes1[0].getDescription() +  "\n" + Incomes1 [1].getDescription() + "\n" + "   "
				+ "Egresos:"+ "\n" + Outcomes1[0].getDescription() + "\n" +  Incomes1 [1].getDescription());
		
			
	}

}

			
			
			
			/*Scanner enter = new Scanner (System.in); 
			
			System.out.println("Planeador Financiero" + "\n" + "Ingrese a continuación el "
					+ "número de la opcíón que desee realizar:  " + "\n" + "1. Ingreso a  "
					+ "cuenta" + "\n" + "2. Registro de cuenta" );
			
			
			/*int opcion1 = enter.nextInt();
		
		
		if (opcion1 == 2) {
		
			
			for (int i = 1; i < Users.length ; i++) {
				
				Users [i] = new User (JOptionPane.showInputDialog("Introduce tu nombre"), 
						JOptionPane.showInputDialog("Introduce tu email"), JOptionPane.showInputDialog("Introduce"
						+ " tu contraseña" ));
			
			}
			
			System.out.println();
			
			for (int i = 1; i < Users.length ; i++) {
				System.out.println(Users[i].getDescription());
			
			}
		} 
		
		if (opcion1 == 1) {

			String password = Users[0].getPassword();
			
			String pass = "";
			
			String emailUser = Users [0].getEmail();
			
			String emailEnter = "";
			
			while (password.equals(pass)== false && emailUser.equals(emailEnter)== false) {
				
				pass = JOptionPane.showInputDialog("Introduce la contraseña");
			
				emailEnter = JOptionPane.showInputDialog("Introduce correo");
				
					System.out.println("Contraseña incorrecta"); 
					
					{break;}
			
			}
			System.out.println("Contraseña correcta. Acceso permitido");
			
		}*/
	



