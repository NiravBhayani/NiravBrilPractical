package Day3.Assignment1;

public class SystemProperties {
    public void displayUserName() {
        System.out.println("user.name:" + System.getProperty("user.name"));
    }

    public void displayOsName() {
        System.out.println("os.name:" + System.getProperty("os.name"));
    }

    public void displayDirectory() {
        System.out.println("user.dir:" + System.getProperty("user.dir"));
    }

    public void displayAll() {
        displayUserName();
        displayOsName();
        displayDirectory();
    }
}
