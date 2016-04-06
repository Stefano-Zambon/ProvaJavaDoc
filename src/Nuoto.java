/**
 * 
 * @author stefano
 *
 */
public class Nuoto extends Disciplina{
	private String codiceCorso ;
	public int corsia ;
	/**
	 * <p> metodo costruttore con le variabili inizializzate 
	 */
	public Nuoto (){
		codiceCorso = " ";
		corsia = 0;
	}
	/**
	 * <p> metodo costruttore con le variabili da inizializzare 
	 * @param codiceCorso
	 * @param corsia
	 */
	public Nuoto (String codiceCorso ,int corsia){
		this.codiceCorso = codiceCorso;
		this.corsia = corsia;
	}
	/**
	 *  permette di ritornare codiceCorso
	 * @return una variabile stringa di tipo codiceCorso
	 */
	public String getCodiceCorso() {
		return codiceCorso;
	}
	/**
	 * <p> permette di modificare codiceCorso
	 * @param codiceCorso
	 */
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}

}
