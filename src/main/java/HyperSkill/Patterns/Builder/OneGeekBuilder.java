package HyperSkill.Patterns.Builder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Builder Director.
 */
class GeekDirector {
    public void buildAdmin(Builder builder) {
        builder.setType("Admin");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Perl");
        languages.add("PowerShell");
        builder.setLanguages(languages);
        builder.setExperience(10);
    }
}

class OneGeekBuilder {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String geekName = scanner.nextLine();
        scanner.close();
        System.out.println("Geek " + geekName + " created.");
        GeekDirector director = new GeekDirector();
        GeekBuilder builder = new GeekBuilder();
        director.buildAdmin(builder);
        Geek geek = builder.getResult();
        System.out.println(geek);
    }
}
