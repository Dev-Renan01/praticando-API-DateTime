package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class TrabalhandoComInstant {
    public static void main(String[] args) throws InterruptedException {

        Instant inicioInstant = Instant.now();

        Thread.sleep(2000);//pode ser um processo com tempo qualquer que não conhecemos

        Instant finalInstant = Instant.now();

        Duration duracao = Duration.between(inicioInstant, finalInstant);

        System.out.println("Duração em nano segundos: " + duracao.getNano());

        System.out.println("Duração em segundos: " + duracao.getSeconds());

        System.out.println("Duração em minutos: " + duracao.toMinutes());

        System.out.println("Duração em horas: " + duracao.toHours());
        
        //**********************************************
        System.out.println("-------------------------------------");

        LocalDate dataAntiga = LocalDate.of(2020, 2, 7);

        LocalDate dataNova = LocalDate.of(2025, 5, 19);

        System.out.println("Data antiga é posterior a data nova? " + dataAntiga.isAfter(dataNova));

        System.out.println("Data antiga é anterior a data nova? " + dataAntiga.isBefore(dataNova));

        System.out.println("As datas são iguais? " + dataAntiga.isEqual(dataNova));

        System.out.println("--------");

        Period periodo = Period.between(dataAntiga, dataNova);

        System.out.println("Quantos dias há nessa faixa de período? " + periodo.getDays());

        System.out.println("Quantos meses há nessa faixa de período? " + periodo.toTotalMonths());

        System.out.println("Quantos anos há nessa faixa de período? " + periodo.getYears());

        System.out.println("Período é de: " + periodo.getYears()
                + " anos " + periodo.getMonths() + " meses " + periodo.getDays() + " e anos");

        //*************************************************
        System.out.println("-------------------------------------");

        LocalDate dataBase = LocalDate.parse("2020-12-20");

        System.out.println("Mais 5 dias: " + (dataBase =  dataBase.plusDays(5)));

        System.out.println("Mais 8 semanas: " + (dataBase = dataBase.plusWeeks(8)));

        System.out.println("Mais 4 meses: " + (dataBase = dataBase.plusMonths(4)));

        System.out.println("Mais 2 anos: " + (dataBase = dataBase.plusYears(2)));
        System.out.println("------");
        System.out.println("Menos 1 mês: " + (dataBase = dataBase.minusMonths(1)));

        System.out.println("Menos 7 dias: " + (dataBase = dataBase.minusDays(7)));
    }
}
