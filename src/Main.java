public class Main {
    public static void main(String[] args) {
        UserManager manager = new UserManager();


        manager.addUser(new User("Nurgul", "alennurgul@icloud.com", "Admin"));
        manager.addUser(new User("Aruzhan", "zhakenaruzhan@icloud.com", "User"));

        System.out.println("После добавления:");
        manager.printUsers();


        manager.updateUser("zhakenaruzhan@icloud.com", "Aruzhka", "Admin");
        System.out.println("После обновления:");
        manager.printUsers();


        manager.removeUser("alennurgul@icloud.com");
        System.out.println("После удаления:");
        manager.printUsers();
    }
}

