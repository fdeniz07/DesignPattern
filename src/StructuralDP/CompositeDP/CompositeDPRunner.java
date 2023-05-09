package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeDPRunner {

    public void compositeDemo(){

        //child departmanlarimizi olusturuyoruz
        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department argeDepartment = new Arge();

        //Genel Departman objemize child departmanlari ekliyoruz
        Department regionalDepartment = new RegionalDepartment(Arrays.asList(financeDepartment,salesDepartment,argeDepartment));

        System.out.println(regionalDepartment.getName());
        System.out.println("***********************************");
        System.out.println(regionalDepartment.getEmployees());
    }


    public static void main(String[] args) {

        CompositeDPRunner composite = new CompositeDPRunner();
        composite.compositeDemo();
    }
}
