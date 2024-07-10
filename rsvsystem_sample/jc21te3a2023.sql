-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- ホスト: localhost:8889
-- 生成日時: 2022 年 9 月 25 日 02:46
-- サーバのバージョン： 5.7.34
-- PHP のバージョン: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- データベース: `jc21te3a2023`
--

-- --------------------------------------------------------

--
-- テーブルの構造 `rsv_timetable`
--

CREATE TABLE `rsv_timetable` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` text NOT NULL,
  `sect` text NOT NULL,
  `notes` text NOT NULL,
  `time_st` datetime NOT NULL,
  `time_end` datetime NOT NULL,
  `cpt_name` text NOT NULL,
  `kwd` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `rsv_timetable`
--

INSERT INTO `rsv_timetable` (`id`, `name`, `sect`, `notes`, `time_st`, `time_end`, `cpt_name`, `kwd`) VALUES
(1, '坂井芳孝', '第一教務部', '打ち合わせ', '2023-09-25 16:30:00', '2023-09-25 17:00:00', '会議室A', ''),
(2, '坂井芳孝', '第一教務部', '', '2023-09-25 10:00:00', '2023-09-25 10:30:00', '会議室B', '');

--
-- ダンプしたテーブルのインデックス
--

--
-- テーブルのインデックス `rsv_timetable`
--
ALTER TABLE `rsv_timetable`
  ADD PRIMARY KEY (`id`);

--
-- ダンプしたテーブルの AUTO_INCREMENT
--

--
-- テーブルの AUTO_INCREMENT `rsv_timetable`
--
ALTER TABLE `rsv_timetable`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
