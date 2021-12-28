package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import main.LoginService;
import main.User;
import main.UserDao;

@RunWith(MockitoJUnitRunner.class)
class LoginServiceTest {
 
    @Mock
    private UserDao userDao;
 
    @InjectMocks
    private LoginService loginService;

    @Test
    public void shouldTrueIfUserNameAndPasswordIsTrue(){
        String userName = "furkan";
        String userPassword = "1234";
 
        User user = new User(userName,userPassword);
 
        when(userDao.findUserByName(userName)).thenReturn(user);
        assertTrue(loginService.login(userName,userPassword)); 
        assertEquals("furkan","1234", loginService.login(userName,userPassword));

}
}
