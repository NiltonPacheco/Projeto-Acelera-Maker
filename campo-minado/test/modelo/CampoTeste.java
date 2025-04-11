package modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import execessao.ExplosaoException;

public class CampoTeste {
    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeVizinho() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }
    @Test
    void naoVizinhoTeste () {
    	Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertFalse(resultado);
    }
    @Test
    void testeValorPadraoMarcado () {
    	assertFalse(campo.isMarcado());
    }
    @Test
    void testeAlternarMacarcao () {
    	campo.alternarMarcacao();
    	assertTrue(campo.isMarcado());
    }
    @Test
    void testeAbrirCampoSemMina () {
    	
    	assertTrue(campo.abrir());
    }
    @Test
    void testeAbrirCampoMinado () {
    	campo.alternarMarcacao();
    	assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoMarcado () {
    	campo.alternarMarcacao();
    	campo.minar();
    	assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoNaoMarcado () {
    	
    	campo.minar();
    	
    	assertThrows(ExplosaoException.class, ()->{
    		campo.abrir();
    	});
    	assertFalse(campo.abrir());
    }
    
    @Test
    void testeAbrirComVizinhos () {
    	Campo campo11 = new Campo (1,1);
    	Campo campo22 = new Campo (2,2);
    	
    	campo11.adicionarVizinho(campo22);
    
    	campo.adicionarVizinho(campo11);
    	campo.abrir();
    	
    	assertTrue(campo22.isAberto() && campo11.isAberto());
    }
    @Test
    void testeAbrirComVizinhos2() {
        Campo campo11 = new Campo(1,1);
        Campo campo12 = new Campo(1,2);

        Campo campo22 = new Campo(2,2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);
        
        campo.adicionarVizinho(campo22);
        
        campo.abrir(); // Agora a abertura ocorre sem explosão

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }

    
    
    
    
}
