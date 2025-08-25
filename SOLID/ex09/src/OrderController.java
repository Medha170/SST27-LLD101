public class OrderController {
    DataRepo repo;

    OrderController(DataRepo repo){
        this.repo = repo;
    }

    void create(String id){
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}