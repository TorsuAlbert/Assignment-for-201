public class User {
    private String username;
    private String password;

git

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verifyPassword(String inputPassword) {
        if (inputPassword == password) {
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        User US1 = new User("Albert","VanJohnson@17");
        System.out.println(US1.verifyPassword("1342556146"));
    }
}
