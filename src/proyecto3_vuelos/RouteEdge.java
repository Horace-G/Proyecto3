/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3_vuelos;

/**
 *
 * @author Horacio Galdamez
 */

/*
 * Ésta clase es la arista del grafo, y en ella se almacenan el nombre de la aerolínea y el costo del vuelo, y conecta
 * dos vértices, que contienen ciudades de las que están en la tabla
 */

public class RouteEdge {
    private String airline;//aerolínea que hace el vuelo y será almacenada en la arista
    private double cost;//costo de ése vuelo almacenado por la arista
    
    public RouteEdge(String airline,double cost){//vértice del grafo
        this.airline=airline;
        this.cost=cost;
    }
    
    public String getAirline(){//metodo accesor de la aerolinea
        return airline;
    }
    
    public double getCost(){//metodo accesor del costo de la arista
        return cost;
    }
    
    @Override
    public String toString(){//metodo propio del toString, utilizado para salidas vistas por el usuario
        return airline+", $"+cost;
    }
    
}//fin de la clase
