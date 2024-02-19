package Day8.Assignment3;

public class Main {
    public static void main(String[] args) {

        EmpInfoMerger reader1= new EmpInfoMerger("/home/brilworks-26/Desktop/BrilAssignment/Day8/Assignment3/file1.txt",EmpInfoMerger.Mode.READ);
        EmpInfoMerger reader2= new EmpInfoMerger("/home/brilworks-26/Desktop/BrilAssignment/Day8/Assignment3/file2.txt",EmpInfoMerger.Mode.READ);
        EmpInfoMerger writer = new EmpInfoMerger("/home/brilworks-26/Desktop/BrilAssignment/Day8/Assignment3/newfile.txt", EmpInfoMerger.Mode.WRITE);

        reader1.start();
        writer.start();

        try {
            reader1.join();
            writer.join();
            reader2.start();
            reader2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        EmpInfoMerger.printSharedResource();
    }
}
