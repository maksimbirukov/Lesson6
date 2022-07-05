import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipArchiveDemo {

    public void saveToZipArchive(String fileName) {

        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(fileName))) {

            ZipEntry zipEntry  = new ZipEntry(Lesson6.ARRAY_EXAMPLE_1);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.write(new FileReadWriteDemo().readFromFile(Lesson6.ARRAY_EXAMPLE_1));
            zipEntry = new ZipEntry(Lesson6.TXT_EXAMPLE);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.write(new FileReadWriteDemo().readFromFile(Lesson6.TXT_EXAMPLE));
            zipEntry = new ZipEntry(Lesson6.DATA_EXAMPLE);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.write(new FileReadWriteDemo().readFromFile(Lesson6.DATA_EXAMPLE));

        }catch (Exception ignored) {

        }

    }

    public void readFromZipArchive(String fileName) {

        try(ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(fileName))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {

                int nexInt;
                while ((nexInt = zipInputStream.read()) != -1) {
                    System.out.print(nexInt);
                }

                System.out.println();
            }
        } catch (Exception ignored) {

        }
    }
}
