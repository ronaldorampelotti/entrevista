# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table PESSOA (
  nome                      varchar(255),
  sobrenome                 varchar(255),
  data_nascimento           timestamp)
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists PESSOA;

SET REFERENTIAL_INTEGRITY TRUE;

