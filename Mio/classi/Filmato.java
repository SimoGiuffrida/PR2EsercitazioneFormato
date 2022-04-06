package classi;

public class Filmato extends ElementoMultimediale implements Audio , Immagine{
	private int durata;
	private int volume;
	private int luminosita;
	public Filmato(String titolo, String formato, String[] formatiValidi ){
		super(titolo,formato,new String[] {"MP4", "WEBM", "AVI", "FLV"});
		this.luminosita=0;
		this.volume=0;
		this.durata=durata;
	}
	int getLuminosita(){
		return this.luminosita;	
	}
	public int getDurata(){
		return this.durata;	
	}
	public int getVolume(){
		return this.volume;	
	}

	@Override
	public void brighter(){
		if(this.getLuminosita() < maxLuminosita)
			this.luminosita++;	
	}
	@Override
	public void darker(){
		if(this.getLuminosita() > 0)
			this.luminosita--;
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
		for(i = 0 ; i < this.getVolume();i++){
			res+="!";
		}
		for (int i=0;i < maxLuminosita;i++){
			res+="*";
		}
		System.out.println(res);
		return res;
	} 
}

