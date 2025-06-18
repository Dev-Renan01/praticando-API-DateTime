package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        Date date = new Date();

        System.out.println(date);
        System.out.println("---");

        System.out.println("Data em milisegundos: " + date.getTime());
        System.out.println("Calendar - em milisegundos: " + calendar.getTimeInMillis());
        System.out.println("---");

        System.out.println("Dia do mês: " + date.getDate());
        System.out.println("Calendar - dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("---");

        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Calendar - dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
        System.out.println("---");

        System.out.println("Horas do dia: " + date.getHours());
        System.out.println("Calendar - horas do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("---");

        System.out.println("Minuto da hora: " + date.getMinutes());
        System.out.println("Calendar - minuto da hora: " + calendar.get(Calendar.MINUTE));
        System.out.println("---");

        System.out.println("Segundos: " + date.getSeconds());
        System.out.println("Calendar - Segundos: " + calendar.get(Calendar.SECOND));

        System.out.println("---");
        System.out.println("Ano: " + (date.getYear() + 1900));
        System.out.println("Calendar - ano: " + calendar.get(Calendar.YEAR));


        /*********SIMPLE DATE FORMAT*************/
        System.out.println("-------------------------------------");


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm.ss");

        System.out.println("Data atual em formato padrão e String: " + sdf.format(date));
        System.out.println("Calendar - data atual em formato padrão e String: " + sdf.format(calendar.getTime()));
        System.out.println("---");


        SimpleDateFormat sdfDB = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

        System.out.println("Data atual em formato para banco de dados: " + sdfDB.format(date));
        System.out.println("Calendar - data atual em formato para banco de dados: " + sdfDB.format(calendar.getTime()));
        System.out.println("---");

        try {
            System.out.println("Objeto Date: " + sdf.parse("2006/11/18 11:45.08"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}