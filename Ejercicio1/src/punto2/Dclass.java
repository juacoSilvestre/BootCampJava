package punto2;

public class Dclass implements Ainterface, Binterface {


    @Override
    public void intA() {
        System.out.println("Im interface A an im being implemented");
    }

    @Override
    public void intB() {
        System.out.println("Im interface B an im being implemented too");
    }
}
