
public class Account {

		private int accountId;
		private String accountName;
		private static int idSiguienteAccount= 1;
		private int Balance;
		private int incomesBalance;
		private int outcomesBalance;
		private Transaction incomesObjects [];
		private Transaction outcomesObjects [];
		
	public Account (String name) {
		accountId = idSiguienteAccount;
		idSiguienteAccount++;
		accountName = name;
		Balance = 0;
		incomesBalance = 0;
		outcomesBalance = 0;
		incomesObjects = new Incomes [0];
		outcomesObjects = new Outcomes [0];
	}
	
	public String getDescription () {
		return "Cuenta: " + "\n" + accountId + ". " + accountName + ". Balance total: " + Balance + ". "
				+ "Balance de Ingresos: " + incomesBalance + ". Balance de "
				+ "egresos: " + outcomesBalance;
	}
	
	
	public void setIncomesObjects (Transaction []object) {
		incomesObjects = object;
	}
		
	public void setOutcomesObjects (Transaction []object) {
		outcomesObjects = object;
	}
	
	public void setIncomesBalance (Transaction [] object) {
		for (int i = 0; i < object.length; i++ ) {
			incomesBalance += object [i].getaAmounTtransaction();
		}
	}
	
	public void setOutcomesBalance (Transaction [] object) {
		for (int i = 0; i < object.length; i++ ) {
			outcomesBalance += object [i].getaAmounTtransaction();
		}
	}
	
	public void setBalance () {
		Balance = incomesBalance - outcomesBalance;
	}
	
	public int getIncomesBalance () {
		return incomesBalance;
	}
	
	public int getOutcomesBalance () {
		return outcomesBalance;
	}
	
	public Transaction [] getTrans1 (){
		return incomesObjects;
	}
}

/*public void setIncomes (Transaction []object) {
for (int i = 0; i < object.length; i++ ) {
	 object [i]= new Incomes("", 0);
	 trans1 = object;
}

}*/
