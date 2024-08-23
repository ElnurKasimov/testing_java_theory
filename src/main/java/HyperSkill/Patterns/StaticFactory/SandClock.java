package HyperSkill.Patterns.StaticFactory;

public class SandClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...sand noise...");
    }
}
