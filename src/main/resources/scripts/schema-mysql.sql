drop table if exists sys_book_info;
create table if not exists sys_book_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp     not null default current_timestamp comment '创建时间',
  last_save timestamp     not null default current_timestamp comment '更新时间',
  save_user varchar(40)   not null default 'sys_auto' comment '创建者名',
  last_user varchar(40)   not null default 'sys_auto' comment '更新者名',
  able_flag tinyint       not null default 1 comment '可用状态',
  lock_flag tinyint       not null default 1 comment '删除状态',
  high_sole bigint        not null default -1 comment '上级编号',

  book_sole bigint        not null unique comment '书籍编号',
  book_name varchar(60)   not null comment '书籍名称',
  real_name varchar(20)   not null comment '作者姓名',
  book_cost decimal(8, 3) not null default 0.0 comment '书籍售价'

) engine = InnoDB
  default charset = utf8mb4 comment '书籍表';

/*一对一*/
drop table if exists oto_user_info;
create table if not exists oto_user_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',

  user_name varchar(40) not null unique comment '用户名称'

) engine InnoDB
  default charset utf8mb4 comment '用户表';

drop table if exists oto_card_info;
create table if not exists oto_card_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',

  card_name varchar(40) not null unique comment '卡片名称'

) engine InnoDB
  default charset utf8mb4 comment '卡片表';


/*一对多*/
drop table if exists otm_role_info;
create table if not exists otm_role_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',

  role_name varchar(40) not null unique comment '角色名称'

) engine InnoDB
  default charset utf8mb4 comment '角色表';

drop table if exists otm_duty_info;
create table if not exists otm_duty_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',

  duty_name varchar(40) comment '权限名称'

) engine InnoDB
  default charset utf8mb4 comment '权限表';

/*多对一*/
drop table if exists mto_team_info;
create table if not exists mto_team_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',

  team_name varchar(40) not null unique comment '小组名称'

) engine InnoDB
  default charset utf8mb4 comment '分组表';

drop table if exists mto_note_info;
create table if not exists mto_note_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',

  note_text varchar(40) comment '消息内容'

) engine InnoDB
  default charset utf8mb4 comment '消息表';

/*多对多*/
drop table if exists mtm_blog_info;
create table if not exists mtm_blog_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',

  blog_head varchar(40) comment '博客标题'

) engine InnoDB
  default charset utf8mb4 comment '博客表';

drop table if exists mtm_mark_info;
create table if not exists mtm_mark_info
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',


  mark_name varchar(40) comment '标签名称'

) engine InnoDB
  default charset utf8mb4 comment '标签表';

drop table if exists mtm_blog_mark;
create table if not exists mtm_blog_mark
(
  main_sole bigint primary key auto_increment comment '主键编号',
  save_time timestamp   not null default current_timestamp comment '创建时间',
  last_save timestamp   not null default current_timestamp comment '更新时间',
  save_user varchar(40) not null default 'sys_auto' comment '创建者名',
  last_user varchar(40) not null default 'sys_auto' comment '更新者名',
  able_flag tinyint     not null default 1 comment '可用状态',
  lock_flag tinyint     not null default 1 comment '删除状态',
  high_sole bigint      not null default -1 comment '上级编号',

  blog_sole bigint      not null comment '博客编号',
  mark_sole bigint      not null comment '标签编号'

) engine InnoDB
  default charset utf8mb4 comment '博客与标签关联表';
