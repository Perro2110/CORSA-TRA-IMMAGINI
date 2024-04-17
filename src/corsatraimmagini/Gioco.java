/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsatraimmagini;
import static corsatraimmagini.CorsaTraImmagini.jf;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**_______🙈🙉🙊___________
 * 🐎 @author perrotta 🐎 *
 *_______________________*/

public class Gioco extends JPanel implements KeyListener
{
    private Immagine sfondo_ippodromo;
    private final Cavallo Incantesimo;
    private CavalloIA Cavallo2,Cavallo3,Cavallo4;  
    private boolean giavinto=false;
    public Gioco(){
        this.sfondo_ippodromo = new Immagine("sfondo.jpg", 0, 0, 850, 800, true);
        this.Incantesimo = new Cavallo("Soldatino","giphy.gif", 10, 10, 100, 75, true);
        this.Cavallo2 = new CavalloIA("Dartagnan","giphy.gif", 10, 100, 100, 75, (float) 0.5,true);
        this.Cavallo3 = new CavalloIA("King","giphy.gif", 10, 200, 100, 75, (float) 0.5,true);
        this.Cavallo4 = new CavalloIA("Mandrake","giphy.gif", 10, 300, 100, 75, (float) 0.5,true);
        this.setFocusable(true);
        this.addKeyListener(this);
            Cavallo2.start();
            Cavallo3.start();
            Cavallo4.start();
                   }    
    @Override
    public void paintComponent(Graphics g){
    sfondo_ippodromo.disegna(g);
      Incantesimo.disegna(g);
     Cavallo2.disegna(g);
      Cavallo3.disegna(g);
      Cavallo4.disegna(g);
      for(int i=0;i<100;i++)
       {
          repaint();
           if(Cavallo2.getX()==500 && !giavinto)
           {
               System.out.println("Vinto:"+ Cavallo2.getNomeMaile()); 
               JfPersa G1;
      G1=new JfPersa();
      giavinto=true;
      jf.setVisible(false);
           }
             if(Cavallo3.getX()==500 && !giavinto)
           {
               System.out.println("Vinto:"+ Cavallo3.getNomeMaile()); 
               JfPersa G1;
      G1=new JfPersa();
      giavinto=true;
      jf.setVisible(false);
           }
                   if(Cavallo4.getX()==500 && !giavinto)
           {
               System.out.println("Vinto:"+ Cavallo4.getNomeMaile()); 
               JfPersa G1;
      G1=new JfPersa();
      giavinto=true;
      jf.setVisible(false);
           }
       }
                                          }    
    @Override
    public void keyTyped(KeyEvent ke) {}
    @Override
    public void keyPressed(KeyEvent ke) {}    
    @Override
    public void keyReleased(KeyEvent ke) {
                     int premuto=ke.getKeyCode();
     switch(premuto)
     {
         case KeyEvent.VK_SPACE: {Incantesimo.spostaDx(10);break;}
     }
        finaly();
        repaint();
                                          }    
    public void finaly() {
        if(Incantesimo.getX()==500 && !giavinto){
            System.out.println("Vinto:"+ Incantesimo.getNomeMaile());
        JfVinta G1;
      G1=new JfVinta();
      giavinto=true;
      jf.setVisible(false);
        
                          }   }                           
}