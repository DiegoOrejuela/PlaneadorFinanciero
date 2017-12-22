
public class Transaction {
  private String nameTrasaction;
	
	private int amounTtransaction;
	
		public Transaction (String nameTrasaction, int amounTransaction) {
			this.nameTrasaction = nameTrasaction;
			this.amounTtransaction = amounTransaction;
		}
	
    public String getDescription () {
      return  "    Nombre: " + nameTrasaction + ". Monto: " + amounTtransaction;
    } 

    public int getaAmounTtransaction () {
      return amounTtransaction;
    }
  
}

class Incomes extends Transaction{
	public Incomes (String nameTrasaction, int amounTransaction) {
		super (nameTrasaction, amounTransaction);
  }
}

class Outcomes extends Transaction {
	public Outcomes (String nameTrasaction, int amounTtransaction) {
		super (nameTrasaction, amounTtransaction);
	}
}
