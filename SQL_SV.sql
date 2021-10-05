create database QLSV_JAVA
use QLSV_JAVA

create table TAIKHOAN
(
	ten_dang_nhap varchar(20) primary key,
	mat_khau char(20),
	confirm char(20)
)

drop table TAIKHOAN

select * from taikhoan