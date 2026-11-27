public class Main {
    public static void main(String[] args) {


        PCEscritorio pc1 = new PCEscritorio("Lenovo",
                "LN203",200000.45,"Gaming",false);
        Notebook nt1 = new Notebook("Lenovo",
                "LN2055LM",150000,24.5,true);
        pc1.toString();
        pc1.calcularPrecioFinal();
        pc1.toString();
    }
}
