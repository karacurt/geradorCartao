import javax.swing.JOptionPane;
import java.util.Random;
public class gerador {
	public static void main(String[] args) {
			
		int[] cartao = new int[16];   
		int soma=0,op=3,validar=0;
		String resu="";
		Object [] gere = {"Sair","Gerar"};
		Random nums = new Random();   
		
		
		
		JOptionPane.showMessageDialog(null, "Bem Vindo ao gerador de cartões de crédito! \nAperte OK para começar\nNome: Daniel de Jesus Lima","Gerador de numeros de cartão de crédito 1.0",2);
	
		do{
			resu="";
			soma=0;
	op = JOptionPane.showOptionDialog(null, "Selecione uma opção","Gerador de numeros de cartão de crédito 1.0",0,2,null,gere,"");
		
	switch(op){
		case 1:	
			
			
			
	do{	
		validar=0;
		soma=0;
		for (int i = 0; i < 16 ; i++){	cartao[i] = nums.nextInt(10); }

for(int i=0; i<16; i++){
	
	if(i%2==0){		
		cartao[i] = cartao[i] * 2;	
		
		if(cartao[i] >= 10){
		cartao[i] = cartao[i] -9;
		soma = soma + cartao[i];
		}else{soma = soma + cartao [i];}
		
	}else{soma = soma + cartao[i];}
	
		}

if ((soma % 10 ==0) & (soma < 150) & cartao[0]>=3 & cartao[0]<=6){validar++;}

	}while(validar!=1);
	
	
//carataogerado

	for(int i=0; i<16; i++){
		if (i==4 || i==8 || i==12){resu = resu + " " + cartao[i];}
		else{resu = resu + cartao[i] ; }	
		}
	
	if (cartao[0]==3){
		//amex
	JOptionPane.showMessageDialog(null, "Cartão American Express \nNumero: "+resu,"Gerador de numeros de cartão de crédito 1.0",2);
	}else if (cartao[0]==4){
		//visa
		JOptionPane.showMessageDialog(null, "Cartão Visa \nNumero: "+resu,"Gerador de numeros de cartão de crédito 1.0",2);
	}else if (cartao[0]==5){
		//master card
		JOptionPane.showMessageDialog(null, "Cartão Master-Card \nNumero: "+resu,"Gerador de numeros de cartão de crédito 1.0",2);
	}else if (cartao[0]==6){
		//Discover
		JOptionPane.showMessageDialog(null, "Cartão Discover \nNumero: "+resu,"Gerador de numeros de cartão de crédito 1.0",2);
	}
break;
		}
		}while(op!=0);
	





		
		
		
		
	}

}
