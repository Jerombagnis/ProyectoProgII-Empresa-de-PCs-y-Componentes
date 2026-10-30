# 🖥️ ProyectoProgII – Empresa de PCs y Componentes

> Sistema de Gestión para una empresa de computación.

Práctico de máquina 2026 de **Programación II** — Tecnicatura Universitaria en Web (UNSL).

Aplicación de escritorio en **Java (Swing)** para administrar una empresa que fabrica computadoras y sus componentes y que vende PCs a medida: permite gestionar el catálogo de componentes, el personal, la cartera de clientes y el armado de computadoras. Los datos se guardan en **archivos de texto**.

---

## 📋 Tabla de contenidos

- [Enunciado](#-enunciado)
- [Funcionalidades](#-funcionalidades)
- [Tecnologías](#-tecnologías)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Modelo de clases](#-modelo-de-clases)
- [Persistencia](#-persistencia)
- [Cómo ejecutar](#-cómo-ejecutar)
- [Datos de ejemplo](#-datos-de-ejemplo)
- [Autor](#-autor)

---

## 📝 Enunciado

Una empresa dedicada a la fabricación de computadoras y sus componentes necesita un sistema para administrar su negocio. Fabrica **placas madre, procesadores, memorias RAM, tarjetas de red, discos duros y fuentes de alimentación**, cuenta con personal **administrativo, gerencial y operario**, y vende **PCs a medida** que el cliente arma a partir de los componentes disponibles.

Requisitos de entrega del práctico:

- Proyecto completo con códigos fuente.
- Archivos con datos de al menos 4 componentes de distintos tipos, 4 personas del personal y 3 PCs armadas con el cliente al que se vendieron.
- Persistencia en archivos de texto.
- Uso de los conceptos vistos en teoría y práctica (herencia, polimorfismo, clases abstractas, interfaces, colecciones, etc.).
- Interfaz gráfica clara y usable.

---

## ✨ Funcionalidades

| Módulo | Qué permite |
|---|---|
| **Componentes** | Alta de cualquier tipo de componente (todos en una única colección), búsqueda por ID, eliminación por ID y listado completo con toda su información. |
| **Clientes** | Alta, búsqueda por ID y listado **ordenado por apellido**. |
| **Empleados** | Alta de personal de cualquier categoría (administrativo, gerencial, operario), búsqueda y listado de todos los empleados. |
| **Armado de PCs** | Construcción de una PC a partir de los componentes cargados, asociada a un cliente, con cálculo del monto total. |
| **Historial** | Listado de las PCs construidas. |
| **Archivo** | Guardado manual de los datos y salida de la aplicación. |

### Validaciones de negocio

- No se permiten **IDs duplicados** de clientes, componentes ni PCs.
- El ID o legajo de un empleado no puede repetirse.
- Al armar una PC se verifica que:
  - el **cliente exista**,
  - **todos los componentes existan**,
  - haya una **placa madre** y un **procesador**,
  - la placa madre sea **compatible con el procesador** elegido (lista de IDs de procesadores soportados),
  - la cantidad de **memorias RAM no supere las ranuras** de la placa madre.

---

## 🛠️ Tecnologías

- **Java** (Swing para la interfaz gráfica, diseñada con el editor de formularios de NetBeans)
- **Maven** para la gestión del proyecto
- **Archivos de texto** (`.txt`) para la persistencia

---

## 📁 Estructura del proyecto

```
ProyectoProgII-Empresa-de-PCs-y-Componentes/
├── pom.xml
├── componente.txt              # Datos de componentes
├── personas.txt                # Datos de clientes y empleados
├── pcs.txt                     # Datos de PCs armadas
└── src/main/java/
    ├── Lógica/
    │   ├── TrabajoFinal.java   # Clase principal (main)
    │   ├── Empresa.java        # Lógica de negocio y colecciones
    │   ├── PC.java
    │   ├── Componentes/        # Jerarquía de componentes
    │   │   ├── Componente.java (abstracta)
    │   │   ├── PlacaMadre.java
    │   │   ├── Procesador.java
    │   │   ├── MemoriaRam.java
    │   │   ├── TarjetaRed.java
    │   │   ├── DiscoDuro.java
    │   │   └── Fuente.java
    │   └── Personas/           # Jerarquía de personas
    │       ├── Persona.java    (abstracta, implementa Comparable)
    │       ├── Cliente.java
    │       └── Empleados/
    │           ├── Empleado.java (abstracta)
    │           ├── Administrativo.java
    │           ├── Gerencial.java
    │           └── Operario.java
    ├── Persistencia/
    │   └── ManejadorArchivos.java   # Lectura y escritura de los .txt
    └── Interfaz/                    # Ventanas Swing
        ├── VentanaPrincipal.java
        ├── DialogGestionComponentes.java
        ├── DialogGestionClientes.java
        ├── DialogGestionEmpleados.java
        ├── DialogArmadoPC.java
        └── DialogHistorialPCs.java
```

El proyecto se organiza en tres capas: **Lógica** (modelo y reglas de negocio), **Persistencia** (archivos) e **Interfaz** (Swing).

---

## 🧩 Modelo de clases

### Componentes

```
Componente (abstracta)  → id, modelo, precio, descripción
├── PlacaMadre          → cantidad de ranuras de memoria, IDs de procesadores compatibles
├── Procesador          → velocidad (GHz), tamaño de caché
├── MemoriaRam          → tecnología (DDR3/DDR4), velocidad, tamaño
├── TarjetaRed          → velocidad de transmisión, MAC
├── DiscoDuro           → velocidad de rotación, capacidad, tipo (SSD/HDD)
└── Fuente              → watts
```

### Personas

```
Persona (abstracta, Comparable<Persona>)  → id, nombre, apellido, dni, fecha de nacimiento, dirección
├── Cliente                               → mail, cuil, nacionalidad
└── Empleado (abstracta)                  → antigüedad, legajo
    ├── Administrativo                    → tarea, área
    ├── Gerencial                         → cargo
    └── Operario                          → sector
```

`Persona` implementa `Comparable<Persona>` comparando por **apellido** (sin distinguir mayúsculas), lo que permite ordenar clientes con `Collections.sort()`.

### PC

Una `PC` guarda su **ID**, la **lista de IDs de los componentes** que la forman, la **fecha de armado** y el **ID del cliente** que la armó.

---

## 💾 Persistencia

Los datos se leen al iniciar la aplicación (`cargarTodo`) y se escriben desde **Archivo → Guardar datos**. Los archivos se buscan en el **directorio desde el que se ejecuta la aplicación**, por lo que `componente.txt`, `personas.txt` y `pcs.txt` deben estar en esa carpeta (por defecto, la raíz del proyecto).

Cada línea es un registro con campos separados por `;`. Las listas de IDs se separan con `,`.

**`componente.txt`** — el primer campo indica el tipo:

```
placa madre;id;modelo;precio;descripcion;ranuras;idsProcesadores
procesador;id;modelo;precio;descripcion;ghz;cache
memoria ram;id;modelo;precio;descripcion;tecnologia;velocidad;tamaño
tarjeta de red;id;modelo;precio;descripcion;velocidad;mac
disco duro;id;modelo;precio;descripcion;rpm;capacidad;tipo
fuente;id;modelo;precio;descripcion;watts
```

**`personas.txt`**

```
cliente;id;nombre;apellido;dni;fechaNac;direccion;mail;cuil;nacionalidad
administrativo;id;nombre;apellido;dni;fechaNac;direccion;antiguedad;legajo;tarea;area
operario;id;nombre;apellido;dni;fechaNac;direccion;antiguedad;legajo;sector
gerencial;id;nombre;apellido;dni;fechaNac;direccion;antiguedad;legajo;cargo
```

**`pcs.txt`**

```
idPC;fechaArmado;idCliente;idsComponentes
```

---

## 🚀 Cómo ejecutar

### Requisitos

- **JDK** compatible con la versión configurada en el `pom.xml` (`maven.compiler.release`).
- **Maven** (opcional si se usa un IDE como NetBeans o IntelliJ IDEA).

### Desde un IDE

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/<tu-usuario>/ProyectoProgII-Empresa-de-PCs-y-Componentes.git
   ```
2. Abrir la carpeta clonada como proyecto Maven (NetBeans, IntelliJ IDEA, etc.).
3. Ejecutar la clase principal **`Lógica.TrabajoFinal`**.

### Desde la terminal

```bash
cd ProyectoProgII-Empresa-de-PCs-y-Componentes
mvn clean package
java -cp target/classes Lógica.TrabajoFinal
```

> ⚠️ Ejecutar siempre desde la carpeta raíz del proyecto para que la aplicación encuentre los archivos `.txt`.

---

## 📊 Datos de ejemplo

El repositorio incluye datos de prueba que superan lo pedido en el práctico:

- **Componentes:** placas madre, procesadores, memorias RAM, tarjetas de red, discos duros y fuentes (4–5 de cada tipo).
- **Personal:** 6 empleados (2 administrativos, 2 operarios, 2 gerenciales).
- **Clientes:** 5 clientes.
- **PCs armadas:** varias computadoras ya vendidas, cada una asociada a su cliente.

---

## 👤 Autor

**Jerónimo Muñoz Bagnis**
Tecnicatura Universitaria en Web — Universidad Nacional de San Luis (UNSL)
Programación II — 2026
