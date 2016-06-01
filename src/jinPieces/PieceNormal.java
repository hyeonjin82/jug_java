package jinPieces;

import logic.piece.Piece;
import logic.piece.StandardJunglePiece;

public class PieceNormal extends StandardJunglePiece {

	public PieceNormal(int side, int speed, int rank, String name) {
		super(side, speed, rank, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canTakePiece(Piece player) {
		if (player == null) {
	      return true;
	    }
	    if (player.getSide() == getSide()) {
	      return false;
	    }
		return player.getRank() <= this.getRank();
	}

}
