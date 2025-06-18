package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class FaixaDeTempo {
    public static void main(String[] args) throws ParseException {

        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2006-11-18"),LocalDate.now());

        System.out.println("Possuí " + dias + " dias entre a faixa de data! ");

        //*****************************************

        //Gerando parcelas mensais e suas datas

        /*Data inicial, EX: uma compra parcelada*/
        Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("18/06/2025");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataInicial);/*Instanciar o obj calendar e passar a dataInicial*/

        for(int i = 1; i <= 12; i++){
            calendar.add(Calendar.MONTH, 1);// Adicionar 1 mês a cada iteração

            System.out.println("---------");
            System.out.println("Parcela de número: " + i + "\nvencimento: "
                    + new SimpleDateFormat("dd/MM/yyyy").format (calendar.getTime()));


        }
    }
}
