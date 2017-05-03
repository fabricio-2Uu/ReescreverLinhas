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
        File arquivo = new File("Q1.txt");
        FileOutputStream saida = new FileOutputStream( new File("Q1.txt") );
        BufferedOutputStream escrita = new BufferedOutputStream(saida);
        escrita.write( "questao1_prova".getBytes()); 

        //3.3
        File arquivo = new File("Q1.txt");
        FileReader entrada = new FileReader(arquivo);
        BufferedReader leitura = new BufferedReader(fr); 

    }
    
}
