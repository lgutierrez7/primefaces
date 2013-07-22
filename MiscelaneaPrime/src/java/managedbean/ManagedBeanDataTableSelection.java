/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import data.CargaJugadores;
import datamodel.JugadorDataModel;
import entidad.Jugadores;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Luis
 */
@ManagedBean(name = "beandatatableselection")
@ViewScoped
public class ManagedBeanDataTableSelection {

    private List<Jugadores> listaJugadores;
    private Jugadores jugadorSeleccionado;
    private JugadorDataModel jugadorDataModel;

    public Jugadores getJugadorSeleccionado() {
        return jugadorSeleccionado;
    }

    public void setJugadorSeleccionado(Jugadores jugadorSeleccionado) {
        this.jugadorSeleccionado = jugadorSeleccionado;
        
    }

    public JugadorDataModel getJugadorDataModel() {
        return jugadorDataModel;
    }

    public List<Jugadores> getListaJugadores() {

        return listaJugadores;
    }

    /**
     * Creates a new instance of ManagedBeanDataTableSelection
     */
    public ManagedBeanDataTableSelection() {

        CargaJugadores cj = new CargaJugadores();
        this.listaJugadores = cj.obtenerJugadores();
        jugadorDataModel = new JugadorDataModel(listaJugadores);

    }

    public void onRowSelect(SelectEvent selectEvent) {
        FacesMessage facesMessage = new FacesMessage("Jugador Seleccionado",
                ((Jugadores) selectEvent.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

    public void onRowSelect() {
        String idAlumno = extContext().getRequestParameterMap().get("formjugador:jugadores_selection");
        for (Jugadores jugadores : listaJugadores) {
            if (jugadores.getIdAlumno().toString().equalsIgnoreCase(idAlumno)) {
                jugadorSeleccionado = jugadores;
                break;
            }

        }

    }

    // utilidades
    private ExternalContext extContext() {
        FacesContext c = FacesContext.getCurrentInstance();
        ExternalContext ec = c.getExternalContext();
        return ec;
    }
}
