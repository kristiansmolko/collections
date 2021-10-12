package colls;

import colls.entity.FPlane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PlanesMain {

    public static void main(String[] args) {
        List<FPlane> planes = createArrayListWithPlanes();

//        printAllPlanes(planes);

//        filterNonJetPlanesAndPrint(planes);

//        filterPlanesByNameAndPrint("Boeing", planes);

        sortPlanesByYearAndPrint(planes);

    }

    private static void sortPlanesByYearAndPrint(List<FPlane> planes){
        printPlanesFromStream(sortPlanesByYearAscended(planes));
    }

    private static Stream<FPlane> sortPlanesByYearAscended(List<FPlane> planes) {
        return planes.stream().sorted(Comparator.comparingInt(FPlane::getYear));
    }

    private static void filterPlanesByNameAndPrint(String name, List<FPlane> planes) {
        printPlanesFromStream(filterPlanesByName(name, planes));

    }

    private static Stream<FPlane> filterPlanesByName(String name, List<FPlane> planes) {
        return planes.stream().filter(fPlane -> fPlane.getBrand().equals(name));
    }

    private static void filterNonJetPlanesAndPrint(List<FPlane> planes) {
        printPlanesFromStream(filterNonJetPlanes(planes));
    }

    private static Stream<FPlane> filterNonJetPlanes(List<FPlane> planes) {
        return planes.stream().filter(fPlane -> !fPlane.isJet());
    }

    private static FPlane[] createPlanes(){
        FPlane[] planes = new FPlane[5];
        FPlane first = new FPlane("Boeing", "747", 2000, true);
        FPlane second = new FPlane("Airbus", "A380", 2020, true);
        FPlane third = new FPlane("Cesna", "172", 2014, false);
        FPlane fourth = new FPlane("Antonov", "An-225", 2013, true);
        FPlane fifth = new FPlane("Northrop Grumman", "B-2 Spirit", 1997, true);
        planes[0] = first;
        planes[1] = second;
        planes[2] = third;
        planes[3] = fourth;
        planes[4] = fifth;
        return planes;
    }

    private static List<FPlane> createArrayListWithPlanes(){
        List<FPlane> list = new ArrayList<>();
        Collections.addAll(list, createPlanes());
        list.add(new FPlane("Boeing","777",2015,true));
        list.add(new FPlane("Boeing","727",2002,true));
        return list;
    }

    private static void printAllPlanes(List<FPlane> allPlanes){
        allPlanes.forEach(fPlane -> System.out.println(fPlane.toString()));
    }

    private static void printPlanesFromStream(Stream<FPlane> stream){
        stream.forEach(fPlane -> System.out.println(fPlane.toString()));
    }
}
