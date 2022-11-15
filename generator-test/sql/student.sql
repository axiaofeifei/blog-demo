/*
 Navicat Premium Data Transfer

 Source Server         : hhf-test
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : blog-demo

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 01/06/2022 10:23:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `stu_num` int NULL DEFAULT NULL,
  `stu_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 2020001, 'jon', 18, '男', '2020-09-18');
INSERT INTO `student` VALUES (2, 2020002, '杰克', 18, '男', '2020-09-18');
INSERT INTO `student` VALUES (3, 2020003, 'tom', 18, '女', '2020-09-18');
INSERT INTO `student` VALUES (4, 2020004, '汤姆', 18, '女', '2020-09-18');
INSERT INTO `student` VALUES (5, 2020005, 'jhon', 28, '男', '2020-09-18');
INSERT INTO `student` VALUES (6, 2020006, '乔恩', 28, '男', '2020-09-18');
INSERT INTO `student` VALUES (7, 2020007, 'marry', 28, '女', '2020-09-18');
INSERT INTO `student` VALUES (8, 2020008, '杰克', 28, '女', '2020-09-18');
INSERT INTO `student` VALUES (9, 2020009, 'Jack', 38, '男', '2019-09-18');
INSERT INTO `student` VALUES (11, 2020011, 'Jack', 38, '女', '2019-09-18');
INSERT INTO `student` VALUES (12, 2020012, '杰克', 38, '女', '2018-08-18');
INSERT INTO `student` VALUES (13, 2020013, '马可', 17, '男', '2020-09-22');
INSERT INTO `student` VALUES (14, 202014, '伽罗', 63, '女', '2020-09-23');
INSERT INTO `student` VALUES (15, 2020015, 'maria', 25, '女', '2020-09-02');
INSERT INTO `student` VALUES (16, 2020016, 'Maria', 21, '男', '2020-03-20');
INSERT INTO `student` VALUES (17, 2020017, 'mara', 62, '男', '2020-07-26');
INSERT INTO `student` VALUES (18, 2020018, 'mary', 23, '女', '2020-05-20');
INSERT INTO `student` VALUES (19, 2020019, 'sara', 54, '男', '2020-06-17');
INSERT INTO `student` VALUES (20, 2020020, 'Naruto', 32, '男', '2020-11-11');


SET FOREIGN_KEY_CHECKS = 1;
