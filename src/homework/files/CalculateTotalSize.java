package homework.files;

public class CalculateTotalSize {

    public static void totalSize(File[] files) {
        long totalSize = 0;
        for (int i = 0; i < files.length; i++) {
            totalSize += files[i].getSize();
        }
        System.out.println("Общий размер файлов: " + totalSize + " байт");
    }
}
