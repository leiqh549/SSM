package mapper;

import entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Usermapper {
    public List<User> selectAll();
}
