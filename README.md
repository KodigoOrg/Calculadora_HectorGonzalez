# 🧮 Calculadora Java

Una calculadora completa desarrollada en Java que implementa operaciones matemáticas básicas y avanzadas con una interfaz intuitiva.

## ✨ Características

- ➕ **Suma**: Operaciones de adición
- ➖ **Resta**: Operaciones de sustracción  
- ✖️ **Multiplicación**: Operaciones de multiplicación
- ➗ **División**: Operaciones de división con manejo de división por cero
- 🔢 **Potenciación**: Cálculo de potencias (x^y)
- √ **Raíz Cuadrada**: Cálculo de raíces cuadradas
- 🎯 **Interfaz amigable**: Fácil de usar y entender

## 🛠️ Tecnologías Utilizadas

- **Java**: JDK 17
- **Paradigma**: Programación Orientada a Objetos
- **IDE Compatible**: IntelliJ IDEA

## 📋 Prerrequisitos

Antes de ejecutar este proyecto, asegúrate de tener instalado:

- Java Development Kit (JDK) 17 o superior
- Un IDE de Java (recomendado) o editor de texto


## 📖 Ejemplos de Uso

```java
// Ejemplos de operaciones disponibles
Calculadora calc = new Calculadora();

// Operaciones básicas
double suma = calc.sumar(5, 3);        // Resultado: 8
double resta = calc.restar(10, 4);     // Resultado: 6
double multiplicacion = calc.multiplicar(7, 6);  // Resultado: 42
double division = calc.dividir(15, 3); // Resultado: 5

// Operaciones avanzadas
double potencia = calc.potencia(2, 3); // Resultado: 8 (2^3)
double raiz = calc.raizCuadrada(16);   // Resultado: 4
```
## 🔧 Funcionalidades Detalladas

### Operaciones Básicas
- **Suma**: números enteros 
- **Resta**: números enteros 
- **Multiplicación**: Optimizada para grandes números
- **División**: Incluye validación para división por cero

### Operaciones Avanzadas
- **Potenciación**: Calcula x elevado a la potencia 
- **Raíz Cuadrada**: calcula raizes cuadradas

### Manejo de Errores
- ✅ División por cero
- ✅ Raíz cuadrada de números negativos
- ✅ Entrada de datos inválidos
  
## 🎮 Modo de Uso Interactivo

La calculadora ofrece un menú interactivo:

```
=== CALCULADORA JAVA ===
1. Suma
2. Resta
3. Multiplicación
4. División
5. Potencia
6. Raíz Cuadrada
0. Salir de la calculadora

seleccione alguna de las opciones porfavor :) 
```

## 👨‍💻 Autor

**Hector Eduardo Gonzalez Parada**
- GitHub: [@Hector2202](https://github.com/Hector2202)
- Email: eduardo2202@gmail.com
