package chess.game;

import chess.game.domain.Board;
import chess.game.repository.Repository;
import chess.game.service.Service;
import chess.game.ui.Console;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Repository repository = new Repository(board);
        Service service = new Service(repository);
        Console console = new Console(service);
        console.run();
    }
}
