package comunicacion;


public class Tesis extends Escrito {

    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;
    public static final int factor = 5;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    @Override
    public int palabrasTotales(int numero) {
        return super.getPaginas() * factor * numero;
    }

    @Override
    public String interpretacion(){
        return interpretacion;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n%s\n%d\n%s\n%d\n%s\n%s\n%s",
        getOrigen(),
        getTitulo(),
        getAutor(),
        getPaginas(),
        idea,
        argumentos.length,
        conclusion,
        referencias,
        interpretacion);
    }
}
