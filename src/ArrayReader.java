import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Objects;

public class ArrayReader extends Object {
    private String fileName;

    FileInputStream inputStream;

    public ArrayReader(String fileName) {
        this.fileName = fileName;
    }

    public int[][] readArray() {
        FileReadWriteDemo fileReadWriteDemo = new FileReadWriteDemo();
        String result = new String(fileReadWriteDemo.readFromFile(fileName));
        String[] lines = result.split(";");
        int[][] array = new int[lines.length][];
        for (int i = 0; i < array.length; i++) {
            String[] columns = lines[i].split(",");
            array[i] = new int[columns.length];

            for (int j = 0; j < columns.length; j++) {
                array[i][j] = Integer.parseInt(columns[j]);
            }
        }

        return array;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof ArrayReader)) {
            return false;
        }

        ArrayReader other = (ArrayReader) object;

        return this.fileName != null && this.fileName.equals(other.fileName);
//        return Objects.equals(this.fileName, other.fileName);

    }

    @Override
    public String toString() {
        return "[" +
                "fileName='" + fileName + '\'' +
                ']';
    }

}
