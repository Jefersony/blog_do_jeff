import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {
	Texto txt;
	
	@Before
	public void setup(){
		Fixtures.deleteDatabase();
	}

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void CriaERecuperaUmTexto(){
    	txt = new Texto("Blur", "Banda Britanica", "Jeferson").save();// salva o objeto no BD
    	
    	// busca o primeiro obj com titulo igual ao informado
    	Texto txtBlur = Texto.find("byTitulo", "Blur").first();
    	
    	//System.out.println(txtBlur.getAutor());
    	Assert.assertEquals(txt.getTitulo(), txtBlur.getTitulo());
    }
    
    @Test
    public void carregaArquivoYml() {
    	Fixtures.loadModels("data.yml");// carrega arquivo do mesmo pacote dos testes
    	
    	Texto txt = Texto.find("byAutor", "Jorge").first();
    	Texto txtCranberries = Texto.find("byTitulo", "Cranberries").first();
    	
    	Assert.assertEquals( "Jorge", txt.getAutor());
    	Assert.assertEquals("Cranberries", txtCranberries.getTitulo());
    }

}
