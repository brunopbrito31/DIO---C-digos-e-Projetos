public class Main {

    public static void main(String[] args) {

        No<String> noUm = new No<>("contedo no1",null);

        No<String> noDois = new No<>("contedo no2",null);
        noUm.setProximoNo(noDois);

        No<String> noTres = new No<>("contedo no3",null);
        noDois.setProximoNo(noTres);

        No<String> noQuatro = new No<>("contedo no4",null);
        noTres.setProximoNo(noQuatro);


        No proximoNo = noUm;

//        Simulando uma iteração
        do{
            System.out.println(proximoNo.getConteudo());
            proximoNo = proximoNo.getProximoNo();
            if(proximoNo.getProximoNo() == null) System.out.println(proximoNo.getConteudo());
        }while(proximoNo.getProximoNo() != null);

    }
}
