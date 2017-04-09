class Perusahaan{
	
	public void fasilitas(){
		System.out.println("Perusahaan mempunyai fasilitas kerja");
	}
}
class HrdDepartemen extends Perusahaan{
	public void fasilitas(){
		System.out.println("HrdDepartemen mempunyai fasilitas kerja");
		super.fasilitas();
	}
}

public class MainHrd{
	public static void main(String[]args){
		Perusahaan abc = new Perusahaan();
		HrdDepartemen abcd = new HrdDepartemen();
		abc.fasilitas();
		abcd.fasilitas();
	}
}