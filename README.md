# Software de escritorio para la Clinica Ricardo Palma

Estructura de paquetes

```
Clínica_EstructuraDatos
|
|- Source Packages
|  |- Busquedas
|  |- Componentes
|  |- Controlador
|  |- Img
|  |- Modelo
|  |- Ordenamientos
|  |- Persistencias
|  |- Principal
|  |- Procesos
|  |- Vista
|
|- Test Packages
|
|- Libraries
|  |- flatlaf-3.4.1.jar
|  |- TimingFramework-0.55.jar
|  |- miglayout-4.0.jar
|  |- swingx-1.6.1.jar
|  |- flatlaf-extras-3.4.1.jar
|  |- jsvg-1.4.0.jar
|  |- dateChooserCustom.jar
|  |- JDK 21 (Default)
|
|- Test Libraries

```

Para el diseño se usó un LookAndFeld llamado FlatLaf

```
      com.formdev.flatlaf.FlatLaf.registerCustomDefaultsSource("MODELO");
      com.formdev.flatlaf.FlatDarculaLaf.setup();  
```
# Login
Tenemos 2 inputs principales que son el *Usuario* y el *Password* <br>
![image](https://github.com/Benji379/Clinica_Ricardo_Palma/assets/108637204/dc8e8776-3623-4b7a-8c1f-24bca43e9929)
