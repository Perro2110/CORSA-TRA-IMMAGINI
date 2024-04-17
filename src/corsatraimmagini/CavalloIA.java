/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsatraimmagini;

/**_______🙈🙉🙊___________
 * 🐎 @author perrotta 🐎 *
 *_______________________*/
public class CavalloIA extends Immagine
{
    String NomeMaile;
    float Velocita;
    public CavalloIA(String NomeMaile, String nomeImmagine, int x, int y, int lunghezza, int larghezza,float Velocita, boolean visible) {
        super(nomeImmagine, x, y, lunghezza, larghezza, visible);
        this.Velocita=Velocita;
        this.NomeMaile = NomeMaile;
    }
    public CavalloIA(String NomeMaile, String nomeImmagine, int x, int y) {
        super(nomeImmagine, x, y);
        this.NomeMaile = NomeMaile;
    }
    public CavalloIA(String NomeMaile, String nomeImmagine) {
        super(nomeImmagine);
        this.NomeMaile = NomeMaile;
    }
    public String getNomeMaile() {
        return NomeMaile;
    }    
    public void run()
    {       
            try {
                 for(int i=1;1<1000;i++){
                Thread.sleep(10);
                spostaDx(Velocita+((float)(Math.random()*1.7)));              
                 }
            } catch (InterruptedException ex) {                
            }        
    }
}
