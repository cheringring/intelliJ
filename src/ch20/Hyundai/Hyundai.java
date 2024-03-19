package ch20.Hyundai;


import ch12.Person;

public class Hyundai {

    // inner class
    public enum Brand {
        AUDI,
         BMW,
    }


    // singleton
    // 싱글톤 왜쓰냐 ? = 아우디나 비엠더블유 할때마다 New 현대 하지말라고.
    private static Hyundai INSTANCE;
    private static Long seralNum;

    private Hyundai() {
        seralNum = 1000L;
    }

    //
    public static synchronized Hyundai getINSTANCE() {

        if (INSTANCE == null) INSTANCE = new Hyundai();
        return INSTANCE;
    }

    public Car createCar(Brand brand) {
       return switch (brand) {
            case BMW -> new Bmw(brand,seralNum++);
           case AUDI -> new Audi(brand,seralNum++);

       };
    }


    class Car {
        private String number;
        private Brand brand;
        private Long seralNumber;

        public Car(Brand brand, Long seralNumber) {
            this.brand = brand;
            this.seralNumber = seralNumber;

        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public Brand getBrand() {
            return brand;
        }

        public void setBrand(Brand brand) {
            this.brand = brand;
        }

        public Long getSeralNumber() {
            return seralNumber;
        }

        public void setSeralNumber(Long seralNumber) {
            this.seralNumber = seralNumber;
        }

        @Override
        public String toString() {
            return "자동차 \n" +
                    "자동차 번호: '" + number + '\n' +
                    "브랜드: " + brand + '\n' +
                    "시리얼 넘버: " + seralNumber +
                    '\n';
        }
    }


        class Bmw extends Car {

            private boolean isBoosterMode;


            public Bmw(Brand brand, Long seralNumber) {
                super(brand, seralNumber);
            }

            public boolean isBoosterMode() {
                return isBoosterMode;
            }

            public void setBoosterMode(boolean boosterMode) {
                isBoosterMode = boosterMode;
            }

            @Override
            public String toString() {
                return "Bmw{" +
                        super.toString()+
                        "isBoosterMode=" + isBoosterMode +
                        '}';
            }
        }


        class Audi extends Car {

            boolean isWindowMode;

            public Audi(Brand brand, Long seralNumber) {
                super(brand, seralNumber);
            }

            public boolean isWindowMode() {
                return isWindowMode;
            }

            public void setWindowMode(boolean windowMode) {
                isWindowMode = windowMode;
                if (windowMode = false) {
                    System.out.println("윈도우 모드가 off 되었습니다.");
                } else System.out.println("윈도우 모드가 on입니다.");
            }

            @Override
            public String toString() {
                return "Audi{" +
                        super.toString()+
                        "isWindowMode=" + isWindowMode +
                        '}';
            }
        }



    class Main {
        public void main(String[] args) {
            Car bmw= Hyundai.getINSTANCE().createCar(Brand.BMW);
            new Main().carSetFution(bmw);

            Car audi= Hyundai.getINSTANCE().createCar(Brand.AUDI);
            new Main().carSetFution(audi);


        }
        public void carSetFution(Car car ){
            if( car instanceof Bmw)((Bmw)car).setBoosterMode(true);
           else  if( car instanceof Audi)((Audi)car).setWindowMode(true);

           System.out.println(car);
        }
    }
    }
