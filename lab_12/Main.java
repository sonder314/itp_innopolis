package lab_12;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt"))
        {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}


//void demoSuppressedException(String filePath) throws IOException {
//    Throwable firstException = null;
//    FileInputStream fileIn = null;
//    try {
//        fileIn = new FileInputStream(filePath);
//    } catch (IOException e) {
//        firstException = e;
//    } finally {
//        try {
//            fileIn.close();
//        } catch (NullPointerException npe) {
//            if (firstException != null) {
//                npe.addSuppressed(firstException);
//            }
//            throw npe;
//        }
//    }
//}

