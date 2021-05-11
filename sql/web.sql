-- ------------------------------------
-- Table structure for Customers
-- 消费者表
-- 存储消费者信息
-- 2021-05-12
-- ------------------------------------
CREATE TABLE `Customers` (
  `custom_id` char(10) NOT NULL COMMENT '唯一的顾客ID',
  `custom_name` char(50) NOT NULL COMMENT '顾客名',
  `custom_address` char(50) DEFAULT NULL COMMENT '顾客的地址',
  `custom_city` char(50) DEFAULT NULL COMMENT '顾客所在城市',
  `custom_state` char(5) DEFAULT NULL COMMENT '顾客所在州',
  `custom_zip` char(10) DEFAULT NULL COMMENT '顾客地址邮政编码',
  `custom_country` char(50) DEFAULT NULL COMMENT '顾客所在国家',
  `custom_contact` char(50) DEFAULT NULL COMMENT '顾客的联系名',
  `custom_email` char(255) DEFAULT NULL COMMENT '顾客的电子邮件地址',
  PRIMARY KEY (`custom_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='顾客信息表'