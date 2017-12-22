
public class Uso_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Planeador financiero: génesis");
			
		User Diana = new User ("Diana Pito", "diapito@gmail.com", "pito"); 
			
			System.out.println(Diana.getDescription());
			
		Account cuenta1 = new Account ("Gastos mensuales");
			
			System.out.println(cuenta1.getDescription());
			
		Diana.setAccount(cuenta1);
			
		Transaction Tran1 = new Incomes ("Trabajo", 500000);
		Transaction Tran2 = new Incomes ("Renta", 250000);
		Transaction Tran3 = new Outcomes ("Arriendo", 250000);
		Transaction Tran4 = new Outcomes ("Pensión", 250000);
			
			System.out.println("Transacciones" + "\n" + "   Ingresos: " + "\n" + 
			Tran1.getDescription() +  "\n" + Tran2.getDescription() + "\n" + "   "
			+ "Egresos:"+ "\n" + Tran3.getDescription() + "\n" +  Tran4.getDescription());
			 
		cuenta1.setIncomes(Tran1);	
		cuenta1.setIncomes(Tran2);
		cuenta1.setOutcomes(Tran3);
		cuenta1.setOutcomes(Tran4);
		
			
			
			
			
			
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
	

	}

}
