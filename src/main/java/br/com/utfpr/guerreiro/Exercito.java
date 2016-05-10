package br.com.utfpr.guerreiro;

/**
 *
 * @author Mairieli
 */
public class Exercito {

    protected CriadorGuerreiro criadorGuerreiro;

    public Exercito(CriadorGuerreiro criadorGuerreiro) {
        this.criadorGuerreiro = criadorGuerreiro;
    }

    public void construirGuerreiro() {
        criadorGuerreiro.escolherEspada();
        criadorGuerreiro.colocarArmadura();
        criadorGuerreiro.escolherArco();
    }
    
    public Guerreiro obterGuerreiro(){
        return criadorGuerreiro.obterGuerreiro();
    }
}
