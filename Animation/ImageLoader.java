/*    */ package Animation;
/*    */ 
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import javax.imageio.ImageIO;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ImageLoader
/*    */ {
/*    */   public static BufferedImage getTexture(String path)
/*    */   {
/*    */     try
/*    */     {
/* 16 */       File file = new File(path);
/*    */       
/*    */ 
/* 19 */       return ImageIO.read(ImageLoader.class.getResource(path));
/*    */     } catch (IOException ex) {
/* 21 */       ex.getMessage();
/*    */     }
/* 23 */     return null;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/Animation/ImageLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */