package br.com.utfpr.builder;

/**
 *
 * @author Mairieli
 */
public class CriadorGuerreiroFuturista extends CriadorGuerreiro {

    @Override
    public void escolherEspada() {
        super.guerreiro.setEspada("Espada Futurista");
    }

    @Override
    public void colocarArmadura() {
        super.guerreiro.setArmadura("Armadura Futurista");
    }

    @Override
    public void escolherArco() {
        super.guerreiro.setArco("Arco Futurista");
    }

}
