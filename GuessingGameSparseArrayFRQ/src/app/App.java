package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        hiddenWordTest();

    }

    public static void hiddenWordTest() {
        HiddenWord puzzle = new HiddenWord("HARPS");

        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
    }

    public int getValueAt(int row, int col) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getRow() == row && entries.get(i).getCol() == col) {
                return entries.get(i).getValue();
            }
        }

        return 0;
    }

    public void removeColumn(int col) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getCol() == col) {
                entries.remove(i);
            } else if (entries.get(i).getCol() > col) {
                SparseArrayEntry newEntry = new SparseArrayEntry(entries.get(i).getRow(), entries.get(i).getCol()-1; entries.get(i).getValue());
                entries.set(i, newEntry);
            }
        }
        
        numCols--;
    }
}