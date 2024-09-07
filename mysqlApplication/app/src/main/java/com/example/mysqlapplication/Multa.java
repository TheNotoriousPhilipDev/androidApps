package com.example.mysqlapplication;

import org.json.JSONException;
import org.json.JSONObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Multa {
    String placa, descripcion, estado, fecha, valor, cedula, id, modelo;

    public Multa(JSONObject objetoJSON) throws JSONException {
        this.placa = objetoJSON.getString("placa");
        this.descripcion = objetoJSON.getString("descripcion");
        this.estado = objetoJSON.getString("estado");
        this.fecha = objetoJSON.getString("fecha");
        this.valor = objetoJSON.getString("valor");
        this.cedula = objetoJSON.getString("cedula");
        this.id = objetoJSON.getString("id");
        this.modelo = objetoJSON.getString("modelo");
    }


}
