
import ru.ifmo.se.pokemon.*;
import java.lang.String;















public class Main {



    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Suicune("Стринг", 1);
        Pokemon p2 = new Crabominable("Хищник", 1);
        Pokemon p3 = new Crabrawler("Крабсбургер", 1);
        Pokemon p4 = new Flabebe("Василек", 1);
        Pokemon p5 = new Floette("Одуванчик", 1);
        Pokemon p6 = new Florges("Роза", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
        }
    }
