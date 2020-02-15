package com.example.application.views.detalhes;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import com.example.application.MainView;
@Route(value = "detalhes", layout = MainView.class)
@PageTitle("Detalhes")
@CssImport("styles/views/detalhes/detalhes-view.css")
public class DetalhesView extends Div {

    public DetalhesView() {
        setId("detalhes-view");
        add(new Label("Content placeholder"));
    }

}
