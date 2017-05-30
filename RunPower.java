public class RunPower{
	public static void main(String[]args){
		Socket Nuclear = new NuclearPower();
		System.out.println(Nuclear.getPower());
		Nuclear.countPower();

		Socket Panas = new PanasPower();
		System.out.println(Panas.getPower());
		Panas.countPower();
	}
}