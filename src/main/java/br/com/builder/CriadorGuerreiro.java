package br.com.builder;

/**
 *
 * @author Mairieli
 */
public abstract class CriadorGuerreiro {

    protected Guerreiro guerreiro;

    public CriadorGuerreiro() {
        this.guerreiro = new Guerreiro();
    }

    public Guerreiro obterGuerreiro() {
        return guerreiro;
    }

    public abstract void escolherEspada();

    public abstract void colocarArmadura();

    public abstract void escolherArco();

}
