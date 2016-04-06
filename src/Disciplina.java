/**
 * 
 * @author stefano
 *
 */
public class Disciplina {
private float  mensile ;
private float annuale ;
public String nome;
/**
 * <p> metodo costruttore
 */
public Disciplina() {
	mensile = 0;
	annuale=0;
	nome = " ";
}
/**
 * <p> metodo costruttore permette di inizializare i parametri 
 * @param mensile
 * @param annuale
 * @param nome
 */

public Disciplina (float mensile ,float annuale ,String nome){
	this.annuale= annuale;
	this.mensile= mensile;
	this.nome =nome;
}
/**
 * <p> metodo che ritorna la retta annuale
 * @return un valore float di tipo annuale
 */
public float getAnnuale() {
	return annuale;
}
/**
 *<p> metodo che modifica la retta annuale
 * @param annuale
 */
public void setAnnuale(float annuale) {
	this.annuale = annuale;
}
/**
 * <p>metodo che ritorna la retta mensile
 * @return un valolre di tipo float di tipo mensile
 */
public float getMensile() {
	return mensile;
}
/**
 * <p>metodo che modifica la retta annuale
 * @param mensile
 */
public void setMensile(float mensile) {
	this.mensile = mensile;
}
/**
 *<p> metodo che ritorna il nome del socio
 * @return un valore String di tipo nome
 */
public String getNome() {
	return nome;
}
/**
 * <p>metodo che modifica il nome del socio
 * @param nome
 */
public void setNome(String nome) {
	this.nome = nome;
}
}
