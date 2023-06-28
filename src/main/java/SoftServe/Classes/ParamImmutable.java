package SoftServe.Classes;

public class ParamImmutable {
      public void passArg(String s) {
            s = s + "_Name";
            System.out.println("s= " + s + "\tAfter the changes inside the method");
        }
   }

