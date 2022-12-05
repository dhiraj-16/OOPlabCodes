



abstract class car {

    private cartype model;

    public car(cartype model){

        this.model=model;

    }

    abstract void construct();

}



 enum cartype{

    hatchback,sedan,suv;

}






 class hatchback extends car  {

    hatchback(){

        super(cartype.hatchback);

        construct();





    }

    void construct(){

        System.out.println("construction process of hatchback");

    }

}





 class sedan extends car{

    sedan(){

        super(cartype.sedan);

        construct();





    }

    void construct()

    {

        System.out.println("construction process of sedan");

    }

}





class suv extends car {

    suv(){

        super(cartype.suv);

        construct();





    }

    void construct(){

        System.out.println("construction process of suv");

    }

}



class carfactory {

    public static car buildcar(cartype model){

        car Car=null;

        switch(model){

            case hatchback:

                Car=new hatchback();

                break;

            case sedan:

                Car=new sedan();

                break;

            case suv:

                Car=new suv();

                break;

        }

        return Car;

    }

}




public class factory_assign10 {

    public static void main(String args[]){

        System.out.println(carfactory.buildcar(cartype.hatchback));

        System.out.println(carfactory.buildcar(cartype.sedan));

        System.out.println(carfactory.buildcar(cartype.suv));



    }

}


