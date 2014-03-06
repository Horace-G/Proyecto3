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
 * Ésta clase es nuestra propia implementación de la clase COLA.
 */
public class Queue {
    List l;
    int pos;
    
    public Queue(){//constructor de la clase
        pos=-1;
        l=new List();
        l.init();//inicializamos la lista atributo de la cola
    }//fin del constructor
    
    public int size(){//metodo accesor del tamaño de la lista que pertenece a ésta clase
        return l.size()-1;
    }//fin del metodo size
    
    public boolean queue(Object o){//metodo que agrega a la cola
        if(l.insert(o)==true){
            return true;
        }
        return false;
    }//fin del metodo agregar a la cola
    
    public Object dequeue(){//metodo que saca de la cola
        return l.remove(0);
    }//fin del metodo dequeue
    
    public Object peek(){//mira el elemento en el tope de la cola sin sacarlo
        return l.get(0);
    }//fin el metodo peek
    
    public Object last(){//retorn el ultimo elemento de la cola
        return l.get(l.size()-1);
    }//fin del metodo last
    
    public Queue duplicate(){//metodo que duplica la cola
        Queue q=new Queue();
        
        for(int i=0;i<l.size();i++)
            q.queue(l.get(i));
        
        return q;//retorn la lista que fue duplicada
    }
    
}
