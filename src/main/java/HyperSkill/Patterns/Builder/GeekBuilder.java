package HyperSkill.Patterns.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Concrete Builder build Geek component.
 **/
class  GeekBuilder implements Builder {

    private String type;
    private List<String> languages;
    private int experience;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Geek getResult() {
        return new Geek(type, languages, experience);
    }
}


