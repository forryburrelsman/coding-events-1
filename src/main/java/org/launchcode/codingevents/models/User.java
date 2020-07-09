package org.launchcode.codingevents.models;
import org.springframework.stereotype.Controller;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Controller
@Entity
public class User extends AbstractEntity {

//    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.pwHash = password;
    }

    public String getUsername() {
        return username;
    }

}
