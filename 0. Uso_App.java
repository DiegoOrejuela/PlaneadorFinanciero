
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Uso_App {

	//Estructura de app
		// 1. Registro y acceso a la cuenta. 
			//Registro
				/*Creación de un objeto USer por consola. 
			//Acceso a la cuenta
			 * Revisión de los objetos USer ingresados en email y password
		 */
	
	public static void main(String[] args) {

		Scanner enter = new Scanner (System.in); 
		
		System.out.println("Planeador Financiero" + "\n" + "Ingrese a continuación el "
				+ "número de la opcíón que desee realizar:  " + "\n" + "1. Ingreso a  "
				+ "cuenta" + "\n" + "2. Registro de cuenta" );
			
		User [] User = new User [3];
		
		int opcion1 = enter.nextInt();
		
		if (opcion1 == 2) {
		
			for (int i = 0; i < User.length ; i++) {
				
				User [i] = new User (JOptionPane.showInputDialog("Introduce tu nombre"), 
						JOptionPane.showInputDialog("Introduce tu email"), JOptionPane.showInputDialog("Introduce"
						+ " tu contraseña" ));
			} 
			System.out.println();
			
			for (User e : User) {
				System.out.println(e.getDescription());
			}
			
		} else {
			
			System.out.println("fin");
		}
		
	(opcion1 == 1) {

			
			String emailUser = Users [0].getEmail();
			
			String emailEnter = "";
			
			String password = Users [0].getPassword();
			
			String passEnter = "";
			
						
				while (emailUser.equals(emailEnter)== false && password.equals(passEnter)) {
				
					emailEnter = JOptionPane.showInputDialog("Introduce correo");
				
					passEnter = JOptionPane.showInputDialog("IntroduceContraseña");
				
					System.out.println("Usuario o contraseña incorrecta");
				}
				
				System.out.println("Contaseña correcta. Acceso concedido");a
			
			System.out.println("fin");
		}

	}
}

