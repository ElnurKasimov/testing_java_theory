package HyperSkill.Patterns.StaticFactory;

public class ToyClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...tick...");
    }
}
