/*    */ package entities;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class Obsticle4 extends Objects
/*    */ {
/*    */   private int speed;
/*    */   
/*    */   public Obsticle4(int x, int y, int width, int height)
/*    */   {
/* 11 */     super(x, y, width, height);
/* 12 */     this.entityPosX = x;
/* 13 */     this.entityPosY = y;
/* 14 */     this.entityWidth = width;
/* 15 */     this.entityHeight = height;
/* 16 */     this.speed = 2;
/*    */   }
/*    */   
/*    */   public void render(Graphics g)
/*    */   {
/* 21 */     g.drawImage(Animation.Assets.ghost, this.entityPosX, this.entityPosY, this.entityWidth, this.entityHeight, null);
/*    */   }
/*    */   
/*    */   public void render2(Graphics g) {
/* 25 */     g.drawImage(Animation.Assets.ghost, this.entityPosX, this.entityPosY, this.entityWidth, this.entityHeight, null);
/*    */   }
/*    */   
/*    */ 
/*    */   public void tick(int x, int y)
/*    */   {
/* 31 */     this.entityPosX -= x;
/* 32 */     if ((this.entityPosY > game.Display.displayHeight - 58) || (this.entityPosY < 0))
/* 33 */       this.speed *= -1;
/* 34 */     this.entityPosY += this.speed;
/*    */   }
/*    */   
/*    */   public void tick()
/*    */   {
/* 39 */     throw new UnsupportedOperationException("Not supported yet.");
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Obsticle4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */