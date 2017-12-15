/*    */ package entities;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class Obsticle3 extends Objects
/*    */ {
/*    */   public Obsticle3(int x, int y, int width, int height)
/*    */   {
/*  9 */     super(x, y, width, height);
/* 10 */     this.entityPosX = x;
/* 11 */     this.entityPosY = y;
/* 12 */     this.entityWidth = width;
/* 13 */     this.entityHeight = height;
/*    */   }
/*    */   
/*    */   public void render(Graphics g)
/*    */   {
/* 18 */     g.drawImage(Animation.Assets.tombstone, this.entityPosX, this.entityPosY, this.entityWidth, this.entityHeight, null);
/*    */   }
/*    */   
/*    */   public void render2(Graphics g) {
/* 22 */     g.drawImage(Animation.Assets.tombstone, this.entityPosX, this.entityPosY, this.entityWidth, this.entityHeight, null);
/*    */   }
/*    */   
/*    */ 
/*    */   public void tick(int x, int y)
/*    */   {
/* 28 */     this.entityPosX -= x;
/* 29 */     this.entityPosY -= y;
/*    */   }
/*    */   
/*    */   public void tick()
/*    */   {
/* 34 */     throw new UnsupportedOperationException("Not supported yet.");
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Obsticle3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */