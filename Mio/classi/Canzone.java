package classi;

import interfacce.Audio;
public class Canzone extends ElementoMultimediale implements Audio{	
	private int durata;
	private int volume;

	public Canzone(String titolo, String formato, String[] formatiSupportati){
		super(titolo,formato,new String[] {"MP3","MIDI","WAV","AAC"});
		this.durata=durata;
		this.volume=volume;
	}
	public int getDurata(){
		return this.durata;	
	}
	public int getVolume(){
		return this.volume;	
	}

	@Override
	public void weaker(){
		if(this.getVolume()>0){
			this.volume -=1;		
		}
	}
	@Override
	public void louder();{
		if(this.getVolume()<maxVolume){
			this.volume +=1;		
		}
	}
	@Override
	public String esegui(){
		String res="";
		for(int i = 0 ; i < this.getDurata();i++){
			res+=this.getTitolo();
		}
		for(int i = 0 ; i < this.getVolume();i++){
			res+="!";
		}
		System.out.println(res);
		return res;
	} 
}
