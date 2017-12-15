/*   */ package entities;
/*   */ 
/*   */ import java.awt.Graphics;
/*   */ 
/*   */ public abstract class Objects extends Entity
/*   */ {
/*   */   public Objects(int x, int y, int width, int height) {
/* 8 */     super(x, y, width, height);
/*   */   }
/*   */   
/*   */   public abstract void render(Graphics paramGraphics);
/*   */   
/*   */   public void render2(Graphics g) {}
/*   */   
/*   */   public abstract void tick(int paramInt1, int paramInt2);
/*   */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Objects.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */