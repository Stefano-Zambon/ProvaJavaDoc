/**
 * 
 * @author stefano
 *
 */
public class BodyBuilding extends Disciplina{
private String peso;
/**
 * <p> mettodo costruttore con parametri
 * @param peso
 */
public BodyBuilding(String peso) {
	this.peso=peso;
}
/**
 * <p> mettodo costruttore con parametri da inizializzare
 */
public BodyBuilding() {
	peso = "0";
}
/**
 * <p>metodo che  restituisce il mese 
 * @return una variabile stringa di tipo mese
 */
public String getPeso() {
	return peso;
}
/**
 * <p>metodo che modifica il parametro peso
 * @param peso
 */
public void setPeso(String peso) {
	this.peso = peso;
}

}
