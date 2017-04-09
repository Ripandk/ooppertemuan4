public class Ruang_kerja extends Perusahaan{
	String komputer;
	String printer;
	String telepon;
	String meja;

public void set( String komputer,String printer, String telepon, String meja){
	this.komputer = komputer;
	this.printer = printer;
	this.telepon = telepon;
	this.meja = meja;
	}
public void fasilitas(){
	super.fasilitas();
	System.out.println("Alat - alat yang di gunakan di tempat kerja" + " \n");
	System.out.println("komputer  :" + komputer);
	System.out.println("printer   :" + printer);
	System.out.println("telepon   :" + telepon);
	System.out.println("meja      :" + meja);
	}

public static void main(String[] args) {
	Ruang_kerja PT = new Ruang_kerja();
	PT.set("entry", "cetak", "komunikasi", "tempat duduk");
	PT.fasilitas();
	}
}
