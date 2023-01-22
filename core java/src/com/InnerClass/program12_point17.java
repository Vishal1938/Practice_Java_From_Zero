package com.InnerClass;
interface ANIMAL{
    void eating();
    int sleeping();
        }
class Hell{
    ANIMAL ani =new ANIMAL() {
        @Override
        public void eating() {
            System.out.println("Animal in hello eating");
        }

        @Override
        public int sleeping() {
            System.out.println("Animal in hello is sleeeping");
            return 0;
        }
        void walking() {
            System.out.println("walking in hello");
        }
    };
    ANIMAL ani2=new ANIMAL() {
        @Override
        public void eating() {
            System.out.println("Animal2 is eating");
        }
        @Override
        public int sleeping() {
            System.out.println("animal2 is sleeping");
            return 0;
        }
        {
            System.out.println("iB in animal2");
        }
        ANIMAL ani3 =new ANIMAL() {
            @Override
            public void eating() {
                System.out.println("Animal3 is eating ");
            }

            @Override
            public int sleeping() {
                System.out.println("Animal3 is sleeping");
                return 0;
            }
            {
                System.out.println("ib in animal3");
            }
        };
    };
   void show1(){
       System.out.println("show1 in hello");
       ANIMAL ani4 = new ANIMAL() {
           @Override
           public void eating() {
               System.out.println("Animal4 is eating");
           }

           @Override
           public int sleeping() {
               System.out.println("Animal is sleeping");
               return 0;
           }
       };
       ani4.eating();
       ani4.sleeping();
   }
   ANIMAL show2(){
       System.out.println("show2 in hello");
       return new ANIMAL() {
           @Override
           public void eating() {

           }

           @Override
           public int sleeping() {
               return 0;
           }
       };
   };
   void showall(){
       System.out.println("showaall in hello");
       ani.eating();
       ani.sleeping();
   }
}
abstract class ALL{
    abstract void thinking();
    abstract ANIMAL doingAll();
}
class HAI{
    ALL all=new ALL() {
        @Override
        void thinking() {
            System.out.println("Allthinking in hai");
        }
        @Override
        ANIMAL doingAll() {
            System.out.println("All doingall in hai");
            return new ANIMAL() {
                @Override
                public void eating() {
                    System.out.println("all doing all eating in hai");
                }
                @Override
                public int sleeping() {
                    System.out.println("all doingall eating in hai");
                    return 0;
                }
            };
        }
    };
}

public class program12_point17 {
    public static void main(String[] args) {
        Hell h1= new Hell();
        h1.showall();
        System.out.println("*******MAIN********");
        h1.ani.sleeping();
        h1.ani.eating();
        h1.ani2.eating();
        h1.ani2.sleeping();
        h1.show1();
        ANIMAL ani1=h1.show2();
        ani1.eating();
        ani1.sleeping();
        HAI hai=new HAI();
        hai.all.thinking();
        ANIMAL ani3=hai.all.doingAll();
        ani3.eating();
        ani3.sleeping();
    }
}
