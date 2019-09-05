package co.com.k4soft.miparqueadero.view.maestro.tipovehiculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.com.k4soft.miparqueadero.R;
import co.com.k4soft.miparqueadero.entities.TipoVehiculo;

public class ListaTipoVehiculoActivity extends AppCompatActivity implements ListaTipoVehiculo.View{

    private ListaTipoVehiculo.Presenter presenter;
    private List<TipoVehiculo> tiposVehiculos;

    @BindView(R.id.listViewTipoVehiculos)
    public ListView listViewTipoVehiculos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tipo_vehiculo);
        ButterKnife.bind(this);
        initComponents();
    }

    private void initComponents() {
        presenter = new ListaTipoVehiculoPresenter(this);
    }

    public List<TipoVehiculo> getTiposVehiculos() {
        return tiposVehiculos;
    }
}
