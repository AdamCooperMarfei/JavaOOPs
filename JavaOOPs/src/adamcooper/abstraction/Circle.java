package adamcooper.abstraction;

public class Circle extends GraphicObject{
    @Override
    void draw() {
        System.out.println("Drawing a cycle");
    }

    @Override
    void resize() {
        System.out.println("Resizing a cycle");
    }
}
