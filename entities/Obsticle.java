/*    */ package entities;
/*    */ 
/*    */ import Animation.Assets;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class Obsticle extends Objects
/*    */ {
/*  8 */   public static int HEIGHT = 120; public static int WIDTH = 60;
/*    */   
/* 10 */   public Obsticle(int x, int y, int width, int height) { super(x, y, width, height);
/* 11 */     this.entityPosX = x;
/* 12 */     this.entityPosY = y;
/* 13 */     this.entityWidth = width;
/* 14 */     this.entityHeight = height;
/*    */   }
/*    */   
/*    */   public void render(Graphics g)
/*    */   {
/* 19 */     g.drawImage(Assets.crate, this.entityPosX, this.entityPosY, this.entityWidth, this.entityHeight, null);
/*    */   }
/*    */   
/*    */   public void tick(int x, int y) {
/* 23 */     this.entityPosX -= x;
/* 24 */     this.entityPosY -= y;
/*    */   }
/*    */   
/*    */   public int getxPos() {
/* 28 */     return this.entityPosX;
/*    */   }
/*    */   
/*    */   public void setxPos(int xPos) {
/* 32 */     this.entityPosX = xPos;
/*    */   }
/*    */   
/*    */   public int getyPos() {
/* 36 */     return this.entityPosY;
/*    */   }
/*    */   
/*    */   public void setyPos(int yPos) {
/* 40 */     this.entityPosY = yPos;
/*    */   }
/*    */   
/*    */   public void tick()
/*    */   {
/* 45 */     throw new UnsupportedOperationException("Not supported yet.");
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Obsticle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */