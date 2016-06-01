package jinTile;

import logic.ConstantValues;
import logic.Coordinate;
import logic.piece.Piece;
import logic.tile.Tile;

public class TileNormal extends Tile {
	public TileNormal(Coordinate location) {
		super(location);
	}
	public TileNormal(Coordinate location, String name) {
		super(location, name);
	}
	@Override
	public Piece getPlacedPiece() {
		if (super.getPlacedPiece() != null) {
			super.getPlacedPiece().resetRank();
		}
		return super.getPlacedPiece();
	}
}
