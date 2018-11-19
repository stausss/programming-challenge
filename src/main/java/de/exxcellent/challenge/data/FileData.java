package de.exxcellent.challenge.data;

public class FileData implements Processable {
    private String id;
    private int arg1;
    private int arg2;

    public FileData(String id, int arg1, int arg2) {
        this.id = id;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public int calcDiff() {
        return 0;
    }

    @Override
    public String getId() {
        return null;
    }
}
