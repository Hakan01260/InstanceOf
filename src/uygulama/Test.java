package uygulama;

public class Test {

	public static void main(String[] args) {

		Daire daire1 = new Daire(5.12);
		Daire daire2 = new Daire(2.36);

		Kare kare1 = new Kare(3);
		Kare kare2 = new Kare(5);
		
		hesapla(kare1);
		hesapla(kare2);
		hesapla(daire1);
		hesapla(daire2);


	}

	public static void hesapla(Sekil sekil) {

		if (sekil instanceof Kare) {

			System.out.println("Kare:");
			System.out.println("Alan :" + sekil.getAlan());
			
		} else if (sekil instanceof Daire) {
			
			System.out.println("Daire :");
			System.out.println("Alan :" + sekil.getAlan());
			System.out.println("Çevre :" + sekil.getCevre());
		}
		
		System.out.println();
	}
}
