package com.company;

//Cylinder area and getter and setter for inputs:
class cylinder{
    private int height,radius;
    public void set_height_radius(int n,int m){
        height=n;
        radius=m;
    }
    public String area_perimeter(){
        int perim_cylin=4*radius+2*height;
        double area_cylin=3.14*radius*radius*height;
        return perim_cylin+" , "+area_cylin;
    }
    public String get_height_radius(){
        return height+" , "+radius;
    }
}

public class CWH_25_accessModifiers_constructors_practice {
    public static void main(String[] args) {
        cylinder obj=new cylinder();
        obj.set_height_radius(30,10);
        System.out.println(obj.get_height_radius());
        System.out.println(obj.area_perimeter());
    }
}
