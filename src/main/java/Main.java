import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {





    @FunctionalInterface
    interface GetName{
        public String get(Team team);
    }
    @FunctionalInterface
    interface GetPoints{
        public int get(Team team);
    }

//    static class Logarifm{
//
//
//        private static void print(double x, Get get){
//
//            System.out.println(Math.log(get.get(x)));
//        }
//    }


    public static void printTeamName(Team team, GetName gn){
        System.out.println(gn.get(team));
    }
    public static void main(String[] args)  {
Team real = new Team("real madrid",50);
Team barca = new Team("barcelona", 45);
printTeamName(real, c->c.getName());
//
//
//     Set<Double> doubleSet = new HashSet<>();
//     doubleSet.add(1D);
//     doubleSet.add(0.2D);
//        Set<Double> newSet = new HashSet<>();
//              doubleSet.stream().forEach(x->{
//
//         x= Math.random();
//        newSet.add(x);
//         System.out.println(x);}
//     );
//        System.out.println(newSet.stream().filter(x->x>0.5).count());
//



    }
}
