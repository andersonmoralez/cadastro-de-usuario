package br.com.cadastro;

import java.io.File;
import java.io.FileWriter;

import br.com.cadastro.cliente.Cliente;

public class CadastroApplication {
	Cliente cliente = new Cliente();
	
	public String salvar(String name, String email, int age) 
	{
		File file = new File("C:\\Users\\Anderson\\Documents\\clientes.txt");
			try 
			{
				if(!file.exists()) 
				{
					file.createNewFile();
					FileWriter archive = new FileWriter(file, true);
					archive.append(name + " - " +  email + " - " + age + "\n");
					archive.flush();
					archive.close();
				} else 
				{
					FileWriter archive = new FileWriter(file, true);
					archive.append(name + " - " +  email + " - " + age + "\n");
					archive.flush();
					archive.close();
					
				}
			} catch(Exception ex) 
			{
				return "Erro ao criar o arquivo: " + ex.getMessage();
			}
			
			return "Sucesso ao cadastrar!";
	}
	
}
