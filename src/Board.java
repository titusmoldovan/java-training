import java.util.*;

public class Board {

    private final List<Tile> gameBoard;
    private final Collection<Piece> whitePieces;
    private final Collection<Piece> blackPieces;

 private Board (Builder builder){
     this.gameBoard = createGameBoard(builder);
     this.whitePieces = calculateActivePieces(this.gameBoard,Alliance.WHITE);
     this.blackPieces = calculateActivePieces(this.gameBoard,Alliance.BLACK);

     final Collection<Move> whiteStandardLegalMoves = calculateLegalMoves(this.whitePieces);
     final Collection<Move> blackStandardLegalMoves = calculateLegalMoves(this.blackPieces);
 }

   public String toString(){
     final StringBuilder builder =new StringBuilder();
     for(int i=0;i<ChessBoard.NUM_TILES;i++)
     {
         final String tileText = this.gameBoard.get(i).toString();
         builder.append(String.format("%3s",tileText));
         if((i+1)%ChessBoard.NUM_TILES_PER_RPW ==0){
             builder.append("\n");
         }
     }
     return builder.toString();
    }

    private Collection<Move> calculateLegalMoves(Collection<Piece> pieces) {

     final List<Move> legalMoves = new ArrayList<>();
     for(final Piece piece :pieces){
         legalMoves.addAll(piece.calculateLegalMoves(this));
     }
     return legalMoves;
    }

    private Collection<Piece> calculateActivePieces( final List<Tile> gameBoard,  final Alliance alliance) {

     final List<Piece> activePieces = new ArrayList<>();
     for(final Tile tile : gameBoard){
         if(tile.isTileOccupied()){
             final Piece piece = tile.getPiece();
             if(piece.getPieceAlliance() == alliance){
                 activePieces.add(piece);
             }
         }
     }
     return activePieces;

    }

    public Tile getTile (final int tileCoordinate){
        return gameBoard.get(tileCoordinate);
    }

    public static List<Tile> createGameBoard (final Builder builder){
     final Tile[] tiles = new Tile[ChessBoard.NUM_TILES];
     for( int i =0 ; i<ChessBoard.NUM_TILES;i++){
         tiles[i]=Tile.createTile(i,builder.boardConfig.get(i));
     }
     return Arrays.asList(tiles);
    }
    public static Board createStandardBoard(){
      final Builder builder = new Builder();
      builder.setPiece(new Rock(Alliance.BLACK,0));
      builder.setPiece(new Knight(Alliance.BLACK,1));
      builder.setPiece(new Bishop(Alliance.BLACK,2));
      builder.setPiece(new Queen(Alliance.BLACK,3));
      builder.setPiece(new King(Alliance.BLACK,4));
      builder.setPiece(new Knight(Alliance.BLACK,5));
      builder.setPiece(new Bishop(Alliance.BLACK,6));
      builder.setPiece(new Rock(Alliance.BLACK,7));
      builder.setPiece(new Pawn(Alliance.BLACK,8));
      builder.setPiece(new Pawn(Alliance.BLACK,9));
      builder.setPiece(new Pawn(Alliance.BLACK,10));
      builder.setPiece(new Pawn(Alliance.BLACK,11));
      builder.setPiece(new Pawn(Alliance.BLACK,12));
      builder.setPiece(new Pawn(Alliance.BLACK,13));
      builder.setPiece(new Pawn(Alliance.BLACK,14));
      builder.setPiece(new Pawn(Alliance.BLACK,15));

      builder.setPiece(new Pawn(Alliance.WHITE,48));
      builder.setPiece(new Pawn(Alliance.WHITE,49));
      builder.setPiece(new Pawn(Alliance.WHITE,50));
      builder.setPiece(new Pawn(Alliance.WHITE,51));
      builder.setPiece(new Pawn(Alliance.WHITE,52));
      builder.setPiece(new Pawn(Alliance.WHITE,53));
      builder.setPiece(new Pawn(Alliance.WHITE,54));
      builder.setPiece(new Pawn(Alliance.WHITE,55));
      builder.setPiece(new Rock(Alliance.WHITE,56));
      builder.setPiece(new Knight(Alliance.WHITE,57));
      builder.setPiece(new Bishop(Alliance.WHITE,58));
      builder.setPiece(new Queen(Alliance.WHITE,59));
      builder.setPiece(new King(Alliance.WHITE,60));
      builder.setPiece(new Knight(Alliance.WHITE,61));
      builder.setPiece(new Bishop(Alliance.WHITE,62));
      builder.setPiece(new Rock(Alliance.WHITE,63));

      builder.setMoveMaker(Alliance.WHITE);
      return builder.build();
    }

    public static class Builder{
         Map<Integer,Piece> boardConfig;
         Alliance nextMoveMaker;
          public Builder(){
              this.boardConfig = new HashMap<>();
          }
          public Builder setPiece (final Piece piece){
              this.boardConfig.put(piece.getPiecePosition(),piece );
              return this;
          }
          public Builder setMoveMaker(final Alliance nextMoveMaker){
              this.nextMoveMaker =nextMoveMaker;
              return this;
          }
        public Board build()
        {
            return  new Board(this);
        }
    }
}
