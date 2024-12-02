https://github.com/NicolasJRuax/Horario.git

# Mi Horario - Aplicación Android

**Mi Horario** es una aplicación que permite a los usuarios organizar y consultar su horario académico de manera sencilla. Con esta aplicación, puedes agregar asignaturas con sus horarios, consultar el horario completo de un día específico y verificar qué asignatura se está impartiendo en tiempo real, basándose en la fecha y hora actual.

---

## **Características Principales**
- **Gestión de Horarios**: Permite a los usuarios agregar asignaturas con sus respectivos horarios.
- **Consulta de Horarios**: Visualiza todas las asignaturas programadas para un día específico.
- **Asignatura Actual**: Consulta rápidamente qué asignatura se está impartiendo en este momento.
- **Interfaz Intuitiva**: Una interfaz sencilla y fácil de usar para gestionar tu horario académico.

---

## **Estructura de Clases**

### **1. MainActivity**
La actividad principal de la aplicación. Presenta un menú con tres opciones:
- **Añadir asignaturas**: Navega a la actividad para agregar nuevas asignaturas.
- **Ver horario**: Muestra el horario completo de un día específico.
- **¿Qué clase ahora?**: Indica qué asignatura se está impartiendo en este momento.

**Métodos principales**:
- `openAddSubjectActivity()`: Navega a la actividad para añadir asignaturas.
- `openHorarioActivity()`: Navega a la actividad para consultar el horario.
- `openCurrentClassActivity()`: Navega a la actividad para consultar la asignatura actual.

---

### **2. AddSubjectActivity**
Permite al usuario agregar asignaturas con sus horarios, incluyendo días y horas.

**Diseño**:
- Contiene campos de texto para ingresar el nombre de la asignatura, día y hora.
- Incluye botones para guardar o cancelar.

**Métodos principales**:
- `onSaveButtonClicked()`: Guarda los datos ingresados por el usuario.
- `onCancelButtonClicked()`: Cancela la operación y regresa a la actividad anterior.

---

### **3. HorarioActivity**
Muestra el horario completo de las asignaturas registradas para un día específico.

**Diseño**:
- Un campo desplegable (`Spinner`) para seleccionar el día.
- Una lista (`ListView`) que muestra las asignaturas y sus horarios para el día seleccionado.

**Métodos principales**:
- `populateHorario()`: Carga los datos del horario para el día seleccionado.
- `onDaySelected()`: Actualiza la lista de asignaturas cuando se selecciona un nuevo día.

---

### **4. CurrentClassActivity**
Muestra qué asignatura se está impartiendo en este momento, basándose en la fecha y hora actuales.

**Diseño**:
- Un `TextView` que muestra el nombre de la asignatura actual o un mensaje indicando que no hay clases en curso.

**Lógica**:
- Obtiene la fecha y hora actuales mediante `SimpleDateFormat`.
- Verifica si la hora actual coincide con el horario de alguna asignatura y la muestra.

**Métodos principales**:
- `getCurrentClass()`: Determina la asignatura actual basándose en la hora del sistema.
- `updateUI()`: Actualiza el `TextView` con el resultado de `getCurrentClass()`.

---

## **Archivo AndroidManifest.xml**
El archivo `AndroidManifest.xml` define las actividades de la aplicación:
- `MainActivity`: Actividad principal con el `intent-filter` configurado para ser el punto de inicio.
- `AddSubjectActivity`: Actividad para agregar asignaturas.
- `HorarioActivity`: Actividad para consultar el horario.
- `CurrentClassActivity`: Actividad para consultar la asignatura actual.

---
