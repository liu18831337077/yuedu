/*
 Navicat Premium Data Transfer

 Source Server         : 49.232.43.230
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : 49.232.43.230:3306
 Source Schema         : yuedu

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 30/12/2019 16:26:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for yuedu_articles
-- ----------------------------
DROP TABLE IF EXISTS `yuedu_articles`;
CREATE TABLE `yuedu_articles`  (
  `art_id` int(11) NOT NULL AUTO_INCREMENT,
  `art_cate` int(10) NULL DEFAULT NULL COMMENT '分类',
  `art_title` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `art_uid` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `art_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '内容',
  `art_createtime` date NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`art_id`) USING BTREE,
  INDEX `art_uid`(`art_uid`) USING BTREE,
  INDEX `art_cate`(`art_cate`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yuedu_articles
-- ----------------------------
INSERT INTO `yuedu_articles` VALUES (29, 2, '宇宙尺度下的我们有多渺小？', 7, '[{\"type\":\"text\",\"content\":\"1995年的冬天，科学家们将哈勃望远镜对准了北斗七星附近的一片天空，那是一片漆黑，远离周围恒星的光污染。这个区域似乎空无一物，所有的努力都有可能白费。但如果那个区域真的有东西，那会是什么呢？\"},{\"type\":\"image\",\"content\":\"http://49.232.43.230:8800/files/b967d4a5-ba0a-42ae-93db-f514f27801f0.jpg\"},{\"type\":\"text\",\"content\":\"在接下来的十天里，哈勃望远镜对这片区域进行了150小时的持续曝光。而得到的图像令人惊叹：1500多个各不相同的星系，在这宇宙的一角闪耀着。现在，让我们倒回来，认识下这张图像的真实大小。假设你站在夜空前，将一支圆珠笔举在一臂远的位置，注视它的最远端，这就是哈勃望远镜拍摄到的第一张哈勃深空视场。换句话说，这3000个星系只是宇宙里的一点尘埃，大约占全部星空的两百万分之一。\"},{\"type\":\"image\",\"content\":\"http://49.232.43.230:8800/files/c131b64e-badc-4256-8c26-ee675aeedea0.png\"},{\"type\":\"text\",\"content\":\"（哈勃极深场）\\n\\n更直观地来理解，人类平均身高约1.7米。而地球的直径是12700公里，大约是750万人头脚相连的长度。阿波罗8号宇航员需要飞行38万公里才能到达月球。而我们的太阳，作为一颗相对较小的恒星，直径也有140万公里，也就是地球直径的110倍。更进一步，银河系包含约1000到4000亿颗恒星，其中包括我们的太阳。而哈勃深空里拍到的每一个闪耀的星系都包含着至少十亿颗恒星。\"},{\"type\":\"image\",\"content\":\"http://49.232.43.230:8800/files/8a7cda53-3b52-4615-9f02-b3fa85462de8.png\"}]', '2019-12-30');
INSERT INTO `yuedu_articles` VALUES (30, 1, '人类文明中有哪些无比悲壮的场面？', 7, '[{\"type\":\"text\",\"content\":\"女黑奴塞丝，怀着身孕从肯塔基州的奴隶庄园逃到俄亥俄州，奴隶主循踪追至。\"},{\"type\":\"text\",\"content\":\"为了使儿女不再重复自己做奴隶的悲惨命运，她毅然杀死了刚刚会爬的幼女宠儿……这是美国女作家托妮·莫里森的小说《宠儿》的主题。\"},{\"type\":\"image\",\"content\":\"_doc/uniapp_temp_1577675852740/compressed/1577676613345.png\"},{\"type\":\"text\",\"content\":\"这个死于父母“暴力”的小孩并非是书中虚构的人物，母亲也有原型——玛格丽特·加纳（Margaret Garner）。\\n\\n*\"},{\"type\":\"text\",\"content\":\"1856年1月27日晚，玛格丽特和四个孩子、丈夫、父母，以及其他9个奴隶从肯塔基州逃往俄亥俄州，后者当时是自由州。\"},{\"type\":\"text\",\"content\":\"他们在亲戚家安顿下来不久，奴隶主盖恩斯带着一队人马追踪而至。眼见逃跑无望，玛格丽特用斧头砍断了2岁小女儿的喉管。\"},{\"type\":\"text\",\"content\":\"她原本想杀死所有孩子，最后自己自杀，但人们强行制服了她。被捕后，玛格丽特十分平静，只是不断重复地说：“他们不能那样活下去”。\"},{\"type\":\"image\",\"content\":\"_doc/uniapp_temp_1577675852740/compressed/1577676655474.png\"},{\"type\":\"text\",\"content\":\"实际上，玛格丽特和她的孩子只是1亿[1]奴隶中的一个，有无数个“母亲玛格丽特”杀死了自己的孩子然后自杀。\"},{\"type\":\"text\",\"content\":\"试想下这个场面，有多悲壮？\"},{\"type\":\"text\",\"content\":\"更悲壮的是“老乡背后插一刀”。\"},{\"type\":\"text\",\"content\":\"——————\"},{\"type\":\"text\",\"content\":\"说下玛格丽特的结局吧。\"},{\"type\":\"text\",\"content\":\"盖恩斯等人包围房子后，玛格丽特丈夫罗伯特·加纳和他们发生了一场枪战，但最后全家还是被逮捕了。\"},{\"type\":\"text\",\"content\":\"1856年3月11日，《解放者报》报道说，在去新奥尔良途中，玛格丽特夫妇乘坐的轮船与另一艘船相撞，她和另一个孩子在碰撞中被抛到海里，孩子淹死了。据报道，玛格丽特很高兴孩子死了，她还试图淹死自己。\"},{\"type\":\"text\",\"content\":\"1870年，《辛辛那提纪事报》一位记者找到了罗伯特·加纳，了解到他们曾在新奥尔良工作，1857年被卖给一个法官，在密西西比州田纳西州兰登市从事种植业劳动。\"},{\"type\":\"text\",\"content\":\"罗伯特说，玛格丽特在1858年死于伤寒，临死前曾敦促他“永远不要成为奴隶，而是要为自由而生活。”\"}]', '2019-12-30');

-- ----------------------------
-- Table structure for yuedu_categories
-- ----------------------------
DROP TABLE IF EXISTS `yuedu_categories`;
CREATE TABLE `yuedu_categories`  (
  `cate_id` int(10) NOT NULL AUTO_INCREMENT,
  `cate_pid` int(10) NULL DEFAULT 0,
  `cate_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cate_order` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`cate_id`) USING BTREE,
  INDEX `cate_pid`(`cate_pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yuedu_categories
-- ----------------------------
INSERT INTO `yuedu_categories` VALUES (1, 0, '美文', 1);
INSERT INTO `yuedu_categories` VALUES (2, 0, '互联网', 2);
INSERT INTO `yuedu_categories` VALUES (3, 0, '汽车', 3);

-- ----------------------------
-- Table structure for yuedu_members
-- ----------------------------
DROP TABLE IF EXISTS `yuedu_members`;
CREATE TABLE `yuedu_members`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `u_openid` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'openid',
  `u_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户昵称',
  `u_face` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户头像',
  `u_random` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户随机码',
  `u_integral` int(10) NULL DEFAULT 0 COMMENT '积分',
  `u_remainder` int(10) NULL DEFAULT 0 COMMENT '余额',
  `u_regtime` datetime(0) NOT NULL COMMENT '用户注册时间',
  PRIMARY KEY (`u_id`) USING BTREE,
  UNIQUE INDEX `u_openid`(`u_openid`) USING BTREE,
  UNIQUE INDEX `u_id`(`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yuedu_members
-- ----------------------------
INSERT INTO `yuedu_members` VALUES (7, 'oRrdQt5TjlF_oIk_cZJvDB008n60', '.', 'http://thirdwx.qlogo.cn/mmopen/vi_32/GM3icWxbualBDY9dvPLibfrGGzdh9skbsukMdflTU9moCgTIIibHC4UYEpPKhNm7dIvk6QticGibZ3T9SictTuE99yuQ/132', '61ab1906-b290-487c-9902-7ff394d404e6', 244, 0, '2019-12-25 00:00:00');
INSERT INTO `yuedu_members` VALUES (8, 'oRrdQt58tgCGvFP3F0YS_7PjPauY', 'such', 'http://thirdwx.qlogo.cn/mmopen/vi_32/Cic3ibHFHRSWxpfub2R45gDexDSEZWSPbXeS6XRrM3ahUrLymubXdiaZWOTXPedBsdATewSN2Y1jKaG7ia9xSW5Aqg/132', '9144bfb8-7f8a-4e8d-bc6a-25bfc225f482', 10, 0, '2019-12-30 00:00:00');

SET FOREIGN_KEY_CHECKS = 1;
