import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {




    @FunctionalInterface
    interface functionalInterface{
        abstract public double abstractMethod(double x);
    }

    static class Logarifm implements functionalInterface{

        @Override
        public double abstractMethod(double x) {
            return Math.log(x);
        }
    }
    public static void main(String[] args)  {

        Logarifm logarifm = new Logarifm();
        

     Set<Double> doubleSet = new HashSet<>();
     doubleSet.add(1D);
     doubleSet.add(0.2D);
        Set<Double> newSet = new HashSet<>();
              doubleSet.stream().forEach(x->{

         x= Math.random();
        newSet.add(x);
         System.out.println(x);}
     );
        System.out.println(newSet.stream().filter(x->x>0.5).count());

    }
}
