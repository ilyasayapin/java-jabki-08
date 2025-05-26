package homework.sorting;

public class FileSize implements Sortable {
    private int size;

    public FileSize(int size) {
        this.size = size;
    }

    @Override
    public int compare(Sortable other) {
        FileSize fileSize = (FileSize) other;
        return Integer.compare(this.size, fileSize.size);
    }

    @Override
    public String toString() {
        return String.format("%s", size);
    }
}
