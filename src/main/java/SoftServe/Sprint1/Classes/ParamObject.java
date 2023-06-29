package SoftServe.Sprint1.Classes;

public class ParamObject {

    public void passArg(Castomer castomer)
    {
        castomer.setFirstName("Alex");
        System.out.println(castomer +
                "\tAfter the changes inside the method");
    }
}

