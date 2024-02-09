package Day3.Assignment8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDetail {
    private Class<?> class1;

    public ClassDetail(String classname) throws ClassNotFoundException {
        this.class1 = Class.forName(classname);
    }

    public void showAllDetails(){
        showConstructor();
        showMethods();
        showFields();
    }

    public void showConstructor(){
        Constructor<?>[] constructors = class1.getDeclaredConstructors();
        System.out.println("Constructors:");
        for (Constructor<?> constructor: constructors) {
            System.out.println(constructor);
        }
    }

    public void showMethods(){
        Method[] methods = class1.getDeclaredMethods();
        System.out.println("Methods:");
        for(Method method:methods){
            System.out.println(method);
        }
    }

    public void showFields(){
        Field[] fields = class1.getDeclaredFields();
        System.out.println("Fields:");
        for(Field field:fields){
            System.out.println(field);
        }
    }
}
