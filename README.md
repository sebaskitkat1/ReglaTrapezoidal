# Regla Trapezoidal Compuesta

Aplicación de escritorio para calcular integrales mediante la regla trapezoidal compuesta, con tabla de valores, procedimiento detallado y visualización gráfica.

## Requisitos

- Java 17
- Apache Ant

## Compilar

```bash
ant -noinput -f build.xml clean jar
```

## Ejecutar

```bash
java -jar dist/ReglaTrapezoidal.jar
```

## Uso rápido

1. Ingresa el límite inferior (a), el límite superior (b) y el número de segmentos.
2. Presiona **Generar Tabla** para crear los valores de Xi.
3. Completa los valores de **f(Xi)** en la tabla.
4. Presiona **Calcular** para obtener el resultado y el procedimiento.
5. Usa **Limpiar** para reiniciar la interfaz.

> Se aceptan decimales con punto o coma.