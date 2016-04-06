/**
 * 
 * @author stefano
 *
 */
public class Socio {
private  String nome;
private String cognome;
private String cf;
/**
 * @metodo costrttore con i parametri da inserire 
 * @param nome 
 * @param cognome
 * @param cf
 */
public Socio (){
	nome = " ";
	cognome = " ";
	cf = " ";
}
/**
 *<p> Permette di modificare il nome
 * @param nome
 */
public void setNome (String nome){
	this.nome =nome ;
}
/**
 * <p>Con questo metodo restituisce il nome
 * @return ritorna una stringa
 */
public String getNome (){
	return nome;
}
/**
 * <p>Permette di modificare il cognome
 * @param cognome
 */
public void setCognome (String cognome){
	this.cognome = cognome ;
}
/**
 * <p>ritorna il cognome
 * @return ritorna una stringa
 */
public String getCognome (){
	return cognome;
}
/**
 *<p> permette di modificare il codice fiscale
 * @param cf
 */
public void setCf (String cf){
	this.cf = cf;
}
/**
 * <p>ritorna il codice fiscale
 * @return ritorna una stringa
 */

public String getCf(){
	return cf;
}

/**
 *  <p>Con questo metodo calcola la retta 
 * @param isAnnuale
 * @return ritorna un float
 */
public float calcoloRetta (boolean isAnnuale){
	return 0;
}
	
}


