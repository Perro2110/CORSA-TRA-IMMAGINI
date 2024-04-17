/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsatraimmagini;

/**_______🙈🙉🙊___________
 * 🐎 @author perrotta 🐎 *
 *_______________________*/
public class Cavallo extends Immagine 
{
    String NomeMaile;

    public Cavallo(String NomeMaile, String nomeImmagine, int x, int y, int lunghezza, int larghezza, boolean visible) {
        super(nomeImmagine, x, y, lunghezza, larghezza, visible);
        this.NomeMaile = NomeMaile;
    }

    public Cavallo(String NomeMaile, String nomeImmagine, int x, int y) {
        super(nomeImmagine, x, y);
        this.NomeMaile = NomeMaile;
    }

    public Cavallo(String NomeMaile, String nomeImmagine) {
        super(nomeImmagine);
        this.NomeMaile = NomeMaile;
    }

    public String getNomeMaile() {
        return NomeMaile;
    }
}
