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
/*    */ public class Level4 extends Level
/*    */ {
/*    */   private Player player;
/*    */   private KeyManager km;
/*    */   private input.MouseListener ml;
/*    */   private Score score;
/*    */   private Display display;
/*    */   private boolean over;
/*    */   private CurrentLevel currentLevel;
/*    */   
/*    */   public Level4(Display display)
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
/* 34 */     this.currentLevel.loadMap("/level4.txt");
/* 35 */     this.currentLevel.setMap2();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void tick()
/*    */   {
/* 42 */     this.km.tick();
/* 43 */     if (this.km.isMenu()) {
/* 44 */       Level.setLevel(new MainMenu(this.d));
/*    */     }
/* 46 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 47 */       o.tick(2, 0);
/*    */     }
/* 49 */     this.currentLevel.getFinish().tick(2, 0);
/* 50 */     this.player.tick();
/* 51 */     if (Colision.getColision(this.player, this.currentLevel.getFinish())) {
/* 52 */       Level.setLevel(new MainMenu(this.display));
/*    */     }
/* 54 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 55 */       if (Colision.getPlayerColision(this.player, o)) {
/* 56 */         Level.setLevel(new Level4(this.display));
/*    */       }
/*    */     }
/* 59 */     this.score.tick();
/* 60 */     if (this.km.isExit()) {
/* 61 */       System.exit(0);
/*    */     }
/*    */   }
/*    */   
/*    */   public void render(Graphics g)
/*    */   {
/* 67 */     g.drawImage(Assets.background4, 0, 0, null);
/* 68 */     for (Objects o : this.currentLevel.getObsticlesList()) {
/* 69 */       o.render2(g);
/*    */     }
/* 71 */     this.score.render2(g);
/* 72 */     this.currentLevel.getFinish().render(g);
/* 73 */     this.player.render(g);
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/levels/Level4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */