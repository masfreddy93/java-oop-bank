package jana60.bank;


public class Conto {
	
	//parametri d'istanza
	private int numeroConto;
	private String nomeProprietario;
	private int saldo;
	
		
	//costruttore
	public Conto(int numeroConto, String nomeProprietario) {
		
		this.numeroConto = numeroConto;
		this.nomeProprietario = nomeProprietario;
		this.saldo = 0;
	}
	
	//getter/setter vari
	public int getNumeroConto() {
		
		return numeroConto;
	}
	
	public String getNomeProprietario() {
		
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		
		this.nomeProprietario = nomeProprietario;
	}
	
	public int getSaldo() {
		
			return saldo;
	}
	
	
	//metodi aggiuntivi
	public void addMoney(int money) {
		
		saldo += money;
	}
	public boolean getMoney(int money) {
		
		if(saldo < money)		
			return false;
		
		saldo -= money;
		return true;
	}

	
	
	@Override
	public String toString() {
		
		return "\nNumero conto: " + numeroConto +
				"\nNome proprietario: " + nomeProprietario +
				"\nSaldo: " + saldo;
	}
}
