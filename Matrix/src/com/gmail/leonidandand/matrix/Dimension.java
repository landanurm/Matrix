package com.gmail.leonidandand.matrix;

public final class Dimension {
	public final int rows;
	public final int columns;

	public static Dimension withRowsColumns(int rows, int columns) {
		return new Dimension(rows, columns);
	}
	
	public Dimension(int rows, int columns) {
		if (rows <= 0 || columns <= 0) {
			throw new IllegalArgumentException(
					"Dimension constructor: rows and columns must be positive");
		}
		this.rows = rows;
		this.columns = columns;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || !(obj instanceof Dimension)) {
			return false;
		}
		Dimension other = (Dimension) obj;
		return (rows == other.rows) && (columns == other.columns);
	}

	@Override
	public int hashCode() {
		return rows * columns + rows - columns;
	}

	@Override
	public String toString() {
		return "{ rows: " + rows + ";  columns: " + columns + " }";  
	}
	
}
