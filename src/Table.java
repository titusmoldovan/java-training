import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Table {

    private final JFrame gameFrame;
    private final BoardPanel boardPanel;
    private final Board chessBoard;


    private static Dimension OUTER_FRAME_DIMENSION = new Dimension(600,600);
    private final static Dimension BOARD_PANEL_DIMENSION = new Dimension(400,350);
    private final static Dimension TILE_PANEL_DIMENSION = new Dimension(10,10);
    private static String defaultPieceImagesPath = " Chess-img";

    private final Color lightTileColor = Color.decode("#FFFACD");
    private final Color darkTileColor = Color.decode("#593E1A");

    public Table() {
        this.gameFrame = new JFrame("Chess");
        this.gameFrame.setLayout(new BorderLayout());
        final JMenuBar tableMenuBar= createTableMenuBar();
        this.gameFrame.setJMenuBar(tableMenuBar);
        this.gameFrame.setSize(OUTER_FRAME_DIMENSION);
        this.chessBoard = Board.createStandardBoard();
        this.boardPanel =new BoardPanel();
        this.gameFrame.add(this.boardPanel,BorderLayout.CENTER);

        this.gameFrame.setVisible(true);
    }


    private JMenuBar createTableMenuBar() {
        final JMenuBar tableMenuBar = new JMenuBar();
        tableMenuBar.add(crateFileMenu());
        return tableMenuBar;
    }
    private JMenu crateFileMenu (){
        final JMenu fileMenu = new JMenu("File");

        final JMenuItem openPGN = new JMenuItem("Load PGN File");
        openPGN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open PGN file");
            }
        });
        fileMenu.add(openPGN);

        final JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitMenuItem);
        return fileMenu;
    }
    private class BoardPanel extends JPanel {
    final List<TilePanel> boardTiles ;

    BoardPanel(){
        super(new GridLayout(8,8));
        this.boardTiles = new ArrayList<>();
        for(int i =0;i<ChessBoard.NUM_TILES;i++)
        {
            final TilePanel tilePanel = new TilePanel(this,i);
            this.boardTiles.add(tilePanel);
            add(tilePanel);
        }
        setPreferredSize(BOARD_PANEL_DIMENSION);
    }
   }
    private class TilePanel extends JPanel{

        private final int tileId;

        TilePanel( final BoardPanel boardPanel, final int tileId){

            super(new GridBagLayout());
            this.tileId = tileId;
            setPreferredSize(TILE_PANEL_DIMENSION);
            assignTileColor();
            assignTilePieceIcon(chessBoard);
            validate();
        }

        private void assignTilePieceIcon(final Board board)
        {
            this.removeAll();
            if(board.getTile(this.tileId).isTileOccupied()){

                try {
                    final BufferedImage image  = ImageIO.read(new
                            File(defaultPieceImagesPath +board.getTile(this.tileId).getPiece().getPieceAlliance().toString().substring(0,1)+
                            board.getTile(this.tileId).getPiece().toString()+".gif"));
                   add(new JLabel(new ImageIcon(image)));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void assignTileColor() {
            if(ChessBoard.FIRST_ROW[this.tileId] ||
               ChessBoard.THIRD_ROW[this.tileId]||
               ChessBoard.FIFTH_ROW[this.tileId]||
               ChessBoard.SEVENTH_ROW[this.tileId]){
                setBackground(this.tileId % 2 == 0 ? lightTileColor : darkTileColor);
            }else if (ChessBoard.SECOND_ROW[this.tileId] ||
                      ChessBoard.FOURTH_ROW[this.tileId]||
                      ChessBoard.SIXTH_ROW[this.tileId] ||
                      ChessBoard.EIGHTH_ROW[this.tileId]){
                setBackground(this.tileId %2 != 0 ? lightTileColor : darkTileColor);
            }
        }

    }

}
