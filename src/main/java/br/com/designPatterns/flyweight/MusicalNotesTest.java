package br.com.designPatterns.flyweight;

import java.util.Arrays;

public class MusicalNotesTest {
    public static void main(String[] args) {
        /*
        * Temos um software musical que deve tocar uma sequência de notas
        * musicais: do(C), re(D), mi(E), fa(F), sol(G), la(A), si(B)
        * Mas não queremos instanciar cada nota toda vez na musica, para isso
        * utilizamos o padrão Flyweight, que reutiliza a mesma instancia das
        * notas musicais
        *
        * "FLYWEIGHT: Reduz o número de instâncias de objetos durante a execução,
        *  economizando memória. Centraliza o estado de muitos objetos "virtuais"
        *  num único local."
        *
         */

        var notes = new MusicalNote();
        var music = Arrays.asList(
            notes.get("do"),
            notes.get("re"),
            notes.get("mi"),
            notes.get("fa"),
            notes.get("fa"),
            notes.get("fa")
        );

        System.out.println(music);
    }
}
