/*    */ package entities;
/*    */ 
/*    */ import Animation.Assets;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ 
/*    */ public class Finish
/*    */   extends Objects
/*    */ {
/*    */   public Finish(int x, int y, int width, int height)
/*    */   {
/* 12 */     super(x, y, width, height);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void render(Graphics g)
/*    */   {
/* 19 */     g.drawImage(Assets.sun, this.entityPosX - 100, 150, 150, 150, null);
/*    */   }
/*    */   
/*    */ 
/*    */   public void tick() {}
/*    */   
/*    */   public void tick(int x, int y)
/*    */   {
/* 27 */     this.entityPosX -= x;
/* 28 */     this.entityPosY -= y;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Finish.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */