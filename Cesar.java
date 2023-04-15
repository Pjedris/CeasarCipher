package cesar;
 
public class Cesar {
    
    public static void main(String[] args) {
        String text = "0 1 2 3 4 5 6 7 8 9 13 17 21 99 9 8 7 6 5 4 3 2 1 0";
        System.out.println(text);
        
        int posun = 3;
        
        String sifra = "";
        
        //sifrovani
        for(int i = 0; i < text.length(); i++) {
            //nacti znak
            char znak = text.charAt(i);
            //sifrujeme pouze cisla
            if(Character.isDigit(znak)) {
                znak = (char)(((znak - '0' + posun) % 10) + '0');
            } else {
                //je to neco jineho -> nesifruju
            }
            sifra += znak;
        }
        
        //kontrolni vypis
        System.out.println(sifra);
        
        String desifra = "";
        
        //desifrovani
        for(int i = 0; i < sifra.length(); i++) {
            //nacti znak
            char znak = sifra.charAt(i);
            //desifrujeme pouze cisla
            if(Character.isDigit(znak)) {
                znak = (char)(((znak - '0' - posun + 10 ) % 10) + '0');
            } else {
                //nedesifruju
            }
            desifra += znak;
        }
        
        //kontrolni vypis
        System.out.println(desifra);
    }
}
