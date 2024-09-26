package Ex2;

import java.util.Scanner;

public class MÉTODOS {                              // Classe pública externa 'MÉTODOS'
	    Scanner ler = new Scanner(System.in);       // Declara o 'ler' como Scanner
	    
	    public void PositivoouNegativo(){           // Método para identificar se o numero é positivo ou negativo
	    
	    System.out.println("Digite um número: ");   // Pede o valor para o usuário
	    int num = ler.nextInt();                    // Parâmetro que espera o usuário preencher o valor
	    
	    if (num >= 0) {                             // Verifica se 'num' é >= 0 
	            System.out.println("Positivo");     // Se a informação foi verdadeira retorna "Positivo"
	        } else {
	            System.out.println("Negativo");     // Se a informação for falsa retorna "Negativo"
	        }
	    }
	    
	    //--------------------------------------------------------------------------------------------------------------------------
	    
	    public static class media {                 // Classe publica estatica 'media' pois não é possivel ter 2 classes públicas no mesmo código
	    	Scanner ler = new Scanner(System.in);   
	        private double medianum;                        // Atributo da classe media
	        private double medianum1;                       // Atributo da classe media
	        
	    public void Media(){                         // Método para calcular a media
	    	    // Pede 3 números (1 de cada vez) para o usuário e espera ele responder (1 de cada vez)
	            System.out.println("Digite um número: ");
	            double num1 = ler.nextDouble();
	            System.out.println("Digite outro número: ");
	            double num2 = ler.nextDouble();
	            System.out.println("Digite outro número: ");
	            double num3 = ler.nextDouble();
	            
	            this.medianum = num1 + num2 + num3;  // Faz a soma dos 3 valores recebidos pelo usuário           
	            
	            this.medianum1 = medianum / 3;    // Calcula a média dos valores recebidos
	            System.out.println("A média é: " + medianum1); // Estrutura que será mostrada para o usuário
	            
	    }
	    }
	    
	    //--------------------------------------------------------------------------------------------------------------------------
	    
	    public static class NumMaior {                       // Classe publica estatica 'NumMaior' pois não é possivel ter 2 classes públicas no mesmo código
	        Scanner ler = new Scanner(System.in);
	        
	        public void Maior(){                             // Método para verificar qual número é maior
	        // Pede 3 números (1 de cada vez) para o usuário e espera ele responder (1 de cada vez)
	        System.out.println("Digite um número: ");
	        int num1 = ler.nextInt();
	        
	        System.out.println("Digite outro número: ");
	        int num2 = ler.nextInt();
	        
	        System.out.println("Digite outro número: ");
	        int num3 = ler.nextInt();
	        
	        if (num1 > num2 && num1 > num3) {                             // Verifica se 'num1' é maior que 'num2 e num3'
	                System.out.printf("\nO maior número é: %d \n",num1);  // Se for verdade, apresenta o que está descrito no 'sout'
	            } else if (num1 < num2 && num2 > num3 ){                  // Verufuca se 'num2' é maior que 'num1 e num3'
	                System.out.printf("\nO maior número é: %d \n",num2);  // Se for verdade, apresenta o que está descrito no 'sout'
	            } else{
	                System.out.printf("\nO maior número é: %d \n",num3);  // Se for qualquer informação diferente dos if, apresenta o que está descrito no 'sout'
	            }
	        }
	    }
	    
	    //--------------------------------------------------------------------------------------------------------------------------
	    
	    public static class Elevado {            // Classe publica estatica 'Elevado' pois não é possivel ter 2 classes públicas no mesmo código
	    	Scanner ler = new Scanner(System.in);
	    	
	    	    public void potencia(){  // Método para calcular a potencia
	    	    // Pede 2 números (1 de cada vez) para o usuário e espera ele responder (1 de cada vez)
	    	    System.out.println("Digite o numero base: ");
	    	    int a = ler.nextInt();
	    	    System.out.println("Digite o expoente: ");
	    	    int b = ler.nextInt();
	    	    
	    	     double x = Math.pow(a,b); // Calcula a base (parâmetro a) pelo expoente (parametro b)
	    	    
	    	        System.out.printf("A potencia de %d é: %.0f%n",a,x); // Estrutura que será mostrada para o usuário
	    	}
	    }
	    
	    //--------------------------------------------------------------------------------------------------------------------------
	    
	    public static class Horas {   // Classe publica estatica 'Horas' pois não é possivel ter 2 classes públicas no mesmo código
	    // Atributos da classe Horas
	    private String result; // Armazena o valor da conversão de horas e minutos restantes
	    private int min;   // Armazena o valor de minutos
	    private int horas; // Armazena o valor de horas após a conversão
	    private int minutosRestantes; // Armazena minutos restantes após a conversão
	    
	    public Horas(int min) { // Construtor da classe com o parâmetro 'int min' declarado
	        setMin(min);        // Chama o setter para inicializar o 'min'
	    }
	        
