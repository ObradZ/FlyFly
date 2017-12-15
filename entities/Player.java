/*    */ package entities;
/*    */ 
/*    */ import Animation.Animation;
/*    */ import Animation.Assets;
/*    */ import input.KeyManager;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class Player extends Creature
/*    */ {
/*    */   private KeyManager keym;
/*    */   private Animation flying;
/*    */   
/*    */   public Player(KeyManager km, int x, int y, int width, int height)
/*    */   {
/* 15 */     super(x, y, width, height);
/* 16 */     this.keym = km;
/* 17 */     this.flying = new Animation(300, Assets.player);
/*    */   }
/*    */   
/*    */   public void render(Graphics g)
/*    */   {
/* 22 */     g.drawImage(this.flying.getCurrentImage(), this.entityPosX, this.entityPosY, this.entityWidth, this.entityHeight, null);
/*    */   }
/*    */   
/*    */   public void tick()
/*    */   {
/* 27 */     this.flying.tick();
/* 28 */     if (this.keym.isUp()) {
/* 29 */       this.entityPosY -= 5;
/*    */     }
/* 31 */     if (getPosY() < game.Display.displayHeight - 35) {
/* 32 */       this.entityPosY += 3;
/*    */     }
/*    */     
/* 35 */     if (this.entityPosY < 0)
/* 36 */       this.entityPosY = 0;
/*    */   }
/*    */   
/*    */   public int getPosX() {
/* 40 */     return this.entityPosX;
/*    */   }
/*    */   
/*    */   public int getPosY() {
/* 44 */     return this.entityPosY;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Player.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */