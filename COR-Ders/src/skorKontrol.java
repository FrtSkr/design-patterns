public class skorKontrol extends  Kredi{
    @Override
    public void kontrol2(Musteri musteri) {
        if (musteri.getSkor() > 1500){

        }else {
            setDeger(false);
        }

    }


//    @Override
//    public void kontrol(Musteri musteri) {
//        if(musteri.getSkor() > 1500){
//            System.out.println(deger);
//            super.execute(musteri);
//        }else {
//            setDeger(false);
//            System.out.println(deger);
//        }
//    }
}
