import java.util.Arrays;
import java.util.Date;

public class Lesson6 {

    public static final String ARRAY_EXAMPLE_1 = "ArrayExample1.txt";
    public static final String TXT_EXAMPLE = "TextExample.txt";
    public static final String DATA_EXAMPLE = "Data.bin";
    public static void main(String[] args) {
//        readWriteFileStream();
//        readWriteDataStream();
        ZipArchiveDemo zipArchiveDemo = new ZipArchiveDemo();
//        zipArchiveDemo.saveToZipArchive("MyTestZip.zip");
//        zipArchiveDemo.readFromZipArchive("MyTestZip.zip");

        ArrayReader arrayReader = new ArrayReader("ArrayExample1.txt");
        System.out.println(arrayReader);
        ArrayReader arrayReader1 = arrayReader;

        arrayReader.equals(arrayReader);
        arrayReader.equals(null);
        int[][] array = arrayReader.readArray();
        System.out.println(Arrays.deepToString(array));
    }

    static void readWriteFileStream() {
        FileReadWriteDemo fileReadWriteDemo = new FileReadWriteDemo();
//        byte[] bytes = fileReadWriteDemo.readFromFile(ARRAY_EXAMPLE_1);
//        System.out.println(new String(bytes));
        fileReadWriteDemo.writeToFile(TXT_EXAMPLE, "Value for saving" + new Date());
    }

    static void readWriteDataStream() {
        DataStreamExample dataStreamExample = new DataStreamExample();
//        dataStreamExample.writeToFile(DATA_EXAMPLE);

        dataStreamExample.readFromFile(DATA_EXAMPLE);
    }
}
