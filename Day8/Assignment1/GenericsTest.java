package Day8.Assignment1;

import java.util.HashMap;

public class GenericsTest {
    private HashMap<Long,String> dictionary;

    public GenericsTest(){
        dictionary = new HashMap<>();
        dictionary.put(9987123456L, "Jacob");
        dictionary.put(9819123456L, "Jenny");
    }

    public void addToDictionary(long mobileNumber,String firstName){
        dictionary.put(mobileNumber,firstName);
    }

    public String searchMobileNumber(long mobileNumber){
        return dictionary.get(mobileNumber);
    }

    public void printAll(){
        System.out.println("Printing all data");
        int index = 1;
        for (long mobileNumber : dictionary.keySet()){
            String firstName = dictionary.get(mobileNumber);
            System.out.println("("+ index++ +")Name: " +firstName+"\n\tMobile: "+mobileNumber);
        }
    }

    public static void main(String[] args) {
        GenericsTest genericsTest= new GenericsTest();

        genericsTest.printAll();

        genericsTest.addToDictionary(9999999999L, "Nirav");
        genericsTest.addToDictionary(8888888888L, "Om");
        genericsTest.addToDictionary(7777777777L, "Nikunj");

        genericsTest.printAll();

        long jacobOrjennyMobile = 9987123456L;
        System.out.println("\nSearching for mobile number: "+ jacobOrjennyMobile);
        String nameFound = genericsTest.searchMobileNumber(jacobOrjennyMobile);

        if (nameFound != null){
            System.out.println("Name Found: "+nameFound);
        }else {
            System.out.println("Mobile not found");
        }

        long niravOrOmOrNikunj = 9999999999L;
        System.out.println("\nSearching for mobile number: "+ niravOrOmOrNikunj);
        nameFound = genericsTest.searchMobileNumber(niravOrOmOrNikunj);

        if (nameFound != null){
            System.out.println("Name Found: "+nameFound);
        }else {
            System.out.println("Mobile not found");
        }
    }
}
