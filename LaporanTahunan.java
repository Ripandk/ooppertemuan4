public class LaporanTahunan implements CetakLaporan, TampilanLaporan{
	public void cetakA4(){
		System.out,println("Cetak Laporan di A4");
	}
	public void cetakA3(){
		System.out.printnl("Cetak Laporan di A3");
	}
	public void tampilWeb(){
		System.out.printnl("Tampil di Monitor");
	}
	public void tampilMobile(){
		System.out.printnl("Tampil di Handphone");
	}
	public static void main(String[] args){
		LaporanTahunan lt = new LaporanTahunan();
		lt.cetakA4();
		lt.cetakA3();
		lt.tampilWeb();
		lt.tampilMobile();

	}
}