package GoogleInterview;

import java.util.HashMap;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Bloc[] blocs = new Bloc[1000];
        Random random = new Random();
        for (int i = 0; i < blocs.length; i++) {
            blocs[i] = new Bloc(random.nextBoolean(), random.nextBoolean(), random.nextBoolean(), random.nextBoolean());
            System.out.println(blocs[i]);
        }

//        for (int i = 0; i < blocs.length; i++) {
//            if(blocs[i])
//        }
    }

    public static class Bloc {
        private Boolean hasStore;
        private Boolean hasSchool;
        private Boolean hasGym;
        private Boolean hasChurch;

        Bloc(Boolean hasStore, Boolean hasSchool, Boolean hasGym, Boolean hasChurch) {
            this.hasStore = hasStore;
            this.hasSchool = hasSchool;
            this.hasGym = hasGym;
            this.hasChurch = hasChurch;
        }

        public Boolean getHasStore() {
            return hasStore;
        }

        public Boolean getHasSchool() {
            return hasSchool;
        }

        public Boolean getHasGym() {
            return hasGym;
        }

        public Boolean getHasChurch() {
            return hasChurch;
        }

        @Override
        public String toString() {
            return "[hasStore=" + hasStore + ", hasSchool=" + hasSchool + ", hasGym=" + hasGym + ", hasChurch=" + hasChurch + "]";
        }
    }
}
