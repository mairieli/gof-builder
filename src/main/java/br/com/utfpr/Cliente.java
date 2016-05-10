package br.com.utfpr;

import br.com.utfpr.bean.Guerreiro;
import br.com.utfpr.builder.CriadorGuerreiroFuturista;
import br.com.utfpr.director.Exercito;
import br.com.utfpr.builder.CriadorGuerreiroMedieval;

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
