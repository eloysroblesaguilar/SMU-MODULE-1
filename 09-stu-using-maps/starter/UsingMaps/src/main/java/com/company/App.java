package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public void printKeys(Map<String,String > map) {

        for (String key : map.keySet()){
            System.out.println(key);
        }
    }

    public void printValues(Map<String,String> map) {

        for (String value : map.values()){
            System.out.println(value);
        }
    }

    public void printKeysAndValues(Map<String,String> map){

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }
    }

    public Map<String, Integer> mapFun(Map<String, Integer> map) {
        map.put("Ford Explorer", 2012);
        map.put("Smart Fortwo", 2013);
        map.remove("Jeep Wrangler");
        return map;
    }

    public Map<String, List<Car>> listCars (List<Car> carList){
        List<Car> toyotaList = new ArrayList<>();
        List<Car> fordList = new ArrayList<>();
        List<Car> hondaList = new ArrayList<>();

        for (Car car : carList) {
            if (car.getMake().equals("Toyota")) {
                toyotaList.add(car);
            } else if (car.getMake().equals("Ford")) {
                fordList.add(car);
            } else {
                hondaList.add(car);
            }
        }
          Map<String, List<Car>> carMap = new HashMap<>();

            carMap.put("Toyota", toyotaList);
            carMap.put("Ford", fordList);
            carMap.put("Honda", hondaList);
            return carMap;
        }
    }

