import java.lang.reflect.Constructor;

public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("Tarefa Annotation com Reflections");
        System.out.println(" ");

        Class<?> clazz = ExemploDeUso.class;

        if(clazz.isAnnotationPresent(Tabela.class)) {
            Tabela anotacao = clazz.getAnnotation(Tabela.class);
            System.out.println("Valor da anotação: " + anotacao.value());
        } else {
            System.out.println("A anotação tabela não está presente!");
        }


    }


}