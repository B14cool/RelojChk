/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojchk;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Reloj extends javax.swing.JFrame implements Runnable {

    int hora, minuto, segundos;
    Thread hilo;

    public Reloj() {
        initComponents();

        setLocationRelativeTo(null);
        setVisible(true);
        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {

        Thread thread = Thread.currentThread();

        while (thread == hilo) {
            
            dameLaHora(); // ;)

            try {
                Thread .sleep(1000);
            } catch (Exception e) {

            }
        }
    }
    /**
     * @param void
     * @return void
     * Se encarga de calcular la hora. Método encapsulado para que se vea más ordenado
     */
    public void dameLaHora(){
        Calendar cal = new GregorianCalendar();
            Date now = new Date();
            hora = cal.get(Calendar.HOUR);
            cal.setTime(now);

            hora = cal.get(Calendar.HOUR);
            switch (hora) {

                case 00:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);

                    hbox14.setSelected(true);
                    hbox15.setSelected(true);
                    hbox16.setSelected(true);
                    hbox17.setSelected(true);
                    hbox18.setSelected(true);
                    hbox19.setSelected(true);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(false);

                    break;
                case 01:
                    hbox1.setVisible(true);
                    hbox2.setVisible(true);
                    hbox3.setVisible(true);
                    hbox4.setVisible(true);
                    hbox5.setVisible(true);
                    hbox6.setVisible(true);
                    hbox7.setVisible(true);
                    hbox8.setVisible(true);
                    hbox9.setVisible(true);
                    hbox10.setVisible(true);
                    hbox11.setVisible(true);
                    hbox12.setVisible(true);
                    hbox13.setVisible(false);

                    hbox14.setVisible(true);
                    hbox15.setVisible(true);
                    hbox16.setVisible(true);
                    hbox17.setVisible(true);
                    hbox18.setVisible(true);
                    hbox19.setVisible(true);
                    hbox20.setVisible(true);
                    hbox21.setVisible(true);
                    hbox22.setVisible(true);
                    hbox23.setVisible(true);
                    hbox24.setVisible(true);
                    hbox25.setVisible(true);
                    hbox26.setVisible(false);

                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);

                    hbox14.setSelected(false);
                    hbox15.setSelected(false);
                    hbox16.setSelected(false);
                    hbox17.setSelected(false);
                    hbox18.setSelected(false);
                    hbox19.setSelected(false);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(false);
                    break;

                case 2:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);

                    hbox14.setSelected(true);
                    hbox15.setSelected(false);
                    hbox16.setSelected(true);
                    hbox17.setSelected(true);
                    hbox18.setSelected(true);
                    hbox19.setSelected(true);
                    hbox20.setSelected(true);
                    hbox21.setSelected(false);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(true);
                    break;

                case 03:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);

                    hbox14.setSelected(true);
                    hbox15.setSelected(false);
                    hbox16.setSelected(true);
                    hbox17.setSelected(false);
                    hbox18.setSelected(true);
                    hbox19.setSelected(true);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(true);
                    break;

                case 4:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);

                    hbox14.setSelected(true);
                    hbox15.setSelected(true);
                    hbox16.setSelected(true);
                    hbox17.setSelected(false);
                    hbox18.setSelected(false);
                    hbox19.setSelected(false);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(false);
                    hbox26.setSelected(true);
                    break;

                case 5:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);

                    hbox14.setSelected(true);
                    hbox15.setSelected(true);
                    hbox16.setSelected(true);
                    hbox17.setSelected(false);
                    hbox18.setSelected(true);
                    hbox19.setSelected(true);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(false);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(true);
                    break;

                case 6:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);
                    hbox14.setSelected(true);
                    hbox15.setSelected(true);
                    hbox16.setSelected(true);
                    hbox17.setSelected(true);
                    hbox18.setSelected(true);
                    hbox19.setSelected(true);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(false);
                    hbox24.setSelected(false);
                    hbox25.setSelected(false);
                    hbox26.setSelected(true);
                    break;
                case 7:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);
                    hbox14.setSelected(true);
                    hbox15.setSelected(false);
                    hbox16.setSelected(false);
                    hbox17.setSelected(false);
                    hbox18.setSelected(false);
                    hbox19.setSelected(false);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(false);
                    break;
                case 8:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);
                    hbox14.setSelected(true);
                    hbox15.setSelected(true);
                    hbox16.setSelected(true);
                    hbox17.setSelected(true);
                    hbox18.setSelected(true);
                    hbox19.setSelected(true);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(true);
                    break;
                case 9:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(true);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(true);
                    hbox13.setSelected(false);
                    hbox14.setSelected(true);
                    hbox15.setSelected(true);
                    hbox16.setSelected(true);
                    hbox17.setSelected(false);
                    hbox18.setSelected(false);
                    hbox19.setSelected(false);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(true);
                    break;
                case 10:
                    hbox1.setSelected(false);
                    hbox2.setSelected(false);
                    hbox3.setSelected(false);
                    hbox4.setSelected(false);
                    hbox5.setSelected(false);
                    hbox6.setSelected(false);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(false);
                    hbox13.setSelected(false);

                    hbox14.setSelected(true);
                    hbox15.setSelected(true);
                    hbox16.setSelected(true);
                    hbox17.setSelected(true);
                    hbox18.setSelected(true);
                    hbox19.setSelected(true);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(false);
                    break;
                case 11:
                    hbox1.setSelected(false);
                    hbox2.setSelected(false);
                    hbox3.setSelected(false);
                    hbox4.setSelected(false);
                    hbox5.setSelected(false);
                    hbox6.setSelected(false);
                    hbox7.setSelected(true);
                    hbox8.setSelected(true);
                    hbox9.setSelected(true);
                    hbox10.setSelected(true);
                    hbox11.setSelected(true);
                    hbox12.setSelected(false);
                    hbox13.setSelected(false);

                    hbox14.setSelected(false);
                    hbox15.setSelected(false);
                    hbox16.setSelected(false);
                    hbox17.setSelected(false);
                    hbox18.setSelected(false);
                    hbox19.setSelected(false);
                    hbox20.setSelected(true);
                    hbox21.setSelected(true);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(false);
                    hbox26.setSelected(false);
                    break;
                case 12:
                    hbox1.setSelected(true);
                    hbox2.setSelected(true);
                    hbox3.setSelected(true);
                    hbox4.setSelected(true);
                    hbox5.setSelected(true);
                    hbox6.setSelected(false);
                    hbox7.setSelected(false);
                    hbox8.setSelected(false);
                    hbox9.setSelected(false);
                    hbox10.setSelected(false);
                    hbox11.setSelected(false);
                    hbox12.setSelected(false);
                    hbox13.setSelected(false);
                    hbox14.setSelected(true);
                    hbox15.setSelected(false);
                    hbox16.setSelected(true);
                    hbox17.setSelected(true);
                    hbox18.setSelected(true);
                    hbox19.setSelected(true);
                    hbox20.setSelected(true);
                    hbox21.setSelected(false);
                    hbox22.setSelected(true);
                    hbox23.setSelected(true);
                    hbox24.setSelected(true);
                    hbox25.setSelected(true);
                    hbox26.setSelected(true);
                    break;
                default:
                    break;
            }

            minuto = cal.get(Calendar.MINUTE);
                switch (minuto) {
                case 00:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);

                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 01:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(false);
                    mbox20.setSelected(false);
                    mbox21.setSelected(false);
                    mbox22.setSelected(false);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(false);
                    break;
                case 2:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(false);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 3:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);
                    
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 4:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);

                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 5:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);

                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 6:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);
                    
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 7:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);

                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(false);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 8:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 9:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 10:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 11:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(false);
                    mbox20.setSelected(false);
                    mbox21.setSelected(false);
                    mbox22.setSelected(false);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(false);
                    break;
                case 12:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(false);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 13:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 14:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 15:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 16:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 17:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    cbox15.setSelected(false);
                    mbox16.setSelected(false);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 18:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 19:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(false);
                    mbox7.setSelected(false);
                    mbox8.setSelected(false);
                    mbox9.setSelected(false);
                    mbox10.setSelected(false);
                    mbox11.setSelected(false);
                    mbox12.setSelected(false);
                    mbox13.setSelected(false);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 20:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 21:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(false);
                    mbox20.setSelected(false);
                    mbox21.setSelected(false);
                    mbox22.setSelected(false);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(false);
                    break;
                case 22:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(false);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 23:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 24:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 25:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 26:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 27:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(false);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 28:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 29:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(true);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(false);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 30:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 31:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(false);
                    mbox20.setSelected(false);
                    mbox21.setSelected(false);
                    mbox22.setSelected(false);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(false);
                    break;
                case 32:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(false);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 33:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 34:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 35:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 36:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 37:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(false);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 38:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 39:
                    mbox1.setSelected(true);
                    mbox2.setSelected(false);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 40:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 41:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(false);
                    mbox20.setSelected(false);
                    mbox21.setSelected(false);
                    mbox22.setSelected(false);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(false);
                    break;
                case 42:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(false);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 43:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 44:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 45:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 46:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 47:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(false);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 48:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 49:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(false);
                    mbox6.setSelected(false);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(true);
                    mbox11.setSelected(true);
                    mbox12.setSelected(false);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 50:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 51:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(false);
                    mbox20.setSelected(false);
                    mbox21.setSelected(false);
                    mbox22.setSelected(false);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(false);
                    break;
                case 52:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(false);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 53:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 54:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 55:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 56:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(false);
                    mbox24.setSelected(false);
                    mbox25.setSelected(false);
                    mbox26.setSelected(true);
                    break;
                case 57:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(false);
                    mbox16.setSelected(false);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(false);
                    break;
                case 58:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(true);
                    mbox18.setSelected(true);
                    mbox19.setSelected(true);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                case 59:
                    mbox1.setSelected(true);
                    mbox2.setSelected(true);
                    mbox3.setSelected(true);
                    mbox4.setSelected(false);
                    mbox5.setSelected(true);
                    mbox6.setSelected(true);
                    mbox7.setSelected(true);
                    mbox8.setSelected(true);
                    mbox9.setSelected(true);
                    mbox10.setSelected(false);
                    mbox11.setSelected(true);
                    mbox12.setSelected(true);
                    mbox13.setSelected(true);
                    mbox14.setSelected(true);
                    mbox15.setSelected(true);
                    mbox16.setSelected(true);
                    mbox17.setSelected(false);
                    mbox18.setSelected(false);
                    mbox19.setSelected(false);
                    mbox20.setSelected(true);
                    mbox21.setSelected(true);
                    mbox22.setSelected(true);
                    mbox23.setSelected(true);
                    mbox24.setSelected(true);
                    mbox25.setSelected(true);
                    mbox26.setSelected(true);
                    break;
                default:
                    break;
            }

            segundos = cal.get(Calendar.SECOND);

            switch (segundos) {
                case 00:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);

                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 01:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(false);
                    cbox20.setSelected(false);
                    cbox21.setSelected(false);
                    cbox22.setSelected(false);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(false);
                    break;
                case 2:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(false);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 3:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);

                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 4:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);

                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 5:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);

                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 6:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);

                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 7:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);

                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(false);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 8:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 9:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 10:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 11:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(false);
                    cbox20.setSelected(false);
                    cbox21.setSelected(false);
                    cbox22.setSelected(false);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(false);
                    break;
                case 12:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(false);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 13:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 14:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 15:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 16:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 17:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(false);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 18:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 19:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(false);
                    cbox7.setSelected(false);
                    cbox8.setSelected(false);
                    cbox9.setSelected(false);
                    cbox10.setSelected(false);
                    cbox11.setSelected(false);
                    cbox12.setSelected(false);
                    cbox13.setSelected(false);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 20:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 21:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(false);
                    cbox20.setSelected(false);
                    cbox21.setSelected(false);
                    cbox22.setSelected(false);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(false);
                    break;
                case 22:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(false);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 23:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 24:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 25:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 26:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 27:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(false);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 28:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 29:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(true);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(false);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 30:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 31:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(false);
                    cbox20.setSelected(false);
                    cbox21.setSelected(false);
                    cbox22.setSelected(false);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(false);
                    break;
                case 32:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(false);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 33:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 34:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 35:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 36:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 37:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(false);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 38:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 39:
                    cbox1.setSelected(true);
                    cbox2.setSelected(false);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 40:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 41:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(false);
                    cbox20.setSelected(false);
                    cbox21.setSelected(false);
                    cbox22.setSelected(false);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(false);
                    break;
                case 42:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(false);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 43:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 44:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 45:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 46:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 47:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(false);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 48:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 49:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(false);
                    cbox6.setSelected(false);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(true);
                    cbox11.setSelected(true);
                    cbox12.setSelected(false);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 50:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 51:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(false);
                    cbox20.setSelected(false);
                    cbox21.setSelected(false);
                    cbox22.setSelected(false);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(false);
                    break;
                case 52:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(false);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 53:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 54:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 55:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 56:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(false);
                    cbox24.setSelected(false);
                    cbox25.setSelected(false);
                    cbox26.setSelected(true);
                    break;
                case 57:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(false);
                    cbox16.setSelected(false);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(false);
                    break;
                case 58:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(true);
                    cbox18.setSelected(true);
                    cbox19.setSelected(true);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                case 59:
                    cbox1.setSelected(true);
                    cbox2.setSelected(true);
                    cbox3.setSelected(true);
                    cbox4.setSelected(false);
                    cbox5.setSelected(true);
                    cbox6.setSelected(true);
                    cbox7.setSelected(true);
                    cbox8.setSelected(true);
                    cbox9.setSelected(true);
                    cbox10.setSelected(false);
                    cbox11.setSelected(true);
                    cbox12.setSelected(true);
                    cbox13.setSelected(true);
                    cbox14.setSelected(true);
                    cbox15.setSelected(true);
                    cbox16.setSelected(true);
                    cbox17.setSelected(false);
                    cbox18.setSelected(false);
                    cbox19.setSelected(false);
                    cbox20.setSelected(true);
                    cbox21.setSelected(true);
                    cbox22.setSelected(true);
                    cbox23.setSelected(true);
                    cbox24.setSelected(true);
                    cbox25.setSelected(true);
                    cbox26.setSelected(true);
                    break;
                default:
                    break;
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mbox22 = new javax.swing.JCheckBox();
        mbox2 = new javax.swing.JCheckBox();
        mbox18 = new javax.swing.JCheckBox();
        mbox3 = new javax.swing.JCheckBox();
        mbox23 = new javax.swing.JCheckBox();
        mbox4 = new javax.swing.JCheckBox();
        mbox19 = new javax.swing.JCheckBox();
        mbox5 = new javax.swing.JCheckBox();
        cbox21 = new javax.swing.JCheckBox();
        mbox24 = new javax.swing.JCheckBox();
        cbox22 = new javax.swing.JCheckBox();
        mbox6 = new javax.swing.JCheckBox();
        cbox23 = new javax.swing.JCheckBox();
        cbox24 = new javax.swing.JCheckBox();
        cbox25 = new javax.swing.JCheckBox();
        cbox26 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        hbox1 = new javax.swing.JCheckBox();
        hbox2 = new javax.swing.JCheckBox();
        hbox3 = new javax.swing.JCheckBox();
        hbox4 = new javax.swing.JCheckBox();
        hbox5 = new javax.swing.JCheckBox();
        hbox6 = new javax.swing.JCheckBox();
        hbox7 = new javax.swing.JCheckBox();
        hbox8 = new javax.swing.JCheckBox();
        hbox9 = new javax.swing.JCheckBox();
        hbox10 = new javax.swing.JCheckBox();
        hbox11 = new javax.swing.JCheckBox();
        hbox12 = new javax.swing.JCheckBox();
        hbox13 = new javax.swing.JCheckBox();
        hbox15 = new javax.swing.JCheckBox();
        mbox20 = new javax.swing.JCheckBox();
        hbox16 = new javax.swing.JCheckBox();
        mbox7 = new javax.swing.JCheckBox();
        hbox17 = new javax.swing.JCheckBox();
        mbox25 = new javax.swing.JCheckBox();
        mbox8 = new javax.swing.JCheckBox();
        mbox21 = new javax.swing.JCheckBox();
        mbox26 = new javax.swing.JCheckBox();
        cbox1 = new javax.swing.JCheckBox();
        cbox2 = new javax.swing.JCheckBox();
        cbox6 = new javax.swing.JCheckBox();
        p1 = new javax.swing.JCheckBox();
        hbox22 = new javax.swing.JCheckBox();
        hbox18 = new javax.swing.JCheckBox();
        hbox23 = new javax.swing.JCheckBox();
        hbox19 = new javax.swing.JCheckBox();
        hbox24 = new javax.swing.JCheckBox();
        hbox20 = new javax.swing.JCheckBox();
        hbox25 = new javax.swing.JCheckBox();
        hbox21 = new javax.swing.JCheckBox();
        p2 = new javax.swing.JCheckBox();
        hbox26 = new javax.swing.JCheckBox();
        p3 = new javax.swing.JCheckBox();
        hbox14 = new javax.swing.JCheckBox();
        p4 = new javax.swing.JCheckBox();
        cbox3 = new javax.swing.JCheckBox();
        cbox4 = new javax.swing.JCheckBox();
        cbox5 = new javax.swing.JCheckBox();
        cbox7 = new javax.swing.JCheckBox();
        cbox8 = new javax.swing.JCheckBox();
        cbox9 = new javax.swing.JCheckBox();
        cbox10 = new javax.swing.JCheckBox();
        mbox14 = new javax.swing.JCheckBox();
        mbox9 = new javax.swing.JCheckBox();
        mbox10 = new javax.swing.JCheckBox();
        mbox11 = new javax.swing.JCheckBox();
        mbox12 = new javax.swing.JCheckBox();
        mbox13 = new javax.swing.JCheckBox();
        mbox15 = new javax.swing.JCheckBox();
        mbox16 = new javax.swing.JCheckBox();
        cbox11 = new javax.swing.JCheckBox();
        mbox1 = new javax.swing.JCheckBox();
        cbox12 = new javax.swing.JCheckBox();
        mbox17 = new javax.swing.JCheckBox();
        cbox13 = new javax.swing.JCheckBox();
        cbox14 = new javax.swing.JCheckBox();
        cbox15 = new javax.swing.JCheckBox();
        cbox16 = new javax.swing.JCheckBox();
        cbox17 = new javax.swing.JCheckBox();
        cbox18 = new javax.swing.JCheckBox();
        cbox19 = new javax.swing.JCheckBox();
        cbox20 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(59, 70, 73));

        jLabel1.setBackground(new java.awt.Color(142, 29, 221));
        jLabel1.setFont(new java.awt.Font("Malayalam MN", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La Hora es:");

        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });

        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hbox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hbox6))
                    .addComponent(hbox4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hbox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hbox13))
                    .addComponent(hbox2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hbox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hbox12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hbox11)
                    .addComponent(hbox10)
                    .addComponent(hbox9)
                    .addComponent(hbox8)
                    .addComponent(hbox7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hbox18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hbox19))
                    .addComponent(hbox17)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hbox16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hbox26))
                    .addComponent(hbox15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hbox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hbox25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hbox24)
                    .addComponent(hbox20)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hbox22)
                            .addComponent(hbox23)
                            .addComponent(hbox21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p2)
                            .addComponent(p1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mbox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mbox6))
                    .addComponent(mbox4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mbox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mbox13))
                    .addComponent(mbox2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mbox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mbox12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mbox11)
                    .addComponent(mbox10)
                    .addComponent(mbox9)
                    .addComponent(mbox8)
                    .addComponent(mbox7))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mbox18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mbox19))
                    .addComponent(mbox17)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mbox16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mbox26))
                    .addComponent(mbox15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mbox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mbox25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mbox24)
                    .addComponent(mbox23)
                    .addComponent(mbox22)
                    .addComponent(mbox21)
                    .addComponent(mbox20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3)
                    .addComponent(p4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbox11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbox10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbox7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbox9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbox4)
                        .addGap(40, 40, 40)
                        .addComponent(cbox8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbox18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox19))
                    .addComponent(cbox17)
                    .addComponent(cbox15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbox16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox24)
                    .addComponent(cbox22)
                    .addComponent(cbox21)
                    .addComponent(cbox20)
                    .addComponent(cbox23)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hbox1)
                            .addComponent(hbox11)
                            .addComponent(hbox12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hbox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hbox3)
                                            .addComponent(hbox13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(hbox4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(hbox5)
                                                    .addComponent(hbox6)
                                                    .addComponent(hbox7)))
                                            .addComponent(hbox8)))
                                    .addComponent(hbox9)))
                            .addComponent(hbox10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hbox14)
                            .addComponent(hbox24)
                            .addComponent(hbox25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hbox15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hbox16)
                                            .addComponent(hbox26))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(hbox17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(hbox18)
                                                    .addComponent(hbox19)
                                                    .addComponent(hbox20)))
                                            .addComponent(hbox21)))
                                    .addComponent(hbox22)))
                            .addComponent(hbox23)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p1)
                                .addGap(35, 35, 35)
                                .addComponent(p2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mbox14)
                            .addComponent(mbox24)
                            .addComponent(mbox25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mbox15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mbox16)
                                            .addComponent(mbox26))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(mbox17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mbox18)
                                                    .addComponent(mbox19)
                                                    .addComponent(mbox20)))
                                            .addComponent(mbox21)))
                                    .addComponent(mbox22)))
                            .addComponent(mbox23)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p3)
                                .addGap(35, 35, 35)
                                .addComponent(p4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbox24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox23)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbox13)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbox22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbox21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbox6)
                                    .addComponent(cbox5)
                                    .addComponent(cbox7)
                                    .addComponent(cbox18)
                                    .addComponent(cbox19)
                                    .addComponent(cbox20)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbox11)
                                    .addComponent(cbox12)
                                    .addComponent(cbox14)
                                    .addComponent(cbox25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox10))
                            .addComponent(cbox15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox8))
                            .addComponent(cbox17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbox26)
                                    .addComponent(cbox16))
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mbox1)
                            .addComponent(mbox11)
                            .addComponent(mbox12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mbox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mbox3)
                                            .addComponent(mbox13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(mbox4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mbox5)
                                                    .addComponent(mbox6)
                                                    .addComponent(mbox7)))
                                            .addComponent(mbox8)))
                                    .addComponent(mbox9)))
                            .addComponent(mbox10))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code he
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbox1;
    private javax.swing.JCheckBox cbox10;
    private javax.swing.JCheckBox cbox11;
    private javax.swing.JCheckBox cbox12;
    private javax.swing.JCheckBox cbox13;
    private javax.swing.JCheckBox cbox14;
    private javax.swing.JCheckBox cbox15;
    private javax.swing.JCheckBox cbox16;
    private javax.swing.JCheckBox cbox17;
    private javax.swing.JCheckBox cbox18;
    private javax.swing.JCheckBox cbox19;
    private javax.swing.JCheckBox cbox2;
    private javax.swing.JCheckBox cbox20;
    private javax.swing.JCheckBox cbox21;
    private javax.swing.JCheckBox cbox22;
    private javax.swing.JCheckBox cbox23;
    private javax.swing.JCheckBox cbox24;
    private javax.swing.JCheckBox cbox25;
    private javax.swing.JCheckBox cbox26;
    private javax.swing.JCheckBox cbox3;
    private javax.swing.JCheckBox cbox4;
    private javax.swing.JCheckBox cbox5;
    private javax.swing.JCheckBox cbox6;
    private javax.swing.JCheckBox cbox7;
    private javax.swing.JCheckBox cbox8;
    private javax.swing.JCheckBox cbox9;
    private javax.swing.JCheckBox hbox1;
    private javax.swing.JCheckBox hbox10;
    private javax.swing.JCheckBox hbox11;
    private javax.swing.JCheckBox hbox12;
    private javax.swing.JCheckBox hbox13;
    private javax.swing.JCheckBox hbox14;
    private javax.swing.JCheckBox hbox15;
    private javax.swing.JCheckBox hbox16;
    private javax.swing.JCheckBox hbox17;
    private javax.swing.JCheckBox hbox18;
    private javax.swing.JCheckBox hbox19;
    private javax.swing.JCheckBox hbox2;
    private javax.swing.JCheckBox hbox20;
    private javax.swing.JCheckBox hbox21;
    private javax.swing.JCheckBox hbox22;
    private javax.swing.JCheckBox hbox23;
    private javax.swing.JCheckBox hbox24;
    private javax.swing.JCheckBox hbox25;
    private javax.swing.JCheckBox hbox26;
    private javax.swing.JCheckBox hbox3;
    private javax.swing.JCheckBox hbox4;
    private javax.swing.JCheckBox hbox5;
    private javax.swing.JCheckBox hbox6;
    private javax.swing.JCheckBox hbox7;
    private javax.swing.JCheckBox hbox8;
    private javax.swing.JCheckBox hbox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox mbox1;
    private javax.swing.JCheckBox mbox10;
    private javax.swing.JCheckBox mbox11;
    private javax.swing.JCheckBox mbox12;
    private javax.swing.JCheckBox mbox13;
    private javax.swing.JCheckBox mbox14;
    private javax.swing.JCheckBox mbox15;
    private javax.swing.JCheckBox mbox16;
    private javax.swing.JCheckBox mbox17;
    private javax.swing.JCheckBox mbox18;
    private javax.swing.JCheckBox mbox19;
    private javax.swing.JCheckBox mbox2;
    private javax.swing.JCheckBox mbox20;
    private javax.swing.JCheckBox mbox21;
    private javax.swing.JCheckBox mbox22;
    private javax.swing.JCheckBox mbox23;
    private javax.swing.JCheckBox mbox24;
    private javax.swing.JCheckBox mbox25;
    private javax.swing.JCheckBox mbox26;
    private javax.swing.JCheckBox mbox3;
    private javax.swing.JCheckBox mbox4;
    private javax.swing.JCheckBox mbox5;
    private javax.swing.JCheckBox mbox6;
    private javax.swing.JCheckBox mbox7;
    private javax.swing.JCheckBox mbox8;
    private javax.swing.JCheckBox mbox9;
    private javax.swing.JCheckBox p1;
    private javax.swing.JCheckBox p2;
    private javax.swing.JCheckBox p3;
    private javax.swing.JCheckBox p4;
    // End of variables declaration//GEN-END:variables
}
