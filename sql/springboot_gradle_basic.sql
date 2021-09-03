/* 基础数据创建部分 */
use information_schema;
drop database if exists db_springboot_basic_demo;
create database db_springboot_basic_demo default charset utf8mb4 collate utf8mb4_general_ci;
use db_springboot_basic_demo;

create table tb_demo
(
  did integer auto_increment primary key not null comment '主键',
  demo_key varchar(50) unique comment '演示键值',
  demo_value varchar(200) comment '演示值',
  lastupdate timestamp on update now() default now() not null comment '最后更新时间'
)comment '系统配置表';

select * from tb_demo;

/* 数据重置部分 */
truncate table tb_demo;

insert into tb_demo(demo_key,demo_value) values('DarkKnight','黑暗骑士');
insert into tb_demo(demo_key,demo_value) values('Spider','蜘蛛侠');
insert into tb_demo(demo_key,demo_value) values('Captain America','美国队长');

select * from tb_demo;
