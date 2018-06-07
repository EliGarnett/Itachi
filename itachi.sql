DROP DATABASE IF EXISTS `itachi`;
CREATE DATABASE `itachi`;
USE `itachi`;

DROP TABLE IF EXISTS `mission_info`;

CREATE TABLE `mission_info` (
  `mission_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `mission_code` varchar(64) NOT NULL COMMENT '任务编号',
  `operation_no` varchar(64) NOT NULL COMMENT '创建任务业务方编号',
  `mission_desc` varchar(1000) NOT NULL DEFAULT '' COMMENT '任务描述',
  `job_url` varchar(255) NOT NULL COMMENT '作业调用url',
  `mission_type` tinyint(2) NOT NULL COMMENT '任务类型，1：循环任务、2：单次流控任务',
  `interval_time` int(4) NOT NULL DEFAULT '0' COMMENT '多次循环任务间隔时间（单位s），type为1时值有效',
  `concurrent_amount` int(4) NOT NULL DEFAULT '100' COMMENT '伪最大并发数（每秒），type为2时值有效',
  `mission_start_time` timestamp NULL DEFAULT NULL COMMENT '任务开始时间',
  `mission_end_time` timestamp NULL DEFAULT NULL COMMENT 'type为2时值有效，当前所有任务最后的执行时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '任务创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '任务更新时间',
  PRIMARY KEY (`mission_id`),
  KEY `idx_operation_no` (`operation_no`),
  KEY `idx_mission_code` (`mission_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务信息表';
