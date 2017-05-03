/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reescreverlinhas;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.*;
import java.nio.file.*;

/**
 *
 * @author 0682160
 */
public class ReescreverLinhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //3.1                
        Path total = FileSystems.getDefault().getPath("C:", "Diretorio", "Teste")
                .resolve("Teste.txt");
       
        //3.2
        

        try(BufferedOutputStream escrita = new BufferedOutputStream(new FileOutputStream( new File("Q1.txt")))) {
                escrita.write( "questao1_prova".getBytes());     
        } catch (IOException e) {
	    System.out.println("Erro de I/O.");
        }
         

        //3.3
        try (FileReader entrada = new FileReader(new File("Q1.txt")); 
                BufferedReader leitura = new BufferedReader(entrada)){
            
            System.out.println("teste");
            
        } catch (IOException e) {
	    System.out.println("Erro de I/O.");
        }

    }
