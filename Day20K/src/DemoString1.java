public class DemoString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k = "GOOD MORNING";
		System.out.println("Print First String:-" +k);
		System.out.println("Length First String:-" + k.length());
 
		String k1 = new String("Welcome Sir/Maam");
		System.out.println("Print Second String:-" +k1);
		k.concat(k1);
		System.out.println("CONCAT  First & Second String:-" +k);
		
		String k2 = k.concat(k1);
		System.out.println("CONCAT  First & Second String:-" +k2);
	}

}
