public class Demo05 {
    // Handles 2D resizable shapes (e.g., Rectangle)
    static int areaAfterResize2D(IResizable2D shape) {
        shape.resize(5, 4);
        return ((IAreaService) shape).area();
    }

    // Handles 1D resizable shapes (e.g., Square)
    static int areaAfterResize1D(IResizeable shape) {
        shape.resize(4); // one side only
        return ((IAreaService) shape).area();
    }

    public static void main(String[] args) {
        System.out.println(areaAfterResize2D(new Rectangle())); // 20
        System.out.println(areaAfterResize1D(new Square()));    // 16
    }
}
