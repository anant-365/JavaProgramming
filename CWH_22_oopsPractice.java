package com.company;
class Employee {
    int salary;
    String name;

    public void get_salary() {
        System.out.println(salary);
    }

    public void get_name() {
        System.out.println(name);
    }

    public void set_name(String n) {
        name = n;
    }
}

     class CellPhone{
        public void ring(){
            System.out.println("Ringing...");
        }

        public void vibrate(){
            System.out.println("vibrating...");
        }

        public void picked(){
            System.out.println("Picked up...");
        }

        public void hello(){
            System.out.println("Hello,Anant speaking...");
        }
    }

    class square{
    int side;
        public void set_side(int n){
            side=n;
        }
        public int calc_Area(){
            return side*side;
        }
        public int calc_Perimeter(){
            return 4*side;
        }
    }
public class CWH_22_oopsPractice {
    public static void main(String[] args) {

//        PROBLEM 1: EMPLOYEE--

//        Employee Anant= new Employee();
//        Employee John= new Employee();
//
//        Anant.salary=50000;
//        Anant.name="Anant";
//        Anant.get_salary();
//        Anant.get_name();
//        Anant.set_name("John");
//        Anant.get_salary();
//        Anant.get_name();
//
////        PROBLEM 2: cELL  PHONE--
//
//          CellPhone obj2= new CellPhone();
//          obj2.ring();
//          obj2.vibrate();
//          obj2.picked();
//          obj2.hello();

//        PROBLEM 3: SQUARE--
          square obj3=new square();
          obj3.set_side(10);
        System.out.println(obj3.calc_Area());;
        System.out.println(obj3.calc_Perimeter());
    }
}