	    public void setMin(int min) { // setter para definir o valor 'min'
	        if (min < 0) {            // Verifica se 'min' é menor que 0 para ver se é um valor valido
	        	throw new IllegalArgumentException("Minutos invalidos, insira um número maior ou igual a 0."); // Se a informação for verdadeira retorna o 'IllegalArgumentException'
	        }
	        
	        this.min = min;                // Atribui o valor do parâmetro 'min' ao atributo 'min'
	        atualizarHorário();            // Armazena os valores atualizados de horas e minutos restantes após a modificação do parâmetro 'min'
	        this.result = convertHoras();  // Atualiza o 'result' após a conversão dos minutos
	    }
	    
	    private void atualizarHorário() { // Método que divide 'min' em horas e minutos restantes
	        this.horas = min / 60;
	        this.minutosRestantes = min % 60;
	    }
	    
	    private String convertHoras() {   // Método privado para convertes as horas e minutos restantes em String
	    return "Horário: " + this.horas + " hora(s) e " + this.minutosRestantes + " minuto(s)";
	    
	    }
	    
	    public String getResult() {       // Getter para 'result'
	    	return result;                // Retorna a String que representa o horário
	    }
	    }
	    
	    //--------------------------------------------------------------------------------------------------------------------------
	    
	    public static class Fatorial { // Classe publica estatica 'Fatorial' pois não é possivel ter 2 classe publica no mesmo código
	    // Atributos da Classe 'PESSOAS'  
	    	private String result;
	    	private int numero;
	    	   
	    public Fatorial(int numero) { 
	        	setNumero(numero);    // Método que inicia o atributo 'numero'
	        }
	    
	    public void setNumero(int numero) { //Método 'setNumero' para alterar o valor de 'numero'
	    	if(numero < 0 ) { // Verifica se o valor de 'numero' é valido
	    		throw new IllegalArgumentException("O número deve ser maior ou igual a zero."); // Se a informação for verdadeira retorna o 'IllegalArgumentException'
	    	}
	    	this.numero = numero;              // Declara o parâmetro 'numero' ao atributo 'numero' 
	    	atualizarFatorial();               // Atualiza o valor de fatorial
	    	this.result = calcularFatorial();  // Declara result com o valor de 'calcularFatorial()' 
	    }
	        
	    private long atualizarFatorial() { // Método qye calcula o fatorial de 'numero'
	    	        if (numero == 0) {    // Verefica se 'numero' é 0
	    	            return 1;         //Se a informação for verdade retorna 1 (fatorial de 0 = 1)
	    	        }

	    	        long fatorial = 1;    //  Armazenar o resultado do cálculo fatorial, inicializada com o valor 1. Utilização do long por ser capaz de armazenar valores maiores
	    	        for (int i = 1; i <= numero; i++) { // Loop for que vai de 1 em 1 até o valor de 'numero' 
	    	            fatorial *= i; //A cada incremento, multiplica o valor atual de 'fatorial' por 'i'
	    	        }
	    	        
	    	        return fatorial; //Após o loop retorna o valor calculado de 'fatorial'
	    	    }
	    
	   private String calcularFatorial() { // Private como String para permitir textos além dos parametros com valores decimal
		   return "O faltorial de " + numero + " é: " + atualizarFatorial(); //Declara a estrutura que será mostrado no main
	   }
	    
	    public String getResult() {  // Retorna um valor do tipo String
	    	return result;           // Retorna o valor de 'result'
	    }
	    }
	    
	    public static void main(String[] args){    // Método main onde as informações que serão mostradas são declaradas
	    MÉTODOS pn = new MÉTODOS();                // Instância 'pn' para ter acesso as informações da classe 'MÉTODOS'
	    pn.PositivoouNegativo();                   // A intância 'pn' acessa as informações do método 'PositivoouNegativo()'
	    
	    System.out.println(" ");
	    
	    media md = new media();                    // Instância 'md' para ter acesso as informações da classe 'media'
	    md.Media();                                // A intância 'md' acessa as informações do método 'Media()'
        
        System.out.println(" ");
        
        NumMaior numM = new NumMaior();            // Instância 'numM' para ter acesso as informações da classe 'NumMaior'
        numM.Maior();                              // A intância 'md' acessa as informações do método 'Maior()'
        
        System.out.println(" ");
        
        Elevado pot = new Elevado();               // Instância 'pot' para ter acesso as informações da classe 'Elevado'
        pot.potencia();                            // A intância 'pot' acessa as informações do método 'potencia()'
        
        System.out.println(" ");
        
        Horas h = new Horas(0);                    // Instância 'h' para ter acesso as informações do construtor 'Horas' com o valor inicial do parâmetro declarado 
        
        h.setMin(90);                             // Intância 'h' acessa o setter que declara o novo valor do parâmetro 'min'
        System.out.println(h.getResult());         // Apresenta para no console o resultado pelo 'getResult()
        
        System.out.println(" ");
        
        Fatorial f1 = new Fatorial(0);             // Instância 'f1' para ter acesso as informações do construtor 'Fatorial' com o valor inicial do parâmetro declarado
        
        f1.setNumero(5);                           //  Instancia 'f1' acessa o setter que declara o novo valor do parâmetro 'numero'
        System.out.println(f1.getResult());        // Apresenta para no console o resultado pelo 'getResult()
	    }      
	}
