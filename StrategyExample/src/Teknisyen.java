public class Teknisyen extends Eleman {
    public Teknisyen(String elemanAdi) {
        super(elemanAdi);
    }

    @Override
    public void izinHesapla() {
        this.getIzinHesap().hesapla();
    }

    @Override
    public void maasHesapla() {
        this.getMaasHesap().hesapla();
    }
}
