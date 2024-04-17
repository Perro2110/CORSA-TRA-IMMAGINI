/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsatraimmagini;
import static corsatraimmagini.CorsaTraImmagini.jf;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**_______🙈🙉🙊___________
 * 🐎 @author perrotta 🐎 *
 *_______________________*/
public class JfPersa {
    
 private  JFrame jfw;
      private  JButton bGiusto;
      private  Icon iGiusto;
      private  GridLayout gl;
    public JfPersa() {
        
        jf.setVisible(false);
                    //creo il Frame
        jfw =new JFrame("Hai perso!!");
        jfw.setSize(600,600);
        jfw.setLocationRelativeTo(null);
        jfw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfw.setResizable(false);
            //creo i Label
            //creo le immagini
        iGiusto=new ImageIcon("febbre10.GIF");
    
            //creo i bottoni e li assoocio  alle immagini
        bGiusto=new JButton(iGiusto);
        gl=new GridLayout(0,1);
            //associo il Layout al frame
        jfw.setLayout(gl);
       bGiusto.setBackground(Color.decode("#ffffff"));
            //aggiungo i componenti al frame
        jfw.add(bGiusto);  
        jfw.setVisible(true);  //rende il tutto VISIBILE
    }
}
