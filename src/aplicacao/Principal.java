
package aplicacao;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;

/**
 *
 * @author Adriano
 */
public class Principal {
    
    public static void main(String[] args){
        
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        
        UI.printTabuleiro(partidaXadrez.getPecas());
    }
    
}
