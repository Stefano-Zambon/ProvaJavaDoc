/**
 * 
 * @author stefano
 *
 */
public class Aerobica extends Disciplina {
private String codiceCorso;
/**
 * <p> metodo costruttore con il parametro inizializzato 
 */
public Aerobica() {
	codiceCorso =" ";
}
/**
 * <p> metodo costruttore con la posibilità di inserire il parametro
 * @param codiceCorso
 */
public Aerobica (String codiceCorso){
	this.codiceCorso = codiceCorso;
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
