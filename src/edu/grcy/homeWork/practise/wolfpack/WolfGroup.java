package edu.grcy.homeWork.practise.wolfpack;

import java.util.*;
import java.util.stream.Collectors;

public class WolfGroup {
    public static void main(String[] args) {
        Wolf alfa = WolfCreator.createWolf("a", "ALFA");
        Wolf hunter1 = WolfCreator.createWolf("h", "Kiki");
        Wolf hunter2 = WolfCreator.createWolf("h", "Rafi");
        Wolf hunter3 = WolfCreator.createWolf("h", "Burek");
        Wolf female1 = WolfCreator.createWolf("f", "Liza");
        Wolf female2 = WolfCreator.createWolf("f", "Raja");
        Wolf female3 = WolfCreator.createWolf("f", "Marlena");
        Wolf youngster1 = WolfCreator.createWolf("y", "Siwy");
        Wolf youngster2 = WolfCreator.createWolf("y", "Bury");
        Wolf youngster3 = WolfCreator.createWolf("y", "Szary");
        List<Wolf> group = Arrays.asList(alfa, hunter1, hunter2, hunter3, female1, female2, female3, youngster1, youngster2, youngster3);


        // Map<WolfEnumType, List<Wolf>> wolfsMap = getWolfesGroupedByType(group);
//        Map<WolfEnumType, List<Wolf>> wolfTypeMapStreamed = group.stream()
//                .collect(Collectors.groupingBy(Wolf::getType, HashMap::new, Collectors.toList()));
//
//        wolfTypeMapStreamed.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        getWolfesGroupedByType(group).entrySet().stream().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));


    }


    public static Map<WolfEnumType, List<Wolf>> getWolfesGroupedByType(List<Wolf> wolves) {
        Map<WolfEnumType, List<Wolf>> wolfTypeMap = new HashMap<>();
        for (Wolf wolf : wolves) {
            if (wolfTypeMap.keySet().contains(wolf.getType())) {
                List<Wolf> listByType = wolfTypeMap.get(wolf.getType());
                listByType.add(wolf);

                wolfTypeMap.put(wolf.getType(), listByType);
            } else {
                List<Wolf> newListByType = new ArrayList<>();
                newListByType.add(wolf);
                wolfTypeMap.put(wolf.getType(), newListByType);

            }
        }

        return wolfTypeMap;
    }


}
