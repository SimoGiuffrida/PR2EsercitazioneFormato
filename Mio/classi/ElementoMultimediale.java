package classi;
import eccezioni.*;
import interfacce.*;

public abstract class ElementoMultimediale{
	private String titolo;	
	private String formato;
	private final String[] formatiValidi;	
	public ElementoMultimediale(String titolo, String formato, String[] formatiValidi){
		this.titolo=titolo;
		this.formato=formato;
		this.formatiValidi=formatiValidi;
	}

	public abstract String esegui();

	public String getTitolo(){
		return this.titolo;
}
	public String getFormato();
		return this.formato;
}



