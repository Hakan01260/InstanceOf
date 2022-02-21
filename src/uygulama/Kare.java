package uygulama;

public class Kare extends Sekil {

	private int kenar;
	
	public Kare (int kenar) {
		this.kenar=kenar;
	}

	public void setKenar(int kenar) {
		this.kenar = kenar;
	}

	@Override
	public double getAlan() {

		return kenar * kenar;
	}

	@Override
	public double getCevre() {

		return 4 * kenar;
	}

}
