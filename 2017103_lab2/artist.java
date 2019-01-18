 import java.util.*;
	
public class  artist implements users {
		String name;
	    static  String[] songs = new String[1000];
	    String[] mysngs=new String[1000];
	    int maxsongs;
	    static artist[] artist_name = new artist[1000];
	    
	    int royalties;
		
		int id;
		
		
		artist(String name,int id){
			this.name=name;
			this.id=id;
			System.out.print(name + " " + id);
		}
		public void print_detail() {
			System.out.print(this.name  + " " + ";" );
			for(int z=0;z<maxsongs;z++) {
				System.out.print(mysngs[z] + " , " );
			}
			System.out.println();
			
		}
		public void streaming(int id_5){
			Scanner sc=new Scanner(System.in);
			int nsongs=sc.nextInt();
			String[] prefrences=new String[nsongs];
			String[] order=new String[nsongs];
			int use =0;
			for(int sng =0; sng<nsongs;sng++) {
				int s_id=sc.nextInt();
				order[use]=artist.songs[s_id];
				use++;
				String opt=sc.next();
				if(artist_name[s_id]!=null && opt.equals("D") && artist_name[s_id]!=this) {
					artist.artist_name[s_id].royalties=artist.artist_name[s_id].royalties+20;
					
				}
				else if(artist_name[s_id]!=null && opt.equals("D") && artist_name[s_id]!=this) {
					artist.artist_name[s_id].royalties=artist.artist_name[s_id].royalties+5;

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
		public  void add_songs(int song, artist art , String name) {
			
			artist_name[song]=art;
			songs[song]=name;
			mysngs[maxsongs]=name;
			
			maxsongs++;
			
			
		}
		
	}