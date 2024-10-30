# Principio del Palomar
En este proyecto se pretende comprobar el uso del principio del palomar, especificamente usado con cumpleaños de estudiantes en salas de estudiantes.
### Explicación del principio del palomar
El principio del palomar nos dice que si n estudiantes se distribuyen en m salas y n > m, entonces habrá un estudiante con el mismo cumpleaños.
Por ejemplo :
- Si tenemos 13 estudiantes en una sala.
  Al menos una compartirá mes de cumpleaños con otra.
- Si tenemos 366 estudiantes en una sala.
  Al menos una compartirá día de cumpleaños con otra.

### Ejemplo de ejecucción
En el ejemplo de ejecucción primeramente se hace una sola ejecucción con 13 personas. Para comprobar que se repite el mes.
En la segunda ejecucción se ejecuta una sola vez con 366 personas para ver cuantas se repiten, podremos ver los dias repetidos por cuantos estudiantes.
En el resto de ejecucciones se junta a 366 estudiantes en una sala, pudiendo comprobar que la tendencia es de repetir aproximadamente entre 90 y 100 dias donde 1 o mas personas cumplen años.
Para bajar esta estadística, tendremos que rozar los 30 estudiantes para comenzar a ver los 0 de forma mas continuada.

Ejemplo de ejecucción :
More Than 12

