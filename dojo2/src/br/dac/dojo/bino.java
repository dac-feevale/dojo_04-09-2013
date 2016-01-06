package br.dac.dojo;

public class bino {
	
	private String anagrama;
	private int totalchar;
	public void criaAnagramas( String palavra ){
		
		char[] letras = new char[palavra.length()];
		char[] vetor = new char[palavra.length()];
		int i;		
		
		for(i=0;i<palavra.length();i++){
			letras[i] = palavra.charAt( i );
		}
		
		for( i = 0; i < letras.length; i++ ) {
			System.out.println( letras[ i ] + criaAnagramas( letras, i ) );
		}
		
	}

	
	
	private String criaAnagramas(char[] letras, int pos ) {
		
		if( letras.length == 2 ) {
			return letras[ 0 ] + letras[ 1 ];
		}
		
		char[] outras = new char[ letras.length - 1 ];
		
		
		for( int i = 0; i < letras.length; i++ ) {
			
		}
		
		
		return 0;
	}



	public  int testaTamanho() {
		totalchar = anagrama.length();
		return totalchar;
	}	


}
