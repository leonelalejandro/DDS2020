package operacionDeEgreso;

import java.util.*;

import medioDePago.*;
import items.*;
import documentosComerciales.*;
import proveedores.*;

public class OperacionDeEgreso {
	private MedioDePago medioDePago;
	private DocumentoComercial documentoComercial;
	private Proveedor proveedor;
	private ArrayList<Item> items;
	
	public OperacionDeEgreso(MedioDePago medioDePago, DocumentoComercial documentoComercial, Proveedor proveedor, ArrayList<Item> items) {
		this.medioDePago = medioDePago;
		this.documentoComercial = documentoComercial;
		this.proveedor = proveedor;
		this.items = items;
	}
	
	public double calcularTotalOperacion() {
		double total = 0;
		for(Item i: items) {
			total += i.getPrecio();
		}
		return total;
	}
	
	public void adjuntarDocumentoComercial(DocumentoComercial dc) {
		documentoComercial = dc;
	}
	

}
