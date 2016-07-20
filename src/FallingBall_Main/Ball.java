package FallingBall_Main;

public class Ball {
    //Instance variables
    private int centerX;
    private int centerY;
    private int speedX;
    private int speedY;
    private int acceleration;
    
    public static final int riseSpeed = 5;
    public static final int initialFallingSpeed = -5;
    
    //Constructors
    /**
     * Empty constructor
     */
    public Ball() {
        centerX = GameConstants.STANDARD_BALL_CENTER_X;
        centerY = GameConstants.STANDARD_BALL_CENTER_Y;
        speedX = 0;
        speedY = 0;
        /* substitute previous ones by fall() ?? */
    }
    
    /**
     * Constructor by parameter
     * @param centerX 
     * @param centerY
     * @param speedX
     * @param speedY 
     */
    public Ball(int centerX, int centerY, int speedX, int speedY) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    //Methods
    public void update() {
        centerX = centerX + speedX;

        if (centerX < -5) {
            centerX = 485;
        } else if (centerX > 485) {
            centerX = -5;
        }

        centerY = centerY + speedY;

        if (centerY >= 735) {
            speedY = 0;
            centerY = 735;
        }
    }

    public void ir_direita() {
        speedX = 5;
    }

    public void ir_esquerda() {
        speedX = -5;
    }

    public void stop() {
        speedX = 0;
    }

    // Getters e Setters
    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }
    // getters e setters
    
    public void fall(){
        this.speedY = initialFallingSpeed;
    }
    
    public void rise(){
        this.speedY = riseSpeed;
    }
}
