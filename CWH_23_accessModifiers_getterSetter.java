package com.company;
      class A {

        private int id;
        private  String name;

        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
        public void setId(int i){
            id = i;
        }
        public int getId(){
            return id;
        }
    }
public class CWH_23_accessModifiers_getterSetter {
        public static void main(String[] args) {
            A emp1 = new A();

            emp1.setName("Shubham");
            System.out.println(emp1.getName());
            emp1.setId(1);
            System.out.println(emp1.getId());

        }
    }


