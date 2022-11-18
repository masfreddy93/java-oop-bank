package jana60.bank;

public class Main {
	
	public static void main(String[] args) {
		
		Conto c1 = new Conto("Gianni");
//		c1.setNomeProprietario("Nicola");
		c1.addMoney(25);
		c1.getMoney(30);
		
		Conto c2 = new Conto("Lucia");
		
		
		
		String result1 = c1.toString();
		System.out.println(result1);
		
		String result2 = c2.toString();
		System.out.println(result2);
		
	}
}
