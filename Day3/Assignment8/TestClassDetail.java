package Day3.Assignment8;

import Day3.Assignment8.ClassDetail;

public class TestClassDetail {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        if(args.length<2){
            throw new IllegalAccessException("Invalid argument. Give ClassName and typeOfInfo");
        }
        String className = args[0];
        String typeOfInfo = args[1];

        Class<?> act = Class.forName("Day3.Assignment5.DateAdd.java");
        Object obj = act.newInstance();
        ClassDetail classDetail = new ClassDetail(className+".java");

        switch (typeOfInfo.toUpperCase()){
            case "ALL":
                classDetail.showAllDetails();
                break;
            case "C":
                classDetail.showConstructor();
                break;
            case"M":
                classDetail.showMethods();
                break;
            case "F":
                classDetail.showFields();
                break;
            default:
                System.out.println("Invalid Type of Info");
        }
    }
}
