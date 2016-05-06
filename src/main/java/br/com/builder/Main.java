package br.com.builder;

/**
 *
 * @author Mairieli
 */
public class Main {
    
    public static void main(String[] args) {
        Exercito exercito = new Exercito(new CriadorGuerreiroMedieval());
        exercito.construirGuerreiro();
        Guerreiro guerreiro = exercito.obterGuerreiro();
        System.out.println("Guerreiro");
        System.out.println("Espada: " + guerreiro.getEspada());
        System.out.println("Armadura: " + guerreiro.getArmadura());
        System.out.println("Arco: " + guerreiro.getArco());
        System.out.println();
        
        exercito = new Exercito(new CriadorGuerreiroFuturista());
        exercito.construirGuerreiro();
        guerreiro = exercito.obterGuerreiro();
        System.out.println("Guerreiro");
        System.out.println("Espada: " + guerreiro.getEspada());
        System.out.println("Armadura: " + guerreiro.getArmadura());
        System.out.println("Arco: " + guerreiro.getArco());
        
    }
}
