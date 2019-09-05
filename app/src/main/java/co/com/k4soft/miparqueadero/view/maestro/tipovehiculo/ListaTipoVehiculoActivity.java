package co.com.k4soft.miparqueadero.view.maestro.tipovehiculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.com.k4soft.miparqueadero.R;

public class ListaTipoVehiculoActivity extends AppCompatActivity implements ListaTipoVehiculo.View{

    private ListaTipoVehiculo.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tipo_vehiculo);
        presenter = new ListaTipoVehiculoPresenter(this);
    }
}
