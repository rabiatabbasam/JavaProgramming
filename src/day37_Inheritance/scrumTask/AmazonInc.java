package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company ="Amazon Inc" ;

        ProductOwner po = new ProductOwner("Suhaib",29,'M',1,160000,company);


        BusinessAnalyst ba = new BusinessAnalyst("Cihad",30,'M',2,150000,company);

        ScrumMaster sm = new ScrumMaster("Anel",26,'F',3,145000,company);

        Tester tester1 = new Tester("Rabia",32,'F',"QA",1415,125000,company);

        Tester tester2 = new Tester("Chinara",31,'F',"SDET",1416,130000,company);

        Tester tester3 = new Tester("Irena",26,'F',"QE",1417,128000,company);

        Tester tester4 = new Tester("Cihad",29,'M',"QA",1418,125000,company);

        Tester[] testers = {tester1,tester2,tester3,tester4};

       Developer developer1 = new Developer("Daniela",40,'F'," Senior Java Developer",8,135000,company);
        Developer developer2 = new Developer("Max",40,'M',"Junior Java Developer",9,12500000,company);
        Developer developer3 = new Developer("Tom",26,'M',"Java Developer",10,115000,company);
        Developer developer4 = new Developer("Manas",27,'M',"Java Developer",11,135000,company);
        Developer developer5 = new Developer("Evelyn",30,'F',"JS Developer",12,120000,company);
      Developer[] developers = {developer1,developer2,developer3,developer4,developer5};



      ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);
     scrumTeam.addDeveloper(developer1);
     scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("--------------------------------------");


        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name +" : "+tester.salary);
        }


        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name +" : "+developer.salary);
        }





    }






}
