package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class ImenikTest1 {

    private static Imenik imenik = new Imenik();

    @BeforeAll
    public static void setup(){ //izvrsava se jednom
        try {
            imenik.dodaj("Iman", new FiksniBroj(Grad.SARAJEVO, "266-900"));
            imenik.dodaj("Amra", new FiksniBroj(Grad.ZENICA, "255-899"));
        }catch (Exception e){
            System.out.println("Uhvacen izuzetak");
        }
        imenik.dodaj("Amar", new MobilniBroj(67, "255-899"));
        imenik.dodaj("Rea", new MedunarodniBroj("+555", "37485938493"));
        imenik.dodaj("Ena", new MedunarodniBroj("+385", "1234321538"));
    }
    @Test
    public void testMockExternal(){
        Imenik i = Mockito.mock(Imenik.class); //vraca instancu
        Mockito.when(i.dajBroj("Ena")).thenReturn("Nema nista");


        String test = i.dajBroj("Dino");
        assertEquals(test, "Nema nista");

    }

    @Test
    public void testMockInternal(){
        Map<String, TelefonskiBroj> mapa = Mockito.mock(Map.class);
        try {
            Mockito.when(mapa.get("Dino")).thenReturn(new FiksniBroj(Grad.MOSTAR, "225-883"));
        }catch (Exception e){
            System.out.println(e);
        }
        imenik.setImenik(mapa);

        String br = imenik.dajBroj("Dino");
        assertNotEquals(br, "033/225-899");
        assertEquals(br, "036/255-899");
    }


    @Test
    public void testDajBrojWithMockInternalDependency() {
        TelefonskiBroj mockBroj = Mockito.mock(TelefonskiBroj.class);
        Mockito.when(mockBroj.ispisi()).thenReturn("130-498");

        imenik.dodaj("Jana", mockBroj);

        String broj = imenik.dajBroj("Jana");

        Mockito.verify(mockBroj).ispisi();

        assertEquals("130-498", broj);
    }

}