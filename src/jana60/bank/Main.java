package jana60.bank;

public class Main {
	
	public static void main(String[] args) {
		
		Conto c1 = new Conto(23452, "Gianni");
//		c1.setNomeProprietario("Nicola");
		boolean res;
		c1.addMoney(25);
		System.out.println(c1);
		res = c1.getMoney(50);
		System.out.println("Risultato prelievo: " + res);
		
		Conto c2 = new Conto(27364, "Lucia");
		c2.addMoney(200);
		System.out.println(c2);
		res = c2.getMoney(1200);
		System.out.println("Risultato prelievo: " + res);
		
		Conto c3 = new Conto(20284, "Monica");
		c3.addMoney(200);
		System.out.println(c3);
		res = c3.getMoney(150);
		System.out.println("Risultato prelievo: " + res);
		
		
	}
}
