public class LoginDAO {


    public static User validate(String userName, String password){

        Database database = new Database();

        for (User user: database.userList) {
            if (user.getUserName().equals(userName)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }

}
