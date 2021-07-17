import java.util.HashMap;
import java.util.Map;

public abstract class Tile {

   protected final int tileCoordinate ;
   private static final Map<Integer,EmptyTile> EMPTY_TILES = createAllPossibleEmptyTiles();

    private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {

        final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
        for(int i = 0; i< ChessBoard.NUM_TILES; i++)
        {
            emptyTileMap.put(i,new EmptyTile(i));
        }
        return emptyTileMap;
    }
    public static Tile createTile(final int tileCoordinate, final Piece piece)
    {
        return piece != null ? new OccupiedTile(tileCoordinate, piece):EMPTY_TILES.get(tileCoordinate);
    }

    Tile (int tileCoordinate)
    {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();
    public  abstract  Piece getPiece ();

    public static final class EmptyTile extends Tile {
        EmptyTile(final int coordinate) {
            super(coordinate);
        }
    public String toString(){
            return "-";
    }

    public boolean isTileOccupied(){
        return false;
        }
    public Piece getPiece(){
         return null;
        }
    }

    public static final class OccupiedTile extends Tile{
       private final Piece pieceOnTile;

        OccupiedTile(int tileCoordinate, final Piece pieceOnTile)
        {
           super(tileCoordinate);
           this.pieceOnTile = pieceOnTile;
        }

        public String toString(){
            return  getPiece().getPieceAlliance().isBlack() ? getPiece().toString().toLowerCase():
                    getPiece().toString();
        }
        public boolean isTileOccupied (){
            return true;
        }

        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }

    }
}
