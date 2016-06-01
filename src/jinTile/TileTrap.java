package jinTile;

import logic.ConstantValues;
import logic.Coordinate;
import logic.piece.Piece;
import logic.tile.Tile;

public class TileTrap extends Tile implements TrapTile{

	public TileTrap(Coordinate location, String name) {
		super(location, name);
	}
	public TileTrap(Coordinate location) {
		super(location);
	}

	@Override
	public Piece getPlacedPiece() {
		if (super.getPlacedPiece() != null) {
			super.getPlacedPiece().setRank(ConstantValues.ON_TRAP);
		}
		return super.getPlacedPiece();
	}
	@Override
	public void setPlacedPiece(Piece placedPiece) {
		System.out.println("setPlacedPiece()  " +  placedPiece.getName());
		super.setPlacedPiece(placedPiece);
	}

	
	
}
