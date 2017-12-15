/*    */ package levels;
/*    */ 
/*    */ import Animation.Assets;
/*    */ import entities.Colision;
/*    */ import entities.Objects;
/*    */ import entities.Player;
/*    */ import entities.Score;
/*    */ import game.Display;
/*    */ import input.KeyManager;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class Level2 extends Level
/*    */ {
/*    */   private Player player;
/*    */   private KeyManager km;
/*    */   private input.MouseListener ml;
/*    */   private Score score;
/*    */   private Display display;
/*    */   private boolean over;
/*    */   private CurrentLevel currentLevel;
/*    */   
/*    */   public Level2(Display display)
/*    */   {
/* 24 */     super(display);
/* 25 */     this.display = display;
/* 26 */     Assets.avengersAssemlbe();
/* 27 */     this.km = new KeyManager();
/* 28 */     this.score = new Score();
/* 29 */     this.ml = new input.MouseListener();
/* 30 */     this.currentLevel = new CurrentLevel();
/* 31 */     this.player = new Player(this.km, 100, 200, 70, 53);
/* 32 */     this.d.getFrame().addKeyListener(this.km);
/* 33 */     this.d.getCanvas().addMouseMotionListener(this.ml);
/* 34 */     this.currentLevel.loadMap("/level2.txt");
/* 35 */     this.currentLevel.setMap();
/*    */   }
/*    */   
/*    */ 
/*    */   public void tick()
/*    */   {
/* 41 */     this.km.tick();
/* 42 */     if (this.km.isMenu()) {
/* 43 */       Level.setLevel(new MainMenu(this.d));
/*    */     }
/* 45 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 46 */       o.tick(2, 0);
/*    */     }
/* 48 */     this.currentLevel.getFinish().tick(2, 0);
/* 49 */     this.player.tick();
/* 50 */     if (Colision.getColision(this.player, this.currentLevel.getFinish())) {
/* 51 */       Level.setLevel(new Level3(this.display));
/*    */     }
/* 53 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 54 */       if (Colision.getPlayerColision(this.player, o)) {
/* 55 */         Level.setLevel(new Level2(this.display));
/*    */       }
/*    */     }
/* 58 */     this.score.tick();
/* 59 */     if (this.km.isExit()) {
/* 60 */       System.exit(0);
/*    */     }
/*    */   }
/*    */   
/*    */   public void render(Graphics g)
/*    */   {
/* 66 */     g.drawImage(Assets.background2, 0, 0, null);
/* 67 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 68 */       o.render(g);
/*    */     }
/* 70 */     this.score.render2(g);
/* 71 */     this.currentLevel.getFinish().render(g);
/* 72 */     this.player.render(g);
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/levels/Level2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */