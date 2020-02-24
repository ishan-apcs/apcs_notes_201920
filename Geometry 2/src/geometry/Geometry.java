package geometry;

/**
 *
 * @author sebek
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle rect = new Rectangle(3.0, 5.0);
        
        System.out.println(rect);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        
        Square squ = new Square(3.4);
        
        System.out.println(squ);
        System.out.println(squ.getArea());
        System.out.println(squ.getPerimeter());
        
        Shape[] shapes = new Shape[4];
        
        shapes[0] = rect;
        shapes[1] = squ;
        shapes[2] = new Square(3.0);
        shapes[3] = new Circle(3.0);
        
        for(int c = 0; c < shapes.length; c++)
        {
            System.out.println(shapes[c].getPerimeter());
        }
        
        RegularShape[] regShapes = new RegularShape[4];
        
        regShapes[0] = rect;
        regShapes[1] = squ;
        regShapes[2] = new Square(3.0);
        regShapes[3] = new Triangle(3, 4, 5);
        
        for(int c = 0; c < regShapes.length; c++)
        {
            System.out.println(regShapes[c].getPerimeter());
        }

    }
    
}