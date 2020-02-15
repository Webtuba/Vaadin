package com.example.application.views.lista;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import com.example.application.MainView;
@Route(value = "List", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Lista")
@CssImport("styles/views/lista/lista-view.css")
public class ListaView extends Div {

    public ListaView() {
        setId("lista-view");
        add(new Label("Content placeholder"));
    }

}
