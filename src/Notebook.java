public class Notebook extends Computadora implements Garantizable{
    private double pantallaPulgadas;
    private boolean tieneGarantia;

    public double getPantallaPulgadas() {
        return pantallaPulgadas;
    }

    public void setPantallaPulgadas(double pantallaPulgadas) {
        this.pantallaPulgadas = pantallaPulgadas;
    }

    public boolean isTieneGarantia() {
        return tieneGarantia;
    }

    public void setTieneGarantia(boolean tieneGarantia) {
        this.tieneGarantia = tieneGarantia;
    }

    public Notebook(String marca, String modelo, double precioBase, double pantallaPulgadas, boolean tieneGarantia) {
        super(marca, modelo, precioBase);
        this.pantallaPulgadas = pantallaPulgadas;
        this.tieneGarantia = tieneGarantia;
    }

    public Notebook(double pantallaPulgadas, boolean tieneGarantia) {
        this.pantallaPulgadas = pantallaPulgadas;
        this.tieneGarantia = tieneGarantia;
    }


    public Notebook() {
    }

    public Notebook(String marca, String modelo) {
        super(marca, modelo);
    }

    public Notebook(String marca, String modelo, double precioBase) {
        super(marca, modelo, precioBase);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "pantallaPulgadas=" + pantallaPulgadas +
                ", tieneGarantia=" + tieneGarantia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }

    @Override
    public boolean tieneGarantia() {
        return false;
    }

    @Override
    public void activarGarantia() {
        this.tieneGarantia = true;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getPrecioBase();

        if(tieneGarantia){
            precio += 100000;
        }

        return precio;

    }
}
