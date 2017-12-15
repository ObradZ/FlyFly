/*    */ package levels;
/*    */ 
/*    */ import game.Display;
/*    */ import input.KeyManager;
/*    */ import input.MouseListener;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class MainMenu extends Level
/*    */ {
/*    */   private KeyManager km;
/*    */   private MouseListener ml;
/*    */   private Display display;
/*    */   
/*    */   public MainMenu(Display display)
/*    */   {
/* 17 */     super(display);
/* 18 */     this.km = new KeyManager();
/* 19 */     this.ml = new MouseListener();
/* 20 */     this.d.getCanvas().addMouseMotionListener(this.ml);
/* 21 */     this.d.getFrame().addKeyListener(this.km);
/*    */   }
/*    */   
/*    */   public void tick()
/*    */   {
/* 26 */     if (this.km.isStart()) {
/* 27 */       Level.setLevel(new Level1(this.d));
/*    */     }
/* 29 */     if (this.km.isExit()) {
/* 30 */       System.exit(0);
/*    */     }
/* 32 */     if (this.km.isFirst())
/* 33 */       Level.setLevel(new Level1(this.d));
/* 34 */     if (this.km.isSecund())
/* 35 */       Level.setLevel(new Level2(this.d));
/* 36 */     if (this.km.isThird())
/* 37 */       Level.setLevel(new Level3(this.d));
/* 38 */     if (this.km.isForth())
/* 39 */       Level.setLevel(new Level4(this.d));
/*    */   }
/*    */   
/*    */   public void render(Graphics g) {
/* 43 */     g.drawImage(Animation.Assets.background, 0, 0, null);
/* 44 */     g.setColor(Color.black);
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/levels/MainMenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */