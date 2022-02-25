public class DemoString2 {

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
		
		String k3 = "Hey";
		System.out.println("CONCAT  First & Second String:-" +k3);
		
		String k4 = "Kalpesh";
		System.out.println("CONCAT  First & Second String:-" +k4);
		
		if(k==k3) 
		{
			System.out.println("Print K = K3");
		}
		else
		{
			System.out.println("Print K =! K3");
		}
		
		System.out.println("K & K3 Are Equals " +(k.equals(k3)));
	}

}
