package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class APIDatas {
    public static void main(String[] args) {
        /*Nova API de data a partir do java 8*/

        LocalDate dataAtual = LocalDate.now();//Data Atual
        System.out.println("data atual -> " + dataAtual);

        LocalTime horaAtual = LocalTime.now();//Hora atual
        System.out.println("Hora atual -> " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm.ss")));

        LocalDateTime dataHoraAtual = LocalDateTime.now();//Data e Hora atual;
        System.out.println("Data e hora atual -> " +
                dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm.ss")));

        //********************************************
        System.out.println("-------------------------------------");

        LocalDate localDate = LocalDate.now();
        System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("----");

        System.out.println("Dia da semana (escrito): " + localDate.getDayOfWeek());
        System.out.println("Dia da semana (numeração): " + localDate.getDayOfWeek().ordinal());
        System.out.println("----");

        System.out.println("Mês (escrito): " + localDate.getMonth());
        System.out.println("Mês (numeração): " + localDate.getMonthValue());
        System.out.println("Dia do mês: " + localDate.getDayOfMonth());
        System.out.println("----");

        System.out.println("ano: " + localDate.getYear());






    }
}
