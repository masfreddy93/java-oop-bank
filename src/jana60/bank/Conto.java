package jana60.bank;

import java.util.Random;

public class Conto {
	
	private int numeroConto;
	private String nomeProprietario;
	private int saldo;
	
	Random r = new Random();
		
	
	public Conto(String nomeProprietario) {
		
		this.numeroConto = r.nextInt(100000, 10000000);
		this.nomeProprietario = nomeProprietario;
		this.saldo = 0;
	}
	
	public int getNumeroConto() {
		
		return numeroConto;
	}
//	public void setNumeroConto(int numeroConto) {
//		
//		this.numeroConto = numeroConto;
//	}
	
	public String getNomeProprietario() {
		
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		
		this.nomeProprietario = nomeProprietario;
	}
	
	public int getSaldo() {
		
		return saldo;
	}
//	public void setSaldo(int saldo) {
//		
//		this.saldo = saldo;
//	}
	
	
	//metodi aggiuntivi
	public void addMoney(int money) {
		
		saldo += money;
	}
	public void getMoney(int money) {
		
		if((saldo - money) >= 0)
			saldo -= money;
		else
			System.out.println("Non puoi prelevare questa somma");
	}
//	public int getSaldo() {
//		
//		return saldo;
//	}
	
	
	@Override
	public String toString() {
		
		return "Numero conto: " + numeroConto +
				"\nNome proprietario: " + nomeProprietario +
				"\nSaldo: " + saldo; 
	}
}
