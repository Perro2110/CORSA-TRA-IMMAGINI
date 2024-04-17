/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsatraimmagini;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Immagine extends Thread
{ 
    Image img;
    protected int x, y, lunghezza, larghezza;
    protected boolean visible;
    

    public Immagine(String nomeImmagine, int x, int y, int lunghezza, int larghezza, boolean visible)
    { 
        this.img = new ImageIcon(nomeImmagine).getImage();
        //this.img =new ImageIcon(getClass().getResource(nomeImmagine)).getImage();
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.x = x;
        this.y = y;
        this.visible = visible;    
    }

    public Immagine(String nomeImmagine, int x, int y) {
        
        this.img =new ImageIcon(getClass().getResource(nomeImmagine)).getImage();
        this.x = x;
        this.y = y;
    }
    public Immagine (String nomeImmagine)
    {
    
    
      String nomep="/"+nomeImmagine;
    
      this.img=new ImageIcon(Immagine.class.getResource(nomep)).getImage();
      this.x=50;
      this.y=50;
      this.larghezza=40;
      this.lunghezza=80;
        
    }

    public int getlunghezza()
    {
        return lunghezza;
    }

    public void setlunghezza(int lunghezza)
    {
        this.lunghezza = lunghezza;
    }

    public int getlarghezza()
    {
        return larghezza;
    }

    public void setlarghezza(int larghezza)
    {
        this.larghezza = larghezza;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }   
    
    public boolean isVisible()
    {
	return visible;
    }

    public void setVisible(boolean visible)
    {
	this.visible = visible;
    }
    
   /* public Rectangle GetBounds()
    {
        return (new Rectangle(x, y, lunghezza, larghezza) );
    }*/

    public void disegna(Graphics g)
    {
        g.drawImage(img,x,y,larghezza,lunghezza,null);
    }

    public Image getImg() 
    {
        return img;
    }

    public void setImg(Image img) 
    {
        this.img = img;
    }

    public int getLunghezza() 
    {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) 
    {
        this.lunghezza = lunghezza;
    }

    public int getLarghezza() 
    {
        return larghezza;
    }

    public void setLarghezza(int larghezza) 
    {
        this.larghezza = larghezza;
    }
    public void sposta(int dx, int dy)
    {
        this.x=this.x+dx; this.y=this.y+dy;
    }
    public void spostax(int dx)
    {
        this.x=this.x+dx; 
    }
    public void spostay(int dy)
    {
        this.y=this.y+dy; 
    }
    public void spostasu()
    {
        this.y-=10;
    }
    public void spostaDx(float dx)
    {
        this.x+=dx;
    }
    public void spostaSx(int dx)
    {
        this.x-=dx;
    }
        
}