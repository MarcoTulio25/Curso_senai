package com.MarcoTulio.SENAI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.MarcoTulio.SENAI.domain.Cidade;
import com.MarcoTulio.SENAI.domain.Cliente;
import com.MarcoTulio.SENAI.domain.Endereco;
import com.MarcoTulio.SENAI.domain.Estado;
import com.MarcoTulio.SENAI.domain.enums.TipoCliente;
import com.MarcoTulio.SENAI.repositories.CidadeRepository;
import com.MarcoTulio.SENAI.repositories.ClienteRepository;
import com.MarcoTulio.SENAI.repositories.EnderecoRepository;
import com.MarcoTulio.SENAI.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenai1Application implements CommandLineRunner {

	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenai1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		cidadeRepository.saveAll(Arrays.asList(c1,c2));
		
		Cliente cli1 = new Cliente(null, "Marco Tulio", "12345678901", "mtulio@gmail.com", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("34900000000", "34911111111"));
		clienteRepository.saveAll(Arrays.asList(cli1));
		
		Cliente cli2 = new Cliente(null, "Gustavo Martins", "09876543212", "gmartins@gmail.com", TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("34922222222", "34900000000"));
		clienteRepository.saveAll(Arrays.asList(cli2));
		
		Cliente cli3 = new Cliente(null, "Gulherme Lennyng", "12345432101", "guilhermim@gmail.com", TipoCliente.PESSOAFISICA);
		cli3.getTelefones().addAll(Arrays.asList("34933333333", "34911112222"));
		clienteRepository.saveAll(Arrays.asList(cli3));
		
		Cliente cli4 = new Cliente(null, "Igor Moto", "12345675678", "motoi@gmail.com", TipoCliente.PESSOAFISICA);
		cli4.getTelefones().addAll(Arrays.asList("34900340000", "34911781111"));
		clienteRepository.saveAll(Arrays.asList(cli4));
		
		Cliente cli5 = new Cliente(null, "Ryan Crispim", "12345348901", "ryanzinho@gmail.com", TipoCliente.PESSOAFISICA);
		cli5.getTelefones().addAll(Arrays.asList("34900000123", "34911111981"));
		clienteRepository.saveAll(Arrays.asList(cli5));
		
		Cliente cli6 = new Cliente(null, "Leonardo Indiano", "32145678901", "indiano@gmail.com", TipoCliente.PESSOAFISICA);
		cli6.getTelefones().addAll(Arrays.asList("34945600000", "34911927111"));
		clienteRepository.saveAll(Arrays.asList(cli6));
		
		Cliente cli7 = new Cliente(null, "Juarez Pote", "12131678901", "juarez@gmail.com", TipoCliente.PESSOAFISICA);
		cli7.getTelefones().addAll(Arrays.asList("34900123400", "34911111121"));
		clienteRepository.saveAll(Arrays.asList(cli7));
		
		Cliente cli8 = new Cliente(null, "Paulo Dan", "12345671234", "paulim@gmail.com", TipoCliente.PESSOAFISICA);
		cli8.getTelefones().addAll(Arrays.asList("34900564310", "34911111671"));
		clienteRepository.saveAll(Arrays.asList(cli8));
		
		Cliente cli9 = new Cliente(null, "Guilherme Junim", "12435678901", "junim@gmail.com", TipoCliente.PESSOAFISICA);
		cli9.getTelefones().addAll(Arrays.asList("34900005280", "34911111789"));
		clienteRepository.saveAll(Arrays.asList(cli9));
		
		Cliente cli10 = new Cliente(null, "Henrique de Ferraz", "69745678901", "ferraz@gmail.com", TipoCliente.PESSOAFISICA);
		cli10.getTelefones().addAll(Arrays.asList("34900012345", "34911110000"));
		clienteRepository.saveAll(Arrays.asList(cli10));
		
		Endereco e1 = new Endereco(null, "Rua das Emboabas", "55b", "Ap 330", "Jardim", "38447587", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua Alameda Nasciute", "234", null, "Centro", "34555098", cli2, c2);
		Endereco e3 = new Endereco(null, "Rua das Emboabas", "55a", "Ap 120", "Jardim", "38447587", cli3, c1);
		Endereco e4 = new Endereco(null, "Rua das Emboabas", "55c", "Ap 320", "Jardim", "38447587", cli4, c1);
		Endereco e5 = new Endereco(null, "Rua das Emboabas", "55b", "Ap 130", "Jardim", "38447587", cli5, c1);
		Endereco e6 = new Endereco(null, "Rua das Emboabas", "15b", "Ap 430", "Jardim", "38447587", cli6, c1);
		Endereco e7 = new Endereco(null, "Rua das Emboabas", "25b", "Ap 530", "Jardim", "38447587", cli7, c1);
		Endereco e8 = new Endereco(null, "Rua das Emboabas", "35b", "Ap 330", "Jardim", "38447587", cli8, c1);
		Endereco e9 = new Endereco(null, "Rua das Emboabas", "55b", "Ap 220", "Jardim", "38447587", cli9, c1);
		Endereco e10 = new Endereco(null, "Rua das Emboabas", "55c", "Ap 130", "Jardim", "38447587", cli10, c1);
		cli1.getEnderecos().addAll(Arrays.asList(e1));
		cli2.getEnderecos().addAll(Arrays.asList(e2));
		cli3.getEnderecos().addAll(Arrays.asList(e3));
		cli4.getEnderecos().addAll(Arrays.asList(e4));
		cli5.getEnderecos().addAll(Arrays.asList(e5));
		cli6.getEnderecos().addAll(Arrays.asList(e6));
		cli7.getEnderecos().addAll(Arrays.asList(e7));
		cli8.getEnderecos().addAll(Arrays.asList(e8));
		cli9.getEnderecos().addAll(Arrays.asList(e9));
		cli10.getEnderecos().addAll(Arrays.asList(e10));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
		
	}

}
