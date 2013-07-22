/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

import entidad.Jugadores;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author Luis
 */
public class JugadorDataModel extends ListDataModel<Jugadores> implements SelectableDataModel<Jugadores> {

    public JugadorDataModel() {
       
    }
    
    public JugadorDataModel(List<Jugadores> list) {
        super(list);
    }

    
    
    @Override
    public Object getRowKey(Jugadores jugadores) {
        return jugadores.getIdAlumno();
    }

    @Override
    public Jugadores getRowData(String rowKey) {
        List<Jugadores> listaJugadores = (List<Jugadores>) getWrappedData();
        for(Jugadores jugadores:listaJugadores){
            if(jugadores.getIdAlumno().toString().equals(rowKey)){
                return jugadores;
            }
        }
        return null;
    }
    
    
    
}
