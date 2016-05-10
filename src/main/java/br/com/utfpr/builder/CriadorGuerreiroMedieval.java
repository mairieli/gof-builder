package br.com.utfpr.builder;

/**
 *
 * @author Mairieli
 */
public class CriadorGuerreiroMedieval extends CriadorGuerreiro {

    @Override
    public void escolherEspada() {
        super.guerreiro.setEspada("Espada Medieval");
    }

    @Override
    public void colocarArmadura() {
        super.guerreiro.setArmadura("Armadura Medieval");
    }

    @Override
    public void escolherArco() {
        super.guerreiro.setArco("Arco Medieval");
    }

}
