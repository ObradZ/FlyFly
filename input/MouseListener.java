/*    */ package input;
/*    */ 
/*    */ import java.awt.event.MouseEvent;
/*    */ 
/*    */ public class MouseListener implements java.awt.event.MouseMotionListener
/*    */ {
/*    */   private int x;
/*    */   private int y;
/*    */   
/*    */   public MouseListener()
/*    */   {
/* 12 */     this.x = 0;
/* 13 */     this.y = 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public void mouseDragged(MouseEvent e) {}
/*    */   
/*    */   public void mouseMoved(MouseEvent e)
/*    */   {
/* 21 */     this.x = e.getX();
/* 22 */     this.y = e.getY();
/*    */   }
/*    */   
/*    */   public int getX()
/*    */   {
/* 27 */     return this.x;
/*    */   }
/*    */   
/*    */   public int gety() {
/* 31 */     return this.y;
/*    */   }
/*    */   
/*    */   public void sety(int y)
/*    */   {
/* 36 */     this.y = y;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/input/MouseListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */