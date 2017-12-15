/*    */ package Animation;
/*    */ 
/*    */ import java.awt.image.BufferedImage;
/*    */ 
/*    */ public class Assets { public static BufferedImage background;
/*    */   public static BufferedImage background1;
/*    */   public static BufferedImage background2;
/*  8 */   public static BufferedImage background3; public static BufferedImage background4; public static BufferedImage dirt; public static BufferedImage sun; public static BufferedImage crate; public static BufferedImage stone; public static BufferedImage tombstone; public static BufferedImage ghost; public static BufferedImage[] player = new BufferedImage[2];
/*    */   
/*    */   public static void avengersAssemlbe() {
/* 11 */     background = ImageLoader.getTexture("/background.png");
/* 12 */     sun = ImageLoader.getTexture("/sun.png");
/* 13 */     player[0] = ImageLoader.getTexture("/player.png");
/* 14 */     player[1] = ImageLoader.getTexture("/player2.png");
/* 15 */     crate = ImageLoader.getTexture("/crate.png");
/* 16 */     dirt = ImageLoader.getTexture("/dirt.png");
/* 17 */     stone = ImageLoader.getTexture("/stone.png");
/* 18 */     background2 = ImageLoader.getTexture("/universe.jpg");
/* 19 */     background3 = ImageLoader.getTexture("/background3.jpg");
/* 20 */     background1 = ImageLoader.getTexture("/background1.png");
/* 21 */     background4 = ImageLoader.getTexture("/background4.png");
/* 22 */     tombstone = ImageLoader.getTexture("/tombstone.png");
/* 23 */     ghost = ImageLoader.getTexture("/ghost.png");
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/Animation/Assets.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */