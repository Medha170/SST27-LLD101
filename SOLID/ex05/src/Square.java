
public class Square implements IAreaService, IResizeable {
    protected int a;
    
    @Override
    public int area() {
        return a * a;
    }

    @Override
    public void resize(int a) {
        this.a = a;
    }
}