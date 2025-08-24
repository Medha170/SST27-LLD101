public class TestRepo implements DataRepository{

    @Override
    public void save() {
        System.out.println("Order stored (pretend DB).");
    }
    
}
