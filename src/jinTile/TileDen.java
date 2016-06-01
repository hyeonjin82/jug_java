package jinTile;

import logic.Coordinate;
import logic.piece.Piece;
import logic.tile.Tile;

public class TileDen extends Tile implements DenTile{
	
	public TileDen(Coordinate location) {
		super(location);
	}
	public TileDen(Coordinate location, String name) {
		super(location, name);
	}
}
