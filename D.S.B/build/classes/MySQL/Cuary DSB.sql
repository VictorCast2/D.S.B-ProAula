-- Crear una base de datos del Proyecto de Aula...
create database Proaula;

-- Ver las base de datos creadas
show databases;

-- Entramos a ProAula
use Proaula;
select * from Users;
select * from Alimentos;
select * from Ejercicios;

-- Creamos las tablas de la  base de datos
create table Users(
ID int not null auto_increment primary Key,
Nombre varchar(50) not null,
Apellido varchar(50) not null,
Edad int not null,
Sexo varchar(20) not null,
Usuario varchar(100) not null,
Contrasenna varchar(100) not null,
Peso decimal(10,2) not null,
Altura decimal(10,2) not null,
Enfermedad varchar(20) not null
);

create table Alimentos(
N int not null auto_increment primary Key,
ID int not null,
Comida varchar(50) not null,
CategoriaAlimentos varchar(50) not null,
TipoComida varchar(50) not null
);

SELECT Comida, CategoriaAlimentos, TipoComida FROM Alimentos where ID = (?);

create table Ejercicios(
N int not null auto_increment primary Key,
ID int not null,
TipoEjercicio varchar(50) not null,
NombreEjercicio varchar(50) not null,
Intensidad varchar(50) not null,
DuraccionHoras varchar(50) not null,
DuraccionMinutos varchar(50) not null
);

select TipoEjercicio, NombreEjercicio, Intensidad, DuraccionHoras, DuraccionMinutos from Ejercicios where ID = 1;

select Comida, CategoriaAlimentos, TipoComida from Alimentos where ID = (?);

-- Insertamos los datos a la tabla:
insert into Users(Nombre, Apellido, Edad, Sexo, Usuario, Contrasenna, Peso, Altura, Enfermedad) values ('Victor Jose', 'Castillo Castro', 19, 'Masculino', 'VictorCast', '1234', 73.8, 1.75, 'Diabetes Tipo 1');
insert into Alimentos(ID,Comida,CategoriaAlimentos,TipoComida) values (1,'H','H','H');
insert into Ejercicios(ID,TipoEjercicio,NombreEjercicio,Intensidad,DuraccionHoras,DuraccionMinutos) values ((1),('Hola'),('Hola'),('Hola'),(4),(5));

-- Actualizar la base de datos
UPDATE Users SET Contrasenna = '1234', Peso = 73.8, Altura = 1.75 WHERE Usuario = ('VictorCast');
UPDATE Alimentos set Comida = (?), CategoriaAlimentos = (?) where ID = (?) && Comida = (?) && CategoriaAlimentos = (?);
UPDATE Ejercicios set TipoEjercicio = (?), NombreEjercicio = (?), Intensidad = (?), DuraccionHoras = (?), DuraccionMinutos = (?) where ID = (?) && TipoEjercicio = (?) && NombreEjercicio = (?) && Intensidad = (?) && DuraccionHoras = (?) && DuraccionMinutos = (?);

-- (Eliminar)

-- Eliminar una tabla
drop table Users;
drop table Alimentos;
drop table Ejercicios;

-- Eliminar en una colunna
delete from Users where Usuario = 'admin' and Contrasenna = '1234' ;

-- Eliminar una base de datos
drop database Proaula;