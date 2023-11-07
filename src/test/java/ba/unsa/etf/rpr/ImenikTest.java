package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


public class ImenikTest {

    private static Imenik imenik = new Imenik();

    @BeforeAll
    public static void setup(){ //izvrsava se jednom
        try {
            imenik.dodaj("Iman", new FiksniBroj(Grad.SARAJEVO, "266-900"));
            imenik.dodaj("Amra", new FiksniBroj(Grad.ZENICA, "255-899"));
        }catch (Exception e){
            System.out.println(e);
        }
        imenik.dodaj("Amar", new MobilniBroj(67, "255-899"));
        imenik.dodaj("Rea", new MedunarodniBroj("+555", "37485938493"));
    }

    @Test
    public void dajBrojFound(){
        String br = imenik.dajBroj("Iman");
        assertEquals(br, "033/266-900");
    }
    @Test
    public void dajBrojNotFound(){
        String br = imenik.dajBroj("Mina");
        assertNull(br);
    }
    @Test
    public void dodajTestPositive(){
        TelefonskiBroj br = new MobilniBroj(61, "456-876");
        imenik.dodaj("Sara", br);
        String brojStr = imenik.dajBroj("Sara");
        assertEquals(brojStr, "061/456-876");
    }
    @Test
    public void dodajFiksniException(){
        assertThrows(Izuzetak.class, new Executable(){
            @Override
            public void execute() throws Throwable{
                new FiksniBroj(null, "121-121");
            }
        });
        assertThrows(Izuzetak.class, () -> {new FiksniBroj(null, "121");});

    }

}