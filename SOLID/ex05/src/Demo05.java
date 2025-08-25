public class Demo05 {
    static int areaAfterResize2D(IResizable2D shape) {
        shape.resize(5, 4);
        return ((IAreaService) shape).area();
    }

    static int areaAfterResize1D(IResizeable shape) {
        shape.resize(4); 
        return ((IAreaService) shape).area();
    }

    public static void main(String[] args) {
        System.out.println(areaAfterResize2D(new Rectangle())); 
        System.out.println(areaAfterResize1D(new Square()));    
    }
}
