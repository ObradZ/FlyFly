/*    */ package entities;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Score
/*    */ {
/*    */   private int score;
/*    */   
/* 12 */   public Score() { this.score = 0; }
/*    */   
/*    */   public void render(Graphics g) {
/* 15 */     g.setColor(Color.black);
/* 16 */     g.setFont(new java.awt.Font("Sans", 1, 26));
/* 17 */     g.drawString("Time: " + this.score / 100, 10, 30);
/*    */   }
/*    */   
/* 20 */   public void render2(Graphics g) { g.setColor(Color.white);
/* 21 */     g.setFont(new java.awt.Font("Sans", 1, 26));
/* 22 */     g.drawString("Time: " + this.score / 100, 10, 30);
/*    */   }
/*    */   
/* 25 */   public void tick() { this.score += 1; }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Score.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */