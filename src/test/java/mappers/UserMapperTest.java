package mappers;

import domain.User;
import lombok.extern.slf4j.Slf4j;
import model.UserCommand;

@Slf4j
public class UserMapperTest {

    public void testMapUserToUserCommand() {
        //given
        User user = User.builder().lastname("Leminta")
                .firstname("Lerroy")
                .email("lerroy2345@yahoo.com")
                .build();

        //when
        UserCommand userDto = UserMapper.INSTANCE.userToUserCommand( user );

        //then
        log.info("user: {},\nuserCommand: {}",user,userDto);
    }

    public void testMapUserCommandToUser() {
        //given
        UserCommand userDto = UserCommand.builder().lastname("Iklemberg")
                .firstname("Lerroy")
                .email("lerroy2345@yahoo.com")
                .build();

        //when
        User user = UserMapper.INSTANCE.userCommandToUser( userDto );

        //then
        log.info("userCommand: {},\nuser: {}",userDto,user);
    }
}
