/*    */ package game;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferStrategy;
/*    */ import world.World;
/*    */ 
/*    */ public class Game implements Runnable
/*    */ {
/*    */   private Thread thread;
/*    */   private boolean running;
/*    */   private Display display;
/*    */   private BufferStrategy bs;
/*    */   private Graphics g;
/*    */   private World world;
/*    */   private Handler handler;
/*    */   
/*    */   public Game()
/*    */   {
/* 19 */     this.running = false;
/* 20 */     init();
/*    */   }
/*    */   
/* 23 */   public void init() { this.display = new Display();
/* 24 */     this.world = new World(this.display);
/* 25 */     this.handler = new Handler(this.world);
/* 26 */     this.display.getFrame().addKeyListener(this.world.getKeyManager());
/* 27 */     this.display.getFrame().addMouseMotionListener(this.world.getMouseL());
/* 28 */     this.display.getCanvas().addMouseMotionListener(this.world.getMouseL());
/*    */   }
/*    */   
/* 31 */   public void render() { this.bs = this.display.getCanvas().getBufferStrategy();
/* 32 */     if (this.bs == null) {
/* 33 */       this.display.getCanvas().createBufferStrategy(3);
/* 34 */       return;
/*    */     }
/*    */     
/* 37 */     this.g = this.bs.getDrawGraphics();
/* 38 */     java.awt.Toolkit.getDefaultToolkit().sync();
/* 39 */     this.g.clearRect(0, 0, Display.displayWidth, Display.displayHeight);
/*    */     
/* 41 */     this.world.render(this.g);
/*    */     
/*    */ 
/* 44 */     this.bs.show();
/* 45 */     this.g.dispose();
/*    */   }
/*    */   
/*    */   public void tick() {
/* 49 */     this.world.tick();
/*    */   }
/*    */   
/*    */   public void run() {
/* 53 */     int fps = 60;
/* 54 */     double timePerTick = 1000000000 / fps;
/*    */     
/* 56 */     long lastTime = System.nanoTime();
/* 57 */     double delta = 0.0D;
/* 58 */     double timer = 0.0D;
/* 59 */     int ticks = 0;
/* 60 */     while (this.running) {
/* 61 */       long now = System.nanoTime();
/* 62 */       delta += (now - lastTime) / timePerTick;
/* 63 */       timer += now - lastTime;
/* 64 */       lastTime = now;
/* 65 */       if (delta >= 1.0D) {
/* 66 */         render();
/* 67 */         tick();
/* 68 */         ticks++;
/* 69 */         delta -= 1.0D;
/*    */       }
/* 71 */       if (timer >= 1.0E9D) {
/* 72 */         System.out.println("FPS:" + ticks);
/* 73 */         ticks = 0;
/* 74 */         timer = 0.0D;
/*    */       }
/*    */     }
/* 77 */     stop();
/*    */   }
/*    */   
/*    */   public synchronized void start()
/*    */   {
/* 82 */     if (!this.running) {
/* 83 */       this.thread = new Thread(this);
/* 84 */       this.thread.start();
/* 85 */       this.running = true;
/*    */     }
/*    */   }
/*    */   
/* 89 */   public synchronized void stop() { if (this.running) {
/*    */       try {
/* 91 */         this.thread.join();
/*    */       } catch (InterruptedException e) {
/* 93 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/game/Game.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */