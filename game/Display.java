/*    */ package game;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import javax.swing.JFrame;
/*    */ 
/*    */ public class Display
/*    */ {
/*    */   private Canvas canvas;
/*    */   private JFrame frame;
/* 10 */   public static int displayHeight = 600; public static int displayWidth = 800;
/*    */   
/*    */ 
/*    */ 
/* 14 */   public Display() { setUpDisplay(); }
/*    */   
/*    */   public void setUpDisplay() {
/* 17 */     this.frame = new JFrame("FlappyBird");
/* 18 */     this.frame.setSize(displayWidth, displayHeight);
/* 19 */     this.frame.setLocationRelativeTo(null);
/* 20 */     this.frame.setDefaultCloseOperation(3);
/* 21 */     this.frame.setUndecorated(true);
/* 22 */     this.frame.setVisible(true);
/*    */     
/*    */ 
/* 25 */     this.canvas = new Canvas();
/* 26 */     this.canvas.setSize(new java.awt.Dimension(displayWidth, displayHeight));
/* 27 */     this.canvas.setPreferredSize(new java.awt.Dimension(displayWidth, displayHeight));
/* 28 */     this.canvas.setMaximumSize(new java.awt.Dimension(displayWidth, displayHeight));
/* 29 */     this.canvas.setMinimumSize(new java.awt.Dimension(displayWidth, displayHeight));
/* 30 */     this.canvas.setBackground(java.awt.Color.black);
/*    */     
/* 32 */     this.canvas.setFocusable(false);
/*    */     
/* 34 */     this.frame.add(this.canvas);
/* 35 */     this.frame.pack();
/*    */   }
/*    */   
/* 38 */   public Canvas getCanvas() { return this.canvas; }
/*    */   
/*    */   public JFrame getFrame() {
/* 41 */     return this.frame;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/game/Display.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */