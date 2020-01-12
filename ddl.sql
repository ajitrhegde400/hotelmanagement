CREATE TABLE `user` (
  `Id` varchar(256) NOT NULL,
  `firstname` varchar(256) DEFAULT NULL,
  `lastname` varchar(256) DEFAULT NULL,
  `phoneNumber` varchar(32) DEFAULT NULL,
  `address` varchar(1024) DEFAULT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id_UNIQUE` (`Id`),
  UNIQUE KEY `phoneNumber_UNIQUE` (`phoneNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='user'


CREATE TABLE `room` (
  `number` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  `hotelId` varchar(256) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `hotel_id` varchar(255) NOT NULL,
  PRIMARY KEY (`number`),
  UNIQUE KEY `number_UNIQUE` (`number`,`hotelId`),
  UNIQUE KEY `hotelId_UNIQUE` (`hotelId`),
  CONSTRAINT `hotelId` FOREIGN KEY (`hotelId`) REFERENCES `hotel` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `hotel` (
  `id` varchar(256) NOT NULL,
  `hotelname` varchar(256) DEFAULT NULL,
  `address` varchar(1024) DEFAULT NULL,
  `phoneNumber` varchar(32) DEFAULT NULL,
  `hotel_name` varchar(255) NOT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `booking` (
  `id` varchar(256) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  `phoneNumber` varchar(32) DEFAULT NULL,
  `userId` varchar(256) DEFAULT NULL,
  `hotelBookingId` varchar(256) DEFAULT NULL,
  `hotelId` varchar(256) DEFAULT NULL,
  `hotel_id` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `userId_UNIQUE` (`userId`),
  UNIQUE KEY `hotelBookingId_UNIQUE` (`hotelBookingId`),
  KEY `userId_idx` (`userId`),
  KEY `hotelId_idx` (`hotelId`),
  CONSTRAINT `hotelIdfk` FOREIGN KEY (`hotelBookingId`) REFERENCES `hotel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci