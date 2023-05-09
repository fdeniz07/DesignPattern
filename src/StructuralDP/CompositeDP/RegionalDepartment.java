package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    //Tüm departmanlari bir degisken üzerinden kontrol etmek icin olusturuldu
    List<Department> childDepartments;


    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() { //firmada bulunan tüm departmanlarin isimlerini getirsin
        return childDepartments.stream(). //stream yapida departmanlar geliyor
                map(Department::getName). //stream departman isimleri geliyor
                collect(Collectors.joining(", ")); //Finance, Sales, Arge
    }

    @Override
    List<String> getEmployees() { //firmada bütün calisanlarin isimleri
        return childDepartments.stream().
                flatMap(dep->dep.getEmployees().stream()).
                collect(Collectors.toList());
    }
}
