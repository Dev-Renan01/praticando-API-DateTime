package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompararDatas {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoBoleto = sdf.parse("01/06/2025");

        Date dataAtual = sdf.parse("06/06/2025");

        if(dataAtual.after(dataVencimentoBoleto)){
            System.out.println("Boleto vencido - URGENTE");
        }else {
            System.out.println("Boleto não vencido");
        }

        System.out.println("------------------------------------------");

        Calendar calendar = Calendar.getInstance();/*Pega data atual*/

        calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("10/06/2025"));//Definindo uma data qualquer

        System.out.println("Dia atual -> "
                + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        calendar.add(calendar.DAY_OF_MONTH, +5);// Data +5 dias
        System.out.println("Somando 5 dias do mês -> "
               + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));


        calendar.add(calendar.MONTH, -4);// Data -4 meses;
        System.out.println("Subtraindo 4 meses -> "
                + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));



    }
}