```
Should be at least 1 month match :
{NOVEMBER=2, OCTOBER=2, DECEMBER=3, JULY=3}
```
```
More Than 365
Should be at least 1 day match :
{2023-04-29=[Student{birthDate=2023-04-29}, Student{birthDate=2023-04-29}], 2023-08-28=[Student{birthDate=2023-08-28}, Student{birthDate=2023-08-28}], 2023-02-28=[Student{birthDate=2023-02-28}, Student{birthDate=2023-02-28}], 2023-12-26=[Student{birthDate=2023-12-26}, Student{birthDate=2023-12-26}, Student{birthDate=2023-12-26}, Student{birthDate=2023-12-26}], 2023-10-26=[Student{birthDate=2023-10-26}, Student{birthDate=2023-10-26}], 2023-02-25=[Student{birthDate=2023-02-25}, Student{birthDate=2023-02-25}], 2023-10-25=[Student{birthDate=2023-10-25}, Student{birthDate=2023-10-25}], 2023-08-25=[Student{birthDate=2023-08-25}, Student{birthDate=2023-08-25}, Student{birthDate=2023-08-25}, Student{birthDate=2023-08-25}], 2023-12-25=[Student{birthDate=2023-12-25}, Student{birthDate=2023-12-25}], 2023-04-25=[Student{birthDate=2023-04-25}, Student{birthDate=2023-04-25}, Student{birthDate=2023-04-25}], 2023-06-24=[Student{birthDate=2023-06-24}, Student{birthDate=2023-06-24}], 2023-02-24=[Student{birthDate=2023-02-24}, Student{birthDate=2023-02-24}], 2023-04-24=[Student{birthDate=2023-04-24}, Student{birthDate=2023-04-24}], 2023-06-23=[Student{birthDate=2023-06-23}, Student{birthDate=2023-06-23}], 2023-02-23=[Student{birthDate=2023-02-23}, Student{birthDate=2023-02-23}], 2023-02-22=[Student{birthDate=2023-02-22}, Student{birthDate=2023-02-22}, Student{birthDate=2023-02-22}], 2023-10-22=[Student{birthDate=2023-10-22}, Student{birthDate=2023-10-22}], 2023-04-21=[Student{birthDate=2023-04-21}, Student{birthDate=2023-04-21}, Student{birthDate=2023-04-21}], 2023-08-20=[Student{birthDate=2023-08-20}, Student{birthDate=2023-08-20}], 2023-12-20=[Student{birthDate=2023-12-20}, Student{birthDate=2023-12-20}], 2023-10-19=[Student{birthDate=2023-10-19}, Student{birthDate=2023-10-19}], 2023-06-19=[Student{birthDate=2023-06-19}, Student{birthDate=2023-06-19}], 2023-06-18=[Student{birthDate=2023-06-18}, Student{birthDate=2023-06-18}], 2023-10-18=[Student{birthDate=2023-10-18}, Student{birthDate=2023-10-18}], 2023-02-17=[Student{birthDate=2023-02-17}, Student{birthDate=2023-02-17}], 2023-04-16=[Student{birthDate=2023-04-16}, Student{birthDate=2023-04-16}, Student{birthDate=2023-04-16}], 2023-02-16=[Student{birthDate=2023-02-16}, Student{birthDate=2023-02-16}, Student{birthDate=2023-02-16}], 2023-10-16=[Student{birthDate=2023-10-16}, Student{birthDate=2023-10-16}], 2023-04-15=[Student{birthDate=2023-04-15}, Student{birthDate=2023-04-15}, Student{birthDate=2023-04-15}], 2023-04-12=[Student{birthDate=2023-04-12}, Student{birthDate=2023-04-12}], 2023-02-11=[Student{birthDate=2023-02-11}, Student{birthDate=2023-02-11}, Student{birthDate=2023-02-11}], 2023-04-10=[Student{birthDate=2023-04-10}, Student{birthDate=2023-04-10}], 2023-12-09=[Student{birthDate=2023-12-09}, Student{birthDate=2023-12-09}, Student{birthDate=2023-12-09}], 2023-08-09=[Student{birthDate=2023-08-09}, Student{birthDate=2023-08-09}], 2023-08-08=[Student{birthDate=2023-08-08}, Student{birthDate=2023-08-08}], 2023-12-06=[Student{birthDate=2023-12-06}, Student{birthDate=2023-12-06}], 2023-08-06=[Student{birthDate=2023-08-06}, Student{birthDate=2023-08-06}], 2023-04-06=[Student{birthDate=2023-04-06}, Student{birthDate=2023-04-06}], 2023-10-05=[Student{birthDate=2023-10-05}, Student{birthDate=2023-10-05}, Student{birthDate=2023-10-05}], 2023-08-04=[Student{birthDate=2023-08-04}, Student{birthDate=2023-08-04}], 2023-10-04=[Student{birthDate=2023-10-04}, Student{birthDate=2023-10-04}, Student{birthDate=2023-10-04}], 2023-10-03=[Student{birthDate=2023-10-03}, Student{birthDate=2023-10-03}], 2023-08-03=[Student{birthDate=2023-08-03}, Student{birthDate=2023-08-03}], 2023-02-02=[Student{birthDate=2023-02-02}, Student{birthDate=2023-02-02}, Student{birthDate=2023-02-02}], 2023-04-02=[Student{birthDate=2023-04-02}, Student{birthDate=2023-04-02}], 2023-06-01=[Student{birthDate=2023-06-01}, Student{birthDate=2023-06-01}, Student{birthDate=2023-06-01}, Student{birthDate=2023-06-01}], 2023-10-01=[Student{birthDate=2023-10-01}, Student{birthDate=2023-10-01}], 2023-05-31=[Student{birthDate=2023-05-31}, Student{birthDate=2023-05-31}, Student{birthDate=2023-05-31}], 2023-05-29=[Student{birthDate=2023-05-29}, Student{birthDate=2023-05-29}], 2023-01-28=[Student{birthDate=2023-01-28}, Student{birthDate=2023-01-28}, Student{birthDate=2023-01-28}], 2023-07-28=[Student{birthDate=2023-07-28}, Student{birthDate=2023-07-28}, Student{birthDate=2023-07-28}], 2023-11-27=[Student{birthDate=2023-11-27}, Student{birthDate=2023-11-27}, Student{birthDate=2023-11-27}], 2023-09-26=[Student{birthDate=2023-09-26}, Student{birthDate=2023-09-26}], 2023-03-26=[Student{birthDate=2023-03-26}, Student{birthDate=2023-03-26}], 2023-07-26=[Student{birthDate=2023-07-26}, Student{birthDate=2023-07-26}], 2023-09-24=[Student{birthDate=2023-09-24}, Student{birthDate=2023-09-24}], 2023-07-24=[Student{birthDate=2023-07-24}, Student{birthDate=2023-07-24}, Student{birthDate=2023-07-24}, Student{birthDate=2023-07-24}], 2023-03-23=[Student{birthDate=2023-03-23}, Student{birthDate=2023-03-23}], 2023-05-22=[Student{birthDate=2023-05-22}, Student{birthDate=2023-05-22}, Student{birthDate=2023-05-22}], 2023-03-21=[Student{birthDate=2023-03-21}, Student{birthDate=2023-03-21}], 2023-01-19=[Student{birthDate=2023-01-19}, Student{birthDate=2023-01-19}], 2023-03-19=[Student{birthDate=2023-03-19}, Student{birthDate=2023-03-19}], 2023-11-19=[Student{birthDate=2023-11-19}, Student{birthDate=2023-11-19}], 2023-11-18=[Student{birthDate=2023-11-18}, Student{birthDate=2023-11-18}], 2023-09-18=[Student{birthDate=2023-09-18}, Student{birthDate=2023-09-18}], 2023-01-17=[Student{birthDate=2023-01-17}, Student{birthDate=2023-01-17}], 2023-07-17=[Student{birthDate=2023-07-17}, Student{birthDate=2023-07-17}, Student{birthDate=2023-07-17}], 2023-09-17=[Student{birthDate=2023-09-17}, Student{birthDate=2023-09-17}, Student{birthDate=2023-09-17}], 2023-05-15=[Student{birthDate=2023-05-15}, Student{birthDate=2023-05-15}], 2023-09-15=[Student{birthDate=2023-09-15}, Student{birthDate=2023-09-15}], 2023-11-15=[Student{birthDate=2023-11-15}, Student{birthDate=2023-11-15}], 2023-01-15=[Student{birthDate=2023-01-15}, Student{birthDate=2023-01-15}], 2023-07-14=[Student{birthDate=2023-07-14}, Student{birthDate=2023-07-14}], 2023-03-14=[Student{birthDate=2023-03-14}, Student{birthDate=2023-03-14}], 2023-03-13=[Student{birthDate=2023-03-13}, Student{birthDate=2023-03-13}], 2023-03-12=[Student{birthDate=2023-03-12}, Student{birthDate=2023-03-12}, Student{birthDate=2023-03-12}, Student{birthDate=2023-03-12}], 2023-11-12=[Student{birthDate=2023-11-12}, Student{birthDate=2023-11-12}], 2023-01-11=[Student{birthDate=2023-01-11}, Student{birthDate=2023-01-11}, Student{birthDate=2023-01-11}], 2023-11-11=[Student{birthDate=2023-11-11}, Student{birthDate=2023-11-11}], 2023-01-10=[Student{birthDate=2023-01-10}, Student{birthDate=2023-01-10}], 2023-05-08=[Student{birthDate=2023-05-08}, Student{birthDate=2023-05-08}], 2023-07-08=[Student{birthDate=2023-07-08}, Student{birthDate=2023-07-08}], 2023-05-07=[Student{birthDate=2023-05-07}, Student{birthDate=2023-05-07}], 2023-07-07=[Student{birthDate=2023-07-07}, Student{birthDate=2023-07-07}, Student{birthDate=2023-07-07}], 2023-03-06=[Student{birthDate=2023-03-06}, Student{birthDate=2023-03-06}], 2023-09-06=[Student{birthDate=2023-09-06}, Student{birthDate=2023-09-06}], 2023-05-05=[Student{birthDate=2023-05-05}, Student{birthDate=2023-05-05}], 2023-01-05=[Student{birthDate=2023-01-05}, Student{birthDate=2023-01-05}], 2023-07-04=[Student{birthDate=2023-07-04}, Student{birthDate=2023-07-04}, Student{birthDate=2023-07-04}], 2023-03-04=[Student{birthDate=2023-03-04}, Student{birthDate=2023-03-04}, Student{birthDate=2023-03-04}, Student{birthDate=2023-03-04}], 2023-09-03=[Student{birthDate=2023-09-03}, Student{birthDate=2023-09-03}], 2023-01-03=[Student{birthDate=2023-01-03}, Student{birthDate=2023-01-03}], 2023-11-02=[Student{birthDate=2023-11-02}, Student{birthDate=2023-11-02}], 2023-05-01=[Student{birthDate=2023-05-01}, Student{birthDate=2023-05-01}]}
```
```
Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 91


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 104


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 101


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 94


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 92


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 95


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 94


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 92


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 107


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 99


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 89


Execution : 
How many months there are where 1 or more people serving 1 or more days in the same day in the same class : 12
How many days there are where 1 or more people serving 1 or more days in the same day in the same class : 94
```
