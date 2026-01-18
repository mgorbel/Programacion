### Ejemplo del manejo de las clases sobre fechas:

#### java.time.LocalDateTime
Es una clase inmutable que representa la combinación de una fecha y una hora (ej. 2026-01-18T18:45).

   * Lo que NO tiene: No contiene información de zona horaria (offset). Es solo una representación de "fecha y hora de pared".
   * Uso: Ideal para representar eventos locales, como "La clase empieza a las 09:00 el 20 de febrero".
   * Métodos comunes: * now(): Obtiene la fecha/hora actual.

       - of(año, mes, día, hora, minuto): Crea una instancia específica.
       - plusDays(n) / minusHours(n): Devuelve una nueva instancia con el tiempo modificado.
       - 
#### java.time.Month
Es un enum que representa los 12 meses del año (del 1 al 12).

    * Ventaja: Elimina la confusión de las APIs antiguas donde Enero era 0. Aquí, Month.JANUARY tiene el valor 1.
    * Métodos: Puedes obtener el nombre del mes o saber cuántos días tiene (length(boolean leapYear)).

#### java.time.format.TextStyle
Define cómo se debe mostrar el texto de una fecha (como el mes o día de la semana).

    * FULL: "Enero"
    * SHORT: "ene."
    * NARROW: "E"
    
#### java.time.format.DateTimeFormatter
Es el motor para convertir objetos de fecha en texto y viceversa.

    * Seguridad: A diferencia de SimpleDateFormat, es completamente seguro para entornos multihilo.
    * Patrones: Usa letras como yyyy (año), MM (mes), dd (día), HH (hora 24h).

#### java.util.Locale
Se usa junto con el formateador para traducir los nombres a un idioma específico. Por ejemplo, mostrar el mes en español (es) o inglés (us).

#### java.time.temporal.ChronoUnit
Es un conjunto de unidades de medida de tiempo.

    * Uso: Se utiliza principalmente con el método between para calcular diferencias.
    * Ejemplo: ChronoUnit.DAYS.between(fecha1, fecha2); (Devuelve el total de días entre dos fechas).
    
#### java.time.temporal.ChronoField
Es un conjunto de campos estándar para acceder a partes específicas de una fecha.

    * Uso: Se usa con el método .get().
    * Ejemplo: fecha.get(ChronoField.DAY_OF_WEEK); (Devuelve un número que representa el día de la semana).

    ``` Java
    
// 1. Crear un LocalDateTime
LocalDateTime ahora = LocalDateTime.now();

// 2. Usar Month y TextStyle con Locale
String nombreMes = ahora.getMonth().getDisplayName( TextStyle.FULL, new Locale( "es", "ES"));

// 3. Usar DateTimeFormatter
DateTimeFormatter formato = DateTimeFormatter.ofPattern( "dd 'de' MMMM 'de' yyyy, HH:mm");
System.out.println( "Fecha formateada: " + ahora.format(formato));

// 4. Usar ChronoUnit para cálculos
LocalDateTime futuro = ahora.plus( 2, ChronoUnit.WEEKS);

// 5. Usar ChronoField para extraer datos
int diaDelAño = ahora.get( ChronoField.DAY_OF_YEAR);
```
