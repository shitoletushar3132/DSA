

public class oop {
    public static void main(String args []){
        // Pen trimax = new Pen();
        // trimax.setcolor("black");
        // trimax.settip(10);
        // System.out.println(trimax.getcolor());
        // System.out.println(trimax.gettip());

        // bank maha = new bank();
        // System.out.println(maha.passwoad);

        // Student s1 =new Student("tushar");
        // System.out.println(s1.name);

        // fish dophine = new fish();
        // dophine.color = "pink";
        // System.out.println(dophine.color);
        // dophine.eat();
        // dophine.fins=10;
        // System.out.println(dophine.fins);

        // dear d = new dear();

        // d.eat();

        
        // horse h = new horse();
        // h.eat();
        // h.walk();

        // chicken c = new chicken();
        // h.eat();
        // c.walk();

        // Student s1 = new Student();
        // s1.schoolName="gopinath";

        // Student s2 = new Student();
        // System.err.println(s2.schoolName);
       
        // System.out.println(s1.getName());

        // queen q =new queen();
        // q.moves();

        // bear b = new bear();
        // b.grass();
        // b.meat(); 

        horse h = new horse();
    
    
    }
    
}



class animal{
    animal(){
        System.out.println("animal constructor is callled");
    }
}

class horse extends animal{
    horse(){
        // super() ;// it calls the parent class constructor 
        System.out.println("horse constructor is called");
    }
}
interface herbivore{
    void grass();
}

interface carnivore{
    void meat();
}

class bear implements herbivore,carnivore{
    public void grass(){
        System.out.println("eats grass");
    }
    public void meat(){
        System.out.println("eats meat");
    }
}


interface chessplayer {

    void moves();
}

class queen implements chessplayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;

    }
    String getName(){
        return this.name;
    }
}

// abstract class Animal{
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }

// class horse extends Animal{
//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }

// class chicken extends Animal{
//     void walk(){
//         System.out.println("walk on 2 legs");
//     }
// }

// class Pen{
//     private String color;
//     private int tip;
//     void setcolor(String newcolor){
//         color = newcolor;
//     }
//     String getcolor(){
//         return this.color;
//     }

//     int gettip(){
//         return this.tip;
//     }
//     void settip(int newtip){
//         tip=newtip;
//     }
//     void detail(){
//         System.out.println("color : "+color);
//     }
// }
// class bank{
//     public String username="tush";
//     private String passwoad = "12345";
// }

// class Student{
//     String name;
//     int roll;

//     Student(String name){
//         this.name = name;
//     }
// }


// class animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }

// }

// class mammal extends animal{
//     void walk(){
//         System.out.print("walk");
//     }
// } 

// class fish extends animal{
//     int fins;
//     void live(){
//         System.out.println("live in water");
//     }
// }


// class dear extends animal{
//     void eat(){
//         System.out.println("Dear eats..");
//     }
// }
