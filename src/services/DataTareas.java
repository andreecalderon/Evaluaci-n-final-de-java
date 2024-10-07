package services;


import view.TareaView;
import view.TareasView;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataTareas {
    public static void cargarTareas(ArrayList<TareaView> Tareas) {
        Tareas.add(new TareaView("matematicas", "sumas y restas", "en progreso"));

        Tareas.add(new TareaView("sociales", "investigación", "completado"));

        Tareas.add(new TareaView("ciencias", "glosario", "pendiente"));

        Tareas.add(new TareaView("fisica fundamental", "ecuaciones", "completado"));

        Tareas.add(new TareaView("expresión artistica", "cuadro","en progreso"));




    }
}
