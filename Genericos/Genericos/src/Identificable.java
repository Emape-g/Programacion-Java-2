public interface Identificable <K>{
    K getid();

    Integer getID();

    boolean tieneMismoID(K id);
}
