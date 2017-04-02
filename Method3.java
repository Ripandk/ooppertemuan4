public class Method2 {
	public static void main(String[] args) {
	Method method = new Method();
	method.methodTampilkan2("Belajar Java Yuks");
	System.out.println(method.kembalikanNilai(3,5));	
	}

	private void methodTampilkan2(String nama){
	System.out.println(nama);
	}

	private int kembalikanNilai(int x, int y){
	return x + y;
	}
}