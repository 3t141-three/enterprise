/*
SQLyog Community v12.3.3 (64 bit)
MySQL - 5.5.54 : Database - hr
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hr` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hr`;

/*Table structure for table `addposition` */

DROP TABLE IF EXISTS `addposition`;

CREATE TABLE `addposition` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `positionCode` varchar(50) NOT NULL COMMENT '职位编码',
  `positionName` varchar(50) NOT NULL COMMENT '职位名称',
  `type` varchar(50) NOT NULL COMMENT '职位分类',
  `departmentId` int(11) NOT NULL COMMENT '所属部门(根据id)',
  `depict` varchar(500) DEFAULT NULL COMMENT '职位描述',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `addposition` */

/*Table structure for table `biographicalnotes` */

DROP TABLE IF EXISTS `biographicalnotes`;

CREATE TABLE `biographicalnotes` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `positionId` int(11) NOT NULL COMMENT '应聘岗位名称(根据id)',
  `positionCode` varchar(20) NOT NULL COMMENT '应聘职位编码',
  `positionClassify` varchar(20) NOT NULL COMMENT '职位分类',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `sex` varchar(2) NOT NULL COMMENT '性别',
  `recruitmentType` varchar(50) NOT NULL COMMENT '招聘类型',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `phone` int(11) NOT NULL COMMENT '电话',
  `hkAddress` varchar(50) NOT NULL COMMENT '户口所在地',
  `address` varchar(50) DEFAULT NULL COMMENT '住址',
  `politicCountenance` varchar(30) DEFAULT NULL COMMENT '政治面貌',
  `identityCard` varchar(50) NOT NULL COMMENT '身份证号码',
  `institution` varchar(30) NOT NULL COMMENT '毕业院校',
  `record` varchar(20) NOT NULL COMMENT '学历',
  `specialty` varchar(50) NOT NULL COMMENT '专业',
  `workExperience` varchar(50) DEFAULT NULL COMMENT '工作经验',
  `salary` double DEFAULT NULL COMMENT '薪资要求',
  `isService` varchar(50) NOT NULL COMMENT '是否在职',
  `freshGraduate` varchar(50) NOT NULL COMMENT '是否应届生',
  `registerDate` date NOT NULL COMMENT '登记时间',
  `biographicalnotes` varchar(500) DEFAULT NULL COMMENT '个人履历',
  `way` varchar(200) DEFAULT NULL COMMENT '简历附件',
  `recommend` varchar(20) NOT NULL COMMENT '是否推荐面试',
  `recommendName` varchar(50) DEFAULT NULL COMMENT '推荐人',
  `recommendTime` date NOT NULL COMMENT '推荐时间',
  `idea` varchar(500) DEFAULT NULL COMMENT '推荐面试意见',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `biographicalnotes` */

/*Table structure for table `cultivate` */

DROP TABLE IF EXISTS `cultivate`;

