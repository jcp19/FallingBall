package FallingBall_Main;

public class Bola {
    //Instance variables
    private int centerX;
    private int centerY;
    private int speedX;
    private int speedY;
    
    //Constructors
    /**
     * Empty constructor
     */
    public Bola() {
        centerX = 240;
        centerY = 200;
        speedX = 0;
        speedY = 0;
    }
    
    /**
     * Constructor by parameter
     * @param centerX 
     * @param centerY
     * @param speedX
     * @param speedY 
     */
    public Bola(int centerX, int centerY, int speedX, int speedY) {
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
}
