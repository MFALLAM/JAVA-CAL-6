package animals;

public class Cat extends Animals {

    private final int run;

    private final int swim;

    private final double jump;
    
    public static int counter;

    public Cat(int run, int swim, double jump) {
        super(run, 0, jump);
        this.run = run;
        this.swim = swim;
        this.jump = jump;
        
        Cat.counter++;
    }

    @Override
    public boolean run(int length) {
        return (length == this.run || length < this.run) ? true : false;
    }

    @Override
    public boolean swim(int length) {
        return false;
    }

    @Override
    public boolean jump(double height) {
        return (height == this.jump || height < this.jump) ? true : false;
    }
}
