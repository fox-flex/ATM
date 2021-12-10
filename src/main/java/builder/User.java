package builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Builder @ToString @Getter
public class User {
    private String name;
    private String gender;
    private int age;
    private int weight;
    private int height;
    private String race;
    @Singular
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder()
                .name("Alala")
                .age(222)
                .gender("m")
                .weight(256)
                .height(240)
                .occupation("CS top")
                .build();

        System.out.println(user);
    }
}
