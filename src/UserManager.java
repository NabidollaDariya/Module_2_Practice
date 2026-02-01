import java.util.ArrayList;
import java.util.List;

class UserManager {
    List<User> users = new ArrayList<>();

    void addUser(User user) {
        users.add(user);
    }

    void removeUser(String email) {
        users.removeIf(u -> u.email.equals(email));
    }

    void updateUser(String email, String newName, String newRole) {
        for (User u : users) {
            if (u.email.equals(email)) {
                u.name = newName;
                u.role = newRole;
                break;
            }
        }
    }

    void printUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }
}
