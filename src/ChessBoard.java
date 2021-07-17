public class ChessBoard {

    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean [] SECOND_COLUMN = initColumn(1);
    public static final boolean []SEVENTH_COLUMN = initColumn(6);
    public static final boolean []EIGHTH_CLOUMN =initColumn(7) ;

    public static final boolean[] FIRST_ROW = initRow(0);
    public static final boolean [] SECOND_ROW =initRow(8);
    public static final boolean[] THIRD_ROW = initRow(16);
    public static final boolean [] FOURTH_ROW = initRow(24);
    public static final boolean [] FIFTH_ROW = initRow(32);
    public static final boolean []  SIXTH_ROW = initRow(40);
    public static final boolean [] SEVENTH_ROW= initRow(48);
    public static final boolean [] EIGHTH_ROW = initRow(56);

    private static boolean[] initRow(int rowNumber) {
        final boolean[] row = new boolean[NUM_TILES];
        do{
            row[rowNumber] =true;
            rowNumber++;
        }while(rowNumber % NUM_TILES_PER_RPW!=0);

        return row;
    }

    public static final int NUM_TILES = 64;
    public  static final int NUM_TILES_PER_RPW =8;

    private static boolean[] initColumn(int columnNumber) {
        final boolean[] column = new boolean[64];

        do{
            column[columnNumber]=true;
            columnNumber+=8;
        }while(columnNumber <64);

        return column;
    }

    private ChessBoard(){
        throw new RuntimeException("You cannot instantiate me !");

    }

    public static boolean isValidTileCoordinate( final int coordinate) {
        return coordinate >=0 && coordinate <NUM_TILES;
    }

}
