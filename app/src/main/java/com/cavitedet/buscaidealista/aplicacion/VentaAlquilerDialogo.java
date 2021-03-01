package com.cavitedet.buscaidealista.aplicacion;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.cavitedet.buscaidealista.R;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;

public class VentaAlquilerDialogo extends DialogFragment {


    private FragmentMaps fragmentMaps;

    public VentaAlquilerDialogo(FragmentMaps fragmentMaps) {
        this.fragmentMaps = fragmentMaps;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder constructor = new AlertDialog.Builder(getActivity());
        constructor.setTitle(R.string.venta_alquiler);
        String venta = getString(R.string.venta);
        String alquiler = getString(R.string.alquiler);
        String[] opciones = {venta, alquiler};

        constructor.setSingleChoiceItems(opciones, fragmentMaps.getVentaAlquiler().ordinal(),
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int indice) {
                        fragmentMaps.setVentaAlquiler(VentaAlquiler.values()[indice]);
                        dialog.dismiss();
                    }
                }
    );

        return constructor.create();

    }
}
