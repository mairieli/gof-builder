package br.com.utfpr.director;

import br.com.utfpr.builder.CriadorGuerreiro;
import br.com.utfpr.bean.Guerreiro;

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
