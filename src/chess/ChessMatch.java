package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat [i][j] = (ChessPiece) board.piece(i, j); //downcast para interpretar a peça como peça do tipo ChessPiece ao inves de Piece
				
			}
		}
	return mat;
	}
}
