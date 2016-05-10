package br.com.utfpr;

import br.com.utfpr.guerreiro.Guerreiro;
import br.com.utfpr.guerreiro.CriadorGuerreiroFuturista;
import br.com.utfpr.guerreiro.Exercito;
import br.com.utfpr.guerreiro.CriadorGuerreiroMedieval;

/**
 *
 * @author Mairieli
 */
public class Cliente {
    
    public static void main(String[] args) {
        Exercito exercito = new Exercito(new CriadorGuerreiroMedieval());
        exercito.construirGuerreiro();
        Guerreiro guerreiro = exercito.obterGuerreiro();
        System.out.println("Construindo guerreiro medieval...");
        System.out.println("Espada: " + guerreiro.getEspada());
        System.out.println("Armadura: " + guerreiro.getArmadura());
        System.out.println("Arco: " + guerreiro.getArco());
        System.out.println();
        
        exercito = new Exercito(new CriadorGuerreiroFuturista());
        exercito.construirGuerreiro();
        guerreiro = exercito.obterGuerreiro();
        System.out.println("Construindo guerreiro futurista...");
        System.out.println("Espada: " + guerreiro.getEspada());
        System.out.println("Armadura: " + guerreiro.getArmadura());
        System.out.println("Arco: " + guerreiro.getArco());
        
    }
}
