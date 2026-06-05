package cadastroCarros;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class programa {

	public void acionar() {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		HashSet <Carros> carro = new HashSet<Carros>();
		
		var opçao = 0;
		while(opçao!=4) {
		System.out.println("===== CADASTRO DE CARROS =====");
		System.out.println("\n======= MENU =======");
		System.out.println("\n1 - Cadastrar carro\n2 - Listar carros\n3 - Remover carro\n4 - Sair");
		opçao = input.nextInt();
		input.nextLine();
		
		switch(opçao) {
		case 1:
			System.out.println("Digite o nome do carro que você quer cadastrar:");
			var nome = input.next();
			System.out.println("\nDigite a placa do carro:");
			var placa = input2.nextLine();
			System.out.println("\nDigite o ano do carro:");
			var ano = input.nextInt();
			carro.add(new Carros(nome, placa, ano));
			System.out.println("Carro cadastrado com sucesso!");
				break;
		case 2:
			for (Carros c : carro) {
				System.out.println("===== CARROS CADASTRADOS =====");
				System.out.println("Modelo: " + c.getModelo() + " Placa: " + c.getPlaca() + " Ano: " + c.getAno());
				System.out.println("================================");
			}
				break;
		case 3:
			System.out.println("Digite a placa do carro que você quer remover:");
            String placaRemover = input.nextLine();
            Iterator <Carros> iterator = carro.iterator();
            while (iterator.hasNext()) {
                Carros c = iterator.next();
                if (c.getPlaca().equalsIgnoreCase(placaRemover)) {
                    iterator.remove();
                    System.out.println("Carro removido com sucesso!");
                    break;
                }
            }

            break;
		case 4:
			System.out.println("Programa encerrado. Obrigado por usar o cadastro de carros!");
				break;
		}
	}
		input.close();
	}
	}
