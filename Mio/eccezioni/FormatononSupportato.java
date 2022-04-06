package eccezioni;

public class FormatoNonSupportato extends IllegalArgumentException{

	public FormatoNonSupportato(String formato){
		System.out.println("il formato" + formato + "non è supportato");

	}

}
