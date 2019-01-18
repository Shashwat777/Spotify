import java.util.*;
public class customer implements users {
		String name;
		int id;
		int sub=1;
		int bill=0;
		int downloads;
		int songs;
		customer(String name,int id){
			this.name=name;
			this.id=id;
			System.out.print(name + " " + id);
		}
		public void set_subscription(int option){
			this.sub=option;
			if(option==1) {}
			else if(option==2) {
				bill=100 +bill ;
				downloads=2;
				songs=5;
				
			}
			else if(option ==3) {
				bill= bill +500;
				downloads=5;
				songs=10;
				
			}
			else if(option==4) {
				bill=1000;
					this.downloads=10000;
				this.songs=1000;
				System.out.print("updated");
			}
			else {
				System.out.print("Error:Wrong input");
			}
			
		}
		public void streaming(int id_5){
			Scanner sc=new Scanner(System.in);
			

			int nsongs=sc.nextInt();
			if(nsongs>downloads +songs) {System.out.print("err");}
			else {
			
			
				String[] prefrences=new String[nsongs];
				String[] order=new String[nsongs];
				int d_count=0;
				int p_count=0;
				
				for(int sng=0; sng<nsongs;sng++) {
					
					int s_id=sc.nextInt();
			
					
					order[d_count +p_count]=artist.songs[s_id];
					
					String opt=sc.next();
					if(opt.equals("D")) {
						d_count++;
						if(d_count < this.downloads) {
						artist.artist_name[s_id].royalties=artist.artist_name[s_id].royalties+20;
					}
						else {
							System.out.print("Download limit finished ");
						}	}
					else if(opt.equals("P")) {
						p_count++;
						if(p_count <this.songs) {
							
							artist.artist_name[s_id].royalties=artist.artist_name[s_id].royalties+5;

						}
						else {
							System.out.print("Songs limit finished ");}
					}
				}
				for(int pref=0;pref<nsongs;pref++) {
					int pr=sc.nextInt()-1;
					prefrences[pr]=order[pref];
					
					
					
				}
			  for(int prints=0;prints<nsongs;prints++) {
				  System.out.print(prefrences[nsongs -1 - prints] + " ");
			  }
				
			}
		}
		
		public void print_detail() {
			System.out.print(this .name + " " + this.id + " " + sub );
		}
	}