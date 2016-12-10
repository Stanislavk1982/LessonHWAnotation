package ref;

//@UserRoleAnatation(value = Role.USER)
@UserRoleAnatation(value = Role.ADMIN)
public class User {
    private String name;
    private int age;
    private String sureName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sureName='" + sureName + '\'' +
                '}';
    }
}
