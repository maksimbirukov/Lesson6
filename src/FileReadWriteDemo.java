import java.io.*;

public class FileReadWriteDemo {


    public byte[] readFromFile(String fileName) {
        try(FileInputStream fis = new FileInputStream(fileName)) {
            int available = fis.available();
            byte[] buffer = new byte[available];
            fis.read(buffer);

            return buffer;
        }catch (Exception ignored) {

        }

        return new byte[]{};
    }

    public void writeToFile(String fileName, String value) {
//        try(FileWriter fileWriter = new FileWriter(fileName, true)) {
//            fileWriter.append("fdfdf");
//            fileWriter.append('f');
//        } catch (Exception e) {
//
//        }
        try(FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(value.getBytes());

        } catch (Exception ignored){

        }
    }
}
