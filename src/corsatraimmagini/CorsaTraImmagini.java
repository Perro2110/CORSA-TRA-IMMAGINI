/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsatraimmagini;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
    
/**_______🙈🙉🙊___________
 * 🐎 @author perrotta 🐎 *
 *_______________________*/
public class CorsaTraImmagini {
    /**
     * @param args the command line arguments
     */
    protected static JFrame jf;
    public static void main(String[] args) {
        // TODO code application logic here
       
        jf=new JFrame("Corsa tra immagini");
         File buono=new File ("FEBBRE-DA-CAVALLO-1976-SIGLA-FINALE.wav");
        Sonoro sBravo=new Sonoro(buono,-1);  
        
        JLabel regoline;
        regoline=new JLabel("                                                             Clicca spazio per incitare e muovere il tuo cavallo!");
        GridLayout g1;                // Istanzio/creo la giglia come layout 
        g1 = new GridLayout(0,1);    // 
        Gioco disegna;
        jf.setSize(700,850); 
        jf.setLocationRelativeTo(null);
         jf.setLayout(g1);
        disegna=new Gioco();
        jf.add(disegna);
        jf.setDefaultCloseOperation(3);
        jf.setResizable(false);        //non ho problemi di diversi size così
        jf.add(regoline);            //Adotto le Lable/Regole del gioco
        jf.setVisible(true);
                                             }
                                }