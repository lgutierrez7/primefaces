/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import entidad.Jugadores;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.DualListModel;

/**
 *
 * @author Luis
 */
@ManagedBean(name = "beanpickList")
@ViewScoped
public class ManagedBeanPickList {

    private List<Jugadores> listaJugadores;
    private DualListModel<String> listaCiudades;
    
    /**
     * Creates a new instance of ManagedBeanPickList
     */
    public ManagedBeanPickList() {
        
        List<String> ciudadesSource = new ArrayList<String>();
        List<String> ciudadesTarget = new ArrayList<String>();
        ciudadesSource.add("Lima");
        ciudadesSource.add("Arequipa");
        ciudadesSource.add("Trujillo");
        ciudadesSource.add("Moyobamba");
        ciudadesSource.add("Huaraz");
        listaCiudades = new DualListModel<String>(ciudadesSource, ciudadesTarget);
        
    }

    public List<Jugadores> getListaJugadores() {
        return listaJugadores;
    }

    public DualListModel<String> getListaCiudades() {
        return listaCiudades;
    }

 
    
    
}
