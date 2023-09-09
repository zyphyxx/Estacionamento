package impacta.estacionamento.utilitario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import impacta.estacionamento.negocio.Movimentacao;

/**
 * Representa uam classe de apoio as demais do sistema.
 */

public class EstacionamentoUtil {
	
	 /**
     * Valida a placa com o padrão LLL-NNNN
     * L = Letra
     * N = Numero
     * @param placa placa do veiculo
     * @return true se atender o padrão e false senão.
     */
	
    public static boolean validarPadraoPlaca(String placa){
    	String padrao = "[A_Z][A-Z][A-Z]-\\d\\d\\d\\d";
        Pattern p = Pattern.compile(padrao);
        Matcher m = p.matcher(placa);
        return m.matches();
    }

   
    /**
     * O calculo do valor da estada do veiculo baseado no tarifario
     * e na hora de entrada e saida do veiculo
     *
     * Altera a propria instacia do paramentro
     *
     * @param movimentacao Instacia da movimentação
     */
    
    public void calcularPagamento(Movimentacao movimentacao){
        //TODO implementar

    }

}
