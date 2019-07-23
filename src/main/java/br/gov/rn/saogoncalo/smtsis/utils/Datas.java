package br.gov.rn.saogoncalo.smtsis.utils;

import org.springframework.context.annotation.Configuration;

import java.util.Calendar;
import java.util.Date;

@Configuration
public class Datas {

    private Date dataAtual;


    public Date setDataAtual() {
        Date date = Calendar.getInstance().getTime();
        return this.dataAtual = date;
    }

}
