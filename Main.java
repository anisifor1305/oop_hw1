//Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
//Создать абстрактный класс и иерархию наследников.
//Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
//В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
//Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
//Формат сдачи:
//Ссылка на гитхаб проект
//Подписать фамилию и номер группы




public class Main {
    public static void main(String[] args) {
        units.Peasant peasant1 = new units.Peasant("Peasant1");
        peasant1.print();

        units.Outlaw outlaw1 = new units.Outlaw("Outlaw1");
        outlaw1.print();

        outlaw1.Damag(outlaw1,peasant1);
        peasant1.print();


        units.Sniper sniper1 = new units.Sniper("Sniper1");

        units.Spearman spearman1 = new units.Spearman("Spearman1");

        units.Crossbowman crossbowman1 = new units.Crossbowman("Crossbowman1");

        units.Monk monk1 = new units.Monk("Monk1");

        units.Mag mag1 = new units.Mag("Mag1");
        mag1.print();

        System.out.println(peasant1);
        System.out.println(outlaw1);
        System.out.println(sniper1);
        System.out.println(spearman1);
        System.out.println(crossbowman1);
        System.out.println(monk1);
        System.out.println(mag1);

    }
}
