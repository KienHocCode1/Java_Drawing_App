package assignment8_000356049;

import javafx.scene.paint.Color;

/**
 * The GeometricObject class represents a basic geometric object with position and fill color.
 * It serves as a foundation for creating specific geometric shapes that can be drawn.
 *
 * @author TRUNG KIEN, BUI 000356049
 */
public abstract class GeometricObject implements Drawable {
    /** Declare x-coordinate of the object's position **/
    private double x;
    /** Declare y-coordinate of the object's position **/
    private double y;
    /** Declare the color will be for the object **/
    private Color fillColor;

    /**
     * Constructs a geometric object with the specified position and fill color.
     *
     * @param x         The x-coordinate of the object's position.
     * @param y         The y-coordinate of the object's position.
     * @param fillColor The fill color of the object.
     */
    public GeometricObject(double x, double y, Color fillColor) {
        this.x = x;
        this.y = y;
        this.fillColor = fillColor;
    }

    /**
     * Gets the x-coordinate of the object's position.
     *
     * @return The x-coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the y-coordinate of the object's position.
     *
     * @return The y-coordinate.
     */
    public double getY() {
        return y;
    }

    /**
     * Gets the fill color of the object.
     *
     * @return The fill color.
     */
    public Color getFillColor() {
        return fillColor;
    }
}
