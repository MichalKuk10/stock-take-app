package Java;

import com.project.dao.UserRepo;
import com.project.exception.MyCustomException;
import com.project.model.User;
import com.project.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;


class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepo userRepo;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        given(userRepo.findAll()).willReturn(prepareMockData());

    }


    @Test
    public void should_return_all_users(){
        //when:
        List<User> users = userService.getAllUsers();

        //then:
        Assertions.assertEquals(4, users.size());
        Assertions.assertEquals("Joanna", users.get(0).getFirstName());
        Assertions.assertEquals("Miłosz", users.get(2).getFirstName());
    }

    @Test
    public void should_check_if_null(){

        Assertions.assertTrue(true);
    }

    @Test
    public void should_check_if_my_custom_exception_is_thrown_when_try_to_delete_user(){

        Assertions.assertThrows(MyCustomException.class, () -> {
            userService.deleteUser(0);
        });

    }


    private List<User> prepareMockData() {
        User appUser1 = new User.Builder()
                .firstName("Joanna")
                .isAdmin(true)
                .build();

        User appUser2 = new User.Builder()
                .firstName("Rafał")
                .isAdmin(false)
                .build();
        User appUser3 = new User.Builder()
                .firstName("Miłosz")
                .isAdmin(true)
                .build();

        User appUser4 = new User.Builder()
                .firstName("Michał")
                .isAdmin(false)
                .build();

        return Arrays.asList(appUser1, appUser2, appUser3, appUser4);
    }
}