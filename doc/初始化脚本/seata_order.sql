/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : seata_order

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 03/12/2020 17:19:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` bigint(0) NOT NULL COMMENT '订单id',
  `goods_Id` int(0) NULL DEFAULT NULL COMMENT '商品ID',
  `num` int(0) NULL DEFAULT NULL COMMENT '商品数量',
  `money` decimal(10, 0) NULL DEFAULT NULL COMMENT '商品总金额',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '订单创建时间',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;


ALTER TABLE `seata_order`.`t_order` 
ADD COLUMN `status` int(0) NULL COMMENT '\r\n订单状态-0不可用,事务未提交 , 1-可用,事务提交' AFTER `username`;