package ejercicios.declases.figurasinterfaces;

public abstract class FiguraGeometrica implements IFigura {

	protected EnumFigura tipoFigura;

	public final EnumFigura getTipo() {

		return this.tipoFigura;
	}

}
