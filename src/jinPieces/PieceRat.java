package jinPieces;

import logic.ConstantValues;
import logic.piece.Piece;
import logic.piece.StandardJunglePiece;

public class PieceRat extends StandardJunglePiece implements SwimmingPiece, WeakestPiece {

	public PieceRat(int side, int speed, int rank, String name) {
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
	    if((this.getLocation().getRow()==3 || this.getLocation().getRow()==4 || this.getLocation().getRow()==5)&&
	       (this.getLocation().getColumn()==1||this.getLocation().getColumn()==2||this.getLocation().getColumn()==4||this.getLocation().getColumn()==5)){
				    if(player.getLocation().getRow()==2 || player.getLocation().getRow()==6||player.getLocation().getColumn()==0||player.getLocation().getColumn()==3
				    		||player.getLocation().getColumn()==6){
				    	return false;
				    }
	    }
	    if (player.getRank() == ConstantValues.STRONGEST_PIECE_RANK){
	    	return true;
	    } 
	   return player.getRank() <= this.getRank();
	}
}
