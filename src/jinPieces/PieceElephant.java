package jinPieces;

import logic.ConstantValues;
import logic.piece.Piece;
import logic.piece.StandardJunglePiece;

public class PieceElephant extends StandardJunglePiece implements StrongestPiece{
	
	public PieceElephant(int side, int speed, int rank, String name) {
		super(side, speed, rank, name);
	}
	@Override
	public boolean canTakePiece(Piece player) {
		if (player == null) {
	      return true;
	    }
	    if (player.getSide() == getSide()) {
	      return false;
	    }
	    if (player.getRank() == ConstantValues.WEAKEST_PIECE_RANK){
	    	return false;
	    } 
	   return player.getRank() <= this.getRank();
	}	
}
