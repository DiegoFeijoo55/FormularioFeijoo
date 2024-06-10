# Interfaz Controles JavaFX

Esta aplicación de JavaFX demuestra el uso de varios controles de la interfaz de usuario en una ventana. La aplicación organiza estos controles en un `VBox` con espaciado y relleno.

## Características

La aplicación incluye los siguientes controles:

- **Button**: Un botón simple.
- **CheckBox**: Una casilla de verificación.
- **Hyperlink**: Un enlace de hipertexto.
- **ToggleButton**: Un botón de alternar.
- **RadioButton**: Un botón de opción.
- **Label**: Una etiqueta.
- **TextField**: Un campo de texto.
- **PasswordField**: Un campo de contraseña.
- **TextArea**: Un área de texto.
- **ProgressIndicator**: Un indicador de progreso.
- **ProgressBar**: Una barra de progreso.
- **Slider**: Un control deslizante.

## Requisitos
- Java (JDK) 8 o posterior
- SDK de JavaFX

## Explicación del código
La clase principal `InterfazControles` extiende `Application` y sobrescribe el método `start`. Este método configura la ventana principal y la escena, y organiza los controles en un `VBox`.

### Método `addControl`

El método `addControl` se utiliza para agregar un control a la interfaz. Este método crea un `HBox` que contiene una etiqueta y el control correspondiente, y luego agrega este `HBox` al `VBox`.

```java
private void addControl(VBox vbox, Label label, Control control) {
    HBox hbox = new HBox();
    hbox.getChildren().addAll(label, control);
    hbox.setSpacing(10);
    vbox.getChildren().add(hbox);
}
```
Luego, se agregan varios controles a la VBox usando el método addControl, que se describe a continuación.

## Método addControl
El método `addControl` se utiliza para agregar un control a la interfaz. Este método crea un `HBox` que contiene una etiqueta y el control correspondiente, y luego agrega este `HBox` al `VBox.`
Por ejemplo, para agregar un botón con su etiqueta, se llama a addControl de la siguiente manera:

```java
addControl(vbox, new Label("Button:"), new Button("Button"));
```

## Creación de la Escena y el Stage
Finalmente, se crea una `Scene` con el `VBox` que contiene todos los controles y se configura el `Stage` principal.
```java
Scene scene = new Scene(vbox, 600, 600);
primaryStage.setTitle("All Controls");
primaryStage.setScene(scene);
primaryStage.show();
```
## Método main
El método `main` es el punto de entrada estándar de la aplicación Java. Este método llama a `launch` para iniciar la aplicación JavaFX.

## Ejecución
![Captura de pantalla 2024-06-10 163928](https://github.com/DiegoFeijoo55/SisMenusFeijoo/assets/169406880/4013bfbf-37f0-4ee9-bc63-aa3b2265de0e)
