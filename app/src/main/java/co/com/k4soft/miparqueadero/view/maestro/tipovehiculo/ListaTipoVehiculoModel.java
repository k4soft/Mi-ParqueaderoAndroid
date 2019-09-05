package co.com.k4soft.miparqueadero.view.maestro.tipovehiculo;

public class ListaTipoVehiculoModel implements ListaTipoVehiculo.Model {

    private final ListaTipoVehiculo.Presenter presenter;

    public ListaTipoVehiculoModel(ListaTipoVehiculoPresenter listaTipoVehiculoPresenter) {
        presenter = listaTipoVehiculoPresenter;
    }
}
