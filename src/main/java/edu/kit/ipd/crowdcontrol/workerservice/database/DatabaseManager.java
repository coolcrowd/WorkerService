package edu.kit.ipd.crowdcontrol.workerservice.database;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * initializes and holds the connection to the database and eventually the database itself.
 * @author LeanderK
 * @version 1.0
 */
public class DatabaseManager {
    @SuppressWarnings("FieldCanBeLocal")
    private final Connection connection;
    private final DSLContext context;


    /**
     * creates new DatabaseManager
     * @param userName the username for the database
     * @param password the password for the database
     * @param url the url to the database
     * @param sqlDialect the dialect to use
     * @throws SQLException if there was a problem establishing a connection to the database
     */
    public DatabaseManager(String userName, String password, String url, SQLDialect sqlDialect) throws SQLException {
        connection = DriverManager.getConnection(url, userName, password);
        context = DSL.using(connection, sqlDialect);
        initDatabase();
    }

    /**
     * initializes the database if not already initialized.
     */
    private void initDatabase() {
        String sql = "-- MySQL Script generated by MySQL Workbench\n" +
                "-- Mon Jan 18 09:29:50 2016\n" +
                "-- Model: New Model    Version: 1.0\n" +
                "-- MySQL Workbench Forward Engineering\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Schema mydb\n" +
                "-- -----------------------------------------------------\n" +
                "-- -----------------------------------------------------\n" +
                "-- Schema crowdcontrol\n" +
                "-- -----------------------------------------------------\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Schema crowdcontrol\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE SCHEMA IF NOT EXISTS `crowdcontrol` DEFAULT CHARACTER SET utf8mb4 ;\n" +
                "USE `crowdcontrol` ;\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Template`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Template` (\n" +
                "  `id_template` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `template` LONGTEXT NOT NULL,\n" +
                "  `titel` VARCHAR(191) NULL,\n" +
                "  `answer_type` VARCHAR(191) NULL,\n" +
                "  PRIMARY KEY (`id_template`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Task_Chooser`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Task_Chooser` (\n" +
                "  `id_task_chooser` VARCHAR(191) NOT NULL,\n" +
                "  PRIMARY KEY (`id_task_chooser`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Experiment`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Experiment` (\n" +
                "  `id_experiment` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `rating_options` MEDIUMTEXT NULL DEFAULT NULL,\n" +
                "  `titel` VARCHAR(191) NULL DEFAULT NULL,\n" +
                "  `description` LONGTEXT NULL DEFAULT NULL,\n" +
                "  `ratings_per_answer` INT(11) NULL DEFAULT NULL,\n" +
                "  `algorithm_task_chooser` VARCHAR(191) NULL DEFAULT NULL,\n" +
                "  `algorithm_quality_answer` VARCHAR(191) NULL DEFAULT NULL,\n" +
                "  `algorithm_quality_rating` VARCHAR(191) NULL DEFAULT NULL,\n" +
                "  `base_payment` INT(11) NULL DEFAULT NULL,\n" +
                "  `bonus_answer` INT(11) NULL DEFAULT NULL,\n" +
                "  `bonus_rating` INT(11) NULL DEFAULT NULL,\n" +
                "  `template_data` MEDIUMTEXT NULL DEFAULT NULL,\n" +
                "  `template` INT NULL,\n" +
                "  `answer_type` VARCHAR(45) NULL,\n" +
                "  PRIMARY KEY (`id_experiment`),\n" +
                "  INDEX `usedTemplate_idx` (`template` ASC),\n" +
                "  INDEX `usedTaskChooser_idx` (`algorithm_task_chooser` ASC),\n" +
                "  CONSTRAINT `usedTemplate`\n" +
                "    FOREIGN KEY (`template`)\n" +
                "    REFERENCES `crowdcontrol`.`Template` (`id_template`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION,\n" +
                "  CONSTRAINT `usedTaskChooser`\n" +
                "    FOREIGN KEY (`algorithm_task_chooser`)\n" +
                "    REFERENCES `crowdcontrol`.`Task_Chooser` (`id_task_chooser`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Platform`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Platform` (\n" +
                "  `id_platform` VARCHAR(191) NOT NULL,\n" +
                "  `name` VARCHAR(191) NOT NULL,\n" +
                "  `render_calibrations` BIT(1) NOT NULL,\n" +
                "  `needs_email` BIT(1) NOT NULL,\n" +
                "  PRIMARY KEY (`id_platform`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Task`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Task` (\n" +
                "  `id_task` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `experiment` INT(11) NOT NULL,\n" +
                "  `running` BIT(1) NOT NULL,\n" +
                "  `platform_data` MEDIUMTEXT NULL DEFAULT NULL,\n" +
                "  `crowd_platform` VARCHAR(191) NOT NULL,\n" +
                "  `stopping` BIT(1) NOT NULL,\n" +
                "  PRIMARY KEY (`id_task`),\n" +
                "  INDEX `idexperiment_idx` (`experiment` ASC),\n" +
                "  INDEX `runningOnPlattform_idx` (`crowd_platform` ASC),\n" +
                "  CONSTRAINT `idexperimenthit`\n" +
                "    FOREIGN KEY (`experiment`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT,\n" +
                "  CONSTRAINT `runningOnPlattform`\n" +
                "    FOREIGN KEY (`crowd_platform`)\n" +
                "    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Worker`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Worker` (\n" +
                "  `id_worker` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `identification` VARCHAR(191) NULL DEFAULT NULL,\n" +
                "  `platform` VARCHAR(191) NOT NULL,\n" +
                "  `email` VARCHAR(191) NULL,\n" +
                "  PRIMARY KEY (`id_worker`),\n" +
                "  INDEX `workerOrigin_idx` (`platform` ASC),\n" +
                "  CONSTRAINT `workerOrigin`\n" +
                "    FOREIGN KEY (`platform`)\n" +
                "    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Answer`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Answer` (\n" +
                "  `id_answer` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `task` INT(11) NOT NULL,\n" +
                "  `answer` MEDIUMTEXT NOT NULL,\n" +
                "  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
                "  `worker_id` INT(11) NOT NULL,\n" +
                "  `quality` INT NULL,\n" +
                "  PRIMARY KEY (`id_answer`),\n" +
                "  INDEX `workerAnswered_idx` (`worker_id` ASC),\n" +
                "  INDEX `idHITanswers_idx` (`task` ASC),\n" +
                "  CONSTRAINT `idHITanswers`\n" +
                "    FOREIGN KEY (`task`)\n" +
                "    REFERENCES `crowdcontrol`.`Task` (`id_task`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `workerAnswered`\n" +
                "    FOREIGN KEY (`worker_id`)\n" +
                "    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Constraint`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Constraint` (\n" +
                "  `id_constraint` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `constraint` VARCHAR(45) NOT NULL,\n" +
                "  `experiment` INT(11) NOT NULL,\n" +
                "  PRIMARY KEY (`id_constraint`),\n" +
                "  INDEX `constrainedExperiment` (`experiment` ASC),\n" +
                "  CONSTRAINT `constrainedExperiment`\n" +
                "    FOREIGN KEY (`experiment`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Gift_Code`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Gift_Code` (\n" +
                "  `id_gift_code` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `code` MEDIUMTEXT NOT NULL,\n" +
                "  `amount` INT NOT NULL,\n" +
                "  PRIMARY KEY (`id_gift_code`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Payment`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Payment` (\n" +
                "  `id_payment` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `worker_id` INT(11) NOT NULL,\n" +
                "  `experiment_id` INT(11) NOT NULL,\n" +
                "  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
                "  `amount` INT NOT NULL,\n" +
                "  `giftcode` INT NULL,\n" +
                "  PRIMARY KEY (`id_payment`),\n" +
                "  INDEX `payedWorker_idx` (`worker_id` ASC),\n" +
                "  INDEX `payedExperiment_idx` (`experiment_id` ASC),\n" +
                "  INDEX `usedGiftCode_idx` (`giftcode` ASC),\n" +
                "  CONSTRAINT `payedExperiment`\n" +
                "    FOREIGN KEY (`experiment_id`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT,\n" +
                "  CONSTRAINT `payedWorker`\n" +
                "    FOREIGN KEY (`worker_id`)\n" +
                "    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `usedGiftCode`\n" +
                "    FOREIGN KEY (`giftcode`)\n" +
                "    REFERENCES `crowdcontrol`.`Gift_Code` (`id_gift_code`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Population`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population` (\n" +
                "  `id_population` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `property` VARCHAR(191) NOT NULL,\n" +
                "  `description` TEXT NULL,\n" +
                "  `name` VARCHAR(191) NOT NULL,\n" +
                "  `experiment` INT NULL,\n" +
                "  PRIMARY KEY (`id_population`),\n" +
                "  UNIQUE INDEX `experiment_UNIQUE` (`experiment` ASC),\n" +
                "  CONSTRAINT `participatedIn`\n" +
                "    FOREIGN KEY (`experiment`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Rating`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Rating` (\n" +
                "  `id_rating` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `task` INT(11) NOT NULL,\n" +
                "  `answer_r` INT(11) NOT NULL,\n" +
                "  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
                "  `rating` INT(11) NULL DEFAULT NULL,\n" +
                "  `worker_id` INT(11) NOT NULL,\n" +
                "  `quality` INT NULL,\n" +
                "  PRIMARY KEY (`id_rating`),\n" +
                "  INDEX `idAnswers_idx` (`answer_r` ASC),\n" +
                "  INDEX `workerRated_idx` (`worker_id` ASC),\n" +
                "  INDEX `idHITrating_idx` (`task` ASC),\n" +
                "  CONSTRAINT `idAnswersratins`\n" +
                "    FOREIGN KEY (`answer_r`)\n" +
                "    REFERENCES `crowdcontrol`.`Answer` (`id_answer`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `idHITrating`\n" +
                "    FOREIGN KEY (`task`)\n" +
                "    REFERENCES `crowdcontrol`.`Task` (`id_task`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `workerRated`\n" +
                "    FOREIGN KEY (`worker_id`)\n" +
                "    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Tag`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Tag` (\n" +
                "  `id_tag` INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `tag` VARCHAR(191) NOT NULL,\n" +
                "  `experiment` INT(11) NOT NULL,\n" +
                "  PRIMARY KEY (`id_tag`),\n" +
                "  INDEX `idexperiment_idx` (`experiment` ASC),\n" +
                "  CONSTRAINT `idexperimenttags`\n" +
                "    FOREIGN KEY (`experiment`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Population_answer_option`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population_answer_option` (\n" +
                "  `id_population_answer_option` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `population` INT NOT NULL,\n" +
                "  `answer` VARCHAR(191) NOT NULL,\n" +
                "  PRIMARY KEY (`id_population_answer_option`),\n" +
                "  INDEX `populationAnswer_idx` (`population` ASC),\n" +
                "  CONSTRAINT `populationAnswer`\n" +
                "    FOREIGN KEY (`population`)\n" +
                "    REFERENCES `crowdcontrol`.`Population` (`id_population`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`ExperimentsPopulation`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`ExperimentsPopulation` (\n" +
                "  `id_experiments_population` VARCHAR(191) NOT NULL,\n" +
                "  `population_user` INT NOT NULL,\n" +
                "  `answer` INT NOT NULL,\n" +
                "  `referenced_platform` VARCHAR(191) NOT NULL,\n" +
                "  `not` BIT(1) NOT NULL,\n" +
                "  PRIMARY KEY (`id_experiments_population`),\n" +
                "  INDEX `populationUser_idx` (`population_user` ASC),\n" +
                "  INDEX `referencedPlatform_idx` (`referenced_platform` ASC),\n" +
                "  INDEX `referencedAnswer_idx` (`answer` ASC),\n" +
                "  CONSTRAINT `populationUser`\n" +
                "    FOREIGN KEY (`population_user`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `referencedPlatform`\n" +
                "    FOREIGN KEY (`referenced_platform`)\n" +
                "    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `referencedAnswer`\n" +
                "    FOREIGN KEY (`answer`)\n" +
                "    REFERENCES `crowdcontrol`.`Population_answer_option` (`id_population_answer_option`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Population_Result`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population_Result` (\n" +
                "  `id_population_result` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `worker` INT NOT NULL,\n" +
                "  `answer` INT NOT NULL,\n" +
                "  PRIMARY KEY (`id_population_result`),\n" +
                "  INDEX `referencedAnswer_idx` (`answer` ASC),\n" +
                "  INDEX `referencedWorker_idx` (`worker` ASC),\n" +
                "  CONSTRAINT `chosenAnswer`\n" +
                "    FOREIGN KEY (`answer`)\n" +
                "    REFERENCES `crowdcontrol`.`Population_answer_option` (`id_population_answer_option`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `referencedWorker`\n" +
                "    FOREIGN KEY (`worker`)\n" +
                "    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Notification`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Notification` (\n" +
                "  `id_notification` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `name` VARCHAR(45) NOT NULL,\n" +
                "  `description` TEXT NOT NULL,\n" +
                "  `checkPeriod` INT NOT NULL,\n" +
                "  `sendThreshold` INT NOT NULL,\n" +
                "  `query` MEDIUMTEXT NOT NULL,\n" +
                "  `lastSent` TIMESTAMP NULL,\n" +
                "  PRIMARY KEY (`id_notification`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "USE `crowdcontrol`;\n" +
                "\n" +
                "DELIMITER $$\n" +
                "USE `crowdcontrol`$$\n" +
                "CREATE DEFINER = CURRENT_USER TRIGGER `crowdcontrol`.`Platform_BEFORE_INSERT` BEFORE INSERT ON `Platform` FOR EACH ROW\n" +
                "BEGIN\n" +
                "\tIF REGEXP_LIKE (NEW.id_platform, '[a-z0-9._-]+') THEN\n" +
                "\t\tSET NEW.id_platform = LOWER(NEW.id_platform);\n" +
                "\tELSE\n" +
                "\t\tSET NEW.id_platform = NULL;\n" +
                "\tEND IF;\n" +
                "END$$\n" +
                "\n" +
                "\n" +
                "DELIMITER ;\n";
        context.fetch(sql);
    }

    /**
     * returns the Context used to communicate with the database
     * @return an instance of DSLContext
     */
    public DSLContext getContext() {
        return context;
    }
}

