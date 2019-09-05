package co.com.k4soft.miparqueadero.view.maestro.tipovehiculo;

public class ListaTipoVehiculoPresenter implements ListaTipoVehiculo.Presenter {


    private final ListaTipoVehiculo.View view;
    private final ListaTipoVehiculo.Model model;

    public ListaTipoVehiculoPresenter(ListaTipoVehiculo.View view) {
        this.view = view;
        model = new ListaTipoVehiculoModel(this);
    }


}
