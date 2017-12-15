/*    */ package entities;
/*    */ 
/*    */ public class Colision
/*    */ {
/*    */   public static boolean getColision(Entity e1, Entity e2) {
/*  6 */     if ((e1.entityPosX < e2.entityPosX + e2.entityWidth) && (e1.entityPosX + e1.entityWidth > e2.entityPosX) && (e1.entityPosY < e2.entityPosY + e2.entityHeight) && (e1.entityPosY + e1.entityHeight > e2.entityPosY)) {
/*  7 */       return true;
/*    */     }
/*  9 */     return false;
/*    */   }
/*    */   
/* 12 */   public static boolean getPlayerColision(Entity player, Entity e2) { if ((player.entityPosX + 10 < e2.entityPosX + e2.entityWidth) && (player.entityPosX + player.entityWidth - 5 > e2.entityPosX) && (player.entityPosY + 2 < e2.entityPosY + e2.entityHeight) && (player.entityPosY + player.entityHeight - 16 > e2.entityPosY)) {
/* 13 */       return true;
/*    */     }
/* 15 */     return false;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/entities/Colision.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */