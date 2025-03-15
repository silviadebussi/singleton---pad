
package com.padrao.singleton.Hotel;


import com.padrao.singleton.Hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testHotel {

    @Test
    public void retornaNomeHotel() {
        Hotel.getInstance().setNomeHotel("Hotel Academia");
        assertEquals("Hotel Academia", Hotel.getInstance().getNomeHotel());
    }

    @Test
    public void retornaNomeCliente() {
        Hotel.getInstance().setNomeCliente("Myke Wayner");
        assertEquals("Myke Wayner", Hotel.getInstance().getNomeCliente());
    }

}