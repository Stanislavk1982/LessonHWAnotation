package ref;

public class UserRoleTest {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Stanislav");
        user.setSureName("Kvashuk");
        user.setAge(34);
        Role roleValue = null;
        UserRoleAnatation role = user.getClass().getAnnotation(UserRoleAnatation.class);
        if (role != null) {
            roleValue = role.value();
        }
        System.out.println("Role value: " + roleValue);


    }
}
