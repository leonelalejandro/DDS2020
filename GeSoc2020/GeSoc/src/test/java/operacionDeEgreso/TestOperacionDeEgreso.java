package operacionDeEgreso;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import documentosComerciales.DocumentoComercial;
import items.Item;
import medioDePago.*;
import proveedores.Proveedor;

public class TestOperacionDeEgreso {
	
	@Test
	public void testValorOperacion() throws Exception{
		
		//Seteo items
		Item item1 = new Item(20.0, "Yerba");
		Item item2 = new Item(10, "Azucar");
		Item item3 = new Item(15, "Agua");
		Item item4 = new Item(100, "Edulcorante");
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		
		//Seteo metodos de pago
		TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("00001");
		TarjetaDeDebito tarjeta2 = new TarjetaDeDebito("00002");
		Efectivo efectivo1 = new Efectivo("00003");
		SaldoPrecargado saldo1 = new SaldoPrecargado("00004");
		
		//Seteo proveedores
		Proveedor proveedor1 = new Proveedor("Macro");
		Proveedor proveedor2 = new Proveedor("Coto");
		
		//Seteo documentos comerciales
		DocumentoComercial dc1 = new DocumentoComercial();
		DocumentoComercial dc2 = new DocumentoComercial();
		DocumentoComercial dc3 = new DocumentoComercial();
		DocumentoComercial dc4 = new DocumentoComercial();
		DocumentoComercial dc5 = new DocumentoComercial();
		
		//Seteo operacion de egreso
		OperacionDeEgreso operacion1 = new OperacionDeEgreso(saldo1, dc5, proveedor2,items) ;
		
		assertEquals("Error en el calculo de la operacion.",145.0,operacion1.calcularTotalOperacion(),0.1);
	}
}
	

