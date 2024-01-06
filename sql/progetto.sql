-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: base_di_dati
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `assegnazioneaccessorio`
--

LOCK TABLES `assegnazioneaccessorio` WRITE;
/*!40000 ALTER TABLE `assegnazioneaccessorio` DISABLE KEYS */;
INSERT INTO `assegnazioneaccessorio` VALUES (2,'B'),(5,'E'),(6,'F'),(9,'I'),(10,'L');
/*!40000 ALTER TABLE `assegnazioneaccessorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `assegnazionebase`
--

LOCK TABLES `assegnazionebase` WRITE;
/*!40000 ALTER TABLE `assegnazionebase` DISABLE KEYS */;
INSERT INTO `assegnazionebase` VALUES (1,'A'),(3,'C'),(4,'D'),(7,'G'),(8,'H');
/*!40000 ALTER TABLE `assegnazionebase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `associazione`
--

LOCK TABLES `associazione` WRITE;
/*!40000 ALTER TABLE `associazione` DISABLE KEYS */;
INSERT INTO `associazione` VALUES ('A','B'),('C','F'),('H','L');
/*!40000 ALTER TABLE `associazione` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `categoriaaccessorio`
--

LOCK TABLES `categoriaaccessorio` WRITE;
/*!40000 ALTER TABLE `categoriaaccessorio` DISABLE KEYS */;
INSERT INTO `categoriaaccessorio` VALUES ('B','Accessorio B su A'),('E','Corpo'),('F','Accesorio di F su C'),('I','Viso e Corpo'),('L','Accessorio di L su H');
/*!40000 ALTER TABLE `categoriaaccessorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `categoriabase`
--

LOCK TABLES `categoriabase` WRITE;
/*!40000 ALTER TABLE `categoriabase` DISABLE KEYS */;
INSERT INTO `categoriabase` VALUES ('A','Corpo',20,50,10,0),('C','Pelo',10,20,12,3),('D','Fascia Addominale',30,10,5,0),('G','Viso',5,3.5,1.5,0),('H','Sterilizzazione',4,13,5,4);
/*!40000 ALTER TABLE `categoriabase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('AAA','ema','pisi',626,'tt',2,'22233',2),('BCCVCN40L12E241A','Vincenzo Arturo','Becce',18279,'Via Tiburtina',99,'3747192837',0),('CNCSMR68C69H843M','AsiaMaria','Cianciotto',78193,'Via Tiberina',12,'3091827482',1),('FGAMTL98B47H760I','Marta Elisa','Faga',8172,'Via Cassia',71,'3617219021',2),('GNTMMD57H54B695I','Maria Madalina','Giuntini',92812,'Via Appia',32,'3261728191',1),('GRBFRC86D16L330N','Federico','Gariboldi',8192,'Via delle Sirene',8,'3322819829',3),('LSKSVN39L42H842Z','Silvana','Liskovski',9182,'Via Aurelia',19,'3561281820',3),('NDLRBN70H17H096L','Urbano','Nedelcu',91843,'Via Salaria',5,'3351929278',1),('PSTMNL00L8Y732U','emanuele','pisaturo',84098,'vittoria',46,'3343215631',0),('RSSMRA80E01H703N','Mario','Rossi',92121,'Via Roma',2,'3452939023',0);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `corriere`
--

LOCK TABLES `corriere` WRITE;
/*!40000 ALTER TABLE `corriere` DISABLE KEYS */;
INSERT INTO `corriere` VALUES ('24BDJ92','2021-02-21','ciao'),('aaaa','2021-02-12','bella'),('BD141WG','2021-01-10','PincoPallino'),('GQ821JA','2021-03-23','SuperRisparmio'),('KA509LE','2021-10-21','Cosmetic');
/*!40000 ALTER TABLE `corriere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `esecuzioneingegnere`
--

LOCK TABLES `esecuzioneingegnere` WRITE;
/*!40000 ALTER TABLE `esecuzioneingegnere` DISABLE KEYS */;
INSERT INTO `esecuzioneingegnere` VALUES ('DNLNRC80C14H703I',5,6),('BTANCL88R17F912E',6,8),('BGNVCN80H26G230D',1,10),('DNLNRC80C14H703I',3,10),('RDTLLG17C58G799F',8,10);
/*!40000 ALTER TABLE `esecuzioneingegnere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `esecuzioneoperaio`
--

LOCK TABLES `esecuzioneoperaio` WRITE;
/*!40000 ALTER TABLE `esecuzioneoperaio` DISABLE KEYS */;
INSERT INTO `esecuzioneoperaio` VALUES ('CCLPRZ71L59I759C',2,4),('CRSRCC01L70F756K',2,4),('PRLGLL89H14C438D',10,4),('CRSRCC01L70F756K',4,8);
/*!40000 ALTER TABLE `esecuzioneoperaio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ingegnere`
--

LOCK TABLES `ingegnere` WRITE;
/*!40000 ALTER TABLE `ingegnere` DISABLE KEYS */;
INSERT INTO `ingegnere` VALUES ('BGNMRT48M25I300B','Umberto','Abagnale','3717283828','Chimica','Servizi Estetici','Part Time'),('BGNVCN80H26G230D','Vincenzo','Abagnara','3378281723','Civile','Servizi Civili','Full Time'),('BTANCL88R17F912E','Nicola','Abate','3365728192','Edile Archietettura','Servizi Edili','Full Time'),('CNFRRT84C12G813M','Roberto','Acanfora','3535719212','ELettronica','Servizi Elettrici','Part Time'),('DNLNRC80C14H703I','Enrico','Adinolfi','3512918392','Meccanica','Servizi Commerciali','Part Time'),('DSSNTN67T21H703Q','Antonio','Adesso','3546182915','Informatica','Servizi Informatici','Part Time'),('LFNLRD48R04C259O','Alfredo','Alfano','3341624388','Civile','Servizi Civili','Full Time'),('MSLMRK83C01H703Y','Mirko','Masullo','3221345656','Chimica','Servizi Estetici','Part Time'),('MTAGNN68M22H800W','Giovanni','Amato','3384828179','Informatica','Servizi Informatici','Full Time'),('RDTLLG17C58G799F','Lucia Luigia','Ardito','3182918212','Meccanica','Servizi Commerciali','Full Time'),('STRMNL00M21I483F','emanuele','setaro','3461829420','albo ingegnere','intelligenza artificiale','Full time');
/*!40000 ALTER TABLE `ingegnere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `intervento`
--

LOCK TABLES `intervento` WRITE;
/*!40000 ALTER TABLE `intervento` DISABLE KEYS */;
INSERT INTO `intervento` VALUES (1,10,NULL,2,'2021-01-10','2021-01-11','manutenzione','in lavorazione'),(2,4,NULL,5,'2021-02-11','2021-02-12','manuntenzione','completato'),(3,10,'DNLNRC80C14H703I',10,'2021-02-28','2021-03-01','sostituzione','verificato'),(4,8,NULL,31,'2021-05-23','2021-05-27','manutenzione','completato'),(5,6,'DNLNRC80C14H703I',23,'2021-06-04','2021-06-12','sostituzione','completato'),(6,8,'BTANCL88R17F912E',10,'2021-04-10','2021-04-13','sostituzione','in lavorazione'),(8,10,'RDTLLG17C58G799F',30,'2021-12-01','2021-12-07','sostituzione','richiesto'),(10,4,NULL,69,'2021-11-03','2021-11-27','manutenzione','completato');
/*!40000 ALTER TABLE `intervento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `macchinario`
--

LOCK TABLES `macchinario` WRITE;
/*!40000 ALTER TABLE `macchinario` DISABLE KEYS */;
INSERT INTO `macchinario` VALUES (1,'FGAMTL98B47H760I','BD141WG','Massaggiatore',1,123.5),(2,'CNCSMR68C69H843M','BD141WG','Trattamento estetico',10,130.5),(3,'FGAMTL98B47H760I',NULL,'Laser Diodo',2,400.5),(4,'LSKSVN39L42H842Z',NULL,'Pressoterapia',5,255.2),(5,'GRBFRC86D16L330N',NULL,'Termo Sauna ',3,100.1),(6,'GNTMMD57H54B695I','aaaa','Tecnologia Ipobarica',4,300.5),(7,'LSKSVN39L42H842Z',NULL,'Maschera LED',19,199.99),(8,'LSKSVN39L42H842Z',NULL,'Autoclave Classe N',10,281.99),(9,'NDLRBN70H17H096L','aaaa','Palmatech',15,190),(10,'GRBFRC86D16L330N',NULL,'Vapo e Vacum Terapia estetica',21,240.2),(11,'GRBFRC86D16L330N',NULL,'Vapo e Vacum Terapia estetica',23,240.2),(12,'AAA',NULL,'Massaggiatore',23,34);
/*!40000 ALTER TABLE `macchinario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `operaio`
--

LOCK TABLES `operaio` WRITE;
/*!40000 ALTER TABLE `operaio` DISABLE KEYS */;
INSERT INTO `operaio` VALUES ('CCLPRZ71L59I759C','Patrizia Gianna','Ecclesia','3337271828',8,'Full Time'),('CRSRCC01L70F756K','Rebecca Luna','Carosio','3362929817',5,'Part Time'),('CSTZSP40L27D520K','Ezio Giuseppe','Castania','3342161829',6,'Part Time'),('GSTMNG94L53M260U','Maria Angela Giuseppina','Gasti','3636472819',4,'Part Time'),('NNAVRD00B68F839K','Anna','Verdi','3610918822',8,'Full Time'),('PRLGLL89H14C438D','Guglielmo Giuseppe','Pirolo','3354638291',6,'Part Time'),('PSQKNM07C03B528U','Kevin Mario','Pasquetti','3325263828',10,'Full Time'),('PSSPLM58C56L212C','Palma ','Passarino','3364673810',4,'Part Time'),('RFFPMR49T15F378E','Piero Mario Eugenio','Raffo','3342617281',5,'Part Time'),('RZZLSN54C14D689P','Alessandro Domenico ','Rizzatti','3345172891',10,'Full Time');
/*!40000 ALTER TABLE `operaio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `partecipazioneingegnere`
--

LOCK TABLES `partecipazioneingegnere` WRITE;
/*!40000 ALTER TABLE `partecipazioneingegnere` DISABLE KEYS */;
INSERT INTO `partecipazioneingegnere` VALUES (1,'BGNMRT48M25I300B'),(4,'BGNVCN80H26G230D'),(5,'BTANCL88R17F912E'),(8,'DNLNRC80C14H703I');
/*!40000 ALTER TABLE `partecipazioneingegnere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `partecipazioneoperaio`
--

LOCK TABLES `partecipazioneoperaio` WRITE;
/*!40000 ALTER TABLE `partecipazioneoperaio` DISABLE KEYS */;
INSERT INTO `partecipazioneoperaio` VALUES (2,'CCLPRZ71L59I759C'),(3,'CRSRCC01L70F756K'),(1,'NNAVRD00B68F839K');
/*!40000 ALTER TABLE `partecipazioneoperaio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `progetto`
--

LOCK TABLES `progetto` WRITE;
/*!40000 ALTER TABLE `progetto` DISABLE KEYS */;
INSERT INTO `progetto` VALUES (1,'commercializzato',1),(2,'prototipale',2),(3,'collaudato',3),(4,'prototipale',4),(5,'pilota',5),(6,'commercializzato',6),(7,'collaudato',7),(8,'pilota',8),(9,'prototipale',9),(10,'pilota',10);
/*!40000 ALTER TABLE `progetto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-28 15:45:44
