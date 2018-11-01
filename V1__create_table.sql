CREATE TABLE `Rep` (
	`id` int(11) NOT NULL,
	`name` varchar(100) NOT NULL,
	`website` varchar(120) DEFAULT NULL,
	`other` varchar(100) DEFAULT NULL,
	`created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`last_updated` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`),
	UNIQUE KEY `Rep2_name_uindex` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
