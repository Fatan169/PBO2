/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2;

/**
 *
 * @author asus
 */
public class ujibus_4 {
    public static void main(String[] abc) {
        bus4 bus = new bus4(100);
        bus.getpenumpang(17);
        bus.getpenumpang(2003);
        bus.cetakpenumpang();
        bus.addpenumpang(19);
        bus.cetakpenumpang();
        bus.addpenumpang(24);
        bus.cetakpenumpang();
        bus.addpenumpang(18);
        bus.cetakpenumpang();
        bus.addpenumpang(29);
        bus.cetakpenumpang();
    }
}
