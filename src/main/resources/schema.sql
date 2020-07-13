CREATE TABLE IF NOT EXISTS USERS (
    userId INT PRIMARY KEY auto_increment,
    username VARCHAR(20),
     salt VARCHAR,
     password VARCHAR,
     firstName VARCHAR(20),
     lastName VARCHAR(20)
    );

    CREATE TABLE IF NOT EXISTS MESSAGES (
     messageId INT PRIMARY KEY auto_increment,
     username VARCHAR NOT NULL,
     messageText VARCHAR NOT NULL
    );
