import java.util.*;


public class Pancard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name");
		String firstname = sc.nextLine();
		System.out.println("enter the last name ");
		String lastname = sc.nextLine();
		String pancardnumber = generatepan(lastname);
		System.out.println("PAN NUMBER : " + pancardnumber);
		
	}
	
	public static String generatepan(String lastname){
		Random rand = new Random();
		StringBuilder pan = new StringBuilder();
		
		for(int i=0;i<3;i++) {
			char randletter = (char) (rand.nextInt(26) + 'A');
			pan.append(randletter);
		}
		char charop;
		if(rand.nextBoolean()) {
			charop = 'P';
		}
		else {
			charop = 'O';
		}
		pan.append(charop);
		
		char lastfl = Character.toUpperCase(lastname.charAt(0));
        pan.append(lastfl);
        
         int num = rand.nextInt(10000);
         String randnum = String.format("%04d",num);
         pan.append(randnum);
        
         char letter = (char)(rand.nextInt(26) + 'A');
         pan.append(letter);
		
		return pan.toString();
	}
	

}