/*    */ package levels;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ 
/*    */ public class LevelLoader
/*    */ {
/*    */   public static String getMap(String path)
/*    */   {
/* 15 */     BufferedReader br = null;
/*    */     try
/*    */     {
/* 18 */       InputStream is = LevelLoader.class.getResourceAsStream(path);
/* 19 */       StringBuilder sb = new StringBuilder();
/* 20 */       br = new BufferedReader(new InputStreamReader(is));
/* 21 */       String line; while ((line = br.readLine()) != null)
/* 22 */         sb.append(line + "\n");
/* 23 */       return sb.toString();
/*    */     } catch (FileNotFoundException ex) {
/* 25 */       Logger.getLogger(LevelLoader.class.getName()).log(Level.SEVERE, null, ex);
/*    */     } catch (IOException ex) {
/* 27 */       Logger.getLogger(LevelLoader.class.getName()).log(Level.SEVERE, null, ex);
/*    */     } finally {
/*    */       try {
/* 30 */         br.close();
/*    */       } catch (IOException ex) {
/* 32 */         Logger.getLogger(LevelLoader.class.getName()).log(Level.SEVERE, null, ex);
/*    */       }
/*    */     }
/* 35 */     return "";
/*    */   }
/*    */   
/*    */   public static int parseIntegerHere(String s) {
/*    */     try {
/* 40 */       return Integer.parseInt(s);
/*    */     } catch (NumberFormatException ne) {
/* 42 */       ne.getMessage();
/*    */     }
/* 44 */     return 6;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/levels/LevelLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */