/*    */ package entities;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public abstract class Entity { protected int entityHeight;
/*    */   protected int entityWidth;
/*  7 */   public static int ENTITY_HEIGHT = 75; public static int ENTITY_WIDTH = 75;
/*    */   protected int entityPosY;
/*    */   
/* 10 */   public Entity(int x, int y, int width, int height) { this.entityPosX = x;
/* 11 */     this.entityPosY = y;
/* 12 */     this.entityHeight = height;
/* 13 */     this.entityWidth = width;
/*    */   }
/*    */   
/*    */   protected int entityPosX;
/*    */   public abstract void render(Graphics paramGraphics);
/*    */   
/*    */   public abstract void tick();
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Entity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */