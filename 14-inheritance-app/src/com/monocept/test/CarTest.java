package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import com.monocept.model.Car;

public class CarTest implements Serializable {
    

    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	 Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.setCompanyname(scanner.next());
        car.setMilege(scanner.nextDouble());
        car.setPrice(scanner.nextDouble());
        String filePath = "D:\\assignments\\14-inheritance-app\\src\\com\\monocept\\test\\car.txt";
        try (FileOutputStream object1 = new FileOutputStream(filePath);
             ObjectOutputStream object2 = new ObjectOutputStream(object1)) {
            object2.writeObject(car);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream car1 = new FileInputStream(filePath);
             ObjectInputStream car2 = new ObjectInputStream(car1)) {
            Car object3 = (Car) car2.readObject();
            System.out.println("Object has been deserialized ");
            System.out.println("Companyname is " + object3.getCompanyname() + "\n" +
                                "Car mileage: " + object3.getMilege() + "\n" +
                               "Car price is: " + object3.getPrice());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
