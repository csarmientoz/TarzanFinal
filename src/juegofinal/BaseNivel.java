/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegofinal;

import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import javax.swing.JPanel;

public class BaseNivel extends JFrame{

    public BaseNivel() {
        add(new NewPanel());
    }
    public static void main(String[] args) {
        BaseNivel frame= new BaseNivel();
        frame.setTitle("Nivel 1");
        frame.setSize(1500 , 600);
        frame.setLocationRelativeTo(null); //Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    }
class NewPanel extends JPanel implements ActionListener, MouseListener{
    private int x;
    private int y=400;
    private Timer timer;
    private int secuencia;
    private int secuencia2;
    private int secuencia3;
    private int z;
    private int k;
    private int pbananas;
    private int qbananas;
    private Rectangle[] bana;
    private boolean Sboton=true;
    private boolean Bsalto=false;

    public NewPanel() {
        this.addMouseListener(this);
        addKeyListener(new TAdapter());
        setFocusable(true);
        timer= new Timer(80, this);
        timer.start();
        this.z=400;
        this.bana= new Rectangle[70];
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x+250, y, 100, 150);
    }
    
    public void checkCollision(){
    Rectangle tarzan= getBounds();
    Rectangle[] rah= new Rectangle[70];
        for (int i = 0; i < 10; i++) {
    //rah[i]= new Rectangle(bananos[i].getX(), bananos[i].getY(), 60, 80);        
        }
    
    Rectangle objeto2= new Rectangle(20, z+0, 20, 50); 
    //if(tanque.intersects(objeto)||tanque.intersects(objeto2)){
     //   System.out.println("Colision");
        //timer.stop();
        //}
    }

    @Override
    protected void paintComponent(Graphics g){
        
       super.paintComponent(g);
//        int k=0;
//        for (int i = 0; i < 1000; i++) {  
//        Image fondo= loadImage("blue_background.png");
//        g.drawImage(fondo, k, 0, null);
//        k+=22;
//        }
    Image fondo=loadImage("forest-background.png");
    Image piso=loadImage("lea.png");
    for(int i=0; i<300; i++){   
        g.drawImage(fondo,k+(i*699),0,699,500,this);
        g.drawImage(piso, k+(i*300), 500, 300, 700,this);
    }
    
    //g.drawImage(piso, k+300, 500, 300, 700,this);
    
    //
    
    Random x1=new Random();
    Random y1= new Random();
    
    
    Troncos[] troncos=new Troncos[100];
    //p=0;
    //q=470;
    Random[] jadhha=new Random[70];
        
    Image trnc = loadImage("short.png");
    for(int i=0;i<70;i++){
    
    troncos[i]=new Troncos(k+(i*300), 470);

    g.drawImage(trnc, k+(i*300), 470, 40, 60, this);
            
            
    //Rectangle tronco= new Rectangle(p+(i*40), y, WIDTH, HEIGHT)
    //p+=300;
    }
    Random ban=new Random();
    int s=(int)(Math.random() * 1500)+1;
    int r=450;
    int po=60;
            
            Image bananas = loadImage("Bananita.png");
            
          //  Rectangle Trazan= new Rectagle();
            //g.drawImage(bananas, s, r, s+60, r+80, (this.secuencia2*388), 0,(this.secuencia2*388)+388, 422, this);
            Bananas bananos[]=new Bananas [70];
            for (int j = 0; j < 70; j++) {
            bananos[j]= new Bananas(k+(po*300),r);
                g.drawImage(bananas,bananos[j].getX(), r, 60, 80,this);
            //    rah[j]= new Rectangle(bananos[j].getX(), bananos[j].getY(), 60, 80);
                
            }
           
    
     Tarzan t= new Tarzan(y, x+250, bananos);

     if(Sboton==false){   
     Image personaje= loadImage("ANA(2).png");
     g.drawImage(personaje, x+250, y, x+350, y+190, (this.secuencia*295), 0,(this.secuencia*295)+260, 529, this);
     }else if(Bsalto==true){
     Image salto= loadImage("jump.png");
     g.drawImage(salto, x+250, y-50, x+350, y+150, (this.secuencia*1400), 0,(this.secuencia*1410)+1340, 3629, this);
     }if(Sboton==true){
         Image sostenido= loadImage("5.png");
    g.drawImage(sostenido, x+250, y,100, 150, this);}
//     if(y<z&&y>100){
//         Image sostenido= loadImage("5.png");
//    g.drawImage(sostenido, x+250, y,x+350, y+150,0,0,1240,2055, this);
//     }     
     
    //    Image moneda= loadImage("FullCoins.png");
        //g.drawImage(moneda, );
//        Image gato= loadImage("cats.gif");

//        g.drawImage(gato, x, 360, x+132, 440, (this.secuencia*132), 0, (this.secuencia*132)+132, 80, this);
g.setColor(Color.WHITE);
g.fillRect(1250, 30, 100, 70);
g.setColor(Color.BLACK);
String as= "Puntaje: "+t.getContador();
     g.drawString(as, 1270, 50);
     
    }
    public Image loadImage (String imageName){
        ImageIcon ii= new ImageIcon(imageName);
        Image image= ii.getImage();
        return image;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x<900){
        //x+=5;
        //k-=10;
        //x-=5;
        //p-=10;
        }
        if (y<z){
        y+=10;
        }
        
        if(this.secuencia ==5){
            this.secuencia=0;
        }else{
            this.secuencia++;
        }
        if(this.secuencia3==3.5){
            this.secuencia3=0;
        }else{
            this.secuencia+=0.7;
        }
        if(this.secuencia2 ==1){
            this.secuencia2=0;
        }else{
            this.secuencia2++;
        }
//        if(z<500){
//            z+=5;
//        
//   }
        checkCollision();
        repaint();
    }
    
    private class TAdapter extends KeyAdapter{
    
        public void keyReleased(KeyEvent e){
            System.out.println("Soltó el botón");
            Bsalto=false;
            Sboton=true;
        }
        public void keyPressed(KeyEvent e){
            System.out.println("Presionó el botón");
            Sboton=false;
            int key= e.getKeyCode();
            if(key==KeyEvent.VK_SPACE){

                    y-=100;
            }
            if(key==KeyEvent.VK_LEFT){
                k=k+5;
            }
            if(key==KeyEvent.VK_RIGHT){
                k=k-5;
            }
            if(key==KeyEvent.VK_UP){
                Bsalto=true;
                 if(y>399){                   
                 for (int i = 0; i < 10; i++) {
                y=y-8;
                k=k-5;  
//                   try{
//                     Thread.sleep(100);
//                 }catch(Exception er){
//                     
//                     er.printStackTrace();
//                 }
                
                }
                 }
           
                /*for (int i = 0; i < 5; i++) {
                y=y+5;
                repaint();
                }*/
                
            }
//            if(key==KeyEvent.VK_DOWN){
//                y=y+10;
//            }
//            
        }
         public void KeyReleased(KeyEvent e){
               int key= e.getKeyCode();
               if(key==KeyEvent.VK_DOWN){
               y=y+10;
               }
                   
                 
                 
                 
                 }
      
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println("Usted ha clickeado");
       Point mp=e.getPoint();
       if(getBounds().contains(mp)){
           this.timer.stop();
           
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
