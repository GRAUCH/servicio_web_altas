import java.text.SimpleDateFormat
import serviciowebaltasnn.Pais
import serviciowebaltasnn.Companya
import serviciowebaltasnn.Configuracion
import serviciowebaltasnn.Slot

class BootStrap {

    def init = { servletContext ->
        //Países por defecto
        Pais españa = Pais.findByNombre('ESPAÑA') ?: new Pais('ESPAÑA', 'Europe/Madrid').save(flush: true)
        Pais italia = Pais.findByNombre('ITALIA') ?: new Pais('ITALIA', 'Europe/Madrid').save(flush: true)
        Pais portugal = Pais.findByNombre('PORTUGAL') ?: new Pais('PORTUGAL', 'Europe/Lisbon').save(flush: true)
        Pais francia = Pais.findByNombre('FRANCIA') ?: new Pais('FRANCIA', 'Europe/Madrid').save(flush: true)

        //Compañías Administracion
        Companya scor_es = Companya.findByNameAndPais('SCOR_ES',españa) ?: new Companya(españa,'SCOR_ES','0').save(flush: true)
        Companya scor_it = Companya.findByNameAndPais('SCOR_IT',italia) ?: new Companya(italia,'SCOR_IT','00').save(flush: true)
        Companya scor_pt = Companya.findByNameAndPais('SCOR_PT',portugal) ?: new Companya(portugal,'SCOR_PT','000').save(flush: true)
        Companya scor_fr = Companya.findByNameAndPais('SCOR_FR',francia) ?: new Companya(francia,'SCOR_FR','0000').save(flush: true)

        //Compañías España
        Companya ama = Companya.findByNameAndPais('A.M.A.',españa) ?: new Companya(españa,'A.M.A.','1059').save(flush: true)
        Companya amaSiniestros = Companya.findByNameAndPais('A.M.A. Siniestros',españa) ?: new Companya(españa,'A.M.A. Siniestros','1060').save(flush: true)
        Companya banSabadellVida = Companya.findByNameAndPais('BanSabadell Vida',españa) ?: new Companya(españa,'BanSabadell Vida','1022').save(flush: true)
        Companya cajamarVida = Companya.findByNameAndPais('Cajamar Vida',españa) ?: new Companya(españa,'Cajamar Vida','1018').save(flush: true)
        Companya cajamarVidaSiniestros = Companya.findByNameAndPais('Cajamar Vida Siniestros',españa) ?: new Companya(españa,'Cajamar Vida Siniestros','1076').save(flush: true)
        Companya caser = Companya.findByNameAndPais('Caser',españa) ?: new Companya(españa,'Caser','1061').save(flush: true)
        Companya lagunAro = Companya.findByNameAndPais('Lagun Aro',españa) ?: new Companya(españa,'Lagun Aro','1004').save(flush: true)
        Companya metLife = Companya.findByNameAndPais('MetLife',españa) ?: new Companya(españa,'MetLife','1002').save(flush: true)
        Companya mutuaEnginyers = Companya.findByNameAndPais('Mutua Enginyers',españa) ?: new Companya(españa,'Mutua Enginyers','1071').save(flush: true)
        Companya nnVida = Companya.findByNameAndPais('NN Vida',españa) ?: new Companya(españa,'NN Vida','1028').save(flush: true)
        Companya patriaHispana = Companya.findByNameAndPais('Patria Hispana',españa) ?: new Companya(españa,'Patria Hispana','1033').save(flush: true)
        Companya predica = Companya.findByNameAndPais('Predica',españa) ?: new Companya(españa,'Predica','1007').save(flush: true)
        Companya psn = Companya.findByNameAndPais('PSN',españa) ?: new Companya(españa,'PSN','1030').save(flush: true)
        Companya saNostra = Companya.findByNameAndPais('Sa Nostra',españa) ?: new Companya(españa,'Sa Nostra','1023').save(flush: true)
        Companya santaLucia = Companya.findByNameAndPais('Santa Lucia',españa) ?: new Companya(españa,'Santa Lucia','1027').save(flush: true)
        Companya vidacaixa = Companya.findByNameAndPais('Vidacaixa',españa) ?: new Companya(españa,'Vidacaixa','1041').save(flush: true)
        Companya zurichSantander = Companya.findByNameAndPais('Zurich Santander',españa) ?: new Companya(españa,'Zurich Santander','1078').save(flush: true)
        Companya zurichVida = Companya.findByNameAndPais('Zurich Vida',españa) ?: new Companya(españa,'Zurich Vida','1021').save(flush: true)

        //Compañías Italia
        Companya netInsurance = Companya.findByNameAndPais('NET Insurance',italia) ?: new Companya(italia,'NET Insurance','1062').save(flush: true)
        Companya hmiMethisLab = Companya.findByNameAndPais('HMI-Methis Lab',italia) ?: new Companya(italia,'HMI-Methis Lab','1069').save(flush: true)
        Companya hmiCbp = Companya.findByNameAndPais('HMI-CBP',italia) ?: new Companya(italia,'HMI-CBP','1072').save(flush: true)
        Companya cfLifeMethisLab = Companya.findByNameAndPais('CF Life-Methis Lab',italia) ?: new Companya(italia,'CF Life-Methis Lab','1075').save(flush: true)

        //Compañías Portugal
        Companya metLifePt = Companya.findByNameAndPais('Metlife',portugal) ?: new Companya(portugal,'Metlife','1029').save(flush: true)

        //Compañías Francia
        Companya afiEsca = Companya.findByNameAndPais('AFI ESCA',francia) ?: new Companya(francia,'AFI ESCA','1035').save(flush: true)
        Companya lifesquare = Companya.findByNameAndPais('Lifesquare',francia) ?: new Companya(francia,'Lifesquare','1043').save(flush: true)
        Companya prevoir = Companya.findByNameAndPais('Prévoir',francia) ?: new Companya(francia,'Prévoir','1066').save(flush: true)

        //Configuraciones por pais
        Configuracion config_ES = Configuracion.findByNombreAndPais('Estandar',españa) ?: new Configuracion(españa, 'Estandar').save(flush:true)
        Configuracion config_IT = Configuracion.findByNombreAndPais('Estandar',italia) ?: new Configuracion(italia, 'Estandar').save(flush:true)
        Configuracion config_PT = Configuracion.findByNombreAndPais('Estandar',portugal) ?: new Configuracion(portugal, 'Estandar').save(flush:true)
        Configuracion config_FR = Configuracion.findByNombreAndPais('Estandar',francia) ?: new Configuracion(francia, 'Estandar').save(flush:true)

        //Slot por configuracion
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm")
        Slot slot_ES = Slot.findByConfig(config_ES) ?: new Slot(config_ES, formatter.parse("01/06/2020 08:00"), formatter.parse("01/06/2020 21:00"), '2', '15').save(flush:true)
        Slot slot_IT = Slot.findByConfig(config_IT) ?: new Slot(config_IT, formatter.parse("01/06/2020 08:00"), formatter.parse("01/06/2020 21:00"), '2', '15').save(flush:true)
        Slot slot_PT = Slot.findByConfig(config_PT) ?: new Slot(config_PT, formatter.parse("01/06/2020 08:00"), formatter.parse("01/06/2020 21:00"), '2', '15').save(flush:true)
        Slot slot_FR = Slot.findByConfig(config_FR) ?: new Slot(config_FR, formatter.parse("01/06/2020 08:00"), formatter.parse("01/06/2020 21:00"), '2', '15').save(flush:true)


    }
    def destroy = {
    }
}
