package com.company;


// EU m-am ganidt sa creez un laptop. Pentru a construi un laptop, avem nevoie de cateva caracteristici de baza.
// Dar daca avem nevoie de mai multe detalii sau de configurari diferite pt mai multe tipuri de laptopuri, treaba devinde un pic complicata,
// iar ca prima solutie ne putem gandi la subclase unde putem folosi toate combinatiile de parametri- insa nu este cea mai buna solutie.
// CA alternativa, ne putem folosi de Builder pattern, care ne permite sa construim obiecte pas cu pas, dar ce e mai interesant si extrem
// de util, este faptul ca nu suntem obligati sa apelam toti parametrii, ci doar necesari configurarii de care avem nevoie.


   public interface Builder {

    void setLaptopBrand(LaptopBrand brand);

    void setOperatingSystem(OperatingSystem system);

    void setProcesor(Procesor procesor);

    void setMotherboard(Motherboard motherboard);

    void setMemory(int memory);
   }

package com;

import com.company.Builder;
import com.company.LaptopBrand;
import com.company.Motherboard;
import com.company.OperatingSystem;
import com.company.Procesor;

public class LaptopBuilder implements Builder {

    private LaptopBrand brand;
    private OperatingSystem system;
    private Procesor procesor;
    private Motherboard motherboard;



    public void setLaptopBrand(LaptopBrand brand) {
        this.brand = brand;
    }

    @Override
    public void setOperatingSystem(OperatingSystem system) {
        this.system = system;
    }

    @Override
    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    @Override
    public void setMemory(int memory) {

    }


    @Override
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Laptop getResult() {

        return new Laptop (brand, system, procesor, motherboard);
    }

}

package com;


import com.company.Builder;
import com.company.LaptopBrand;
import com.company.Motherboard;
import com.company.OperatingSystem;
import com.company.Procesor;

public class TechInfo<Memory> implements Builder {
        private LaptopBrand brand;
        private OperatingSystem system;
        private Procesor procesor;
       // private Memory memory;
        private Motherboard motherboard;

        @Override
        public void setLaptopBrand(LaptopBrand brand) {
            this.brand = brand;
        }

        @Override
        public void setOperatingSystem(OperatingSystem system) {
            this.system = system;
        }

        @Override
        public void setProcesor (Procesor procesor) {
            this.procesor = procesor;
        }

    @Override
    public void setMemory(int memory) {

    }


        @Override
        public void setMotherboard (Motherboard motherboard) {
            this.motherboard = motherboard;
        }


        public Laptop getResult() {
            Laptop laptop = new Laptop(brand, system, procesor, motherboard);
            return laptop;
        }
    }

package com;


import com.company.LaptopBrand;
import com.company.Motherboard;
import com.company.OperatingSystem;
import com.company.Procesor;

     public class Laptop {
        private LaptopBrand brand;
        private OperatingSystem system;
        private Procesor procesor;
        private Motherboard motherboard;
        private int memory;


    public Laptop ( LaptopBrand brand, OperatingSystem system, Procesor procesor, int memory, Motherboard motherboard){
            this.brand = brand;
            this.system = system;
            this.procesor = procesor;
            this.memory = memory;
            this.motherboard = motherboard;
        }

         public Laptop(LaptopBrand brand, OperatingSystem system, Procesor procesor, Motherboard motherboard) {
         }


         public void LaptopBrand (LaptopBrand brand, OperatingSystem system, Procesor procesor, Motherboard motherboard, int memory) {
        this.brand = brand;
        this.system = system;
        this.procesor = procesor;
        this.motherboard = motherboard;
        this.memory = memory;

        }
        
    public OperatingSystem getOperatingSystem() {
            return system;
        }

        public Procesor getProcesor() {
            return procesor;
        }

    public Motherboard getMotherboard() {
            return motherboard;
        }

        public LaptopBrand getLaptopType() {
        return brand;
    }

    public int getMemory() {
        return memory;

         }

         public String print() {
          return getLaptopType().name();
         }
     }

package com;


import com.company.*;

public class Final {
        public void constructSamsungLaptop(Builder builder) {
            builder.setLaptopBrand(LaptopBrand.Samsung);
            builder.setOperatingSystem(OperatingSystem.Windows);
            builder.setProcesor(Procesor.Amd);
            builder.setMotherboard(Motherboard.Asus);
            builder.setMemory(8);
        }

        public void constructAppleLaptop(Builder builder) {
            builder.setLaptopBrand(LaptopBrand.Apple);
            builder.setOperatingSystem(OperatingSystem.MacOS);
            builder.setProcesor(Procesor.Amd);
            builder.setMotherboard(Motherboard.MSI);
            builder.setMemory(16);
        }


    }

package com;


import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        Final director = new Final();

//        LaptopBrand memory = null;
//        Laptop builder = new Laptop(memory);

        Laptop laptop = builder();
        System.out.println("Laptop name: \n" + laptop.getLaptopType());

        TechInfo manualBuilder = new TechInfo();


        director.constructSamsungLaptop(manualBuilder);
        Laptop laptopInfo = manualBuilder.getResult();
        System.out.println("\n Laptop info \n" + laptopInfo.print());
    }

    public static @NotNull
    Laptop builder() {
        Laptop laptop = builder();
        System.out.println("Laptop name: \n" + laptop.getLaptopType());

        return laptop;
    }

}

package com.company;

public enum Memory {

}

package com.company;

public enum Motherboard {
    Asus, Gigabyte, MSI
}

package com.company;

public enum LaptopBrand {
      Samsung, Apple, HP, Asus, Acer
}

