/*    */ package levels;
/*    */ 
/*    */ import Animation.Assets;
/*    */ import entities.Colision;
/*    */ import entities.Finish;
/*    */ import entities.Objects;
/*    */ import entities.Player;
/*    */ import entities.Score;
/*    */ import game.Display;
/*    */ import input.KeyManager;
/*    */ import input.MouseListener;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class Level1 extends Level
/*    */ {
/*    */   private Player player;
/*    */   private KeyManager km;
/*    */   private MouseListener ml;
/*    */   private Score score;
/*    */   private Display display;
/*    */   private boolean over;
/*    */   private CurrentLevel currentLevel;
/*    */   
/*    */   public Level1(Display display)
/*    */   {
/* 26 */     super(display);
/* 27 */     this.over = false;
/* 28 */     this.display = display;
/* 29 */     Assets.avengersAssemlbe();
/* 30 */     this.km = new KeyManager();
/* 31 */     this.score = new Score();
/* 32 */     this.ml = new MouseListener();
/* 33 */     this.currentLevel = new CurrentLevel();
/* 34 */     this.player = new Player(this.km, 100, 200, 70, 53);
/* 35 */     this.d.getFrame().addKeyListener(this.km);
/* 36 */     this.d.getCanvas().addMouseMotionListener(this.ml);
/* 37 */     this.currentLevel.loadMap("/level1.txt");
/* 38 */     this.currentLevel.setMap();
/*    */   }
/*    */   
/*    */   public void render(Graphics g)
/*    */   {
/* 43 */     g.drawImage(Assets.background1, 0, 0, null);
/*    */     
/* 45 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 46 */       o.render(g);
/*    */     }
/*    */     
/* 49 */     this.score.render(g);
/* 50 */     this.currentLevel.getFinish().render(g);
/* 51 */     this.player.render(g);
/*    */   }
/*    */   
/*    */   public void tick()
/*    */   {
/* 56 */     this.km.tick();
/* 57 */     if (this.km.isMenu()) {
/* 58 */       Level.setLevel(new MainMenu(this.d));
/*    */     }
/* 60 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 61 */       o.tick(2, 0);
/*    */     }
/* 63 */     this.currentLevel.getFinish().tick(2, 0);
/* 64 */     this.player.tick();
/* 65 */     if (Colision.getColision(this.player, this.currentLevel.getFinish())) {
/* 66 */       Level.setLevel(new Level2(this.display));
/*    */     }
/* 68 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 69 */       if (Colision.getPlayerColision(this.player, o)) {
/* 70 */         Level.setLevel(new Level1(this.display));
/*    */       }
/*    */     }
/* 73 */     this.score.tick();
/* 74 */     if (this.km.isExit()) {
/* 75 */       System.exit(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/levels/Level1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */