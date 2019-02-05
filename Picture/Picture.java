
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square door1;
    private Square window1;
    private Square window2;
    private Square door2;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(45);
        wall.changeSize(150);
        wall.makeVisible();
        

        window1 = new Square();
        window1.changeColor("black");
        window1.moveHorizontal(20);
        window1.moveVertical(100);
        window1.changeSize(25);
        window1.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(105);
        window2.moveVertical(100);
        window2.changeSize(25);
        window2.makeVisible();
        
        
        door1 = new Square();
        door1.changeColor("white");
        door1.moveHorizontal(60);
        door1.moveVertical(165);
        door1.changeSize(30);
        door1.makeVisible();
        
        door2 = new Square();
        door2.changeColor("white");
        door2.moveHorizontal(60);
        door2.moveVertical(145);
        door2.changeSize(30);
        door2.makeVisible();
        
        
       

        roof = new Triangle();
        roof.changeSize(150, 150);
        roof.moveHorizontal(100);
        roof.moveVertical(-20);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(220);
        sun.moveVertical(-25);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window1.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window1.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
