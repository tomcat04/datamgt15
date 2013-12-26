/**
config utf8 for Ubuntu 12.04
sudo vim /etc/

[client]加
default-character-set   = utf8

[mysqld]加
init_connect                = 'SET collation_connection = utf8_unicode_ci' 
init_connect                = 'SET NAMES utf8' 
character-set-server    = utf8 
collation-server            = utf8_unicode_ci 
skip-character-set-client-handshake

[mysql]加
default-character-set   = utf8


**/

create database DataMgm15;

GRANT ALL PRIVILEGES ON DataMgm15.* To 'bydrootnew'@'localhost' IDENTIFIED BY 'bydrootnew';

/**
USER
    region( 地区), id, name, password, email, gender, job_title(岗位), phone, mobile_phone,  organization, working_location(办公地点）, workshop车间、working_section科室、status，field1(website), field2, field3 

*/

USE DataMgm15;

drop table t_user;

create  table t_user(
    id int primary key,
    region varchar(32),
    userid varchar(32),
    user_name varchar(32),
    password varchar(255),
    email varchar(64),
    gender varchar(4),
    job_title varchar(32),
    phone varchar(32),
    mobile_phone varchar(32),
    organization varchar(255),
    working_location varchar(255),
    workshop varchar(255),
    working_section varchar(255),
    status smallInt
);


/**
USER-ROLE
id, userId, roleId, status, request_time
*/

create table t_user_role(
    id int primary key,
    userId varchar(32),
    roleId int,
    status smallint,
    request_time date,
);


/**
Role

**/

/**
Material
 id, material_code, material_desc, material_desc2, image, QMS质量管理体系
*/

create table t_material(
    id int primary key,
    material_code varchar(32),
    material_desc varchar(255),
    material_desc2 varchar(255),
    image blob,
    QMS varchar(255)
);

/**
Material_Doc
id, material_code,document_grade, status(是否添加资料), Bom,iqc_Standard, iqc_card, Specification, iqc_Agreement, ppap_document
*/


/**
Material_exception_log
id,material_code,log_time,batch,exception, deal_desc, status
*/

/**
Vendor
id, vendor_code, vendor_name, brand, vendor_grade, phone, mobile_phone, email
**/


