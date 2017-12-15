/*     */ package input;
/*     */ 
/*     */ import java.awt.event.KeyEvent;
/*     */ 
/*     */ public class KeyManager implements java.awt.event.KeyListener {
/*     */   boolean[] keys;
/*     */   private boolean left;
/*     */   
/*     */   public KeyManager() {
/*  10 */     this.keys = new boolean['Ā'];
/*     */   }
/*     */   
/*     */   public void tick() {
/*  14 */     setLeft(this.keys[65]);
/*  15 */     setRight(this.keys[68]);
/*  16 */     setUp(this.keys[32]);
/*     */   }
/*     */   
/*     */   public void keyPressed(KeyEvent e) {
/*  20 */     this.keys[e.getKeyCode()] = true;
/*     */   }
/*     */   
/*     */ 
/*     */   public void keyReleased(KeyEvent e)
/*     */   {
/*  26 */     this.keys[e.getKeyCode()] = false;
/*     */     
/*  28 */     if (e.getKeyCode() == 77) {
/*  29 */       this.menu = true;
/*     */     }
/*  31 */     if (e.getKeyCode() == 32)
/*  32 */       setStart(true);
/*  33 */     if (e.getKeyCode() == 27)
/*  34 */       setExit(true);
/*  35 */     if (e.getKeyCode() == 49)
/*  36 */       this.first = true;
/*  37 */     if (e.getKeyCode() == 50)
/*  38 */       this.secund = true;
/*  39 */     if (e.getKeyCode() == 51)
/*  40 */       this.third = true;
/*  41 */     if (e.getKeyCode() == 52) {
/*  42 */       this.forth = true;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void keyTyped(KeyEvent e) {}
/*     */   
/*     */   public boolean isLeft()
/*     */   {
/*  51 */     return this.left;
/*     */   }
/*     */   
/*  54 */   public void setLeft(boolean left) { this.left = left; }
/*     */   
/*     */   public boolean isRight() {
/*  57 */     return this.right;
/*     */   }
/*     */   
/*  60 */   public void setRight(boolean right) { this.right = right; }
/*     */   
/*     */   private boolean right;
/*     */   private boolean start;
/*     */   private boolean menu;
/*     */   private boolean up;
/*     */   private boolean exit;
/*     */   private boolean first;
/*     */   private boolean secund;
/*     */   private boolean third;
/*     */   private boolean forth;
/*     */   public boolean isMenu()
/*     */   {
/*  73 */     return this.menu;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setMenu(boolean menu)
/*     */   {
/*  80 */     this.menu = menu;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isUp()
/*     */   {
/*  87 */     return this.up;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setUp(boolean up)
/*     */   {
/*  94 */     this.up = up;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isStart()
/*     */   {
/* 101 */     return this.start;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setStart(boolean start)
/*     */   {
/* 108 */     this.start = start;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isExit()
/*     */   {
/* 115 */     return this.exit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setExit(boolean exit)
/*     */   {
/* 122 */     this.exit = exit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isFirst()
/*     */   {
/* 129 */     return this.first;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isSecund()
/*     */   {
/* 136 */     return this.secund;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isThird()
/*     */   {
/* 143 */     return this.third;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isForth()
/*     */   {
/* 150 */     return this.forth;
/*     */   }
/*     */ }


/* Location:              /home/javabrat/Desktop/FlyFly.jar!/input/KeyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */