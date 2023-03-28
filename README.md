# Patron builder

### diagrama de clases
Correspondiente a la rama builder.
```mermaid
classDiagram
class Pizzas {
  - int masa
  - boolean relleno
  - int tipo
  - boolean salsa
  - int tipoSalsa
  - boolean cebolla
  - boolean sinGluten
  - boolean extraQueso
  - boolean pinha
  - boolean champinhones
  - boolean jamon
  + Pizzas()
  + Pizzas(masa:int, relleno:boolean, tipo:int, salsa:boolean, tipoSalsa:int, cebolla:boolean, sinGluten:boolean, extraQueso:boolean, pinha:boolean, champinhones:boolean, jamon:boolean)
  + getMasa():int
  + setMasa(masa:int):void
  + isRelleno():boolean
  + setRelleno(relleno:boolean):void
  + getTipo():int
  + setTipo(tipo:int):void
  + isSalsa():boolean
  + setSalsa(salsa:boolean):void
  + getTipoSalsa():int
  + setTipoSalsa(tipoSalsa:int):void
  + isCebolla():boolean
  + setCebolla(cebolla:boolean):void
  + isSinGluten():boolean
  + setSinGluten(sinGluten:boolean):void
  + isExtraQueso():boolean
  + setExtraQueso(extraQueso:boolean):void
  + isPinha():boolean
  + setPinha(pinha:boolean):void
  + isChampinhones():boolean
  + setChampinhones(champinhones:boolean):void
  + isJamon():boolean
  + setJamon(jamon:boolean):void
}

Pizzas "1" *-- "1..*" PizzaBuilder : association
class PizzaBuilder {
  - Pizzas _pizza
  + build():Pizzas
  + PizzaBuilder()
  + setMasa(masa:int):PizzaBuilder
  + setRelleno(relleno:boolean):PizzaBuilder
  + setTipo(tipo:int):PizzaBuilder
  + setSalsa(salsa:boolean):PizzaBuilder
  + setTipoSalsa(tipoSalsa:int):PizzaBuilder
  + setCebolla(cebolla:boolean):PizzaBuilder
  + setSinGluten(sinGluten:boolean):PizzaBuilder
  + setExtraQueso(extraQueso:boolean):PizzaBuilder
  + setPinha(pinha:boolean):PizzaBuilder
  + setChampinhones(champinhones:boolean):PizzaBuilder
  + setJamon(jamon:boolean):PizzaBuilder
}

PizzaBuilder "1" *-- "1" Main : association
class Main {
  + main(args: String[]): void
}
```


### Función del patrón Builder
Este patrón simplifica la realización de objetos complejos, hace que el código sea más sencillo.
De esta forma conseguiremos que se pueda modificar de una manera más sencilla, y poder crear nuevos objetos de una forma más simple.


### Combinación Builder - Factory

Sí es posible llevar a cabo la combinación, ya que con Builder se pueden crear los objetos y con Factory encapsular la creación.

### Examen

#### Función del patrón builder en el caso de coches
Este patrón nos ayuda a la hora de desarrollar el código, ya que se puede construir de forma más sencilla los objetos, en este caso coche1  y coche2, con diferentes 
valores, además sería fácil añadirle nuevos atributos, mediante CocheBuilder.




##### Diagrama de clases
```mermaid
classDiagram
class Main {
  +main(args: String[])
}

class Coche {
  -marca: String
  -modelo: String
  -caballos: int
  -anio: int
  +Coche(marca: String, modelo: String, caballos: int, anio: int)
  +getMarca(): String
  +setMarca(marca: String): void
  +getModelo(): String
  +setModelo(modelo: String): void
  +getCaballos(): int
  +setCaballos(caballos: int): void
  +getAnio(): int
  +setAnio(anio: int): void
  +toString(): String
}

class CocheBuilder {
  -marca: String
  -modelo: String
  -caballos: int
  -anio: int
  +setMarca(marca: String): CocheBuilder
  +setModelo(modelo: String): CocheBuilder
  +setCaballos(caballos: int): CocheBuilder
  +setAnio(anio: int): CocheBuilder
  +build(): Coche
}

Main --> CocheBuilder
Main --> Coche
CocheBuilder --> Coche
CocheBuilder: build() creates --> Coche
Coche: +Coche() creates --> Coche
```


#### Combinación Builder - Factory (Coches)

Sí se pueden combinar ya que haciéndolo se pueden crear los objetos de forma más flexible, en este caso tendremos que tener en cuenta el uso de la interfaz.

Ejemplo:

```java
public interface CocheFactory {
    Coche crearCoche();
}

public class CocheDeportivoFactory implements CocheFactory {
    private CocheBuilder cocheBuilder = new CocheBuilder()
            .setMarca("Ferrari")
            .setModelo("458 Italia")
            .setCaballos(562)
            .setAnio(2015);

    @Override
    public Coche crearCoche() {
        return cocheBuilder.build();
    }
}

public class CocheFamiliarFactory implements CocheFactory {
    private CocheBuilder cocheBuilder = new CocheBuilder()
            .setMarca("Volkswagen")
            .setModelo("Passat")
            .setCaballos(190)
            .setAnio(2022);

    @Override
    public Coche crearCoche() {
        return cocheBuilder.build();
    }
}

public class Main {
    public static void main(String[] args) {
        CocheFactory cocheDeportivoFactory = new CocheDeportivoFactory();
        Coche cocheDeportivo = cocheDeportivoFactory.crearCoche();
        System.out.println("Coche deportivo creado: " + cocheDeportivo.toString());

        CocheFactory cocheFamiliarFactory = new CocheFamiliarFactory();
        Coche cocheFamiliar = cocheFamiliarFactory.crearCoche();
        System.out.println("Coche familiar creado: " + cocheFamiliar.toString());
    }
}
```


