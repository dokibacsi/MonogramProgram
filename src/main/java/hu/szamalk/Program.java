package hu.szamalk;

import java.util.Arrays;

public class Program {
    private String[][] tb;
    private String sorok;
    String jel;

    public Program() {
        this.tb = new String[0][0];
        sorok = "";
        jel = new Monogram("!").getJel();
    }

    public void run() {
        sorok = (MonogramEloallit(jel));
        sorDarab(3);
    }

    private void sorDarab(int sor){
        String[] sorokTomb = sorok.split("\n");
        int db = 0;
        for (int i = 0; i < sorokTomb[sor].length(); i++) {
            if(sorokTomb[sor].charAt(i) == jel.charAt(0)){
                db++;
            }
        }
        System.out.println("A "+sor+". sor ennyi jelet tartalmaz: "+db);
    }

    private String MonogramEloallit(String jel){
        String sorok = "";
        String sorEgy = "   " +jel + "      " + jel;
        String sorKetto = "    "+jel + "    " + jel;
        String sorHarom = "     "+jel +"  " + jel;
        String sorNegy = "      "+jel+"" + jel;

        sorok = sorEgy + "\n" + sorKetto + "\n" +sorHarom + "\n" + sorNegy;
        return sorok;
    }


}