CREATE TABLE `cultivate` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `cultivateName` varchar(50) NOT NULL COMMENT '培训名称',
  `cultivateTeacher` varchar(50) NOT NULL COMMENT '培训讲师',
  `beginTime` date NOT NULL COMMENT '开始培训时间',
  `finish` date NOT NULL COMMENT '结束培训时间',
  `purpose` varchar(500) DEFAULT NULL COMMENT '培训目的',
  `participant` varchar(500) NOT NULL COMMENT '培训人员',
  `introduce` varchar(500) DEFAULT NULL COMMENT '培训简介',
  `means` varchar(500) DEFAULT NULL COMMENT '培训资料(文件路径)',
  `cultivateExamine` varchar(500) NOT NULL COMMENT '培训审核意见',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cultivate` */

/*Table structure for table `cultivatefeedback` */

DROP TABLE IF EXISTS `cultivatefeedback`;

CREATE TABLE `cultivatefeedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `result` varchar(20) NOT NULL COMMENT '培训反馈(优，良，差)',
  `sumUp` varchar(500) DEFAULT NULL COMMENT '培训总结',
  `examine` varchar(500) DEFAULT NULL COMMENT '考核结果',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cultivatefeedback` */

/*Table structure for table `file` */

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `branchid` int(11) NOT NULL COMMENT '所属部门(部门id)',
  `fileStatus` varchar(20) NOT NULL COMMENT '档案状态(试用期，正式员工，离职，已删除，实习员工)',
  `positionCode` varchar(20) NOT NULL COMMENT '职位编码',
  `positionid` int(11) NOT NULL COMMENT '职位名称(职位id)',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `sex` varchar(2) NOT NULL COMMENT '性别(男，女)',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `phone` int(11) NOT NULL COMMENT '电话',
  `address` varchar(50) NOT NULL COMMENT '地址',
  `identityCard` varchar(50) NOT NULL COMMENT '身份证号码',
  `hkAddress` varchar(50) NOT NULL COMMENT '户口所在地',
  `politicCountenance` varchar(50) DEFAULT NULL COMMENT '政治面貌',
  `institution` varchar(50) NOT NULL COMMENT '毕业院校',
  `specialty` varchar(50) NOT NULL COMMENT '专业',
  `record` varchar(20) NOT NULL COMMENT '学历(专科，本科，硕士，博士)',
  `salary` varchar(20) NOT NULL COMMENT '薪酬标准(低，中，高级工程师)',
  `bankName` varchar(50) NOT NULL COMMENT '开户行',
  `bankId` varchar(50) NOT NULL COMMENT '银行卡号',
  `socialInsuranceId` varchar(50) NOT NULL COMMENT '社保卡号',
  `register` varchar(50) NOT NULL COMMENT '登记人',
  `build` date NOT NULL COMMENT '登记时间',
  `biographicalNotes` varchar(500) DEFAULT NULL COMMENT '个人履历',
  `family` varchar(300) DEFAULT NULL COMMENT '家庭关系',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `way` varchar(200) DEFAULT NULL COMMENT '简历附件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `file` */

/*Table structure for table `organization` */

DROP TABLE IF EXISTS `organization`;

CREATE TABLE `organization` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `code` varchar(50) NOT NULL COMMENT '组织编码',
  `call` varchar(50) NOT NULL COMMENT '组织简称',
  `organizationName` varchar(50) NOT NULL COMMENT '组织全称',
  `higherLevel` varchar(50) NOT NULL COMMENT '所属组织',
  `address` varchar(50) NOT NULL COMMENT '地址',
  `briefIntroduction` varchar(200) DEFAULT NULL COMMENT '组织简介',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `organization` */

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `branch` varchar(50) NOT NULL COMMENT '部门',
  `recruit` varchar(50) NOT NULL COMMENT '招聘类型(校园招聘，社会招聘)',
  `positionName` varchar(50) NOT NULL COMMENT '职位名称',
  `positionCode` varchar(50) NOT NULL COMMENT '职位编码',
  `positionClassify` varchar(50) DEFAULT NULL COMMENT '职位分类',
  `fegisterName` varchar(50) NOT NULL COMMENT '登记人',
  `beginTime` date NOT NULL COMMENT '登记时间',
  `finish` date NOT NULL COMMENT '截止时间',
  `depict` varchar(500) NOT NULL COMMENT '职位描述',
  `ask` varchar(500) NOT NULL COMMENT '职位要求',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `position` */

/*Table structure for table `professionaltitle` */

DROP TABLE IF EXISTS `professionaltitle`;

CREATE TABLE `professionaltitle` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `professionalTitleCode` varchar(50) NOT NULL COMMENT '职称编码',
  `professionalTitleName` varchar(50) NOT NULL COMMENT '职称名称',
  `departmentId` int(11) NOT NULL COMMENT '所属部门(根据id)',
  `depict` varchar(500) DEFAULT NULL COMMENT '职称描述',
  `remarks` varchar(500) DEFAULT NULL COMMENT '职称描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `professionaltitle` */

/*Table structure for table `questions` */

DROP TABLE IF EXISTS `questions`;

CREATE TABLE `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `questionsName` varchar(50) NOT NULL COMMENT '试题名称',
  `type` varchar(50) NOT NULL COMMENT '试题类型',
  `departmentId` int(11) NOT NULL COMMENT '所属部门(根据id)',
  `grade` int(11) NOT NULL COMMENT '试题等级',
  `person` varchar(50) NOT NULL COMMENT '出题人',
  `time` date NOT NULL COMMENT '出题时间',
  `question` varchar(500) NOT NULL COMMENT '试题内容',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `appendix` varchar(50) DEFAULT NULL COMMENT '试题附件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `questions` */

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `salaryCode` varchar(50) NOT NULL COMMENT '薪酬标准编号',
  `salaryName` varchar(50) NOT NULL COMMENT '薪酬标准名称',
  `salarySum` double NOT NULL COMMENT '薪酬总额',
  `layDown` varchar(50) NOT NULL COMMENT '制定人',
  `register` varchar(50) NOT NULL COMMENT '登记人',
  `registerTime` date NOT NULL COMMENT '登记时间',
  `change` varchar(500) DEFAULT NULL COMMENT '变更原因',
  `basic` double NOT NULL COMMENT '基本工资',
  `performance` double DEFAULT NULL COMMENT '绩效工资',
  `travel` double DEFAULT NULL COMMENT '交通补助',
  `phoneAllowance` double DEFAULT NULL COMMENT '通讯补助',
  `mealAllowance` double DEFAULT NULL COMMENT '餐补',
  `housingAllowance` double DEFAULT NULL COMMENT '住房补助',
  `travelAllowance` double DEFAULT NULL COMMENT '出差补助',
  `overtimePremium` double DEFAULT NULL COMMENT '加班补助',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salary` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `code` varchar(20) NOT NULL COMMENT '用户编码',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `role` varchar(50) NOT NULL COMMENT '角色',
  `branch` varchar(50) NOT NULL COMMENT '所属部门',
  `phone` int(11) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
