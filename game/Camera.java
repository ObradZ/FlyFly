/*    */ package game;
/*    */ 
/*    */ public class Camera { private int xOffset;
/*    */   private int yOffset;
/*    */   
/*  6 */   public Camera(int xOff, int yOff) { setxOffset(xOff);
/*  7 */     setyOffset(yOff);
/*    */   }
/*    */   
/* 10 */   public void moveCam(int mX, int mY) { this.xOffset += mX;
/* 11 */     this.yOffset += mY;
/*    */   }
/*    */   
/*    */   public int getxOffset() {
/* 15 */     return this.xOffset;
/*    */   }
/*    */   
/* 18 */   public void setxOffset(int xOffset) { this.xOffset = xOffset; }
/*    */   
/*    */   public int getyOffset() {
/* 21 */     return this.yOffset;
/*    */   }
/*    */   
/* 24 */   public void setyOffset(int yOffset) { this.yOffset = yOffset; }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/game/Camera.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */