import java.util.Optional;

class TesteEnum{
public static void main(String[] args) {
    getUF("LA").ifPresent(System.out::print);

    System.out.println(getUF("MG").get());

    if(getUF("123").isPresent()){
        System.out.println(getUF("123"));
    }
}
public static Optional<UF> getUF(String uf){
    try {
        return Optional.of(UF.valueOf(uf));
    }catch (Exception e) {
        //e.printStackTrace();
        System.out.println("UF inexistente");
    }
    return Optional.empty();
}
}
