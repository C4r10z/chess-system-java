package boardgame;

public class Board {

	private int rows;
	private int column;
	private Piece[][] pieces;
	
	public Board(int rows, int colums) {
		this.rows = rows;
		this.column = colums;
		pieces = new Piece[rows][colums];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int colums) {
		this.column = colums;
	}
	
	public Piece piece(int row,int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColum()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColum()] = piece;
		piece.position = position;
	}
}
