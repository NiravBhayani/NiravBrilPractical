package Day3.Assignment1;

import Day3.Assignment1.SystemProperties;

public class ShowSystemProperties {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please provide a command like uname, osname, udir or all");
            return;
        }
        String command = args[0];
        SystemProperties systemProperties = new SystemProperties();

        switch (command){
            case "uname":
                systemProperties.displayUserName();
                break;
            case "osname":
                systemProperties.displayOsName();
                break;
            case "udir":
                systemProperties.displayDirectory();
                break;
            case "all":
                systemProperties.displayAll();
                break;
            default:
                System.out.println("Invalid Command");
        }
    }
}
