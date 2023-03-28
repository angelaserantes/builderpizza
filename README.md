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