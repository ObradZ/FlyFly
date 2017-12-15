/*   */ package entities;
/*   */ 
/*   */ import java.awt.Graphics;
/*   */ 
/*   */ public abstract class Creature extends Entity
/*   */ {
/*   */   public Creature(int x, int y, int width, int height) {
/* 8 */     super(x, y, width, height);
/*   */   }
/*   */   
/*   */   public abstract void render(Graphics paramGraphics);
/*   */   
/*   */   public abstract void tick();
/*   */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Creature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */