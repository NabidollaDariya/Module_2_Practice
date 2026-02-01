class User {
    String name;
    String email;
    String role;

    User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    @Override
    public String toString() {
        return name + " (" + email + ") - " + role;
    }
}
