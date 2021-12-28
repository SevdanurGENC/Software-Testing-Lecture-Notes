package main;

public class LoginService {
	//@Autowired
    private UserDao userDao;

    public boolean login(String userName, String userPassword) {
        User user = userDao.findUserByName(userName);
        if(user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword) ) return true;
        return false;

    }
}
