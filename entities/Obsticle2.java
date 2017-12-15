/*    */ package entities;
/*    */ 
/*    */ import Animation.Assets;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class Obsticle2 extends Objects
/*    */ {
/*  8 */   public static int HEIGHT = 60; public static int WIDTH = 60;
/*    */   
/* 10 */   public Obsticle2(int x, int y, int width, int height) { super(x, y, width, height);
/* 11 */     this.entityPosX = x;
/* 12 */     this.entityPosY = y;
/* 13 */     this.entityWidth = width;
/* 14 */     this.entityHeight = height;
/*    */   }
/*    */   
/*    */   public void render(Graphics g)
/*    */   {
/* 19 */     g.drawImage(Assets.stone, this.entityPosX, this.entityPosY, this.entityWidth, this.entityHeight, null);
/*    */   }
/*    */   
/*    */   public void render2(Graphics g)
/*    */   {
/* 24 */     g.drawImage(Assets.dirt, this.entityPosX, this.entityPosY, this.entityWidth, this.entityHeight, null);
/*    */   }
/*    */   
/*    */ 
/*    */   public void tick(int x, int y)
/*    */   {
/* 30 */     this.entityPosX -= x;
/* 31 */     this.entityPosY -= y;
/*    */   }
/*    */   
/*    */   public void tick()
/*    */   {
/* 36 */     throw new UnsupportedOperationException("Not supported yet.");
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Obsticle2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */