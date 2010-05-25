/*
Created: 24/05/2010
Modified: 25/05/2010
Model: MySQL 5.1
Database: MySQL 5.1
*/

-- Create tables section -------------------------------------------------

-- Table ACTIVIDAD

CREATE TABLE ACTIVIDAD
(
  Id_actividad Int(10) NOT NULL AUTO_INCREMENT,
  Accion Varchar(100) NOT NULL,
  DescripcionActividad Varchar(300),
  NombreTabla Varchar(200) NOT NULL,
 PRIMARY KEY (Id_actividad)
) ENGINE = InnoDB
;

-- Table CATEGORIA

CREATE TABLE CATEGORIA
(
  IdCategoria Int(10) NOT NULL AUTO_INCREMENT,
  NombreCategoria Varchar(100) NOT NULL,
  DescripcionCategoria Varchar(300),
  FK_IdCategoria Int(10),
 PRIMARY KEY (IdCategoria)
)
;

-- Table DETALLEFACTURA

CREATE TABLE DETALLEFACTURA
(
  IdDetalleFac Int(10) NOT NULL AUTO_INCREMENT,
  CantidadProducto Int(10) NOT NULL,
  MontoTotal Double(10,5) NOT NULL,
  Id_inventario_inventario Int(10) NOT NULL,
  IdDetalleOrden Int(10) NOT NULL,
  Id_producto_DOrd Int(10) NOT NULL,
  Id_inventario Int(10) NOT NULL,
  Id_producto_detalles Int(10) NOT NULL,
  Id_producto Int(10) NOT NULL,
 PRIMARY KEY (IdDetalleFac,Id_inventario_inventario,IdDetalleOrden,Id_producto_DOrd,Id_inventario,Id_producto_detalles,Id_producto)
)
;

-- Table DETALLEORDEN

CREATE TABLE DETALLEORDEN
(
  IdDetalleOrden Int(10) NOT NULL AUTO_INCREMENT,
  CantidadProducto Int(10),
  Attribute2 Char(20),
  Id_producto_Prod Int(10) NOT NULL,
  Id_inventario Int(10) NOT NULL,
  Id_producto Int(10) NOT NULL,
 PRIMARY KEY (IdDetalleOrden,Id_producto_Prod,Id_inventario,Id_producto)
)
;

-- Table FACTURA

CREATE TABLE FACTURA
(
  IdFactura Int(10) NOT NULL AUTO_INCREMENT,
  FechaFactura Date,
  MontoTotal Double(10,5),
  IdDetalleFac Int(10) NOT NULL,
  Id_inventario_inventario Int(10) NOT NULL,
  Id_orden Int(10) NOT NULL,
  IdDetalleOrden_OCompr Int(10) NOT NULL,
  Id_producto_OrdComp Int(10) NOT NULL,
  Id_inventario Int(10) NOT NULL,
  Cedula Varchar(20) NOT NULL,
  Id_rol Int(10) NOT NULL,
  Id_formapago Int(10) NOT NULL,
  IdDetalleOrden Int(10) NOT NULL,
  Id_producto_DFact Int(10) NOT NULL,
  Id_inventario_DFact Int(10) NOT NULL,
  Id_producto_OC Int(10) NOT NULL,
  Id_producto_DF Int(10) NOT NULL,
  Id_producto_detalles Int(10) NOT NULL,
 PRIMARY KEY (IdFactura,IdDetalleFac,Id_inventario_inventario,Id_orden,IdDetalleOrden_OCompr,Id_producto_OrdComp,Id_inventario,Cedula,Id_rol,Id_formapago,IdDetalleOrden,Id_producto_DFact,Id_inventario_DFact,Id_producto_OC,Id_producto_DF,Id_producto_detalles)
)
;

-- Table FORMAPAGO

CREATE TABLE FORMAPAGO
(
  Id_formapago Int(10) NOT NULL,
  NroTarjetaCredito Int(25) NOT NULL,
  FechaVence Date NOT NULL,
  CodSeguridad Int(5) NOT NULL,
  Marca Varchar(30) NOT NULL
)
;

ALTER TABLE FORMAPAGO ADD PRIMARY KEY (Id_formapago)
;

-- Table HISTORIALORDEN

CREATE TABLE HISTORIALORDEN
(
  Id_historial Int(10) NOT NULL AUTO_INCREMENT,
  Fecha Date,
  Estado Varchar(100),
  Descripcion Varchar(300),
  Attribute4 Char(20),
  Id_orden Int(10) NOT NULL,
  IdDetalleOrden Int(10) NOT NULL,
  Id_producto_Prod Int(10) NOT NULL,
  Id_inventario Int(10) NOT NULL,
  Cedula Varchar(20) NOT NULL,
  Id_rol Int(10) NOT NULL,
  Id_formapago Int(10) NOT NULL,
  Id_producto Int(10) NOT NULL,
 PRIMARY KEY (Id_historial,Id_orden,IdDetalleOrden,Id_producto_Prod,Id_inventario,Cedula,Id_rol,Id_formapago,Id_producto)
)
;

-- Table INVENTARIO

CREATE TABLE INVENTARIO
(
  Id_inventario Int(10) NOT NULL AUTO_INCREMENT,
  PrecioProducto Double(10,5) NOT NULL,
  CantidadMinima Int(10) NOT NULL,
  CantidadExistente Int(10) NOT NULL,
  Id_producto Int(10) NOT NULL,
 PRIMARY KEY (Id_inventario,Id_producto)
)
;

-- Table ORDENDECOMPRA

CREATE TABLE ORDENDECOMPRA
(
  Id_orden Int(10) NOT NULL AUTO_INCREMENT,
  FechaCreacion Date,
  InformacionAdicional Varchar(200),
  IdDetalleOrden Int(10) NOT NULL,
  Id_producto_Prod Int(10) NOT NULL,
  Id_inventario Int(10) NOT NULL,
  Cedula Varchar(20) NOT NULL,
  Id_rol Int(10) NOT NULL,
  Id_formapago Int(10) NOT NULL,
  Id_producto Int(10) NOT NULL,
 PRIMARY KEY (Id_orden,IdDetalleOrden,Id_producto_Prod,Id_inventario,Cedula,Id_rol,Id_formapago,Id_producto)
)
;

-- Table PRODUCTO

CREATE TABLE PRODUCTO
(
  Id_producto Int(10) NOT NULL AUTO_INCREMENT,
  NombreProducto Varchar(100) NOT NULL,
  DescripcionProducto Varchar(300),
  Imagen Varchar(1000),
  InformacionExtra Varchar(300),
 PRIMARY KEY (Id_producto)
)
;

-- Table PRODUTO_CATEGORIA

CREATE TABLE PRODUTO_CATEGORIA
(
  IdCategoria Int(10) NOT NULL,
  Id_producto Int(10) NOT NULL
)
;

ALTER TABLE PRODUTO_CATEGORIA ADD PRIMARY KEY (IdCategoria,Id_producto)
;

-- Table PROVEEDOR

CREATE TABLE PROVEEDOR
(
  Rif Varchar(20) NOT NULL,
  NombreProveedor Varchar(100) NOT NULL,
  DireccionProveedor Varchar(200),
  FechaRegistro Date NOT NULL,
  Email Varchar(100),
  PaginaWeb Varchar(300),
  Id_inventario Int(10) NOT NULL,
  Id_producto Int(10) NOT NULL
)
;

ALTER TABLE PROVEEDOR ADD PRIMARY KEY (Rif,Id_inventario,Id_producto)
;

-- Table ROL

CREATE TABLE ROL
(
  Id_rol Int(10) NOT NULL AUTO_INCREMENT,
  NombreRol Varchar(200),
  DescripcionRol Varchar(1000),
 PRIMARY KEY (Id_rol)
)
;

-- Table ROLACTIVIDAD

CREATE TABLE ROLACTIVIDAD
(
  Id_actividad Int(10) NOT NULL,
  Id_rol Int(10) NOT NULL
)
;

ALTER TABLE ROLACTIVIDAD ADD PRIMARY KEY (Id_actividad,Id_rol)
;

-- Table USUARIO

CREATE TABLE USUARIO
(
  Cedula Varchar(20) NOT NULL,
  Nombre Varchar(20),
  Apellido Varchar(20),
  Email Varchar(20),
  FechaRegistro Date,
  Tipo Varchar(50),
  DireccionFisica Varchar(100),
  Id_rol Int(10) NOT NULL,
  Id_formapago Int(10) NOT NULL
)
;

ALTER TABLE USUARIO ADD PRIMARY KEY (Cedula,Id_rol,Id_formapago)
;

-- Create relationships section -------------------------------------------------

ALTER TABLE CATEGORIA ADD CONSTRAINT Sub categoria FOREIGN KEY (FK_IdCategoria) REFERENCES CATEGORIA (IdCategoria)
;

ALTER TABLE PRODUTO_CATEGORIA ADD CONSTRAINT sobre la cual FOREIGN KEY (IdCategoria) REFERENCES CATEGORIA (IdCategoria)
;

ALTER TABLE PRODUTO_CATEGORIA ADD CONSTRAINT puede FOREIGN KEY (Id_producto) REFERENCES PRODUCTO (Id_producto)
;

ALTER TABLE PROVEEDOR ADD CONSTRAINT inven_proveedor FOREIGN KEY (Id_inventario, Id_producto) REFERENCES INVENTARIO (Id_inventario, Id_producto)
;

ALTER TABLE ROLACTIVIDAD ADD CONSTRAINT siempre FOREIGN KEY (Id_actividad) REFERENCES ACTIVIDAD (Id_actividad)
;

ALTER TABLE ROLACTIVIDAD ADD CONSTRAINT posee FOREIGN KEY (Id_rol) REFERENCES ROL (Id_rol)
;

ALTER TABLE USUARIO ADD CONSTRAINT rol FOREIGN KEY (Id_rol) REFERENCES ROL (Id_rol) O
;

ALTER TABLE USUARIO ADD CONSTRAINT paga FOREIGN KEY (Id_formapago) REFERENCES FORMAPAGO (Id_formapago)
;

ALTER TABLE ORDENDECOMPRA ADD CONSTRAINT detalle FOREIGN KEY (IdDetalleOrden, Id_producto_Prod, Id_inventario, Id_producto) REFERENCES DETALLEORDEN (IdDetalleOrden, Id_producto_Prod, Id_inventario, Id_producto)
;

ALTER TABLE DETALLEORDEN ADD CONSTRAINT es parte FOREIGN KEY (Id_producto_Prod) REFERENCES PRODUCTO (Id_producto) ON DELETE NO ACTION
;

ALTER TABLE FACTURA ADD CONSTRAINT pretende FOREIGN KEY (IdDetalleFac, Id_inventario_inventario, IdDetalleOrden, Id_producto_DFact, Id_inventario_DFact, Id_producto_DF, Id_producto_detalles) REFERENCES DETALLEFACTURA (IdDetalleFac, Id_inventario_inventario, IdDetalleOrden, Id_producto_DOrd, Id_inventario, Id_producto_detalles, Id_producto)
;

ALTER TABLE DETALLEORDEN ADD CONSTRAINT forma FOREIGN KEY (Id_inventario, Id_producto) REFERENCES INVENTARIO (Id_inventario, Id_producto)
;

ALTER TABLE ORDENDECOMPRA ADD CONSTRAINT tiene FOREIGN KEY (Cedula, Id_rol, Id_formapago) REFERENCES USUARIO (Cedula, Id_rol, Id_formapago)
;

ALTER TABLE DETALLEFACTURA ADD CONSTRAINT invent FOREIGN KEY (Id_inventario_inventario, Id_producto) REFERENCES INVENTARIO (Id_inventario, Id_producto)
;

ALTER TABLE FACTURA ADD CONSTRAINT facturacion FOREIGN KEY (Id_orden, IdDetalleOrden_OCompr, Id_producto_OrdComp, Id_inventario, Cedula, Id_rol, Id_formapago, Id_producto_OC) REFERENCES ORDENDECOMPRA (Id_orden, IdDetalleOrden, Id_producto_Prod, Id_inventario, Cedula, Id_rol, Id_formapago, Id_producto)
;

ALTER TABLE HISTORIALORDEN ADD CONSTRAINT historial FOREIGN KEY (Id_orden, IdDetalleOrden, Id_producto_Prod, Id_inventario, Cedula, Id_rol, Id_formapago, Id_producto) REFERENCES ORDENDECOMPRA (Id_orden, IdDetalleOrden, Id_producto_Prod, Id_inventario, Cedula, Id_rol, Id_formapago, Id_producto)
;

ALTER TABLE DETALLEFACTURA ADD CONSTRAINT Relationship27 FOREIGN KEY (IdDetalleOrden, Id_producto_DOrd, Id_inventario, Id_producto_detalles) REFERENCES DETALLEORDEN (IdDetalleOrden, Id_producto_Prod, Id_inventario, Id_producto)
;

ALTER TABLE INVENTARIO ADD CONSTRAINT producto inv FOREIGN KEY (Id_producto) REFERENCES PRODUCTO (Id_producto) ON DELETE NO ACTION ON UPDATE NO ACTION
;

