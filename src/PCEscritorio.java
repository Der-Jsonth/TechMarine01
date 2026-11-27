public class PCEscritorio extends Computadora {
    private String tipoGabinete;
    private boolean incluyemonitor;

    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public void setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public boolean isIncluyemonitor() {
        return incluyemonitor;
    }

    public void setIncluyemonitor(boolean incluyemonitor) {
        this.incluyemonitor = incluyemonitor;
    }

    public PCEscritorio() {
    }

    @Override
    public String toString() {
        return "PCEscritorio{" +
                "tipoGabinete='" + tipoGabinete + '\'' +
                ", incluyemonitor=" + incluyemonitor +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }



    public PCEscritorio(String marca, String modelo, double precioBase, String tipoGabinete, boolean incluyemonitor) {
        super(marca, modelo, precioBase);
        this.tipoGabinete = tipoGabinete;
        this.incluyemonitor = incluyemonitor;
    }




}
