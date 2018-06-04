/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : dcits

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2018-06-04 09:15:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `backdiscussmsg`
-- ----------------------------
DROP TABLE IF EXISTS `backdiscussmsg`;
CREATE TABLE `backdiscussmsg` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `user_sid` int(11) NOT NULL,
  `pdm_sid` int(11) NOT NULL,
  `pre_sales_summarize` varchar(1000) DEFAULT NULL,
  `client_back_summarize` varchar(1000) DEFAULT NULL,
  `pre_sales_comment` varchar(100) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sid`),
  KEY `FK_Reference_7` (`user_sid`),
  KEY `FK_Reference_8` (`pdm_sid`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`user_sid`) REFERENCES `user` (`sid`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`pdm_sid`) REFERENCES `prediscussmsg` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of backdiscussmsg
-- ----------------------------

-- ----------------------------
-- Table structure for `indiscussmsg`
-- ----------------------------
DROP TABLE IF EXISTS `indiscussmsg`;
CREATE TABLE `indiscussmsg` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `user_sid` int(11) NOT NULL,
  `pdm_sid` int(11) NOT NULL,
  `discuss_proficient` varchar(100) NOT NULL,
  `discuss_time` varchar(255) DEFAULT NULL,
  `discuss_way` varchar(255) DEFAULT NULL,
  `discuss_file` varchar(255) DEFAULT NULL,
  `pre_sales_days` varchar(100) DEFAULT NULL,
  `reimbursement_amount` varchar(100) DEFAULT NULL,
  `apartment_person` varchar(255) DEFAULT NULL,
  `discuss_result` varchar(1000) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`),
  KEY `FK_Reference_10` (`user_sid`),
  KEY `FK_Reference_9` (`pdm_sid`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`user_sid`) REFERENCES `user` (`sid`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`pdm_sid`) REFERENCES `prediscussmsg` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of indiscussmsg
-- ----------------------------

-- ----------------------------
-- Table structure for `keycode`
-- ----------------------------
DROP TABLE IF EXISTS `keycode`;
CREATE TABLE `keycode` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `ftype` varchar(255) DEFAULT NULL,
  `fvalue` varchar(255) DEFAULT NULL,
  `p_sid` int(11) DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of keycode
-- ----------------------------
INSERT INTO `keycode` VALUES ('1', '1', 'A:技术交流\r\nA:技术交流', '0', null);
INSERT INTO `keycode` VALUES ('2', '1', 'B:投标支持', '0', null);
INSERT INTO `keycode` VALUES ('3', '1', 'C:产品POC', '0', null);
INSERT INTO `keycode` VALUES ('4', '2', '业务一部', '0', null);
INSERT INTO `keycode` VALUES ('5', '2', '业务二部', '0', null);
INSERT INTO `keycode` VALUES ('6', '2', '业务三部', '0', null);
INSERT INTO `keycode` VALUES ('7', '2', '业务四部', '0', null);
INSERT INTO `keycode` VALUES ('8', '2', '产品线外合作', '0', null);
INSERT INTO `keycode` VALUES ('9', '3', '非常好：（直接推动了商务机会）', '0', null);
INSERT INTO `keycode` VALUES ('10', '3', '良好：（加强了客户的了解，使客户对我们比较感兴趣，希望进一步交流）', '0', null);
INSERT INTO `keycode` VALUES ('11', '3', '一般：（客户了解了我们的情况，后续需要根据情况再进行讨论）', '0', null);
INSERT INTO `keycode` VALUES ('12', '3', '差：（客户对我们的情况，不感兴趣）', '0', null);
INSERT INTO `keycode` VALUES ('13', '3', '非常差：（交流的内容与客户的要求不符）', '0', null);

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(255) NOT NULL,
  `p_sid` int(11) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='�������ʾ������';

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '人员管理', '0', '1', 'personManager.html');
INSERT INTO `menu` VALUES ('2', '个人信息', '0', '2', 'myInfo.html');
INSERT INTO `menu` VALUES ('3', '售前申请', '0', '3', null);
INSERT INTO `menu` VALUES ('4', '菜单权限', '0', '4', null);
INSERT INTO `menu` VALUES ('5', '其他权限', '0', '5', null);

-- ----------------------------
-- Table structure for `prediscussmsg`
-- ----------------------------
DROP TABLE IF EXISTS `prediscussmsg`;
CREATE TABLE `prediscussmsg` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `proposer` varchar(50) NOT NULL,
  `pre_sales_type` varchar(100) NOT NULL,
  `application_date` datetime NOT NULL,
  `proposer_department` varchar(100) NOT NULL,
  `aim_unit` varchar(100) NOT NULL,
  `aim_department` varchar(100) NOT NULL,
  `aim_location` varchar(255) DEFAULT NULL,
  `aim_time` varchar(100) DEFAULT NULL,
  `client_interface` varchar(255) DEFAULT NULL,
  `client_duty` varchar(100) DEFAULT NULL,
  `client_back` varchar(1000) DEFAULT NULL,
  `aim_purpose` varchar(1000) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`),
  KEY `FK_Reference_5` (`user_id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`user_id`) REFERENCES `user` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prediscussmsg
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '系统管理员', null);
INSERT INTO `role` VALUES ('2', '其他', null);

-- ----------------------------
-- Table structure for `rolepower`
-- ----------------------------
DROP TABLE IF EXISTS `rolepower`;
CREATE TABLE `rolepower` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `role_sid` int(11) NOT NULL,
  `menu_sid` int(11) NOT NULL,
  PRIMARY KEY (`sid`),
  KEY `FK_Reference_4` (`role_sid`),
  KEY `FK_Reference_6` (`menu_sid`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`role_sid`) REFERENCES `role` (`sid`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`menu_sid`) REFERENCES `menu` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolepower
-- ----------------------------
INSERT INTO `rolepower` VALUES ('1', '1', '1');
INSERT INTO `rolepower` VALUES ('2', '1', '2');
INSERT INTO `rolepower` VALUES ('3', '1', '3');
INSERT INTO `rolepower` VALUES ('4', '1', '4');
INSERT INTO `rolepower` VALUES ('5', '1', '5');

-- ----------------------------
-- Table structure for `tablepower`
-- ----------------------------
DROP TABLE IF EXISTS `tablepower`;
CREATE TABLE `tablepower` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `role_sid` int(11) NOT NULL,
  `table_name` varchar(50) NOT NULL,
  `power` int(11) NOT NULL,
  PRIMARY KEY (`sid`),
  KEY `FK_Reference_11` (`role_sid`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`role_sid`) REFERENCES `role` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='power: 1-���ӣ�2-ɾ����3-�޸ģ�4-��ѯ��';

-- ----------------------------
-- Records of tablepower
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `itcode` varchar(255) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `other` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '81dc9bdb52d04dc20036dbd8313ed055', '13515425631', '156265412@qq.com', '0');

-- ----------------------------
-- Table structure for `user_role_ref`
-- ----------------------------
DROP TABLE IF EXISTS `user_role_ref`;
CREATE TABLE `user_role_ref` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `user_sid` int(11) NOT NULL,
  `role_sid` int(11) NOT NULL,
  PRIMARY KEY (`sid`),
  KEY `FK_Reference_2` (`user_sid`),
  KEY `FK_Reference_3` (`role_sid`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`user_sid`) REFERENCES `user` (`sid`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`role_sid`) REFERENCES `role` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role_ref
-- ----------------------------
INSERT INTO `user_role_ref` VALUES ('1', '1', '1');
