public class LaporanBulanan implements CetakLaporan{
	public void cetakA4(){
		System.out,println("Cetak Laporan di A4");
	}
	public void cetakA3(){
		System.out.printnl("Cetak Laporan di A3");
	}
	public static void main(String[] args){
		LaporanBulanan lb = new LaporanBulanan();
		lb.cetakA4();
		lb.cetakA3();

	}
}