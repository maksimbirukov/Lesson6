import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamExample {

    public void writeToFile(String fileName) {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeInt(3120);
            dataOutputStream.writeDouble(34.34d);
            dataOutputStream.writeUTF("DataStreamExample");
        } catch (Exception ignored) {

        }
    }

    public void readFromFile(String fileName) {
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            int available = dataInputStream.available();
            if(available > 0) {
                int intValue = dataInputStream.readInt();
                double doubleValue = dataInputStream.readDouble();
                String str = dataInputStream.readUTF();

                System.out.printf("int value = %d, doubleValue = %.2f, stringValue = %s%n", intValue, doubleValue, str);
            }
        }catch (Exception ignored) {

        }
    }
}
