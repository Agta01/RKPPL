package perhitungan;

public class Perhitungan {

	public int pertambahan5(int x){
		if (x <= 0) {
			return x;
		}else if(x >= 10){
			return x-10;
		}else{
			return x + 5;
		}
	}
	
	public int perkalian5(int x){
		if(x <= 0){
			return x;
		}else if(x >= 10){
			return x-10;
		}else{
			return x * 5;
		}
	}
	
	public static void main(String[] args) {
		Perhitungan p = new Perhitungan();
		System.out.println(p.pertambahan5(5));
	}
	
}
