import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarP1 extends Actor
{
     final int BAR_WIDTH = 500; // the color portion of the bar
    final int BAR_HEIGHT = 50; // the color portion of the bar
    final int BREAK_PERCENT = 20; // the percentage amount that changes the color of the bar
    final boolean BREAK_LOW = true; // true: with low-percent values bar is red, else green; false: vise versa
    final Color SAFE_COLOR = Color.GREEN;
    final Color DANGER_COLOR = Color.RED;
     
    int value = 0; // updated value of bar
    int lastValue = 0; // previously recorded value of bar
    int maxValue = 0; // the maximum value of bar
    String refName = ""; // the title string (who or what the meter/bar is for)
    String units = ""; // the unit of measure of the bar (any quantitative standard of measurement)  
     
    public BarP1(String referenceName, String unitType, int initValue, int maximumValue)
    {
        refName = referenceName;
        units = unitType;
        maxValue = maximumValue;
        add(initValue);
    }
     
    private void newImage()
    {
        int imgWidth = BAR_WIDTH + 10 * (units.length() + refName.length() + 1);
        int barValue = (int) (BAR_WIDTH * value / maxValue);
        GreenfootImage image = new GreenfootImage(imgWidth, 20);  
        image.setColor(Color.BLACK);
//  Un-comment the following two statements, as well as those commented in BackGround class, for a different view
//         image.fill();
 //        image.setColor(Color.WHITE);
//  Do not un-comment this statement.  If the two lines above are active, activate those commented in BackGround class.
        image.setColor(Color.WHITE);        
        image.drawString(refName, 5, 14);
        image.drawString("" + value + " " + units, refName.length() * 10 + BAR_WIDTH, 14);
        image.drawRect(refName.length() * 8 - 2, (int) (8 - BAR_HEIGHT / 2), BAR_WIDTH + 3, BAR_HEIGHT + 3);
        if (value > 0)
        {
            if (BREAK_LOW)
            {
                if (value > (int) (BREAK_PERCENT * maxValue / 100)) image.setColor(SAFE_COLOR);
                else image.setColor(DANGER_COLOR);
            }
            else
            {
                if (value < (int) (BREAK_PERCENT * maxValue / 100)) image.setColor(SAFE_COLOR);
                else image.setColor(DANGER_COLOR);
            }
            image.fillRect(refName.length() * 8, (int) (10 - BAR_HEIGHT / 2), barValue, BAR_HEIGHT);
        }
        setImage(image);  
    }
     
    public void add(int amount)
    {
        value += amount;
        checkValue();
        newImage();
    }
     
    public void subtract(int amount)
    {
        value -= amount;
        checkValue();
        newImage();
    }
     
    private void checkValue()
    {
        if (value < 0) value = 0;
        if (value > maxValue) value = maxValue;
    }
     
    public int getValue()
    {
        return value;
    }
}
