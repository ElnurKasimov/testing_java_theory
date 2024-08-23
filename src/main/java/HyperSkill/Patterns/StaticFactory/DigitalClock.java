package HyperSkill.Patterns.StaticFactory;

public class DigitalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...pim...");
    }
}
