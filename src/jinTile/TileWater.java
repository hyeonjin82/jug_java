package jinTile;

import logic.ConstantValues;
import logic.Coordinate;
import logic.InvalidMoveException;
import logic.piece.Piece;
import logic.tile.Tile;

public class TileWater extends Tile implements WaterTile {
	public TileWater(Coordinate location, String name) {
		super(location, name);
	}
	public TileWater(Coordinate location) {
		super(location);
	}
	@Override
	public boolean canJumpOver(Piece piece) {
		if (piece.getUsualRank()== ConstantValues.GAMEPIECE_LION+1 || piece.getUsualRank()==ConstantValues.GAMEPIECE_TIGER+1){
			if(this.getPlacedPiece()!= null&&this.getPlacedPiece().getName() == "Rat"){
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
	@Override
	public boolean canPieceEnter(Piece toPlace) {
		if (toPlace.getUsualRank() == ConstantValues.WEAKEST_PIECE_RANK){
			return true;
		} else {
			return false;
		}
	}

}
