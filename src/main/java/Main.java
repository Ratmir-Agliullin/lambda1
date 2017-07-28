import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {





    @FunctionalInterface
    interface GetName{
        public String get(Team team);
    }
    @FunctionalInterface
    interface GetPoints{
        public int get(Team team);
    }
//public static Map<String,Integer> getStringTeam(Stream<Team> teamStream){
//       // return teamStream.collect(Collectors.groupingBy(Team::getPoints),Collectors.toCollection(HashMap<String,Integer>.getClass()))
//    return teamStream.map()
//}


    public static void printTeamName(Team team, GetName gn){
        System.out.println(gn.get(team));
    }
    public static void main(String[] args)  {
Team real = new Team("real madrid",50);
Team barca = new Team("barcelona", 55);
printTeamName(real, c->c.getName());

Map<String,Integer> teamMap = new HashMap<>();
teamMap.put(real.getName(),real.getPoints());
teamMap.put(barca.getName(),barca.getPoints());
        Map<String,Integer> teamSorted = new HashMap<>();
teamMap.forEach((String,Integer)-> {
    Collectors.groupingBy(Team::getPoints);
    teamSorted.put(String,Integer);
   });

teamSorted.forEach((String,Integer)-> System.out.println(String+ " "+Integer));
List<Map.Entry<String, Integer>> integers = teamSorted.entrySet().stream().filter(stringIntegerEntry ->
    stringIntegerEntry.getKey().equals("barcelona")).collect(toList());
integers.forEach(value-> System.out.println(value));
    }
}
