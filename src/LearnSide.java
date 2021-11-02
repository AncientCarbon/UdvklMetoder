public class LearnSide {

    public String opg;
    class Underviser {
        public void uploadOpgBeskrivelse(String opgaveBeskrivelse){
            opg = opgaveBeskrivelse;
        }

        public String downloadFærdigOpgave(){
            return opg;
        }
    }

    class Studerende {
        public String downloadOpgBeskrivelse(){
            return opg;
        }
        public void uploadFærdigOpgave(String færdigOpgave){
            opg = færdigOpgave;
        }
    }
}