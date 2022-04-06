package classi;
import eccezioni.*;
public class Foto extends ElementoMultimediale implements Immagine{
	int luminosita;
	public Foto(String titolo, String formato, String[] formatiValidi ){
		super(titolo,formato,new String[] {"JPG", "PNG", "JPEG", "TIFF"});
		this.luminosita=0;
	}
	int getLuminosita(){
		return this.luminosita;	
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
	public String esegui(){
	String res="";
	res+=this.titolo;			
		for (int i=0;i < maxLuminosita;i++){
			res+="*";
		}
}
