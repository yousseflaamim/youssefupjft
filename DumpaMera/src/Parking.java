
//abstract class
public abstract class  Parking {
        private String namePaking;
        private int SizeParking;

        public Parking() {

        }

        public abstract void NamePaking() ;



        public void setNamePaking(String namePaking) {
                this.namePaking = namePaking;
        }

        public int getSizeParking() {
                return SizeParking;
        }

        public void setSizeParking(int sizeParking) {
                SizeParking = sizeParking;
        }

        @Override
        public String toString() {
                return "Parking{" +
                        "namePaking='" + namePaking + '\'' +
                        ", SizeParking=" + SizeParking +
                        '}';
        }
}








