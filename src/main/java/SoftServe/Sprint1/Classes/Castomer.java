package SoftServe.Sprint1.Classes;

import lombok.Data;

@Data
public class Castomer {
    private String firstName;
    private String lastName;

    {
        firstName = "Bob";
        lastName = "Silver";
    }
}
