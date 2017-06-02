-- MySQL Workbench Forward Engineering

/* SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0; */
/* SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0; */
/* SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES'; */

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Table `mydb`.`leage`
-- -----------------------------------------------------
CREATE SEQUENCE leage_seq;

CREATE TABLE IF NOT EXISTS leage (
  leage_id INT CHECK (leage_id > 0) NOT NULL DEFAULT NEXTVAL ('leage_seq'),
  leage_name VARCHAR(45) NULL,
  logo VARCHAR(45) NULL,
  prize INT NULL,
  PRIMARY KEY (leage_id))
;


-- -----------------------------------------------------
-- Table `mydb`.`team`
-- -----------------------------------------------------
CREATE SEQUENCE team_seq;

CREATE TABLE IF NOT EXISTS team (
  team_name VARCHAR(45) NOT NULL,
  numberOfWin INT NULL,
  numberOfLost INT NULL,
  numberOfDraw INT NULL,
  score INT NULL,
  logo VARCHAR(45) NULL,
  team_id INT NOT NULL DEFAULT NEXTVAL ('team_seq'),
  leage_leage_id INT CHECK (leage_leage_id > 0) NOT NULL,
  PRIMARY KEY (team_id)
 ,
  CONSTRAINT fk_team_leage1
    FOREIGN KEY (leage_leage_id)
    REFERENCES leage (leage_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

CREATE INDEX fk_team_leage1_idx ON team (leage_leage_id ASC);



-- -----------------------------------------------------
-- Table `mydb`.`players`
-- -----------------------------------------------------
CREATE SEQUENCE players_seq;

CREATE TABLE IF NOT EXISTS players (
  player_id INT CHECK (player_id > 0) NOT NULL DEFAULT NEXTVAL ('players_seq'),
  team_name VARCHAR(45) NULL,
  name VARCHAR(45) NULL,
  position VARCHAR(45) NULL,
  goal INT NULL,
  photo VARCHAR(45) NULL,
  age INT NULL,
  team_id INT NOT NULL,
  PRIMARY KEY (player_id)
 ,
  CONSTRAINT fk_players_team
    FOREIGN KEY (team_id)
    REFERENCES team (team_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

CREATE INDEX fk_players_team_idx ON players (team_id ASC);


-- -----------------------------------------------------
-- Table `mydb`.`fixture`
-- -----------------------------------------------------
CREATE SEQUENCE fixture_seq;

CREATE TABLE IF NOT EXISTS fixture (
  fixture_id INT CHECK (fixture_id > 0) NOT NULL DEFAULT NEXTVAL ('fixture_seq'),
  team1_score INT NULL,
  team2_score INT NULL,
  fixture_date DATE NULL,
  team1_id INT NOT NULL,
  team2_id INT NOT NULL,
  PRIMARY KEY (fixture_id)
 ,
  CONSTRAINT fk_fixture_team1
    FOREIGN KEY (team1_id)
    REFERENCES team (team_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_fixture_team2
    FOREIGN KEY (team2_id)
    REFERENCES team (team_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

CREATE INDEX fk_fixture_team1_idx ON fixture (team1_id ASC);
CREATE INDEX fk_fixture_team2_idx ON fixture (team2_id ASC);


-- -----------------------------------------------------
-- Table `mydb`.`goal_scored`
-- -----------------------------------------------------
CREATE SEQUENCE goal_scored_seq;

CREATE TABLE IF NOT EXISTS goal_scored (
  goal_id INT CHECK (goal_id > 0) NOT NULL DEFAULT NEXTVAL ('goal_scored_seq'),
  goal_time INT NULL,
  player_id INT CHECK (player_id > 0) NOT NULL,
  fixture_id INT NOT NULL,
  PRIMARY KEY (goal_id)
 ,
  CONSTRAINT fk_goal_scored_players1
    FOREIGN KEY (player_id)
    REFERENCES players (player_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_goal_scored_fixture1
    FOREIGN KEY (fixture_id)
    REFERENCES fixture (fixture_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

CREATE INDEX fk_goal_scored_players1_idx ON goal_scored (player_id ASC);
CREATE INDEX fk_goal_scored_fixture1_idx ON goal_scored (fixture_id ASC);


-- -----------------------------------------------------
-- Table `mydb`.`player_match`
-- -----------------------------------------------------
CREATE SEQUENCE player_match_seq;

CREATE TABLE IF NOT EXISTS player_match (
  goal_conceeded INT CHECK (goal_conceeded > 0) NULL DEFAULT NEXTVAL ('player_match_seq'),
  min_played INT NULL,
  yellow_card INT NULL,
  red_card INT NULL,
  fixture_id INT NOT NULL,
  player_id INT CHECK (player_id > 0) NOT NULL
 ,
  CONSTRAINT fk_player_match_fixture1
    FOREIGN KEY (fixture_id)
    REFERENCES fixture (fixture_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_player_match_players1
    FOREIGN KEY (player_id)
    REFERENCES players (player_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

CREATE INDEX fk_player_match_fixture1_idx ON player_match (fixture_id ASC);
CREATE INDEX fk_player_match_players1_idx ON player_match (player_id ASC);


/* SET SQL_MODE=@OLD_SQL_MODE; */
/* SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS; */
/* SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS; */