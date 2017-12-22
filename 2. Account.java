
public class Account {
  private int accountId;
		private String accountName;
		private static int idSiguiente;
		private int Balance;
		private int incomesBalance;
		private int outcomesBalance;
		private Transaction trans1;
		private Transaction trans2;
		
	public Account (String name) {
		accountId = idSiguiente;
		idSiguiente++;
		accountName = name;
		Balance = 0;
		incomesBalance = 0;
		outcomesBalance = 0;
		trans1 = new Incomes ("", 0);
		trans2 = new Outcomes ("", 0);
	}
	
	public String getDescription () {
		return "Cuenta: " + "\n" + accountId + ". " + accountName + ". Balance total: " + Balance + ". "
				+ "Balance de Ingresos: " + incomesBalance + ". Balance de "
				+ "egresos: " + outcomesBalance;
	}
	public void setIncomes (Transaction object) {
		trans1 = object;
	}
	
	public void setOutcomes (Transaction object) {
		trans2 = object;
	}
}
