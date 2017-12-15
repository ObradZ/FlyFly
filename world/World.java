/*    */ package world;
/*    */ 
/*    */ import game.Camera;
/*    */ import game.Display;
/*    */ import input.KeyManager;
/*    */ import input.MouseListener;
/*    */ import java.awt.Graphics;
/*    */ import levels.Level;
/*    */ import levels.Level1;
/*    */ import levels.MainMenu;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class World
/*    */ {
/*    */   private Level level;
/*    */   private KeyManager keyManager;
/*    */   private Camera camera;
/*    */   private MouseListener mouseL;
/*    */   private MainMenu mm;
/*    */   
/*    */   public World(Display display)
/*    */   {
/* 25 */     this.level = new Level1(display);
/* 26 */     this.mm = new MainMenu(display);
/* 27 */     Level.setLevel(this.mm);
/*    */   }
/*    */   
/*    */   public void tick() {
/* 31 */     if (Level.getLevel() != null) {
/* 32 */       Level.getLevel().tick();
/*    */     }
/*    */   }
/*    */   
/*    */   public void render(Graphics g) {
/* 37 */     if (Level.getLevel() != null)
/* 38 */       Level.getLevel().render(g);
/*    */   }
/*    */   
/*    */   public KeyManager getKeyManager() {
/* 42 */     return this.keyManager;
/*    */   }
/*    */   
/* 45 */   public void setKeyManager(KeyManager keyManager) { this.keyManager = keyManager; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public MouseListener getMouseL()
/*    */   {
/* 52 */     return this.mouseL;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void setMouseL(MouseListener mouseL)
/*    */   {
/* 59 */     this.mouseL = mouseL;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/world/World.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */