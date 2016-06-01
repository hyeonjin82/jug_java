package juggle;

import jinPieces.*;
import jinTile.*;
import logic.*;
import logic.Coordinate;
import logic.Game;
import logic.GameBoard;
import logic.piece.Piece;
import logic.piece.StandardJunglePiece;
import logic.tile.Tile;
import view.GameView;


public class JuggleMain extends Game{
	GameBoard gb = null;
	
	@Override
	public void initBoard() {
		//initBoard(), initPieces() - the 2 init methods are used to make a new Game object

		this.gb = new GameBoard();
		
		Tile[][]  gameBoard = new Tile[ConstantValues.ROWS][ConstantValues.COLUMNS];
		for (int i = 0; i < ConstantValues.ROWS; i++) {
		      for (int j = 0; j < ConstantValues.COLUMNS; j++) {
		    	  gameBoard[i][j] = new TileNormal(new Coordinate(i, j), "Tile");
		      }
		}
		TileWater tlw1 = new TileWater(new Coordinate(3,1),"Water");
		TileWater tlw2 = new TileWater(new Coordinate(3,2),"Water");
		TileWater tlw3 = new TileWater(new Coordinate(4,1),"Water");
		TileWater tlw4 = new TileWater(new Coordinate(4,2),"Water");
		TileWater tlw5 = new TileWater(new Coordinate(5,1),"Water");
		TileWater tlw6 = new TileWater(new Coordinate(5,2),"Water");
		
		TileWater tlw7 = new TileWater(new Coordinate(3,4),"Water");
		TileWater tlw8 = new TileWater(new Coordinate(3,5),"Water");
		TileWater tlw9 = new TileWater(new Coordinate(4,4),"Water");
		TileWater tlw10 = new TileWater(new Coordinate(4,5),"Water");
		TileWater tlw11 = new TileWater(new Coordinate(5,4),"Water");
		TileWater tlw12 = new TileWater(new Coordinate(5,5),"Water");
		
		TileDen tld1 = new TileDen(new Coordinate(0,3),"Den");
		TileDen tld2 = new TileDen(new Coordinate(8,3),"Den");
		
		TileTrap tlt1 = new TileTrap(new Coordinate(0,2),"Trap");
		TileTrap tlt2 = new TileTrap(new Coordinate(0,4),"Trap");
		TileTrap tlt3 = new TileTrap(new Coordinate(1,3),"Trap");
		TileTrap tlt4 = new TileTrap(new Coordinate(7,3),"Trap");
		TileTrap tlt5 = new TileTrap(new Coordinate(8,2),"Trap");
		TileTrap tlt6 = new TileTrap(new Coordinate(8,4),"Trap");
		
		gameBoard[0][3] = tld1;
		gameBoard[8][3] = tld2;
		
		gameBoard[0][2] = tlt1;
		gameBoard[0][4] = tlt2;
		gameBoard[1][3] = tlt3;
		gameBoard[7][3] = tlt4;
		gameBoard[8][2] = tlt5;
		gameBoard[8][4] = tlt6;
		
		gameBoard[3][1] = tlw1;
		gameBoard[3][2] = tlw2;
		gameBoard[4][1] = tlw3;
		gameBoard[4][2] = tlw4;
		gameBoard[5][1] = tlw5;
		gameBoard[5][2] = tlw6;
		
		gameBoard[3][4] = tlw7;
		gameBoard[3][5] = tlw8;
		gameBoard[4][4] = tlw9;
		gameBoard[4][5] = tlw10;
		gameBoard[5][4] = tlw11;
		gameBoard[5][5] = tlw12;
	
		gb.setGameBoard(gameBoard);
		this.setGameBoard(gb);
	}

	@Override
	public void initPieces() {
		super.initPieces();
		this._redPieces.clear();
		this._blackPieces.clear();
		this._graveYard.clear();
		for (int i = 0; i < this._gameBoard.getGameBoard().length; i++) {
	      for (int j = 0; j < this._gameBoard.getGameBoard()[i].length; j++) {
	        this._gameBoard.getTile(i, j).removePiece();
	      }
		}
		PieceRat bp1 = new PieceRat(ConstantValues.BLACK_SIDE,1,ConstantValues.WEAKEST_PIECE_RANK,"Rat");
		PieceNormal bp2 = new PieceNormal(ConstantValues.BLACK_SIDE,1,ConstantValues.GAMEPIECE_CAT+1,"Cat");
		PieceNormal bp3 = new PieceNormal(ConstantValues.BLACK_SIDE,1,ConstantValues.GAMEPIECE_DOG+1,"Dog");
		PieceNormal bp4 = new PieceNormal(ConstantValues.BLACK_SIDE,1,ConstantValues.GAMEPIECE_WOLF+1,"Wolf");
		PieceNormal bp5 = new PieceNormal(ConstantValues.BLACK_SIDE,1,ConstantValues.GAMEPIECE_LEOPARD+1,"Leopard");
		PieceBigCat bp6 = new PieceBigCat(ConstantValues.BLACK_SIDE,1,ConstantValues.GAMEPIECE_TIGER+1,"Tiger");
		PieceBigCat bp7 = new PieceBigCat(ConstantValues.BLACK_SIDE,1,ConstantValues.GAMEPIECE_LION+1,"Lion");
		PieceElephant bp8 = new PieceElephant(ConstantValues.BLACK_SIDE,1,ConstantValues.STRONGEST_PIECE_RANK,"Elephant");
		
		PieceRat rp1 = new PieceRat(ConstantValues.RED_SIDE,1,ConstantValues.WEAKEST_PIECE_RANK,"Rat");
		PieceNormal rp2 = new PieceNormal(ConstantValues.RED_SIDE,1,ConstantValues.GAMEPIECE_CAT+1,"Cat");
		PieceNormal rp3 = new PieceNormal(ConstantValues.RED_SIDE,1,ConstantValues.GAMEPIECE_DOG+1,"Dog");
		PieceNormal rp4 = new PieceNormal(ConstantValues.RED_SIDE,1,ConstantValues.GAMEPIECE_WOLF+1,"Wolf");
		PieceNormal rp5 = new PieceNormal(ConstantValues.RED_SIDE,1,ConstantValues.GAMEPIECE_LEOPARD+1,"Leopard");
		PieceBigCat rp6 = new PieceBigCat(ConstantValues.RED_SIDE,1,ConstantValues.GAMEPIECE_TIGER+1,"Tiger");
		PieceBigCat rp7 = new PieceBigCat(ConstantValues.RED_SIDE,1,ConstantValues.GAMEPIECE_LION+1,"Lion");
		PieceElephant rp8 = new PieceElephant(ConstantValues.RED_SIDE,1,ConstantValues.STRONGEST_PIECE_RANK,"Elephant");
		
		this.getGameBoard().getTile(2, 0).placePiece(bp1);
		this.getBlackPieces().add(bp1);
		this.getGameBoard().getTile(1, 5).placePiece(bp2);
		this.getBlackPieces().add(bp2);
		this.getGameBoard().getTile(1, 1).placePiece(bp3);
		this.getBlackPieces().add(bp3);
		this.getGameBoard().getTile(2, 4).placePiece(bp4);
		this.getBlackPieces().add(bp4);
		this.getGameBoard().getTile(2, 2).placePiece(bp5);
		this.getBlackPieces().add(bp5);
		this.getGameBoard().getTile(0, 6).placePiece(bp6);
		this.getBlackPieces().add(bp6);
		this.getGameBoard().getTile(0, 0).placePiece(bp7);
		this.getBlackPieces().add(bp7);
		this.getGameBoard().getTile(2, 6).placePiece(bp8);
		this.getBlackPieces().add(bp8);
		
		this.getGameBoard().getTile(6, 6).placePiece(rp1);
		this.getRedPieces().add(rp1);
		this.getGameBoard().getTile(7, 1).placePiece(rp2);
		this.getRedPieces().add(rp2);
		this.getGameBoard().getTile(7, 5).placePiece(rp3);
		this.getRedPieces().add(rp3);
		this.getGameBoard().getTile(6, 4).placePiece(rp4);
		this.getRedPieces().add(rp4);
		this.getGameBoard().getTile(6, 2).placePiece(rp5);
		this.getRedPieces().add(rp5);
		this.getGameBoard().getTile(8, 0).placePiece(rp6);
		this.getRedPieces().add(rp6);
		this.getGameBoard().getTile(8, 6).placePiece(rp7);
		this.getRedPieces().add(rp7);
		this.getGameBoard().getTile(6, 0).placePiece(rp8);
		this.getRedPieces().add(rp8);
		
		GameView gv = new GameView(this);
	}

	@Override
	public int whoWon() {
		/*  whoWon() This method tells the GUI who won the game using the constant values included
		                       in the library (RED/BLACK); */
		
		if (this.getTile(0, 3).getPlacedPiece() != null && this.getTile(0, 3).getPlacedPiece().getSide() != ConstantValues.BLACK_SIDE){
			return -1;
		} 
		if (this.getTile(8, 3).getPlacedPiece() != null && this.getTile(8, 3).getPlacedPiece().getSide() != ConstantValues.RED_SIDE){
			return 1;
		} 
		if (this._blackPieces.isEmpty()) {
	      return -1;
	    }
	    if (this._redPieces.isEmpty()) {
	      return 1;
	    }
	    return 0;
	}

	public static void main(String[] args) {
		new JuggleMain();
	}
}
