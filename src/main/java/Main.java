import models.Auto;
import models.User;
import services.UserService;

public class Main {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Masha", 23);
        userService.saveUser(user);
        /*
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
         */
    }
}
