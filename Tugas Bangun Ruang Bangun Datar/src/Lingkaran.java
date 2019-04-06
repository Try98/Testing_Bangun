public class Lingkaran extends BangunDatar{

	private int jarijari;
	
	
	public Lingkaran(int jarijari) {
		super();
		this.jarijari = jarijari;
	}
	
	public int getJarijari() {
		return jarijari;
	}

	public void setJarijari(int jarijari) {
		this.jarijari = jarijari;
	}


	public void keliling() {
		double keliling = 2*jarijari*Math.PI;
		System.out.println("Keliling : "+keliling);	
		
	}
	
	public void luas() {
		double luas = Math.PI*Math.pow(jarijari, 2);
		System.out.println("Luas : "+luas);
		
	}
	
	public Lingkaran() {
		
	}

}
