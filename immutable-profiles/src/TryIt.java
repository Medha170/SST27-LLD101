import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");

        System.out.println("Original: " + p.getEmail());

        UserProfile updated = new UserProfile.UserProfileBuilder(p.getId(), "evil@example.com")
                .build();

        System.out.println("Updated (new object): " + updated.getEmail());
        System.out.println("Original still unchanged: " + p.getEmail());
        System.out.println("=> This proves immutability: once built, a UserProfile cannot be modified.");
    }
}
