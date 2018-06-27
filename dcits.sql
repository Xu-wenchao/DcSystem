/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : dcits

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2018-06-27 10:18:47
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
INSERT INTO `keycode` VALUES ('1', '1', 'A:技术交流', '0', null);
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
INSERT INTO `menu` VALUES ('3', '售前申请', '0', '3', 'preMsgManager.html');
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prediscussmsg
-- ----------------------------
INSERT INTO `prediscussmsg` VALUES ('2', '1', 'admin', 'A:技术交流', '2018-06-06 08:00:00', '业务一部', '神州信息大厦', '技术部', '神州信息大厦', '2018-06-06', 'Mr Lee', '销售', '新华社里斯本6月4日电（报道员陈柏乔）权威媒体《转会市场》4日公布了2018年世界杯32支参赛球队的预测身价。法国队以10.8亿欧元的身价排名榜首，西班牙10.4亿欧元位居次席，巴西、英格兰、德国、比利时和阿根廷队的身价也均超过了7亿欧元。C罗领衔的葡萄牙队以约4.7亿欧元的身价排名第八。', '球星身价方面，阿根廷的梅西和巴西的内马尔以1.8亿欧元的身价并列第一，埃及红星萨拉赫则凭借1.5亿欧元的身价与凯恩和德布劳内并列第三。C罗的预计身价由1.2亿欧元降至1亿欧元。33岁的葡萄牙队长也是12名身价过亿的球员中年纪最大的一位。', null);
INSERT INTO `prediscussmsg` VALUES ('3', '12', '售前', 'B:投标支持', '2018-06-06 08:00:00', '业务二部', '神州数码', '技术部', '数码科技广场', '2018-06-06', '范德萨', '程序员', '工作原理：首先设置表达式 n（通常是一个变量）。随后表达式的值会与结构中的每个 case 的值做比较。如果存在匹配，则与该 case 关联的代码块会被执行。请使用 break 来阻止代码自动地向下一个 case 运行。', 'default 关键词\n\n请使用 default 关键词来规定匹配不存在时做的事情：\n实例\n\n如果今天不是周六或周日，则会输出默认的消息：', null);

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '系统管理员', null);
INSERT INTO `role` VALUES ('2', '其他', null);
INSERT INTO `role` VALUES ('3', '售前', null);
INSERT INTO `role` VALUES ('4', '专家', null);

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolepower
-- ----------------------------
INSERT INTO `rolepower` VALUES ('1', '1', '1');
INSERT INTO `rolepower` VALUES ('2', '1', '2');
INSERT INTO `rolepower` VALUES ('3', '1', '3');
INSERT INTO `rolepower` VALUES ('4', '1', '4');
INSERT INTO `rolepower` VALUES ('5', '1', '5');
INSERT INTO `rolepower` VALUES ('6', '3', '2');
INSERT INTO `rolepower` VALUES ('7', '3', '3');

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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '81dc9bdb52d04dc20036dbd8313ed055', '13515425631', '156265412@qq.com', '0');
INSERT INTO `user` VALUES ('2', 'xuwcb', 'xuwenchao', '81dc9bdb52d04dc20036dbd8313ed055', '13515425632', '23123@123.com', '1');
INSERT INTO `user` VALUES ('3', 'xuwcb', 'xuwenchao', '81dc9bdb52d04dc20036dbd8313ed055', '13515425632', '23123@123.com', '1');
INSERT INTO `user` VALUES ('4', 'xuwcb', 'xuwenchao', '81dc9bdb52d04dc20036dbd8313ed055', '13515425632', '23123@123.com', '1');
INSERT INTO `user` VALUES ('5', 'xuwcb', 'xuwenchao', '81dc9bdb52d04dc20036dbd8313ed055', '13515425632', '23123@123.com', '1');
INSERT INTO `user` VALUES ('6', 'xuwcb', '徐文超', '81dc9bdb52d04dc20036dbd8313ed055', '1351543671', '32324', '0');
INSERT INTO `user` VALUES ('7', 'xxx', 'xxx', '81dc9bdb52d04dc20036dbd8313ed055', 'xxx', 'xxx', '1');
INSERT INTO `user` VALUES ('8', 'qq', 'qq', '81dc9bdb52d04dc20036dbd8313ed055', 'qq', 'qq', '1');
INSERT INTO `user` VALUES ('9', 'eee', 'eee', '81dc9bdb52d04dc20036dbd8313ed055', 'ee', 'eee', '1');
INSERT INTO `user` VALUES ('10', 'zzzz', 'zzzz', '81dc9bdb52d04dc20036dbd8313ed055', 'zzz', 'zzzz', '1');
INSERT INTO `user` VALUES ('11', 'zzz', 'zz', '81dc9bdb52d04dc20036dbd8313ed055', 'zz', 'zzzz', '1');
INSERT INTO `user` VALUES ('12', 'shouqian', '售前', '81dc9bdb52d04dc20036dbd8313ed055', '13516473643', '35@QQ.COM', '0');
INSERT INTO `user` VALUES ('13', '1', '1', '81dc9bdb52d04dc20036dbd8313ed055', '1', '1', '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role_ref
-- ----------------------------
INSERT INTO `user_role_ref` VALUES ('1', '1', '1');
INSERT INTO `user_role_ref` VALUES ('2', '11', '1');
INSERT INTO `user_role_ref` VALUES ('3', '12', '3');
INSERT INTO `user_role_ref` VALUES ('4', '13', '2');
