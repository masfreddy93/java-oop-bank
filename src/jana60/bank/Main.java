package jana60.bank;

public class Main {
	
	public static void main(String[] args) {
		
		Conto c1 = new Conto("Gianni");
//		c1.setNomeProprietario("Nicola");
		c1.addMoney(25);
		c1.getMoney(50);
		
		Conto c2 = new Conto("Lucia");
		c2.getMoney(1200);
		c2.addMoney(200);
		
		Conto c3 = new Conto("Monica");
		c3.addMoney(200);
		c3.getMoney(150);
		
		
		
		String result1 = c1.toString();
		System.out.println(result1);
		
		String result2 = c2.toString();
		System.out.println(result2);
		
		String result3 = c3.toString();
		System.out.println(result3);
		
	}
}
