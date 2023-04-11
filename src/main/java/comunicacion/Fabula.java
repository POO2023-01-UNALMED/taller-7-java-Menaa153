package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;
    public static final int factor = 1;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int numero) {
        return (getPaginas() * factor * numero);
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return String.format("Origen: %s\nTítulo: %s\nAutor: %s\nPáginas: %d\nEnseñanza: %s", 
        getOrigen(),
        getTitulo(),
        getAutor(),
        getPaginas(),
        ensenanza);
    }
}
