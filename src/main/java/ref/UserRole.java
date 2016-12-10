package ref;

public class UserRole {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Stanislav");
        user.setSureName("Kvashuk");
        user.setAge(34);
        Role role = user.getClass().getAnnotation(UserRoleAnatation.class).value();
        System.out.println(role);


    }
}
