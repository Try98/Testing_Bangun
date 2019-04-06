
public class PersegiPanjang extends BangunDatar {

	public int panjang;
	public int lebar;
	
	public PersegiPanjang(int panjang, int lebar) {
		super();
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public int getPanjang() {
		return panjang;
	}

	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}

	public int getLebar() {
		return lebar;
	}

	public void setLebar(int lebar) {
		this.lebar = lebar;
	}

	public void luas() {
		double luas = panjang*lebar;
		System.out.println("Luas : "+luas);
	}
	public void keliling() {
		double keliling = 2*panjang+2*lebar;
		System.out.println("Keliling : "+keliling);
	}
	
	public PersegiPanjang() {
		
	}


}
