/*    */ package Animation;
/*    */ 
/*    */ import java.awt.image.BufferedImage;
/*    */ 
/*    */ public class Animation {
/*    */   private BufferedImage[] frames;
/*    */   private long lastTime;
/*    */   private long timer;
/*    */   private int speed;
/*    */   private int index;
/*    */   
/*    */   public Animation(int speed, BufferedImage[] frames) {
/* 13 */     this.frames = frames;
/* 14 */     this.speed = speed;
/* 15 */     this.index = 0;
/* 16 */     this.timer = 0L;
/* 17 */     this.lastTime = System.currentTimeMillis();
/*    */   }
/*    */   
/* 20 */   public void tick() { this.timer += System.currentTimeMillis() - this.lastTime;
/* 21 */     this.lastTime = System.currentTimeMillis();
/* 22 */     if (this.timer > this.speed) {
/* 23 */       this.index += 1;
/* 24 */       this.timer = 0L;
/* 25 */       if (this.index >= this.frames.length)
/* 26 */         this.index = 0;
/*    */     }
/*    */   }
/*    */   
/*    */   public BufferedImage getCurrentImage() {
/* 31 */     return this.frames[this.index];
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/Animation/Animation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */