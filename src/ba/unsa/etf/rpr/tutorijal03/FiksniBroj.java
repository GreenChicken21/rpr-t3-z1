package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    enum Grad {TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKI_BRIJEG, BRCKO }

    private Grad grad;
    private String broj;

    FiksniBroj(Grad grad, String broj){

        this.grad = grad;
        this.broj = broj;

    }

    public String ispisi(){
        int niz[] = {30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 49};
        return "0" + niz[grad.ordinal()] + "/" + broj;
    }

    @Override
    public int hashCode(){

        return 0;
    }

}
