package HyperSkill.Patterns.StaticFactory;

public class MechanicalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...clang mechanism...");
    }
}
