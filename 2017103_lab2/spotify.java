import java.util.*;

public class spotify {
	


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int _a=0;
		int _c=1;
		int _s=0;
		artist[] artists=new artist[1000];
		customer[] customers=new customer[1000];
	
		
	;
		int t=sc.nextInt();
		for(int k=0 ; k<t ;t++) {
			int q =sc.nextInt();
			switch(q) {
			case 1:
				String determine=sc.next();
				String name=sc.next();
				if(determine.equals("A")) {
					
					artist userr=new artist(name,_a+2);
				
					
					
					_a=_a +2;
					artists[_a]=userr;
				}
				else if(determine.equals("C")) {
					customer userr=new customer(name,_c+2);
					_c=_c +2;
					customers[_c]=userr;
				}
				else {
					System.out.println("Error:invalid input ");
					break;
				
					
				}
				break;
			case 2:
				int inp_id=sc.nextInt();
				if(inp_id%2==1) {
					if(customers[inp_id]!=null) {
						customer obj= customers[inp_id];
						int option=sc.nextInt();
						
						
						obj.set_subscription(option);
							
						
						
					}
					else {
						System.out.println("Error: invalid id");
					}
					
				}
				else {
					System.out.println("Error: invalid id");
					
				}
				
				break;
			case 3:
				
				int id_3=sc.nextInt();
				if(artists[id_3]!=null) {
				int n=sc.nextInt();
				for(int jk=0;jk<n;jk++) {
					String namee=sc.next();
					System.out.print(_s +" ");
					
					artists[id_3].add_songs(_s,artists[id_3] , namee);
					_s++;
				}
				
					
					
					
					
					
				}
				else {
					System.out.print("Error:invalid input");
				}
				break;
			case 4:
				int id_4=sc.nextInt();
				if(artists[id_4]!=null) {
					System.out.print(artists[id_4].royalties);
					artists[id_4].royalties=0;
				}
				else {
					System.out.print("Error:invalid id");
				}
				break;
				
			case 5:
				int id_5=sc.nextInt();
				if(artists[id_5]!=null) {
					artists[id_5].streaming(id_5);
					
					
				}
				else if(customers[id_5]!=null) {
					customers[id_5].streaming(id_5);
				}
				else {
					System.out.print("Error:invalid id" + " " + id_5);
				}
				break;
				
				
			case 6:
				int id_6=sc.nextInt();
				if(customers[id_6]!=null) {
					System.out.println(customers[id_6].bill);
				}
				break;
				
			case 7:
				int id_7=sc.nextInt();
				if( artists[id_7]!=null) {
					artists[id_7].print_detail();
				}
				else if( customers[id_7]!=null) {
					customers[id_7].print_detail();
				}
				else {
					System.out.print("Error:invalid input");
				}
				break;
			}
			
		}
		// TODO Auto-generated method stub
		

	}

}
