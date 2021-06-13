# Hoy No Circula
Api Rest desarrollada en Spring Boot - Java

# Funcionamiento
1. Para poner a marcha se necesita una conexión a la base de datos, la cual debera ser configurada en el archivo `hoynocircula\src\main\resources`.
2. El script para la base de datos será el siguiente, el nombre puede ser el mismo como se especifica en el archivo de configuración inicial o puede ser modificado:

**Script para SQL SERVER**

`USE [nocircula]`
`GO`

`/****** Object:  Table [dbo].[Calendario]    Script Date: 13/06/2021 18:25:49 ******/`
`SET ANSI_NULLS ON`
`GO`

`SET QUOTED_IDENTIFIER ON`
`GO`

`CREATE TABLE [dbo].[Calendario](`
`	[id] [int] IDENTITY(1,1) NOT NULL,`
`	[dia] [nvarchar](9) NOT NULL,`
`	[digito] [int] NULL,`
`	[estado] [bit] NULL,`
` CONSTRAINT [PK_Calendario] PRIMARY KEY CLUSTERED` 
`(`
`	[id] ASC`
`)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]`
`) ON [PRIMARY]`
`GO`

`USE [nocircula]`
`GO`

`/****** Object:  Table [dbo].[Vehiculo]    Script Date: 13/06/2021 18:26:15 ******/`
`SET ANSI_NULLS ON`
`GO`

`SET QUOTED_IDENTIFIER ON`
`GO`

`CREATE TABLE [dbo].[Vehiculo](`
`	[id] [numeric](18, 0) IDENTITY(1,1) NOT NULL,`
` [placa] [nvarchar](7) NOT NULL,`
` [placa] [nvarchar](7) NOT NULL,`
`	[placa] [nvarchar](7) NOT NULL,`
`	[color] [nvarchar](100) NULL,`
`	[modelo] [nvarchar](1000) NULL,`
`	[chasis] [nvarchar](50) NULL,`
`	[anio] [nvarchar](4) NULL,`
` CONSTRAINT [PK_Vehiculo_1] PRIMARY KEY CLUSTERED`
`(`
`	[placa] ASC`
`)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]`
`) ON [PRIMARY]`
`GO`

3. Abrir la aplicación en un IDE de preferencia, es importante contar con la herramienta de Spring Tools.
4. Configurar las anotaciones `@CrossOrigin(origins = "http://localhost:4200/")` con el puerto y el servidor con el que se vaya a consumir la API.
