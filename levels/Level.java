/*    */ package levels;
/*    */ 
/*    */ import game.Display;
/*    */ import input.KeyManager;
/*    */ 
/*    */ public abstract class Level
/*    */ {
/*    */   private static Level curLevel;
/*    */   protected Display d;
/*    */   
/*    */   public Level(Display display)
/*    */   {
/* 13 */     this.d = display;
/*    */   }
/*    */   
/*    */   public static void setLevel(Level level) {
/* 17 */     curLevel = level;
/*    */   }
/*    */   
/* 20 */   public static Level getLevel() { return curLevel; }
/*    */   
/*    */   public void setListeners(Display d, KeyManager km, input.MouseListener ml) {
/* 23 */     d.getFrame().addKeyListener(km);
/* 24 */     d.getFrame().addMouseMotionListener(ml);
/* 25 */     d.getCanvas().addMouseMotionListener(ml);
/*    */   }
/*    */   
/*    */   public abstract void tick();
/*    */   
/*    */   public abstract void render(java.awt.Graphics paramGraphics);
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/levels/Level.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */