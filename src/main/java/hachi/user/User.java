package hachi.user;

public class User {
    private String name;
    private String id;
    private String gender;
    private String email;

    public User(String name, String id, String gender, String email) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
