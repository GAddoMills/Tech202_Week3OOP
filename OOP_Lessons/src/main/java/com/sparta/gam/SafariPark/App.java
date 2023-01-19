package com.sparta.gam.SafariPark;

import com.sparta.gam.SafariPark.Airplane;
import com.sparta.gam.SafariPark.Hunter;
import com.sparta.gam.SafariPark.Person;
import com.sparta.gam.SafariPark.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Person cathy = new Person("Cathy","French", 32);
//
//        var fullName = cathy.getFullName();
//        System.out.println(fullName);
//
//        Person laura = new Person("Laura", "Tozer", 22);
//        var laurafUllName = laura.getFullName();
//        System.out.println(laurafUllName);
//
//        var age = laura.getAge();
//        System.out.println(age);
//
//        Person parmita = new Person("parmita");
//
//        laura.setAge(35);
//        var laurasNewAge = laura.getAge();
//        System.out.println(laurasNewAge);
//
//        Hunter h = new Hunter();
//        Hunter h1 = new Hunter("Marion", "Jones", 32, "Leica");
//        System.out.println(h1.getFullName());
//        System.out.println(h1.shoot());
//
//        Hunter h3 = new Hunter("Marion", "Jones", 32, "Leica");
//        var same = h1.equals(h3);
//        var h1Hashcode = h1.hashCode();
//        var h3Hashcode = h3.hashCode();
//        var type = h1.getClass();
//        System.out.println(h1.toString());
//
//        Vehicle x = new Vehicle();
//        Vehicle x1 = new Vehicle(2,40);
//        Vehicle x2 = new Vehicle(4, 3, 0, 20);
//
//        System.out.println(x2.getPosition());
//        System.out.println(x2.getCapacity());
//        System.out.println(x2.getNumPassengers());
//        System.out.println(x2.getSpeed());
//        x2.setNumPassengers(4);
//        System.out.println(x2.getNumPassengers());
//        System.out.println(x2.move());
//        System.out.println(x2.move(5));
//        System.out.println(x2.toString());
//
//        Airplane a = new Airplane(200,100,"JetsRUs");
//        a.setNumPassengers(157);
//        a.ascend(500);
//        System.out.println(a.move(3));
//        System.out.println(a);
//        a.descend(200);
//        System.out.println(a.move());
//        a.move();
//        System.out.println(a);
//        a.descend(500);
//        System.out.println(a);
//
//        List<Object> myObjects = new ArrayList<>();
//        myObjects.add(cathy);
//        myObjects.add(laura);
//        myObjects.add(parmita);
//        myObjects.add(h);
//        myObjects.add(h1);
//        myObjects.add(h3);
//        myObjects.add(x);
//        myObjects.add(x1);
//        myObjects.add(x2);
//        myObjects.add(a);
//
//        System.out.println(" ");
//        System.out.println("PRINTING ALL OBJECTS FROM MYOBJECTS");
//        for (Object o : myObjects){
//            System.out.println(o.toString());
//        }
//        Person yolanda = new Person("Yolanda");
//        spartaWrite(yolanda);
//        spartaWrite(h1);
//        System.out.println("SafariWrite");
//        safariWrite(yolanda);
//        safariWrite(laura);
//        safariWrite(h1);
//
//        System.out.println("Moving IMoveable objects");
//        List<IMoveable>  movObjects = new ArrayList<>();
//        movObjects.add(laura);
//        movObjects.add(h1);
//        movObjects.add(a);
//
//        for (var m : movObjects){
//            System.out.println(m.move());
//            System.out.println(m.move(3));
//        }

        System.out.println(" ");
        System.out.println("Polymorphism Exercise");
        List<IShootable> shootObj = new ArrayList<>();

        //creating weapons
        LaserGun las = new LaserGun("Star Wars");
        WaterPistol wat = new WaterPistol("Gard");
        LaserGun las2 = new LaserGun("Stars");
        WaterPistol wat2 = new WaterPistol("Gard 2");

        shootObj.add(las);
        shootObj.add(wat);
        shootObj.add(las2);
        shootObj.add(wat2);

        for (var v : shootObj){
            System.out.println(v.shoot());
        }

        //STEP 4
        Camera cam = new Camera("Cam");
        shootObj.add(cam);

        //STEP 3
        Hunter nish2 = new Hunter("Nish", "Mandal", 23, cam);
        shootObj.add(nish2);
        System.out.println(nish2.shoot() );



        //STEP 5




    }

//    public static void spartaWrite(Object obj){
//        System.out.println(obj);
//
//    }
//
//    public static void safariWrite(Person p){
//        System.out.println(p.getFullName());
//        if (p instanceof Hunter){
//            var hunterObj = (Hunter)p;
//            System.out.println(hunterObj.shoot());
//        }
//    }

}
