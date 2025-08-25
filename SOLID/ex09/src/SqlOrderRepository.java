public class SqlOrderRepository implements DataRepo{
    public void save(String id){ 
        System.out.println("Saved order " + id + " to SQL"); 
    }
}
