/**
 * 
 * @author stefano
 *
 */
public class CircoloSportivo {
public String Nome;
public CircoloSportivo() {
	Nome =" ";
}
public CircoloSportivo (String Nome){
	this.Nome = Nome;
}

/**
 * <p> metodo utile a visualizzare l'elenco degli iscritti.
 */
public void elencoIscritti(){
	System.out.println("elencoIscritti");
}


/**
 * <p> metodo utile a verificare l'elenco degli iscritti per ogni disciplina.
 * @param disc
 */
public void elencoIscrittiPerDisciplina(String disc){
	System.out.println("elencoIscrittiPerDisciplina");
}

}
