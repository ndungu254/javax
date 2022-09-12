//////////decision class////
public class Car{
        private String carType, carModel;
        /**
         * 
         */
        public Car() {
            carType = "";
            carModel = "";

        }
        public void setdecision(String cT, String cM, double cP){
            carType = cT;
            carModel = cM;


        }
        public String getCarType(){
            return carType;
        }
        public String getCarModel(){
            return carModel;
        }
        public  String  getCar(){
            return getCarType() + "-" + getCarModel(); 
        
        }

     
        public double getRentalPrice(Transaction transaction) {

        	getCar();

        	return transaction.getDays() * Integer.parseInt(getCar());
        }
        public void setCar(String carType2, String carModel2, double carPrice) {
        }
}
