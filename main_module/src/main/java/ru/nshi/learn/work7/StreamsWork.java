package ru.nshi.learn.work7;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsWork {

    static String URL = "https://raw.githubusercontent.com/rassafel/java-learn/master/tasks/data/CAR_DATA.csv";

    public static void main(String[] args) throws IOException{
        BufferedReader reader = getReader();
        Stream<String> data = reader.lines();
        FileWriter fout = new FileWriter("C://Temp//Table.txt", false);

        ArrayList<Car> cars = data
                .skip(1)
                .map(s -> {
                    String[] strings = s.split(",");
                    Car car = new Car(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3]);
                    try {
                        fout.append(car.toString() + '\n');
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return car;
                })
                .collect(Collectors.toCollection(ArrayList::new));

        Map<String, List<String>> carsColors = new HashMap<>();
        for (Car car1: cars){
            if(!carsColors.containsKey(car1.getColor())){
                LinkedList<String> carInfo = new LinkedList<>();
                for (Car car2: cars){
                    if(car1.getColor().equals(car2.getColor())){
                        carInfo.addLast(car2.toString());
                    }
                }
                carsColors.put(car1.getColor(), carInfo);
            }
        }

        try {
            fout.append("\n-------------\n" +
                           "Colors\n" +
                          "-------------\n");
            for (String key : carsColors.keySet()) {
                fout.append(key + " - {");
                for (String value: carsColors.get(key)) {
                    fout.append(value + " | ");
                }
                fout.append("}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, LinkedList<String>> carsMakerMap = new HashMap<>();
        for (Car car1: cars){
            if(!carsMakerMap.containsKey(car1.getMakerName())){
                LinkedList<String> carInfo = new LinkedList<>();
                for (Car car2: cars){
                    if(car1.getMakerName().equals(car2.getMakerName())){
                        carInfo.addLast(car2.toString());
                    }
                }
                carsMakerMap.put(car1.getMakerName(), carInfo);
            }
        }

        List<CarMaker> carMakerArrayList = new ArrayList<>();
        for(String carMaker: carsMakerMap.keySet()){
            carMakerArrayList.add(new CarMaker(carMaker, carsMakerMap.get(carMaker)));
        }

        try {
            fout.append("\n-------------\n" +
                    "Car Makers\n" +
                    "-------------\n");
            for (CarMaker carMakerName: carMakerArrayList) {
                fout.append(carMakerName.getName() + " - {");
                fout.append(carMakerName.toString() + "\n");
                fout.append("}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] carMakers = new String[carMakerArrayList.size()];
        int index = 0;
        for (CarMaker carMaker: carMakerArrayList){
            carMakers[index] = carMaker.toString();
            index++;
        }

        System.out.println(Arrays.stream(carMakers)
                .collect(Collectors.joining("\n")));
        fout.close();

        FileWriter result = new FileWriter("C://Temp//Result.txt", false);
        try {
            result.append("\n-------------\n" +
                    "Filtered Car Makers\n" +
                    "-------------\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        carMakerArrayList.stream()
                .filter(s -> s.getCars().size() > 2)
                .sorted(new CarMakerCompare())
                .forEach(s -> {
                    try {
                        result.append(s.toString());
                        result.append('\n');
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });
        result.close();
    }


    static BufferedReader getReader() throws IOException {
        java.net.URL url = new URL(URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }

    static class CarMakerCompare implements Comparator<CarMaker>{

        public int compare(CarMaker cm1, CarMaker cm2){

            return cm1.getName().toUpperCase().compareTo(cm2.getName().toUpperCase());

        }

    }
}
