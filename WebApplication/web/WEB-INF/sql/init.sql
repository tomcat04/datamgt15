/**
config utf8 for Ubuntu 12.04
sudo vim /etc/mysql/my.cnf

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
    status int
);


/**
USER-ROLE
id, userId, roleId, status, request_time
*/

create table t_user_role(
    id int primary key,
    userId varchar(32),
    roleId int,
    status int,
    request_time date
);


/**
Role

**/

/**
Material
 id, material_code, material_desc, image, QMS质量管理体系
*/

create table t_material(
    id int primary key,
    material_code varchar(32),
    material_desc varchar(255),
    image blob,
    QMS varchar(255)
);

/**
Material_Doc
id, material_code,document_grade, status(是否添加资料), Bom,iqc_Standard, iqc_card, Specification, iqc_Agreement, ppap_document
*/

create table t_material_doc(
    id int primary key,
    material_code varchar(32),
    document_grade varchar(32),
    status varchar(32),
    Bom varchar(255),
    iqc_Standard varchar(255),
    iqc_card varchar(255),
    specification varchar(255),
    iqc_Agreement varchar(255),
    ppap_document varchar(255)
);

/**
Material_exception_log
id,material_code,log_time,batch,exception_desc, deal_desc, status
*/
create table t_material_exception_log(
id int primary key,
material_code varchar(32),
log_time date,
batch varchar(32),
exception_desc varchar(255),
deal_desc  varchar(255),
status int
);

/**
Vendor
id, vendor_code, vendor_name, brand, vendor_grade, phone, mobile_phone, email
**/
create table t_vendor(
id int primary key,
vendor_code varchar(32),
vendor_name varchar(255),
brand varchar(64),
vendor_grade  varchar(32),
phone varchar(32),
mobile_phone varchar(32),
email varchar(64)
);


/**
Material_Vendor_Relation
    id,recordId(编号),materialCode,vendorCode,material_desc2(原厂描述),delivery_cycle(交货周期),delivery_status(供货状态)
**/
create table t_material_vendor_relation(
id int primary key,
recordId varchar(32),
material_Code varchar(32),
vendor_Code varchar(32),
material_desc2 varchar(255),
delivery_cycle varchar(32),
delivery_status int
);

/**

**/
create  view MaterialFullInfo  as 
select 
relation.id,
relation.recordId,
material.material_Code,
material.material_desc,
relation.material_desc2,
material.image,
material.QMS,
vendor.vendor_Code,
vendor.vendor_name,
vendor.brand,
vendor.vendor_grade,
vendor.phone,
vendor.mobile_phone,
vendor.email,
relation.delivery_cycle,
relation.delivery_status
from t_material_vendor_relation relation, t_vendor vendor,  t_material material
where relation.material_Code = material.material_code and relation.vendor_Code = vendor.vendor_code;