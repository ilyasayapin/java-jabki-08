package homework.sorting;

public class FileSize implements Sortable {
    int size;

    public FileSize(int size) {
        this.size = size;
    }

    @Override
    public int compare(Sortable other) {
        FileSize person = (FileSize) other;
        return Integer.compare(this.size, person.size);
    }

    @Override
    public String toString() {
        return String.format("%s", size);
    }
}
