/*    */ package levels;
/*    */ 
/*    */ import entities.Finish;
/*    */ import entities.Objects;
/*    */ import entities.Obsticle;
/*    */ import entities.Obsticle2;
/*    */ import entities.Obsticle3;
/*    */ import game.Display;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class CurrentLevel
/*    */ {
/*    */   private Finish finish;
/*    */   private int[][] obsticles;
/*    */   int width;
/*    */   int height;
/*    */   private ArrayList<Objects> obsticlesList;
/*    */   
/*    */   public CurrentLevel()
/*    */   {
/* 21 */     this.obsticlesList = new ArrayList();
/*    */   }
/*    */   
/*    */ 
/*    */   public void loadMap(String path)
/*    */   {
/* 27 */     String map = LevelLoader.getMap(path);
/* 28 */     String[] tiles = map.split("\\s+");
/* 29 */     this.width = LevelLoader.parseIntegerHere(tiles[1]);
/* 30 */     this.height = LevelLoader.parseIntegerHere(tiles[0]);
/* 31 */     this.obsticles = new int[this.height][this.width];
/* 32 */     for (int y = 0; y < this.height; y++) {
/* 33 */       for (int x = 0; x < this.width; x++) {
/* 34 */         this.obsticles[y][x] = LevelLoader.parseIntegerHere(tiles[(2 + x + y * this.width)]);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void setMap() {
/* 40 */     for (int y = 0; y < this.height; y++) {
/* 41 */       for (int x = 0; x < this.width; x++) {
/* 42 */         if (this.obsticles[y][x] == 1) {
/* 43 */           getObsticlesList().add(new Obsticle(x * Obsticle.WIDTH, y * Obsticle.HEIGHT, Obsticle.WIDTH, Obsticle.HEIGHT));
/* 44 */         } else if (this.obsticles[y][x] == 2)
/* 45 */           setFinish(new Finish(x * Obsticle.WIDTH, y * Obsticle.HEIGHT, 20, Display.displayHeight));
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void setMap2() {
/* 51 */     for (int y = 0; y < this.height; y++) {
/* 52 */       for (int x = 0; x < this.width; x++) {
/* 53 */         if (this.obsticles[y][x] == 1) {
/* 54 */           getObsticlesList().add(new Obsticle2(x * Obsticle2.WIDTH, y * Obsticle2.HEIGHT, Obsticle2.WIDTH, Obsticle2.HEIGHT));
/* 55 */         } else if (this.obsticles[y][x] == 2) {
/* 56 */           setFinish(new Finish(x * Obsticle2.WIDTH, y * Obsticle2.HEIGHT, 20, Display.displayHeight));
/* 57 */         } else if (this.obsticles[y][x] == 3) {
/* 58 */           getObsticlesList().add(new Obsticle3(x * Obsticle2.WIDTH, y * Obsticle2.HEIGHT, Obsticle2.WIDTH, Obsticle2.HEIGHT));
/* 59 */         } else if (this.obsticles[y][x] == 4) {
/* 60 */           getObsticlesList().add(new entities.Obsticle4(x * Obsticle2.WIDTH, y * Obsticle2.HEIGHT, Obsticle2.WIDTH, Obsticle2.HEIGHT));
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public ArrayList<Objects> getObsticlesList()
/*    */   {
/* 79 */     return this.obsticlesList;
/*    */   }
/*    */   
/*    */   public void setObsticlesList(ArrayList<Objects> obsticlesList) {
/* 83 */     this.obsticlesList = obsticlesList;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public Finish getFinish()
/*    */   {
/* 90 */     return this.finish;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void setFinish(Finish finish)
/*    */   {
/* 97 */     this.finish = finish;
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/levels/CurrentLevel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */